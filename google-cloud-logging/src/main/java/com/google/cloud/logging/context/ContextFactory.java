package com.google.cloud.logging.context;

public class ContextFactory {
  static CurrentContext context = null;
  static final ContextExtractor extractors[] = {new SpringContextExtractor()
    /*
     * add new extractor instances here
     */
  };

  public static CurrentContext getContext() {
    if (context == null) {
      for (ContextExtractor extractor : extractors) {
        context = extractor.getContext();
        if (context != null) {
          break;
        }
      }
    }
    return context;
  }
}
