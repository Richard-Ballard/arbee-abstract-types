/*
 * (C) Copyright 2016 Richard Ballard.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.richardballard.arbeecoretypes.numeric;

import org.jetbrains.annotations.NotNull;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * An extension of {@link Number} that has methods relating to {@link BigInteger} and {@link BigDecimal}
 */
public abstract class BigNumber extends Number {

  /**
   * Returns the value of the specified number as a {@link BigInteger},
   * which may involve rounding or truncation.
   */
  public abstract @NotNull BigInteger bigIntegerValue();

  /**
   * Returns the value of the specified number as a {@link BigInteger},
   * which may involve rounding or truncation.
   */
  public abstract @NotNull BigDecimal bigDecimalValue();
}
