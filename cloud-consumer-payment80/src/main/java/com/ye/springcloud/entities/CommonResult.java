package com.ye.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author qiwu
 * @date 2021-01-31 18:15
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {

  private int code;
  private String message;
  private T data;

  public CommonResult(int code, String message) {
    this.code = code;
    this.message = message;
  }
}
