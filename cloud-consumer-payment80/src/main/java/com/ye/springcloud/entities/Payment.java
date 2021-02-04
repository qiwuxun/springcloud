package com.ye.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author qiwu
 * @date 2021-01-31 15:14
 */


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payment {


  private Long id;
  private String serial;

}
