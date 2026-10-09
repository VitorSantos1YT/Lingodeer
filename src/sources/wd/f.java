package wd;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import pe.m;
import re.e0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Bitmap.Config f55077f = Bitmap.Config.ARGB_8888;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f55078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f55079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e0 f55080c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f55081d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f55082e;

    public f(long j11) {
        j jVar = new j();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i11 = Build.VERSION.SDK_INT;
        hashSet.add(null);
        if (i11 >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
        this.f55081d = j11;
        this.f55078a = jVar;
        this.f55079b = setUnmodifiableSet;
        this.f55080c = new e0(11);
    }

    @Override // wd.a
    public final Bitmap a(int i11, int i12, Bitmap.Config config) {
        Bitmap bitmapB = b(i11, i12, config);
        if (bitmapB != null) {
            return bitmapB;
        }
        if (config == null) {
            config = f55077f;
        }
        return Bitmap.createBitmap(i11, i12, config);
    }

    public final synchronized Bitmap b(int i11, int i12, Bitmap.Config config) {
        Bitmap bitmapB;
        try {
            if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE) {
                throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
            }
            bitmapB = this.f55078a.b(i11, i12, config != null ? config : f55077f);
            if (bitmapB != null) {
                long j11 = this.f55082e;
                this.f55078a.getClass();
                this.f55082e = j11 - ((long) m.c(bitmapB));
                this.f55080c.getClass();
                bitmapB.setHasAlpha(true);
                bitmapB.setPremultiplied(true);
            } else if (Log.isLoggable("LruBitmapPool", 3)) {
                this.f55078a.getClass();
                j.c(m.d(config) * i11 * i12, config);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                this.f55078a.getClass();
                j.c(m.d(config) * i11 * i12, config);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Objects.toString(this.f55078a);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return bitmapB;
    }

    @Override // wd.a
    public final void c(int i11) {
        if (i11 >= 40 || i11 >= 20) {
            j();
        } else if (i11 >= 20 || i11 == 15) {
            e(this.f55081d / 2);
        }
    }

    @Override // wd.a
    public final synchronized void d(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable()) {
                this.f55078a.getClass();
                if (m.c(bitmap) <= this.f55081d && this.f55079b.contains(bitmap.getConfig())) {
                    this.f55078a.getClass();
                    int iC = m.c(bitmap);
                    this.f55078a.e(bitmap);
                    this.f55080c.getClass();
                    this.f55082e += (long) iC;
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        this.f55078a.getClass();
                        j.c(m.c(bitmap), bitmap.getConfig());
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        Objects.toString(this.f55078a);
                    }
                    e(this.f55081d);
                    return;
                }
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                this.f55078a.getClass();
                j.c(m.c(bitmap), bitmap.getConfig());
                bitmap.isMutable();
                this.f55079b.contains(bitmap.getConfig());
            }
            bitmap.recycle();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void e(long j11) {
        while (this.f55082e > j11) {
            j jVar = this.f55078a;
            Bitmap bitmap = (Bitmap) jVar.f55093b.i();
            if (bitmap != null) {
                jVar.a(Integer.valueOf(m.c(bitmap)), bitmap);
            }
            if (bitmap == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    Objects.toString(this.f55078a);
                }
                this.f55082e = 0L;
                return;
            }
            this.f55080c.getClass();
            long j12 = this.f55082e;
            this.f55078a.getClass();
            this.f55082e = j12 - ((long) m.c(bitmap));
            if (Log.isLoggable("LruBitmapPool", 3)) {
                this.f55078a.getClass();
                j.c(m.c(bitmap), bitmap.getConfig());
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Objects.toString(this.f55078a);
            }
            bitmap.recycle();
        }
    }

    @Override // wd.a
    public final Bitmap i(int i11, int i12, Bitmap.Config config) {
        Bitmap bitmapB = b(i11, i12, config);
        if (bitmapB != null) {
            bitmapB.eraseColor(0);
            return bitmapB;
        }
        if (config == null) {
            config = f55077f;
        }
        return Bitmap.createBitmap(i11, i12, config);
    }

    @Override // wd.a
    public final void j() {
        e(0L);
    }
}
