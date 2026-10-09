package ce;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import ay.k0;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 implements td.l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final td.i f6858d = new td.i("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new hd.b(5));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final td.i f6859e = new td.i("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new hd.d(7));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final k0 f6860f = new k0(5);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final List f6861g = Collections.unmodifiableList(Arrays.asList("TP1A", "TD1A.220804.031"));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g0 f6862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wd.a f6863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k0 f6864c = f6860f;

    public i0(wd.a aVar, g0 g0Var) {
        this.f6863b = aVar;
        this.f6862a = g0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // td.l
    public final vd.b0 a(Object obj, int i11, int i12, td.j jVar) throws Exception {
        boolean zIsTerminated;
        boolean zIsTerminated2;
        long jLongValue = ((Long) jVar.c(f6858d)).longValue();
        if (jLongValue < 0 && jLongValue != -1) {
            throw new IllegalArgumentException(defpackage.e.h(jLongValue, "Requested frame must be non-negative, or DEFAULT_FRAME, given: "));
        }
        Integer num = (Integer) jVar.c(f6859e);
        if (num == null) {
            num = 2;
        }
        l lVar = (l) jVar.c(l.f6873g);
        if (lVar == null) {
            lVar = l.f6872f;
        }
        l lVar2 = lVar;
        this.f6864c.getClass();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        boolean z11 = false;
        try {
            this.f6862a.k(mediaMetadataRetriever, obj);
            Bitmap bitmapC = c(obj, mediaMetadataRetriever, jLongValue, num.intValue(), i11, i12, lVar2);
            if (Build.VERSION.SDK_INT < 29) {
                mediaMetadataRetriever.release();
            } else if (mediaMetadataRetriever instanceof AutoCloseable) {
                mediaMetadataRetriever.close();
            } else if (mediaMetadataRetriever instanceof ExecutorService) {
                ExecutorService executorService = (ExecutorService) mediaMetadataRetriever;
                if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated2 = executorService.isTerminated())) {
                    executorService.shutdown();
                    while (!zIsTerminated2) {
                        try {
                            zIsTerminated2 = executorService.awaitTermination(1L, TimeUnit.DAYS);
                        } catch (InterruptedException unused) {
                            if (!z11) {
                                executorService.shutdownNow();
                                z11 = true;
                            }
                        }
                    }
                    if (z11) {
                        Thread.currentThread().interrupt();
                    }
                }
            } else {
                mediaMetadataRetriever.release();
            }
            return c.e(bitmapC, this.f6863b);
        } catch (Throwable th2) {
            if (Build.VERSION.SDK_INT < 29) {
                mediaMetadataRetriever.release();
            } else if (mediaMetadataRetriever instanceof AutoCloseable) {
                mediaMetadataRetriever.close();
            } else if (mediaMetadataRetriever instanceof ExecutorService) {
                ExecutorService executorService2 = (ExecutorService) mediaMetadataRetriever;
                if (executorService2 != ForkJoinPool.commonPool() && !(zIsTerminated = executorService2.isTerminated())) {
                    executorService2.shutdown();
                    while (!zIsTerminated) {
                        try {
                            zIsTerminated = executorService2.awaitTermination(1L, TimeUnit.DAYS);
                        } catch (InterruptedException unused2) {
                            if (!z11) {
                                executorService2.shutdownNow();
                                z11 = true;
                            }
                        }
                    }
                    if (z11) {
                        Thread.currentThread().interrupt();
                    }
                }
            } else {
                mediaMetadataRetriever.release();
            }
            throw th2;
        }
    }

    @Override // td.l
    public final boolean b(Object obj, td.j jVar) {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0091  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:48:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:54:0x00fd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:55:0x00ff A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:61:0x0144 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:62:0x0145  */
    public final Bitmap c(Object obj, MediaMetadataRetriever mediaMetadataRetriever, long j11, int i11, int i12, int i13, l lVar) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        MediaExtractor mediaExtractor;
        String str = Build.DEVICE;
        Bitmap bitmapCreateBitmap = null;
        if (str != null && str.matches(".+_cheets|cheets_.+")) {
            try {
                if ("video/webm".equals(mediaMetadataRetriever.extractMetadata(12))) {
                    mediaExtractor = new MediaExtractor();
                    try {
                        this.f6862a.i(mediaExtractor, obj);
                        int trackCount = mediaExtractor.getTrackCount();
                        for (int i19 = 0; i19 < trackCount; i19++) {
                            if ("video/x-vnd.on2.vp8".equals(mediaExtractor.getTrackFormat(i19).getString("mime"))) {
                                mediaExtractor.release();
                                throw new IllegalStateException("Cannot decode VP8 video on CrOS.");
                            }
                        }
                    } catch (Throwable unused) {
                        if (mediaExtractor != null) {
                        }
                        if (Build.VERSION.SDK_INT >= 27) {
                            try {
                                i16 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
                                i17 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
                                i18 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
                                if (i18 != 90) {
                                    i17 = i16;
                                    i16 = i17;
                                } else {
                                    i17 = i16;
                                    i16 = i17;
                                }
                                float fB = lVar.b(i16, i17, i12, i13);
                                bitmapCreateBitmap = mediaMetadataRetriever.getScaledFrameAtTime(j11, i11, Math.round(i16 * fB), Math.round(fB * i17));
                            } catch (Throwable unused2) {
                            }
                        }
                        if (bitmapCreateBitmap == null) {
                            bitmapCreateBitmap = mediaMetadataRetriever.getFrameAtTime(j11, i11);
                        }
                        if (Build.MODEL.startsWith("Pixel")) {
                            i14 = Build.VERSION.SDK_INT;
                            if (i14 >= 30) {
                                try {
                                    String strExtractMetadata = mediaMetadataRetriever.extractMetadata(36);
                                    String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(35);
                                    i15 = Integer.parseInt(strExtractMetadata);
                                    int i21 = Integer.parseInt(strExtractMetadata2);
                                    if (i15 != 7) {
                                        Matrix matrix = new Matrix();
                                        matrix.postRotate(180.0f, bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f);
                                        bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix, true);
                                    } else {
                                        Matrix matrix2 = new Matrix();
                                        matrix2.postRotate(180.0f, bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f);
                                        bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix2, true);
                                    }
                                } catch (NumberFormatException unused3) {
                                }
                            }
                        } else {
                            i14 = Build.VERSION.SDK_INT;
                            if (i14 >= 30) {
                                String strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(36);
                                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(35);
                                i15 = Integer.parseInt(strExtractMetadata3);
                                int i22 = Integer.parseInt(strExtractMetadata4);
                                if (i15 != 7) {
                                    Matrix matrix3 = new Matrix();
                                    matrix3.postRotate(180.0f, bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f);
                                    bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix3, true);
                                } else {
                                    Matrix matrix4 = new Matrix();
                                    matrix4.postRotate(180.0f, bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f);
                                    bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix4, true);
                                }
                            }
                        }
                        if (bitmapCreateBitmap != null) {
                            return bitmapCreateBitmap;
                        }
                        throw new h0("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
                    }
                    mediaExtractor.release();
                }
            } catch (Throwable unused4) {
                mediaExtractor = null;
            }
        }
        if (Build.VERSION.SDK_INT >= 27 && i12 != Integer.MIN_VALUE && i13 != Integer.MIN_VALUE && lVar != l.f6871e) {
            i16 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            i17 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
            i18 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            if (i18 != 90 || i18 == 270) {
                i17 = i16;
                i16 = i17;
            }
            float fB2 = lVar.b(i16, i17, i12, i13);
            bitmapCreateBitmap = mediaMetadataRetriever.getScaledFrameAtTime(j11, i11, Math.round(i16 * fB2), Math.round(fB2 * i17));
        }
        if (bitmapCreateBitmap == null) {
            bitmapCreateBitmap = mediaMetadataRetriever.getFrameAtTime(j11, i11);
        }
        if (Build.MODEL.startsWith("Pixel") || Build.VERSION.SDK_INT != 33) {
            i14 = Build.VERSION.SDK_INT;
            if (i14 >= 30 && i14 < 33) {
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(36);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(35);
                i15 = Integer.parseInt(strExtractMetadata5);
                int i23 = Integer.parseInt(strExtractMetadata6);
                if ((i15 != 7 || i15 == 6) && i23 == 6 && Math.abs(Integer.parseInt(mediaMetadataRetriever.extractMetadata(24))) == 180) {
                    Matrix matrix5 = new Matrix();
                    matrix5.postRotate(180.0f, bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f);
                    bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix5, true);
                }
            }
        } else {
            Iterator it = f6861g.iterator();
            do {
                if (it.hasNext()) {
                }
            } while (!Build.ID.startsWith((String) it.next()));
            String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(36);
            String strExtractMetadata8 = mediaMetadataRetriever.extractMetadata(35);
            i15 = Integer.parseInt(strExtractMetadata7);
            int i24 = Integer.parseInt(strExtractMetadata8);
            if (i15 != 7) {
                Matrix matrix6 = new Matrix();
                matrix6.postRotate(180.0f, bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f);
                bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix6, true);
            } else {
                Matrix matrix7 = new Matrix();
                matrix7.postRotate(180.0f, bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f);
                bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix7, true);
            }
        }
        if (bitmapCreateBitmap != null) {
            return bitmapCreateBitmap;
        }
        throw new h0("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
    }
}
