/**
 * Cobertura - http://cobertura.sourceforge.net/
 *
 * Copyright (C) 2003 jcoverage ltd.
 * Copyright (C) 2005 Mark Doliner <thekingant@users.sourceforge.net>
 *
 * Cobertura is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published
 * by the Free Software Foundation; either version 2 of the License,
 * or (at your option) any later version.
 *
 * Cobertura is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Cobertura; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307
 * USA
 */

package com.example.simple;



public class Simple {
	public double nextDown(double d) {
		if (Double.isNaN(d))
			return d;
		if (d == Double.NEGATIVE_INFINITY)
			return d;
		else {
			if (d == 0.0)
				return -Double.MIN_VALUE;
			else
				return Double.longBitsToDouble(Double.doubleToRawLongBits(d) + ((d > 0.0d)?-1L:+1L));
		}
	}

}