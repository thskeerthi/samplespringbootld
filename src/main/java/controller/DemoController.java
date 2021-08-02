package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import service.DemoService;
@RestController
public class DemoController {
	@Autowired
	DemoService demoService;
	 @GetMapping(path = "/sampleApi")
	    public ResponseEntity<String> fetchdataofdefault()  {
	        return new ResponseEntity<String>(demoService.sampleFuntion(),HttpStatus.OK);

	    }
}
