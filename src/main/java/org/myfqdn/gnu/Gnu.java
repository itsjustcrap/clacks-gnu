/*
    Gnu-Clacks copyright 2021 Steve Jensen  sj-gpl@gruv.org
    
    GNU Terry Pratchett
 
    This content of this file is free software; you can redistribute 
    it and/or modify it under the terms of the GNU General Public 
    License version 2 OR under the terms of the GNU Lesser General 
    Public License version 2 depending on your needs.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License along
    with this program; if not, write to the Free Software Foundation, Inc.,
    51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 */

package org.myfqdn.gnu;


public class Gnu {

	private String gnu=null;
	
	public Gnu() {}
	
	public Gnu(String g) {
		gnu=g;
	}
	
	public String getGnu() {
		return toGnu();
	}
	
	public void setGnu(String s) {
		gnu=s;
	}
	
	private String toGnu() {
		if((this.gnu!=null)&&(this.gnu.trim().length()>0)) {
			return "GNU "+this.gnu;
		}
		return "GNU Terry Pratchett";
	}
}
