/*
 * Copyright (C) 2017 AlexMofer
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

package am.util.ftpserver;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.RandomAccessFile;

/**
 * 随机访问文件流
 * Created by Alex on 2017/12/20.
 */
class RandomAccessFileOutputStream extends OutputStream {

    private final RandomAccessFile mRandomAccessFile;

    RandomAccessFileOutputStream(File file, String mode, long offset) throws IOException {
        mRandomAccessFile = new RandomAccessFile(file, mode);
        mRandomAccessFile.seek(offset);
    }

    @Override
    public void write(int b) throws IOException {
        mRandomAccessFile.write(b);
    }

    @Override
    public void write(@SuppressWarnings("NullableProblems") byte b[]) throws IOException {
        mRandomAccessFile.write(b);
    }

    @Override
    public void write(@SuppressWarnings("NullableProblems") byte b[], int off, int len)
            throws IOException {
        mRandomAccessFile.write(b, off, len);
    }

    @Override
    public void close() throws IOException {
        super.close();
        mRandomAccessFile.close();
    }
}