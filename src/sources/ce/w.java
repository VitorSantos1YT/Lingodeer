package ce;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Gainmap;
import android.graphics.Paint;
import android.os.Build;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class w {
    public static Bitmap a(FileDescriptor fileDescriptor, BitmapFactory.Options options, ob.m mVar) throws Throwable {
        boolean zU;
        int i11 = Build.VERSION.SDK_INT;
        Bitmap bitmapC = null;
        if (i11 == 34) {
            if ((i11 == 34 && options.inPreferredConfig == Bitmap.Config.HARDWARE) ? ((Boolean) v.f6892a.get()).booleanValue() : false) {
                try {
                    zU = mVar.u();
                } catch (IOException unused) {
                    zU = false;
                }
                if (zU) {
                    Bitmap.Config config = options.inPreferredConfig;
                    Bitmap.Config config2 = Bitmap.Config.HARDWARE;
                    pe.f.a(BuildConfig.VERSION_NAME, config == config2);
                    options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                    try {
                        Bitmap bitmapDecodeFileDescriptor = BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
                        if (bitmapDecodeFileDescriptor == null) {
                            if (bitmapDecodeFileDescriptor != null) {
                            }
                            options.inPreferredConfig = config2;
                            return bitmapC;
                        }
                        try {
                            bitmapC = c(bitmapDecodeFileDescriptor);
                        } catch (Throwable th2) {
                            th = th2;
                            bitmapC = bitmapDecodeFileDescriptor;
                            if (bitmapC != null) {
                                bitmapC.recycle();
                            }
                            options.inPreferredConfig = Bitmap.Config.HARDWARE;
                            throw th;
                        }
                        bitmapDecodeFileDescriptor.recycle();
                        options.inPreferredConfig = config2;
                        return bitmapC;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
            }
        }
        return BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
    }

    public static Bitmap b(InputStream inputStream, BitmapFactory.Options options, y yVar) throws Throwable {
        boolean zU;
        int i11 = Build.VERSION.SDK_INT;
        Bitmap bitmapC = null;
        if (i11 == 34) {
            if ((i11 == 34 && options.inPreferredConfig == Bitmap.Config.HARDWARE) ? ((Boolean) v.f6892a.get()).booleanValue() : false) {
                try {
                    zU = yVar.u();
                } catch (IOException unused) {
                    zU = false;
                }
                if (zU) {
                    Bitmap.Config config = options.inPreferredConfig;
                    Bitmap.Config config2 = Bitmap.Config.HARDWARE;
                    pe.f.a(BuildConfig.VERSION_NAME, config == config2);
                    options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                    try {
                        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStream, null, options);
                        if (bitmapDecodeStream == null) {
                            if (bitmapDecodeStream != null) {
                            }
                            options.inPreferredConfig = config2;
                            return bitmapC;
                        }
                        try {
                            bitmapC = c(bitmapDecodeStream);
                        } catch (Throwable th2) {
                            th = th2;
                            bitmapC = bitmapDecodeStream;
                            if (bitmapC != null) {
                                bitmapC.recycle();
                            }
                            options.inPreferredConfig = Bitmap.Config.HARDWARE;
                            throw th;
                        }
                        bitmapDecodeStream.recycle();
                        options.inPreferredConfig = config2;
                        return bitmapC;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
            }
        }
        return BitmapFactory.decodeStream(inputStream, null, options);
    }

    public static Bitmap c(Bitmap bitmap) {
        Gainmap gainmap = bitmap.getGainmap();
        if (gainmap != null) {
            Bitmap.Config config = gainmap.getGainmapContents().getConfig();
            Bitmap.Config config2 = Bitmap.Config.ALPHA_8;
            if (config == config2) {
                ColorMatrixColorFilter colorMatrixColorFilter = u.f6891a;
                Bitmap gainmapContents = gainmap.getGainmapContents();
                if (gainmapContents.getConfig() == config2) {
                    pe.f.a(BuildConfig.VERSION_NAME, gainmapContents.getConfig() == config2);
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(gainmapContents.getWidth(), gainmapContents.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                    Paint paint = new Paint();
                    paint.setColorFilter(u.f6891a);
                    canvas.drawBitmap(gainmapContents, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, paint);
                    canvas.setBitmap(null);
                    Gainmap gainmap2 = new Gainmap(bitmapCreateBitmap);
                    float[] ratioMin = gainmap.getRatioMin();
                    gainmap2.setRatioMin(ratioMin[0], ratioMin[1], ratioMin[2]);
                    float[] ratioMax = gainmap.getRatioMax();
                    gainmap2.setRatioMax(ratioMax[0], ratioMax[1], ratioMax[2]);
                    float[] gamma = gainmap.getGamma();
                    gainmap2.setGamma(gamma[0], gamma[1], gamma[2]);
                    float[] epsilonSdr = gainmap.getEpsilonSdr();
                    gainmap2.setEpsilonSdr(epsilonSdr[0], epsilonSdr[1], epsilonSdr[2]);
                    float[] epsilonHdr = gainmap.getEpsilonHdr();
                    gainmap2.setEpsilonHdr(epsilonHdr[0], epsilonHdr[1], epsilonHdr[2]);
                    gainmap2.setDisplayRatioForFullHdr(gainmap.getDisplayRatioForFullHdr());
                    gainmap2.setMinDisplayRatioForHdrTransition(gainmap.getMinDisplayRatioForHdrTransition());
                    gainmap = gainmap2;
                }
                bitmap.setGainmap(gainmap);
            }
        }
        return bitmap.copy(Bitmap.Config.HARDWARE, false);
    }
}
