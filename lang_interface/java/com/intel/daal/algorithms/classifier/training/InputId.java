/* file: InputId.java */
/*******************************************************************************
* Copyright 2014-2017 Intel Corporation
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*******************************************************************************/

/**
 * @defgroup training Training
 * @brief Contains classes for training the model of the classification algorithms
 * @ingroup classifier
 * @{
 */
/**
 * @brief Contains classes for training the classification model
 */
package com.intel.daal.algorithms.classifier.training;

/**
 * <a name="DAAL-CLASS-ALGORITHMS__CLASSIFIER__TRAINING__INPUTID"></a>
 * @brief Available identifiers of input objects for the classifier algorithm
 */
public final class InputId {
    private int _value;

    /**
     * Constructs the input object identifier using the provided value
     * @param value     Value corresponding to the input object identifier
     */
    public InputId(int value) {
        _value = value;
    }

    /**
     * Returns the value corresponding to the input object identifier
     * @return Value corresponding to the input object identifier
     */
    public int getValue() {
        return _value;
    }

    private static final int Data    = 0;
    private static final int Labels  = 1;
    private static final int Weights = 2;

    public static final InputId data    = new InputId(Data);    /*!< Data for the training stage */
    public static final InputId labels  = new InputId(Labels);  /*!< Labels for the training stage */
    public static final InputId weights = new InputId(Weights); /*!< Weights for the training stage */
}
/** @} */
