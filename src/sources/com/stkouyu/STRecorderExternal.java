package com.stkouyu;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
class STRecorderExternal {
    private RandomAccessFile raf;

    public void feed(byte[] bArr, int i11) throws IOException {
        RandomAccessFile randomAccessFile = this.raf;
        if (randomAccessFile != null) {
            randomAccessFile.write(bArr, 0, i11);
        }
    }

    public void start(String str) {
        File file = new File(str);
        if (file.exists()) {
            file.delete();
        } else {
            File parentFile = file.getParentFile();
            if (parentFile != null && !parentFile.exists()) {
                parentFile.mkdirs();
            }
        }
        this.raf = new RandomAccessFile(file, "rw");
    }

    public void stop() throws IOException {
        RandomAccessFile randomAccessFile = this.raf;
        if (randomAccessFile != null) {
            randomAccessFile.close();
            this.raf = null;
        }
    }
}
