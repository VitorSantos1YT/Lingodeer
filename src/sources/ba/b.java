package ba;

import android.content.Context;
import cf.x;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import ka.d;
import kotlin.jvm.internal.m;
import w9.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements d, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f4056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f4057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4058c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f4059d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public w9.b f4060e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f4061f;

    public b(Context context, File file, int i11, d delegate) {
        m.f(context, "context");
        m.f(delegate, "delegate");
        this.f4056a = context;
        this.f4057b = file;
        this.f4058c = i11;
        this.f4059d = delegate;
    }

    @Override // w9.c
    public final d a() {
        return this.f4059d;
    }

    public final void b(File file) throws IOException {
        File file2 = this.f4057b;
        if (file2 == null) {
            throw new IllegalStateException("copyFromAssetPath, copyFromFile and copyFromInputStream are all null!");
        }
        FileChannel input = new FileInputStream(file2).getChannel();
        File fileCreateTempFile = File.createTempFile("room-copy-helper", ".tmp", this.f4056a.getCacheDir());
        fileCreateTempFile.deleteOnExit();
        FileChannel channel = new FileOutputStream(fileCreateTempFile).getChannel();
        m.c(channel);
        m.f(input, "input");
        try {
            channel.transferFrom(input, 0L, Long.MAX_VALUE);
            channel.force(false);
            input.close();
            channel.close();
            File parentFile = file.getParentFile();
            if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
                throw new IOException("Failed to create directories for " + file.getAbsolutePath());
            }
            if (this.f4060e == null) {
                m.n("databaseConfiguration");
                throw null;
            }
            if (fileCreateTempFile.renameTo(file)) {
                return;
            }
            throw new IOException("Failed to move intermediate file (" + fileCreateTempFile.getAbsolutePath() + ") to destination (" + file.getAbsolutePath() + ").");
        } catch (Throwable th2) {
            input.close();
            channel.close();
            throw th2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f4059d.close();
        this.f4061f = false;
    }

    @Override // ka.d
    public final String getDatabaseName() {
        return this.f4059d.getDatabaseName();
    }

    @Override // ka.d
    public final ka.a n0() {
        if (!this.f4061f) {
            String databaseName = this.f4059d.getDatabaseName();
            if (databaseName == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Context context = this.f4056a;
            File databasePath = context.getDatabasePath(databaseName);
            w9.b bVar = this.f4060e;
            if (bVar == null) {
                m.n("databaseConfiguration");
                throw null;
            }
            boolean z11 = bVar.f54774v;
            ma.a aVar = new ma.a(databaseName, context.getFilesDir(), z11);
            try {
                aVar.a(z11);
                if (databasePath.exists()) {
                    try {
                        int iG = x.G(databasePath);
                        int i11 = this.f4058c;
                        if (iG != i11) {
                            w9.b bVar2 = this.f4060e;
                            if (bVar2 == null) {
                                m.n("databaseConfiguration");
                                throw null;
                            }
                            if (!com.bumptech.glide.d.t(bVar2, iG, i11) && context.deleteDatabase(databaseName)) {
                                b(databasePath);
                            }
                        }
                    } catch (IOException unused) {
                    }
                } else {
                    try {
                        b(databasePath);
                    } catch (IOException e8) {
                        throw new RuntimeException("Unable to copy database file.", e8);
                    }
                }
                aVar.b();
                this.f4061f = true;
            } catch (Throwable th2) {
                aVar.b();
                throw th2;
            }
        }
        return this.f4059d.n0();
    }

    @Override // ka.d
    public final void setWriteAheadLoggingEnabled(boolean z11) {
        this.f4059d.setWriteAheadLoggingEnabled(z11);
    }
}
