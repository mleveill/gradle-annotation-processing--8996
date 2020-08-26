package com.example.gradle.i8996;

import java.util.Set;
import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.TypeElement;

@SupportedAnnotationTypes(RunsFaultyProcessor.QUALIFIED_NAME)
@SupportedSourceVersion(SourceVersion.RELEASE_6)
public class FaultyProcessor extends AbstractProcessor {

	public FaultyProcessor() {
	}

	@Override
	public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment env) {
		ProcessorHelper thisNeverRuns = new ProcessorHelper();
		return false;
	}
}
