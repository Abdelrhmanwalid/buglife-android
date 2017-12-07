/*
 * Copyright (C) 2017 Buglife, Inc.
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
 *
 */

package com.buglife.sdk.reporting;

import android.support.annotation.NonNull;

/**
 * This exception should be thrown when an unexpected error
 * prevents a bug report submission job from being scheduled.
 * Note that this is NOT the same as a bug report submission
 * failing due to network error, etc, since the submission
 * hasn't even been successfully scheduled.
 */
public class ReportSchedulingException extends Exception {
    @NonNull private final Throwable mCause;

    public ReportSchedulingException(@NonNull Throwable cause) {
        mCause = cause;
    }

    public Throwable getCause() {
        return mCause;
    }
}