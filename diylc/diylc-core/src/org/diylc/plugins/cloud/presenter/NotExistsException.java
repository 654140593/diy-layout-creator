package org.diylc.plugins.cloud.presenter;

public class NotExistsException extends Exception {

  private static final long serialVersionUID = 1L;

  public NotExistsException(String message) {
    super(message);
  }
}
