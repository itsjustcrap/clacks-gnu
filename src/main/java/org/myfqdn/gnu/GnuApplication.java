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

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GnuApplication {

	public static void main(String[] args) {
		SpringApplication.run(GnuApplication.class, args);
	}

}
