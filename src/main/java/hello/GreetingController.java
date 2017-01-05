package hello;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private static final String template2 = "Hola, %s!";
    private static final String template3 = "Bounjour, %s!";
    private static final String template4 = "Ciaos, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name)
    {
        return new Greeting(counter.incrementAndGet(), 
        		String.format(template, name));
    }	

    @RequestMapping("/hola")
    public Hola hola(@RequestParam(value="nombre", defaultValue="Mundo") String name)
    {
        return new Hola(counter.incrementAndGet(), 
        		String.format(template2, name));
    }	    

    @RequestMapping("/bonjour")
    public Bonjour bonjour(@RequestParam(value="nom", defaultValue="Monde") String name)
    {
        return new Bonjour(counter.incrementAndGet(), 
        		String.format(template3, name));
    }	    

    @RequestMapping("/ciao")
    public Ciao ciao(@RequestParam(value="nome", defaultValue="Mondo") String name)
    {
        return new Ciao(counter.incrementAndGet(), 
        		String.format(template4, name));
    }	    

    @RequestMapping("/hallo")
    public Hallo hallo(@RequestParam(value="navn", defaultValue="Verden") String name)
    {
        return new Hallo(counter.incrementAndGet(), 
        		String.format(template4, name));
    }	    
    
}