package odata4fx.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import odata4fx.core.Endpoint;
import odata4fx.core.ODataEntityHelper;

@Service	
public class SpringEndpoint extends Endpoint {

	@Autowired
	protected ODataEntityHelper springODataEntityHelper;
	
	@Autowired
	private ApplicationContext ctx;
	
	public SpringEndpoint() {
		super("demo");
	}
	
	@Override
	public ODataEntityHelper getODataEntityHelper() {
		return springODataEntityHelper;
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	

}
