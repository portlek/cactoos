/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2017-2019 Yegor Bugayenko
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included
 * in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NON-INFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package org.cactoos.iterator;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

/**
 * Test for {@link Sliced}.
 * @since 1.0
 * @checkstyle JavadocMethodCheck (500 lines)
 * @checkstyle MagicNumberCheck (500 lines)
 */
public final class SlicedTest {

    @Test
    public void sliceTheMiddle() throws Exception {
        MatcherAssert.assertThat(
            "Should return the slice iterator in the middle",
            () -> new Sliced<>(
                new IteratorOf<>(
                    1, 2, 3, 4, 5, 6, 7, 8, 9, 0
                ),
                3,
                2
            ),
            Matchers.contains(
                4, 5
            )
        );
    }

    @Test
    public void sliceTheHead() throws Exception {
        MatcherAssert.assertThat(
            "Shoud return the head elements of the iterator",
            () -> new Sliced<>(
                new IteratorOf<>(
                    1, 2, 3, 4, 5, 6, 7, 8, 9, 0
                ),
                0,
                5
            ),
            Matchers.contains(
                1, 2, 3, 4, 5
            )
        );
    }
}
