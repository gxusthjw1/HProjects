/*
 * Copyright (c) 2018-2019, Jiwei Huang. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cn.edu.gxust.jiweihuang.java.math;

import java.io.Serializable;

/**
 * <p>The class {@code NumericalConstants} is used for
 * representing numerical constants.</p>
 *
 * @author JiweiHuang
 * @version 1.0.0_build-20181128
 * @see java.io.Serializable
 */
public final class NumericalConstants implements Serializable {
    /**
     * Serialized version number
     */
    private static final long serialVersionUID = -3814349650465331677L;

    /**
     * The numerical precision for numerical calculation.
     */
    public static final double NUMERICAL_PRECISION = 1.0e-15;

}
