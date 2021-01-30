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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class GnuController {
	Logger logger;

	GnuController() {
		logger = LoggerFactory.getLogger(GnuController.class);
		logger.info("logger init!");
	}

	@GetMapping("/gnu")
	public ResponseEntity<Gnu> handleGet(
			@RequestParam(name = "name", required = false, defaultValue = "") String name) {
		HttpHeaders h = new HttpHeaders();
		h.add("X-Clacks-Overhead", "GNU Terry Pratchett");
		Gnu gnu = new Gnu(name);
		logger.info("get called: " + gnu.getGnu());
		return new ResponseEntity<Gnu>(gnu, h, HttpStatus.OK);
	}

	@PostMapping("/gnu")
	public ResponseEntity<Gnu> handlePost(@RequestBody(required = false) String name) {
		HttpHeaders h = new HttpHeaders();
		h.add("X-Clacks-Overhead", "GNU Terry Pratchett");
		Gnu gnu = new Gnu(name);
		logger.info("post called: " + gnu.getGnu());
		return new ResponseEntity<Gnu>(gnu, h, HttpStatus.OK);
	}

	@PutMapping("/gnu")
	public ResponseEntity<Gnu> handleJsonPost(@RequestBody Gnu gnu) {
		HttpHeaders h = new HttpHeaders();
		h.add("X-Clacks-Overhead", gnu.getGnu());
		Gnu rgnu = new Gnu("Sir Terry Pratchett");
		logger.info("put called: " + gnu.getGnu());
		return new ResponseEntity<Gnu>(rgnu, h, HttpStatus.OK);
	}
}