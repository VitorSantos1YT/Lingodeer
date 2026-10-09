package s20;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.lingodeer.data.model.AchievementLevelType;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class e implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f51381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f51382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public f f51383c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Handler f51384d;

    /* JADX WARN: Code duplicated, block: B:16:0x004c  */
    /* JADX WARN: Code duplicated, block: B:42:0x00fe  */
    public static File a(e eVar, Context context, b bVar) throws IOException {
        String strReplace;
        int iCeil;
        int i11;
        int iB;
        File file;
        a.SINGLE.getClass();
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeStream(bVar.b(), null, options);
            strReplace = options.outMimeType.replace("image/", ".");
        } catch (Exception unused) {
            strReplace = ".jpg";
        }
        if (TextUtils.isEmpty(eVar.f51381a)) {
            File externalCacheDir = context.getExternalCacheDir();
            if (externalCacheDir != null) {
                file = new File(externalCacheDir, "luban_disk_cache");
                if (!file.mkdirs() && (!file.exists() || !file.isDirectory())) {
                    file = null;
                }
            } else {
                file = null;
            }
            eVar.f51381a = file.getAbsolutePath();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(eVar.f51381a);
        sb2.append("/");
        sb2.append(System.currentTimeMillis());
        sb2.append((int) (Math.random() * 1000.0d));
        sb2.append(TextUtils.isEmpty(strReplace) ? ".jpg" : strReplace);
        File file2 = new File(sb2.toString());
        a aVar = a.SINGLE;
        int i12 = eVar.f51382b;
        String strA = bVar.a();
        aVar.getClass();
        if (i12 > 0) {
            File file3 = new File(strA);
            if (!file3.exists() || file3.length() <= (i12 << 10)) {
                return new File(bVar.a());
            }
        }
        BitmapFactory.Options options2 = new BitmapFactory.Options();
        options2.inJustDecodeBounds = true;
        options2.inSampleSize = 1;
        BitmapFactory.decodeStream(bVar.b(), null, options2);
        int i13 = options2.outWidth;
        int i14 = options2.outHeight;
        BitmapFactory.Options options3 = new BitmapFactory.Options();
        if (i13 % 2 == 1) {
            i13++;
        }
        if (i14 % 2 == 1) {
            i14++;
        }
        int iMax = Math.max(i13, i14);
        float fMin = Math.min(i13, i14) / iMax;
        if (fMin > 1.0f || fMin <= 0.5625d) {
            double d5 = fMin;
            if (d5 > 0.5625d || d5 <= 0.5d) {
                iCeil = (int) Math.ceil(((double) iMax) / (1280.0d / d5));
            } else {
                iCeil = iMax / 1280;
                if (iCeil == 0) {
                    iCeil = 1;
                }
            }
        } else if (iMax < 1664) {
            iCeil = 1;
        } else if (iMax < 4990) {
            iCeil = 2;
        } else if (iMax <= 4990 || iMax >= 10240) {
            iCeil = iMax / 1280;
            if (iCeil == 0) {
                iCeil = 1;
            }
        } else {
            iCeil = 4;
        }
        options3.inSampleSize = iCeil;
        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(bVar.b(), null, options3);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (aVar.a(bVar.b())) {
            byte[] bArrC = a.c(bVar.b());
            int i15 = 0;
            if (bArrC != null) {
                int i16 = 0;
                while (true) {
                    if (i16 + 3 < bArrC.length) {
                        int i17 = i16 + 1;
                        if ((bArrC[i16] & 255) == 255) {
                            int i18 = bArrC[i17] & 255;
                            if (i18 != 255) {
                                i17 = i16 + 2;
                                if (i18 != 216 && i18 != 1) {
                                    if (i18 != 217 && i18 != 218) {
                                        int iB2 = a.b(bArrC, i17, 2, false);
                                        if (iB2 >= 2 && (i17 = i17 + iB2) <= bArrC.length) {
                                            if (i18 == 225 && iB2 >= 8 && a.b(bArrC, i16 + 4, 4, false) == 1165519206 && a.b(bArrC, i16 + 8, 2, false) == 0) {
                                                i16 += 10;
                                                i11 = iB2 - 8;
                                            }
                                        }
                                    }
                                }
                            }
                            i16 = i17;
                        }
                        i11 = 0;
                        i16 = i17;
                    } else {
                        i11 = 0;
                    }
                    if (i11 > 8 && ((iB = a.b(bArrC, i16, 4, false)) == 1229531648 || iB == 1296891946)) {
                        boolean z11 = iB == 1229531648;
                        int iB3 = a.b(bArrC, i16 + 4, 4, z11) + 2;
                        if (iB3 >= 10 && iB3 <= i11) {
                            int i19 = i16 + iB3;
                            int i21 = i11 - iB3;
                            int iB4 = a.b(bArrC, i19 - 2, 2, z11);
                            while (true) {
                                int i22 = iB4 - 1;
                                if (iB4 <= 0 || i21 < 12) {
                                    break;
                                }
                                if (a.b(bArrC, i19, 2, z11) == 274) {
                                    int iB5 = a.b(bArrC, i19 + 8, 2, z11);
                                    if (iB5 == 3) {
                                        i15 = AchievementLevelType.DAY_STREAK_LV_8;
                                        break;
                                    }
                                    if (iB5 == 6) {
                                        i15 = 90;
                                        break;
                                    }
                                    if (iB5 != 8) {
                                        break;
                                    }
                                    i15 = 270;
                                    break;
                                }
                                i19 += 12;
                                i21 -= 12;
                                iB4 = i22;
                            }
                        }
                    }
                }
            }
            Matrix matrix = new Matrix();
            matrix.postRotate(i15);
            bitmapDecodeStream = Bitmap.createBitmap(bitmapDecodeStream, 0, 0, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight(), matrix, true);
        }
        bitmapDecodeStream.compress(Bitmap.CompressFormat.JPEG, 60, byteArrayOutputStream);
        bitmapDecodeStream.recycle();
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        fileOutputStream.write(byteArrayOutputStream.toByteArray());
        fileOutputStream.flush();
        fileOutputStream.close();
        byteArrayOutputStream.close();
        return file2;
    }

    public static a.a b(Context context) {
        a.a aVar = new a.a(7);
        aVar.f5b = 100;
        aVar.f6c = context;
        aVar.f9f = new ArrayList();
        return aVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        f fVar = this.f51383c;
        if (fVar != null) {
            int i11 = message.what;
            if (i11 == 0) {
                fVar.c((File) message.obj);
                return false;
            }
            if (i11 == 1) {
                fVar.onStart();
                return false;
            }
            if (i11 == 2) {
                fVar.onError((Throwable) message.obj);
                return false;
            }
        }
        return false;
    }
}
