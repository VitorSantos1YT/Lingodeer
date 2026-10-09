package com.google.firebase.crashlytics.internal.metadata;

import com.adjust.sdk.Constants;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
class QueueFileLogStore implements FileLogStore {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Charset f18421c = Charset.forName(Constants.ENCODING);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f18422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public QueueFile f18423b;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class LogBytes {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final byte[] f18426a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f18427b;

        public LogBytes(byte[] bArr, int i11) {
            this.f18426a = bArr;
            this.f18427b = i11;
        }
    }

    public QueueFileLogStore(File file) {
        this.f18422a = file;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.FileLogStore
    public final void a() {
        CommonUtils.b(this.f18423b);
        this.f18423b = null;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000a  */
    @Override // com.google.firebase.crashlytics.internal.metadata.FileLogStore
    public final String b() {
        LogBytes logBytes;
        File file = this.f18422a;
        byte[] bArr = null;
        if (file.exists()) {
            if (this.f18423b == null) {
                try {
                    this.f18423b = new QueueFile(file);
                } catch (IOException unused) {
                    Objects.toString(file);
                }
            }
            QueueFile queueFile = this.f18423b;
            if (queueFile == null) {
                logBytes = null;
            } else {
                final int[] iArr = {0};
                final byte[] bArr2 = new byte[queueFile.q()];
                try {
                    this.f18423b.c(new QueueFile.ElementReader() { // from class: com.google.firebase.crashlytics.internal.metadata.QueueFileLogStore.1
                        @Override // com.google.firebase.crashlytics.internal.metadata.QueueFile.ElementReader
                        public final void a(InputStream inputStream, int i11) throws IOException {
                            int[] iArr2 = iArr;
                            try {
                                inputStream.read(bArr2, iArr2[0], i11);
                                iArr2[0] = iArr2[0] + i11;
                            } finally {
                                inputStream.close();
                            }
                        }
                    });
                } catch (IOException unused2) {
                }
                logBytes = new LogBytes(bArr2, iArr[0]);
            }
        } else {
            logBytes = null;
        }
        if (logBytes != null) {
            int i11 = logBytes.f18427b;
            bArr = new byte[i11];
            System.arraycopy(logBytes.f18426a, 0, bArr, 0, i11);
        }
        if (bArr != null) {
            return new String(bArr, f18421c);
        }
        return null;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.FileLogStore
    public final void c(long j11, String str) {
        File file = this.f18422a;
        if (this.f18423b == null) {
            try {
                this.f18423b = new QueueFile(file);
            } catch (IOException unused) {
                Objects.toString(file);
            }
        }
        if (this.f18423b == null) {
            return;
        }
        if (str == null) {
            str = "null";
        }
        try {
            if (str.length() > 16384) {
                str = "..." + str.substring(str.length() - 16384);
            }
            this.f18423b.a(String.format(Locale.US, "%d %s%n", Long.valueOf(j11), str.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(f18421c));
            while (!this.f18423b.d() && this.f18423b.q() > 65536) {
                this.f18423b.h();
            }
        } catch (IOException unused2) {
        }
    }
}
