/*
 * Copyright 2002-2021 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.contextpropagation.holder;

import org.slf4j.MDC;

public class MdcThreadLocalHolder {

	public static final String key = "MDC-KEY";

	public static void set(String value) {
		MDC.put(key, value);
	}

	public static String get() {
		return MDC.get(key);
	}

	public static void reset() {
		MDC.clear();
	}

}
