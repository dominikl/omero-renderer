/*
 * omeis.providers.re.quantum.QuantizationException
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

package omeis.providers.re.quantum;

//Java imports

//Third-party libraries

//Application-internal dependencies

/**
 * This exception is thrown during the quantization process if something goes
 * wrong.
 * For example, quantization strategies that depend on an interval <code>[min,
 * max]</code> where <code>min</code> (<code>max</code>) is, in general, the 
 * minimum (maximum) of all minima (maxima) calculated in a given stack (for a
 * given wavelength and timepoint).
 * 
 * @author  Jean-Marie Burel &nbsp;&nbsp;&nbsp;&nbsp;
 * 				<a href="mailto:j.burel@dundee.ac.uk">j.burel@dundee.ac.uk</a>
 * @author  <br>Andrea Falconi &nbsp;&nbsp;&nbsp;&nbsp;
 * 				<a href="mailto:a.falconi@dundee.ac.uk">
 * 					a.falconi@dundee.ac.uk</a>
 * @version 2.2 
 * <small>
 * (<b>Internal version:</b> $Revision: 1.1 $ $Date: 2005/06/10 17:37:26 $)
 * </small>
 * @since OME2.2
 */
public class QuantizationException
	extends Exception
{

	/** The OME index of the wavelength that coudln't be rendered. */
	private int		wavelength;
	
    
	/** Creates a new exception. */
	public QuantizationException() { super(); }

	/**
	 * Constructs a new exception with the specified detail message.
	 * 
	 * @param message	Short explanation of the problem.
	 */
	public QuantizationException(String message) { super(message); }

	/**
	 * Constructs a new exception with the specified cause.
	 * 
	 * @param cause		The exception that caused this one to be risen.
	 */
	public QuantizationException(Throwable cause) { super(cause); }

	/**
	 * Constructs a new exception with the specified detail message and cause.
	 * 
	 * @param message	Short explanation of the problem.
	 * @param cause		The exception that caused this one to be risen.
	 */
	public QuantizationException(String message, Throwable cause)
	{
		super(message, cause);
	}

    /**
     * Sets the index of the wavelength that couldn't be rendered.
     * 
     * @param index The index of the wavelength.
     */
	public void setWavelength(int index) { wavelength = index; }
	
    /** 
     * Returns the index of the wavelength that couldn't be rendered.
     * 
     * @return See above.
     */
	public int getWavelength() { return wavelength;	}
	
}
