package de.adorsys.quiz;

import de.adorsys.quiz.resource.Example;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/api")
public class RestApplication extends Application {
	@Override
	public Set<Class<?>> getClasses() {
		final Set<Class<?>> returnValue = new HashSet<>();
		returnValue.add(Example.class);
		return returnValue;
	}
} 