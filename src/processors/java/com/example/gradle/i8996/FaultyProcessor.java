package com.example.gradle.i8996;

import java.util.Set;
import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.TypeElement;

@SupportedAnnotationTypes(RunsFaultyProcessor.QUALIFIED_NAME)
@SupportedSourceVersion(SourceVersion.RELEASE_8) // Could probably be as low as RELEASE_5
public class FaultyProcessor extends AbstractProcessor {

	public FaultyProcessor() {
		throw new RuntimeException("Whoops!");
	}

	@Override
	public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment env) {
		return false;
	}
}
