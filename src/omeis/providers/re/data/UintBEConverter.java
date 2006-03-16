/*
 * omeis.providers.re.data.UintBEConverter
 *
 *------------------------------------------------------------------------------
 *
 *  Copyright (C) 2004 Open Microscopy Environment
 *      Massachusetts Institute of Technology,
 *      National Institutes of Health,
 *      University of Dundee
 *
 *
 *
 *    This library is free software; you can redistribute it and/or
 *    modify it under the terms of the GNU Lesser General Public
 *    License as published by the Free Software Foundation; either
 *    version 2.1 of the License, or (at your option) any later version.
 *
 *    This library is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *    Lesser General Public License for more details.
 *
 *    You should have received a copy of the GNU Lesser General Public
 *    License along with this library; if not, write to the Free Software
 *    Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 *
 *------------------------------------------------------------------------------
 */

package omeis.providers.re.data;


//Java imports

//Third-party libraries

//Application-internal dependencies

/** 
 * Packs a sequence of bytes representing an unsigned big-endian integer into 
 * an double value. 
 * This class handles the conversion of unsigned big-endian integers of <code>
 * 1, 2</code> and <code>4</code>-byte length (bytes are assumed to be <code>
 * 8</code>-bit long).
 *
 * @author  Jean-Marie Burel &nbsp;&nbsp;&nbsp;&nbsp;
 * 				<a href="mailto:j.burel@dundee.ac.uk">j.burel@dundee.ac.uk</a>
 * @author  <br>Andrea Falconi &nbsp;&nbsp;&nbsp;&nbsp;
 * 				<a href="mailto:a.falconi@dundee.ac.uk">
 * 					a.falconi@dundee.ac.uk</a>
 * @version 2.2 
 * <small>
 * (<b>Internal version:</b> $Revision: 1.1 $ $Date: 2005/06/08 20:15:03 $)
 * </small>
 * @since OME2.2
 */
class UintBEConverter
	extends BytesConverter
{ 
	
	/** Implemented as specified by {@link BytesConverter}. */
	public double pack(byte[] data, int offset, int length)
	{
		long r = 0, tmp;
		for (int k = 0; k < length; ++k)
        {
			//Get k-byte starting from MSB, that is LSB[length-k-1].
			
			tmp = data[offset+k]&0xFF;
			//Add LSB[j]*(2^8)^j to r, where j=length-k-1.  
			r |= tmp<<(length-k-1)*8;
			
			/* 
			 * This probably deserves a quick explanation.
			 * We consider every byte value as a digit in base 2^8=B. 
			 * This means that the numeric value is given by 
			 * LSB[0]*B^0 + LSB[1]*B^1 + ... + LSB[n]*B^n.
			 * So, if we know where the LSB in the input bytes is (that is, the
			 * endianness), we can calculate the numeric value regardless of the
			 * endianness of the platform we're running on.
			 * We use a left shift to calculate LSB[k]*B^k because this operator
			 * shifts from LSB to MSB, regardless of endianness.
			 */ 
		}
        
        // FIXME: Get rid of this ASAP
        if (r < 0)
            throw new RuntimeException("Negative value: '" + r + "'");
		
		return r;
	}
    
}

