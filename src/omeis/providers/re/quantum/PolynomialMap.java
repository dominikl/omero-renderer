/*
 * omeis.providers.re.quantum.PolynomialMap
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
 * This class implements the {@link QuantumMap} interface. Each method
 * is a wrapper around the {@link Math#pow(double, double)} method, which
 * returns the value of the first argument raised to the power of the
 * second argument.
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
class PolynomialMap 
	implements QuantumMap
{
	
	/** 
     * Implemented as specified in {@link QuantumMap}. 
     * @see QuantumMap#transform(int, double)
     */
	public double transform(int x, double k) { return Math.pow(x, k); }

    /** 
     * Implemented as specified in {@link QuantumMap}. 
     * @see QuantumMap#transform(double, double)
     */
	public double transform(double x, double k) { return Math.pow(x, k); }

    /** 
     * Implemented as specified in {@link QuantumMap}. 
     * @see QuantumMap#transform(float, double)
     */
	public double transform(float x, double k) { return Math.pow(x, k); }

}

