package fr;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.protobuf.DescriptorProtos;
import com.google.zxing.pdf417.decoder.vBn.xTCJ;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.Sentence;
import com.lingo.lingoskill.object.Word;
import com.lingo.lingoskill.ui.base.ENO.MzwEyWCkjXL;
import com.lingodeer.data.model.AchievementLevelType;
import com.lingodeer.data.model.KnowledgeNote;
import com.lingodeer.data.model.SRSStatus;
import com.lingodeer.data.model.uistate.CourseTestSummaryItemStatus;
import com.lingodeer.network.model.ServerReviewDataItem;
import com.yalantis.ucrop.UCrop;
import com.yalantis.ucrop.view.CropImageView;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import rt.m5;
import rt.oc;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class j3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile boolean f27634a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static WeakReference f27635b;

    public static final long A(int i11) {
        return L(4294967296L, i11);
    }

    public static String B(Word word) {
        kotlin.jvm.internal.m.f(word, "word");
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        int i11 = cf.x.n().keyLanguage;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    switch (i11) {
                        case 11:
                            break;
                        case 12:
                            break;
                        case 13:
                            break;
                        default:
                            String word2 = word.getWord();
                            kotlin.jvm.internal.m.e(word2, "getWord(...)");
                            return word2;
                    }
                }
                String zhuyin = cf.x.n().koDisPlay == 0 ? word.getZhuyin() : word.getWord();
                kotlin.jvm.internal.m.c(zhuyin);
                return zhuyin;
            }
            String luoma = (cf.x.n().jsDisPlay == 2 || cf.x.n().jsDisPlay == 4) ? word.getLuoma() : word.getWord();
            kotlin.jvm.internal.m.c(luoma);
            return luoma;
        }
        String zhuyin2 = cf.x.n().csDisplay == 0 ? word.getZhuyin() : word.getWord();
        kotlin.jvm.internal.m.c(zhuyin2);
        return zhuyin2;
    }

    public static boolean F(org.greenrobot.greendao.database.a aVar, boolean z11, String str) {
        int i11;
        if (aVar != null && !TextUtils.isEmpty(str)) {
            Cursor cursorD = null;
            try {
                try {
                    cursorD = aVar.d(ep.a.g("SELECT COUNT(*) FROM `", z11 ? "sqlite_temp_master" : "sqlite_master", "` WHERE type = ? AND name = ?"), new String[]{"table", str});
                    if (cursorD != null && cursorD.moveToFirst()) {
                        i11 = cursorD.getInt(0);
                        cursorD.close();
                        return i11 > 0;
                    }
                    if (cursorD != null) {
                        cursorD.close();
                        return false;
                    }
                } catch (Exception e8) {
                    e8.printStackTrace();
                    if (cursorD != null) {
                        cursorD.close();
                    }
                    i11 = 0;
                }
            } catch (Throwable th2) {
                if (cursorD != null) {
                    cursorD.close();
                }
                throw th2;
            }
        }
        return false;
    }

    public static final int G(Context context, int i11) {
        kotlin.jvm.internal.m.f(context, "<this>");
        return context.getColor(i11);
    }

    public static Drawable H(Context context, int i11, Resources.Theme theme) {
        if (theme != null) {
            p.e eVar = new p.e(context);
            eVar.f46183b = theme;
            eVar.a(theme.getResources().getConfiguration());
            context = eVar;
        }
        return jh.h.k(context, i11);
    }

    public static q6.i I(a0.p1 p1Var, q6.m polygon) {
        List listK;
        kotlin.jvm.internal.m.f(polygon, "polygon");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List list = polygon.f47504a;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            q6.g gVar = (q6.g) list.get(i11);
            List list2 = gVar.f47484a;
            int size2 = list2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                if ((gVar instanceof q6.e) && i12 == list2.size() / 2) {
                    arrayList2.add(new qy.l(gVar, Integer.valueOf(arrayList.size())));
                }
                arrayList.add(list2.get(i12));
            }
        }
        Float fValueOf = Float.valueOf(CropImageView.DEFAULT_ASPECT_RATIO);
        int iW = ry.n.W(arrayList, 9);
        if (iW == 0) {
            listK = ns.o.K(fValueOf);
        } else {
            ArrayList arrayList3 = new ArrayList(iW + 1);
            arrayList3.add(fValueOf);
            int size3 = arrayList.size();
            int i13 = 0;
            while (i13 < size3) {
                Object obj = arrayList.get(i13);
                i13++;
                float fFloatValue = fValueOf.floatValue();
                float fC = p1Var.c((q6.c) obj);
                if (fC < CropImageView.DEFAULT_ASPECT_RATIO) {
                    throw new IllegalArgumentException("Measured cubic is expected to be greater or equal to zero");
                }
                fValueOf = Float.valueOf(fFloatValue + fC);
                arrayList3.add(fValueOf);
            }
            listK = arrayList3;
        }
        float fFloatValue2 = ((Number) ry.m.z0(listK)).floatValue();
        y.u uVar = new y.u(listK.size());
        int size4 = listK.size();
        for (int i14 = 0; i14 < size4; i14++) {
            uVar.a(((Number) listK.get(i14)).floatValue() / fFloatValue2);
        }
        sy.c cVarO = ns.o.o();
        int size5 = arrayList2.size();
        for (int i15 = 0; i15 < size5; i15++) {
            int iIntValue = ((Number) ((qy.l) arrayList2.get(i15)).f48496b).intValue();
            cVarO.add(new q6.k((uVar.b(iIntValue + 1) + uVar.b(iIntValue)) / 2, (q6.g) ((qy.l) arrayList2.get(i15)).f48495a));
        }
        return new q6.i(p1Var, ns.o.e(cVarO), arrayList, uVar);
    }

    public static dm.a J() {
        if (dm.a.f23483c == null) {
            synchronized (dm.a.class) {
                if (dm.a.f23483c == null) {
                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                    kotlin.jvm.internal.m.c(lingoSkillApplication);
                    dm.a.f23483c = new dm.a(lingoSkillApplication);
                }
            }
        }
        dm.a aVar = dm.a.f23483c;
        kotlin.jvm.internal.m.c(aVar);
        return aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void K(r4.f[] fVarArr, Path path) {
        int i11;
        float f5;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        r4.f[] fVarArr2 = fVarArr;
        float[] fArr = new float[6];
        int length = fVarArr2.length;
        int i12 = 0;
        int i13 = 0;
        char c11 = 'm';
        while (i13 < length) {
            r4.f fVar = fVarArr2[i13];
            char c12 = fVar.f48798a;
            float[] fArr2 = fVar.f48799b;
            float f21 = fArr[i12];
            float f22 = fArr[1];
            float f23 = fArr[2];
            float f24 = fArr[3];
            float f25 = fArr[4];
            int i14 = i12;
            float f26 = fArr[5];
            switch (c12) {
                case 'A':
                case 'a':
                    i11 = 7;
                    break;
                case 'C':
                case 'c':
                    i11 = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i11 = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i11 = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path.moveTo(f25, f26);
                    f21 = f25;
                    f23 = f21;
                    f22 = f26;
                    f24 = f22;
                default:
                    i11 = 2;
                    break;
            }
            float f27 = f25;
            float f28 = f26;
            float f29 = f21;
            float f30 = f22;
            int i15 = i14;
            while (i15 < fArr2.length) {
                if (c12 == 'A') {
                    fArr2 = fArr2;
                    i15 = i15;
                    fVar = fVar;
                    float f31 = f30;
                    i13 = i13;
                    int i16 = i15 + 5;
                    int i17 = i15 + 6;
                    r4.f.a(path, f29, f31, fArr2[i16], fArr2[i17], fArr2[i15], fArr2[i15 + 1], fArr2[i15 + 2], fArr2[i15 + 3] != CropImageView.DEFAULT_ASPECT_RATIO ? 1 : i14, fArr2[i15 + 4] != CropImageView.DEFAULT_ASPECT_RATIO ? 1 : i14);
                    f23 = fArr2[i16];
                    f5 = fArr2[i17];
                    f24 = f5;
                    f11 = f23;
                } else if (c12 == 'C') {
                    fArr2 = fArr2;
                    i15 = i15;
                    i13 = i13;
                    fVar = fVar;
                    int i18 = i15 + 2;
                    int i19 = i15 + 3;
                    int i21 = i15 + 4;
                    int i22 = i15 + 5;
                    path.cubicTo(fArr2[i15], fArr2[i15 + 1], fArr2[i18], fArr2[i19], fArr2[i21], fArr2[i22]);
                    float f32 = fArr2[i21];
                    float f33 = fArr2[i22];
                    f23 = fArr2[i18];
                    f24 = fArr2[i19];
                    f5 = f33;
                    f11 = f32;
                } else if (c12 == 'H') {
                    fArr2 = fArr2;
                    i15 = i15;
                    fVar = fVar;
                    f5 = f30;
                    i13 = i13;
                    path.lineTo(fArr2[i15], f5);
                    f11 = fArr2[i15];
                } else if (c12 == 'Q') {
                    fArr2 = fArr2;
                    i15 = i15;
                    i13 = i13;
                    fVar = fVar;
                    int i23 = i15 + 1;
                    int i24 = i15 + 2;
                    int i25 = i15 + 3;
                    path.quadTo(fArr2[i15], fArr2[i23], fArr2[i24], fArr2[i25]);
                    float f34 = fArr2[i15];
                    float f35 = fArr2[i23];
                    float f36 = fArr2[i24];
                    float f37 = fArr2[i25];
                    f23 = f34;
                    f24 = f35;
                    f11 = f36;
                    f5 = f37;
                } else if (c12 == 'V') {
                    fArr2 = fArr2;
                    i15 = i15;
                    i13 = i13;
                    fVar = fVar;
                    f11 = f29;
                    path.lineTo(f11, fArr2[i15]);
                    f5 = fArr2[i15];
                } else if (c12 != 'a') {
                    if (c12 == 'c') {
                        fArr2 = fArr2;
                        i15 = i15;
                        int i26 = i15 + 2;
                        int i27 = i15 + 3;
                        int i28 = i15 + 4;
                        int i29 = i15 + 5;
                        path.rCubicTo(fArr2[i15], fArr2[i15 + 1], fArr2[i26], fArr2[i27], fArr2[i28], fArr2[i29]);
                        float f38 = fArr2[i26] + f29;
                        float f39 = fArr2[i27] + f30;
                        f29 += fArr2[i28];
                        f30 += fArr2[i29];
                        f23 = f38;
                        f24 = f39;
                    } else if (c12 != 'h') {
                        if (c12 != 'q') {
                            if (c12 != 'v') {
                                if (c12 == 'L') {
                                    fArr2 = fArr2;
                                    i15 = i15;
                                    int i30 = i15 + 1;
                                    path.lineTo(fArr2[i15], fArr2[i30]);
                                    f11 = fArr2[i15];
                                    f5 = fArr2[i30];
                                } else if (c12 == 'M') {
                                    fArr2 = fArr2;
                                    i15 = i15;
                                    f11 = fArr2[i15];
                                    f5 = fArr2[i15 + 1];
                                    if (i15 > 0) {
                                        path.lineTo(f11, f5);
                                    } else {
                                        path.moveTo(f11, f5);
                                        f27 = f11;
                                        f28 = f5;
                                    }
                                } else if (c12 == 'S') {
                                    fArr2 = fArr2;
                                    i15 = i15;
                                    if (c11 == 'c' || c11 == 's' || c11 == 'C' || c11 == 'S') {
                                        f29 = (f29 * 2.0f) - f23;
                                        f30 = (f30 * 2.0f) - f24;
                                    }
                                    float f40 = f29;
                                    float f41 = f30;
                                    int i31 = i15 + 1;
                                    int i32 = i15 + 2;
                                    int i33 = i15 + 3;
                                    path.cubicTo(f40, f41, fArr2[i15], fArr2[i31], fArr2[i32], fArr2[i33]);
                                    f23 = fArr2[i15];
                                    f24 = fArr2[i31];
                                    f11 = fArr2[i32];
                                    f5 = fArr2[i33];
                                } else if (c12 == 'T') {
                                    fArr2 = fArr2;
                                    i15 = i15;
                                    if (c11 == 'q' || c11 == 't' || c11 == 'Q' || c11 == 'T') {
                                        f29 = (f29 * 2.0f) - f23;
                                        f30 = (f30 * 2.0f) - f24;
                                    }
                                    int i34 = i15 + 1;
                                    path.quadTo(f29, f30, fArr2[i15], fArr2[i34]);
                                    f11 = fArr2[i15];
                                    f5 = fArr2[i34];
                                    fVar = fVar;
                                    f23 = f29;
                                    f24 = f30;
                                } else if (c12 == 'l') {
                                    fArr2 = fArr2;
                                    i15 = i15;
                                    int i35 = i15 + 1;
                                    path.rLineTo(fArr2[i15], fArr2[i35]);
                                    f29 += fArr2[i15];
                                    f15 = fArr2[i35];
                                } else if (c12 == 'm') {
                                    fArr2 = fArr2;
                                    i15 = i15;
                                    float f42 = fArr2[i15];
                                    f29 += f42;
                                    float f43 = fArr2[i15 + 1];
                                    f30 += f43;
                                    if (i15 > 0) {
                                        path.rLineTo(f42, f43);
                                    } else {
                                        path.rMoveTo(f42, f43);
                                        fVar = fVar;
                                        f11 = f29;
                                        f27 = f11;
                                        f5 = f30;
                                        f28 = f5;
                                    }
                                } else if (c12 != 's') {
                                    if (c12 != 't') {
                                        f11 = f29;
                                    } else {
                                        if (c11 == 'q' || c11 == 't' || c11 == 'Q' || c11 == 'T') {
                                            f18 = f29 - f23;
                                            f19 = f30 - f24;
                                        } else {
                                            f19 = CropImageView.DEFAULT_ASPECT_RATIO;
                                            f18 = CropImageView.DEFAULT_ASPECT_RATIO;
                                        }
                                        int i36 = i15 + 1;
                                        path.rQuadTo(f18, f19, fArr2[i15], fArr2[i36]);
                                        float f44 = f18 + f29;
                                        float f45 = f19 + f30;
                                        float f46 = f29 + fArr2[i15];
                                        f30 += fArr2[i36];
                                        f24 = f45;
                                        f11 = f46;
                                        f23 = f44;
                                    }
                                    f5 = f30;
                                } else {
                                    if (c11 == 'c' || c11 == 's' || c11 == 'C' || c11 == 'S') {
                                        f16 = f30 - f24;
                                        f17 = f29 - f23;
                                    } else {
                                        f17 = CropImageView.DEFAULT_ASPECT_RATIO;
                                        f16 = CropImageView.DEFAULT_ASPECT_RATIO;
                                    }
                                    int i37 = i15;
                                    int i38 = i37 + 1;
                                    int i39 = i37 + 2;
                                    int i40 = i37 + 3;
                                    fArr2 = fArr2;
                                    i15 = i37;
                                    path.rCubicTo(f17, f16, fArr2[i37], fArr2[i38], fArr2[i39], fArr2[i40]);
                                    f12 = fArr2[i15] + f29;
                                    f13 = fArr2[i38] + f30;
                                    f29 += fArr2[i39];
                                    f14 = fArr2[i40];
                                }
                                fVar = fVar;
                            } else {
                                fArr2 = fArr2;
                                i15 = i15;
                                path.rLineTo(CropImageView.DEFAULT_ASPECT_RATIO, fArr2[i15]);
                                f15 = fArr2[i15];
                            }
                            f30 += f15;
                        } else {
                            fArr2 = fArr2;
                            i15 = i15;
                            int i41 = i15 + 1;
                            int i42 = i15 + 2;
                            int i43 = i15 + 3;
                            path.rQuadTo(fArr2[i15], fArr2[i41], fArr2[i42], fArr2[i43]);
                            f12 = fArr2[i15] + f29;
                            f13 = fArr2[i41] + f30;
                            f29 += fArr2[i42];
                            f14 = fArr2[i43];
                        }
                        f30 += f14;
                        f23 = f12;
                        f24 = f13;
                    } else {
                        fArr2 = fArr2;
                        i15 = i15;
                        path.rLineTo(fArr2[i15], CropImageView.DEFAULT_ASPECT_RATIO);
                        f29 += fArr2[i15];
                    }
                    fVar = fVar;
                    f11 = f29;
                    f5 = f30;
                } else {
                    fArr2 = fArr2;
                    i15 = i15;
                    int i44 = i15 + 5;
                    float f47 = fArr2[i44] + f29;
                    int i45 = i15 + 6;
                    float f48 = fArr2[i45] + f30;
                    fVar = fVar;
                    float f49 = f29;
                    float f50 = f30;
                    i13 = i13;
                    r4.f.a(path, f49, f50, f47, f48, fArr2[i15], fArr2[i15 + 1], fArr2[i15 + 2], fArr2[i15 + 3] != CropImageView.DEFAULT_ASPECT_RATIO ? 1 : i14, fArr2[i15 + 4] != CropImageView.DEFAULT_ASPECT_RATIO ? 1 : i14);
                    f11 = f49 + fArr2[i44];
                    f5 = f50 + fArr2[i45];
                    f23 = f11;
                    f24 = f5;
                }
                i15 += i11;
                path = path;
                fVar = fVar;
                c12 = c12;
                i13 = i13;
                f29 = f11;
                f30 = f5;
                c11 = c12;
                fArr2 = fArr2;
            }
            fArr[i14] = f29;
            fArr[1] = f30;
            fArr[2] = f23;
            fArr[3] = f24;
            fArr[4] = f27;
            fArr[5] = f28;
            c11 = fVar.f48798a;
            i13++;
            fVarArr2 = fVarArr;
            i12 = i14;
        }
    }

    public static final long L(long j11, float f5) {
        long jFloatToRawIntBits = j11 | (((long) Float.floatToRawIntBits(f5)) & 4294967295L);
        v3.p[] pVarArr = v3.o.f53500b;
        return jFloatToRawIntBits;
    }

    public static int M(int i11) {
        if (i11 > 0) {
            return Math.abs(new Random().nextInt()) % i11;
        }
        throw new RuntimeException();
    }

    public static int N(int i11, int i12) {
        if (i11 < 0 || i11 > i12) {
            throw new IllegalArgumentException();
        }
        return M(i12 - i11) + i11;
    }

    public static int[] O(int i11) {
        Random random = new Random();
        ArrayList arrayList = new ArrayList();
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            arrayList.add(Integer.valueOf(i13));
        }
        int[] iArr = new int[i11];
        while (arrayList.size() > 0) {
            int iAbs = Math.abs(random.nextInt()) % arrayList.size();
            iArr[i12] = ((Integer) arrayList.get(iAbs)).intValue();
            arrayList.remove(iAbs);
            i12++;
        }
        return iArr;
    }

    public static int[] P(int i11, int i12) {
        Random random = new Random();
        if (i12 > i11) {
            i12 = i11;
        }
        ArrayList arrayList = new ArrayList();
        while (arrayList.size() < i12) {
            int iAbs = Math.abs(random.nextInt()) % i11;
            if (-1 == arrayList.indexOf(Integer.valueOf(iAbs))) {
                arrayList.add(Integer.valueOf(iAbs));
            }
            if (arrayList.size() >= i11) {
                break;
            }
        }
        int[] iArr = new int[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            iArr[i13] = ((Integer) arrayList.get(i13)).intValue();
        }
        return iArr;
    }

    public static void Q(org.greenrobot.greendao.database.a aVar, String str, boolean z11, Class... clsArr) {
        if (clsArr.length < 1) {
            return;
        }
        try {
            for (Class cls : clsArr) {
                cls.getDeclaredMethod(str, org.greenrobot.greendao.database.a.class, Boolean.TYPE).invoke(null, aVar, Boolean.valueOf(z11));
            }
        } catch (IllegalAccessException e8) {
            e8.printStackTrace();
        } catch (NoSuchMethodException e10) {
            e10.printStackTrace();
        } catch (InvocationTargetException e11) {
            e11.printStackTrace();
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0097 A[FALL_THROUGH] */
    public static boolean R(b10.b bVar) {
        char cN;
        if (bVar.f()) {
            if (!bVar.l('<')) {
                int i11 = 0;
                boolean z11 = true;
                while (bVar.f()) {
                    char cN2 = bVar.n();
                    if (cN2 == ' ') {
                        return !z11;
                    }
                    if (cN2 == '\\') {
                        bVar.k();
                        char cN3 = bVar.n();
                        switch (cN3) {
                            default:
                                switch (cN3) {
                                    default:
                                        switch (cN3) {
                                            case '[':
                                            case '\\':
                                            case ']':
                                            case '^':
                                            case '_':
                                            case UCrop.RESULT_ERROR /* 96 */:
                                                break;
                                            default:
                                                switch (cN3) {
                                                    case '{':
                                                    case '|':
                                                    case AchievementLevelType.DAY_STREAK_LV_7 /* 125 */:
                                                    case '~':
                                                        break;
                                                    default:
                                                        continue;
                                                }
                                                break;
                                        }
                                    case ':':
                                    case ';':
                                    case '<':
                                    case '=':
                                    case '>':
                                    case '?':
                                    case '@':
                                        bVar.k();
                                        break;
                                }
                            case '!':
                            case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                            case '#':
                            case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                            case '%':
                            case '&':
                            case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                            case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                            case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                            case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                            case '+':
                            case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                            case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                            case '.':
                            case '/':
                                bVar.k();
                                break;
                        }
                    } else if (cN2 == '(') {
                        i11++;
                        if (i11 <= 32) {
                            bVar.k();
                        }
                    } else if (cN2 != ')') {
                        if (Character.isISOControl(cN2)) {
                            return !z11;
                        }
                        bVar.k();
                    } else {
                        if (i11 == 0) {
                            return true;
                        }
                        i11--;
                        bVar.k();
                    }
                    z11 = false;
                }
                return true;
            }
            while (bVar.f() && (cN = bVar.n()) != '\n' && cN != '<') {
                if (cN == '>') {
                    bVar.k();
                    return true;
                }
                if (cN == '\\') {
                    bVar.k();
                    char cN4 = bVar.n();
                    switch (cN4) {
                        case '!':
                        case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                        case '#':
                        case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                        case '%':
                        case '&':
                        case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                        case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                        case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                        case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                        case '+':
                        case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                        case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                        case '.':
                        case '/':
                            bVar.k();
                            break;
                        default:
                            switch (cN4) {
                                case ':':
                                case ';':
                                case '<':
                                case '=':
                                case '>':
                                case '?':
                                case '@':
                                    bVar.k();
                                    break;
                                default:
                                    switch (cN4) {
                                        case '[':
                                        case '\\':
                                        case ']':
                                        case '^':
                                        case '_':
                                        case UCrop.RESULT_ERROR /* 96 */:
                                            bVar.k();
                                            break;
                                        default:
                                            switch (cN4) {
                                                case '{':
                                                case '|':
                                                case AchievementLevelType.DAY_STREAK_LV_7 /* 125 */:
                                                case '~':
                                                    break;
                                                default:
                                                    continue;
                                            }
                                            bVar.k();
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                } else {
                    bVar.k();
                }
            }
        }
        return false;
    }

    public static boolean S(b10.b bVar) {
        while (bVar.f()) {
            switch (bVar.n()) {
                case '[':
                    return false;
                case '\\':
                    bVar.k();
                    char cN = bVar.n();
                    switch (cN) {
                        case '!':
                        case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                        case '#':
                        case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                        case '%':
                        case '&':
                        case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                        case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                        case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                        case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                        case '+':
                        case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                        case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                        case '.':
                        case '/':
                            bVar.k();
                            break;
                        default:
                            switch (cN) {
                                case ':':
                                case ';':
                                case '<':
                                case '=':
                                case '>':
                                case '?':
                                case '@':
                                    bVar.k();
                                    break;
                                default:
                                    switch (cN) {
                                        case '[':
                                        case '\\':
                                        case ']':
                                        case '^':
                                        case '_':
                                        case UCrop.RESULT_ERROR /* 96 */:
                                            bVar.k();
                                            break;
                                        default:
                                            switch (cN) {
                                                case '{':
                                                case '|':
                                                case AchievementLevelType.DAY_STREAK_LV_7 /* 125 */:
                                                case '~':
                                                    break;
                                                default:
                                                    continue;
                                            }
                                            bVar.k();
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
                case ']':
                    return true;
                default:
                    bVar.k();
                    break;
            }
        }
        return true;
    }

    public static boolean T(b10.b bVar, char c11) {
        while (bVar.f()) {
            char cN = bVar.n();
            if (cN == '\\') {
                bVar.k();
                char cN2 = bVar.n();
                switch (cN2) {
                    case '!':
                    case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                    case '#':
                    case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    case '%':
                    case '&':
                    case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                    case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                    case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                    case '+':
                    case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                    case '.':
                    case '/':
                        bVar.k();
                        break;
                    default:
                        switch (cN2) {
                            case ':':
                            case ';':
                            case '<':
                            case '=':
                            case '>':
                            case '?':
                            case '@':
                                bVar.k();
                                break;
                            default:
                                switch (cN2) {
                                    case '[':
                                    case '\\':
                                    case ']':
                                    case '^':
                                    case '_':
                                    case UCrop.RESULT_ERROR /* 96 */:
                                        bVar.k();
                                        break;
                                    default:
                                        switch (cN2) {
                                            case '{':
                                            case '|':
                                            case AchievementLevelType.DAY_STREAK_LV_7 /* 125 */:
                                            case '~':
                                                break;
                                            default:
                                                continue;
                                        }
                                        bVar.k();
                                        break;
                                }
                                break;
                        }
                        break;
                }
            } else {
                if (cN == c11) {
                    return true;
                }
                if (c11 == ')' && cN == '(') {
                    return false;
                }
                bVar.k();
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0029  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object U(int i11, Object obj, n3.a0 a0Var, n3.s sVar, int i12) {
        Object[] objArr;
        if (!(obj instanceof Typeface)) {
            return obj;
        }
        boolean z11 = false;
        int i13 = 0;
        z11 = false;
        if ((i11 & 1) == 0 || kotlin.jvm.internal.m.a(a0Var.f43127b, sVar)) {
            objArr = false;
        } else {
            n3.s sVar2 = n3.s.f43175d;
            if (sVar.compareTo(sVar2) < 0 || kotlin.jvm.internal.m.h(a0Var.f43127b.f43179a, sVar2.f43179a) >= 0) {
                objArr = false;
            } else {
                objArr = true;
            }
        }
        Object[] objArr2 = ((i11 & 2) == 0 || i12 == a0Var.f43128c) ? false : true;
        if (objArr2 != true && objArr != true) {
            return obj;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            int i14 = objArr != false ? sVar.f43179a : a0Var.f43127b.f43179a;
            if (objArr2 == false ? a0Var.f43128c == 1 : i12 == 1) {
                z11 = true;
            }
            return a2.l.d((Typeface) obj, i14, z11);
        }
        Object[] objArr3 = objArr2 == true && i12 == 1;
        if (objArr3 == true && objArr == true) {
            i13 = 3;
        } else if (objArr == true) {
            i13 = 1;
        } else if (objArr3 != false) {
            i13 = 2;
        }
        return Typeface.create((Typeface) obj, i13);
    }

    public static byte[] V(fb.j data) {
        kotlin.jvm.internal.m.f(data, "data");
        HashMap map = data.f27096a;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            try {
                dataOutputStream.writeShort(-21521);
                dataOutputStream.writeShort(1);
                dataOutputStream.writeInt(map.size());
                for (Map.Entry entry : map.entrySet()) {
                    W(dataOutputStream, (String) entry.getKey(), entry.getValue());
                }
                dataOutputStream.flush();
                if (dataOutputStream.size() > 10240) {
                    throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                dataOutputStream.close();
                kotlin.jvm.internal.m.e(byteArray, "{\n                ByteAr…          }\n            }");
                return byteArray;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    ns.o.m(dataOutputStream, th2);
                    throw th3;
                }
            }
        } catch (IOException unused) {
            int i11 = fb.k.f27097a;
            fb.l.b().getClass();
            return new byte[0];
        }
    }

    public static final void W(DataOutputStream dataOutputStream, String str, Object obj) throws IOException {
        int i11;
        if (obj == null) {
            dataOutputStream.writeByte(0);
        } else if (obj instanceof Boolean) {
            dataOutputStream.writeByte(1);
            dataOutputStream.writeBoolean(((Boolean) obj).booleanValue());
        } else if (obj instanceof Byte) {
            dataOutputStream.writeByte(2);
            dataOutputStream.writeByte(((Number) obj).byteValue());
        } else if (obj instanceof Integer) {
            dataOutputStream.writeByte(3);
            dataOutputStream.writeInt(((Number) obj).intValue());
        } else if (obj instanceof Long) {
            dataOutputStream.writeByte(4);
            dataOutputStream.writeLong(((Number) obj).longValue());
        } else if (obj instanceof Float) {
            dataOutputStream.writeByte(5);
            dataOutputStream.writeFloat(((Number) obj).floatValue());
        } else if (obj instanceof Double) {
            dataOutputStream.writeByte(6);
            dataOutputStream.writeDouble(((Number) obj).doubleValue());
        } else if (obj instanceof String) {
            dataOutputStream.writeByte(7);
            dataOutputStream.writeUTF((String) obj);
        } else {
            if (!(obj instanceof Object[])) {
                throw new IllegalArgumentException("Unsupported value type " + kotlin.jvm.internal.z.a(obj.getClass()).g());
            }
            Object[] objArr = (Object[]) obj;
            kotlin.jvm.internal.e eVarA = kotlin.jvm.internal.z.a(objArr.getClass());
            if (eVarA.equals(kotlin.jvm.internal.z.a(Boolean[].class))) {
                i11 = 8;
            } else if (eVarA.equals(kotlin.jvm.internal.z.a(Byte[].class))) {
                i11 = 9;
            } else if (eVarA.equals(kotlin.jvm.internal.z.a(Integer[].class))) {
                i11 = 10;
            } else if (eVarA.equals(kotlin.jvm.internal.z.a(Long[].class))) {
                i11 = 11;
            } else if (eVarA.equals(kotlin.jvm.internal.z.a(Float[].class))) {
                i11 = 12;
            } else if (eVarA.equals(kotlin.jvm.internal.z.a(Double[].class))) {
                i11 = 13;
            } else {
                if (!eVarA.equals(kotlin.jvm.internal.z.a(String[].class))) {
                    throw new IllegalArgumentException("Unsupported value type " + kotlin.jvm.internal.z.a(objArr.getClass()).f());
                }
                i11 = 14;
            }
            dataOutputStream.writeByte(i11);
            dataOutputStream.writeInt(objArr.length);
            for (Object obj2 : objArr) {
                if (i11 == 8) {
                    Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
                    dataOutputStream.writeBoolean(bool != null ? bool.booleanValue() : false);
                } else if (i11 == 9) {
                    Byte b3 = obj2 instanceof Byte ? (Byte) obj2 : null;
                    dataOutputStream.writeByte(b3 != null ? b3.byteValue() : (byte) 0);
                } else if (i11 == 10) {
                    Integer num = obj2 instanceof Integer ? (Integer) obj2 : null;
                    dataOutputStream.writeInt(num != null ? num.intValue() : 0);
                } else if (i11 == 11) {
                    Long l9 = obj2 instanceof Long ? (Long) obj2 : null;
                    dataOutputStream.writeLong(l9 != null ? l9.longValue() : 0L);
                } else if (i11 == 12) {
                    Float f5 = obj2 instanceof Float ? (Float) obj2 : null;
                    dataOutputStream.writeFloat(f5 != null ? f5.floatValue() : CropImageView.DEFAULT_ASPECT_RATIO);
                } else if (i11 == 13) {
                    Double d5 = obj2 instanceof Double ? (Double) obj2 : null;
                    dataOutputStream.writeDouble(d5 != null ? d5.doubleValue() : 0.0d);
                } else if (i11 == 14) {
                    String str2 = obj2 instanceof String ? (String) obj2 : null;
                    if (str2 == null) {
                        str2 = "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d";
                    }
                    dataOutputStream.writeUTF(str2);
                }
            }
        }
        dataOutputStream.writeUTF(str);
    }

    public static String X(int i11) {
        Object[] objArr = {Integer.valueOf(Color.red(i11)), Integer.valueOf(Color.green(i11)), Integer.valueOf(Color.blue(i11)), Double.valueOf(((double) Color.alpha(i11)) / 255.0d)};
        String str = b7.f0.f3975a;
        return String.format(Locale.US, "rgba(%d,%d,%d,%.3f)", objArr);
    }

    public static final String Y(String str) {
        if (str == null || str.length() == 0) {
            return "-";
        }
        if (str.length() <= 48) {
            return str;
        }
        return oz.q.g1(48, str) + "…(" + str.length() + ")";
    }

    public static final float Z(Number number, Context context) {
        kotlin.jvm.internal.m.f(context, "context");
        return ff.h.l(number.floatValue());
    }

    public static final void a(wc.h hVar, fz.a progress, z1.r rVar, ad.t tVar, z1.e eVar, w2.j jVar, l1.n nVar, int i11, int i12, int i13) {
        kotlin.jvm.internal.m.f(progress, "progress");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(382909894);
        wc.e0 e0Var = wc.e0.AUTOMATIC;
        ad.t tVar2 = (i13 & 512) != 0 ? null : tVar;
        z1.e eVar2 = (i13 & 1024) != 0 ? z1.c.f58467e : eVar;
        w2.j jVar2 = (i13 & 2048) != 0 ? w2.i.f54515b : jVar;
        wc.a aVar = wc.a.AUTOMATIC;
        sVar.e0(185152185);
        Object objQ = sVar.Q();
        l1.g gVar = l1.m.f39353a;
        if (objQ == gVar) {
            objQ = new wc.v();
            sVar.o0(objQ);
        }
        wc.v vVar = (wc.v) objQ;
        sVar.p(false);
        sVar.e0(185152232);
        Object objQ2 = sVar.Q();
        if (objQ2 == gVar) {
            objQ2 = new Matrix();
            sVar.o0(objQ2);
        }
        Matrix matrix = (Matrix) objQ2;
        sVar.p(false);
        sVar.e0(185152312);
        boolean zF = sVar.f(hVar);
        Object objQ3 = sVar.Q();
        if (zF || objQ3 == gVar) {
            objQ3 = l1.t.B(null);
            sVar.o0(objQ3);
        }
        l1.b1 b1Var = (l1.b1) objQ3;
        sVar.p(false);
        sVar.e0(185152364);
        if (hVar == null || hVar.b() == CropImageView.DEFAULT_ASPECT_RATIO) {
            j0.o.a(rVar, sVar, (i11 >> 6) & 14);
            sVar.p(false);
            l1.x1 x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new ad.j(hVar, progress, rVar, e0Var, tVar2, eVar2, jVar2, aVar, i11, i12, i13, 0);
                return;
            }
            return;
        }
        sVar.p(false);
        w2.j jVar3 = jVar2;
        Rect rect = hVar.f54967k;
        Context context = (Context) sVar.j(AndroidCompositionLocals_androidKt.f1200b);
        int iWidth = rect.width();
        int iHeight = rect.height();
        kotlin.jvm.internal.m.f(rVar, "<this>");
        z1.r rVarI = rVar.i(new ad.l(iWidth, iHeight));
        z1.e eVar3 = eVar2;
        ad.t tVar3 = tVar2;
        d0.n.b(0, new ad.k(rect, jVar3, eVar3, matrix, vVar, e0Var, aVar, hVar, tVar3, context, progress, b1Var), sVar, rVarI);
        l1.x1 x1VarT2 = sVar.t();
        if (x1VarT2 != null) {
            x1VarT2.f39502d = new ad.j(hVar, progress, rVar, e0Var, tVar3, eVar3, jVar3, aVar, i11, i12, i13, 1);
        }
    }

    public static final boolean b(KnowledgeNote knowledgeNote, KnowledgeNote knowledgeNote2) {
        return kotlin.jvm.internal.m.a(knowledgeNote.getId(), knowledgeNote2.getId()) && kotlin.jvm.internal.m.a(knowledgeNote.getLan(), knowledgeNote2.getLan()) && kotlin.jvm.internal.m.a(knowledgeNote.getNoteTypeCode(), knowledgeNote2.getNoteTypeCode()) && knowledgeNote.getElemId() == knowledgeNote2.getElemId() && kotlin.jvm.internal.m.a(knowledgeNote.getNote(), knowledgeNote2.getNote()) && knowledgeNote.isDeleted() == knowledgeNote2.isDeleted();
    }

    public static final void c(List list, fz.c cVar) {
        if (list.isEmpty()) {
            return;
        }
        ry.m.y0(ry.m.U0(list, Math.min(list.size(), 5)), "\n", null, null, cVar, 30);
        list.size();
    }

    public static final String d(SRSStatus sRSStatus) {
        String id2 = sRSStatus.getId();
        int elemType = sRSStatus.getElemType();
        long elemId = sRSStatus.getElemId();
        String strName = sRSStatus.getStatus().name();
        String strName2 = sRSStatus.getReviewVisibilityMode().name();
        boolean zIsExcludedFromReview = sRSStatus.isExcludedFromReview();
        boolean pendingUpdate = sRSStatus.getPendingUpdate();
        long lastStudyTime = sRSStatus.getLastStudyTime();
        long lastReviewTime = sRSStatus.getLastReviewTime();
        long nextReviewTime = sRSStatus.getNextReviewTime();
        long lastModifierTime = sRSStatus.getLastModifierTime();
        StringBuilder sbQ = defpackage.e.q(elemType, "id=", id2, ", elem=", "/");
        b7.e0.w(elemId, ", status=", strName, sbQ);
        sbQ.append(", visibility=");
        sbQ.append(strName2);
        sbQ.append(", excluded=");
        sbQ.append(zIsExcludedFromReview);
        sbQ.append(", pending=");
        sbQ.append(pendingUpdate);
        sbQ.append(", study=");
        sbQ.append(lastStudyTime);
        ep.a.y(lastReviewTime, ", review=", ", next=", sbQ);
        sbQ.append(nextReviewTime);
        sbQ.append(", modified=");
        sbQ.append(lastModifierTime);
        return sbQ.toString();
    }

    public static final String e(ServerReviewDataItem serverReviewDataItem) {
        String data_key = serverReviewDataItem.getData_key();
        long update_timestamp = serverReviewDataItem.getUpdate_timestamp();
        return defpackage.e.p(com.google.android.material.datepicker.d.m(update_timestamp, "dataKey=", data_key, ", update="), ", srsMeta=", Y(serverReviewDataItem.getSrs_meta_data()), ", practiceMeta=", Y(serverReviewDataItem.getPractice_meta_data()));
    }

    public static final oc g(int i11, int i12, Map knowPoints) {
        int i13;
        kotlin.jvm.internal.m.f(knowPoints, "knowPoints");
        Collection collectionValues = knowPoints.values();
        if ((collectionValues instanceof Collection) && collectionValues.isEmpty()) {
            i13 = 0;
        } else {
            Iterator it = collectionValues.iterator();
            i13 = 0;
            while (it.hasNext()) {
                if (((Number) it.next()).intValue() == 1 && (i13 = i13 + 1) < 0) {
                    ns.o.U();
                    throw null;
                }
            }
        }
        int size = knowPoints.size() + i11;
        int i14 = i11 + i12;
        return new oc(i13, size, size > 0 ? (int) ((i13 / size) * 100) : 0, i14 > 0 ? i12 / i14 : 1.0f);
    }

    public static final LinkedHashMap h(Map knowPoints, Set skippedReviewIds) {
        CourseTestSummaryItemStatus courseTestSummaryItemStatus;
        kotlin.jvm.internal.m.f(knowPoints, "knowPoints");
        kotlin.jvm.internal.m.f(skippedReviewIds, "skippedReviewIds");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : knowPoints.entrySet()) {
            String str = (String) entry.getKey();
            int iIntValue = ((Number) entry.getValue()).intValue();
            String strD1 = oz.q.d1(str, ":", str);
            if (iIntValue != 1) {
                courseTestSummaryItemStatus = CourseTestSummaryItemStatus.WRONG;
            } else {
                Object obj = linkedHashMap.get(strD1);
                CourseTestSummaryItemStatus courseTestSummaryItemStatus2 = CourseTestSummaryItemStatus.WRONG;
                courseTestSummaryItemStatus = obj == courseTestSummaryItemStatus2 ? courseTestSummaryItemStatus2 : CourseTestSummaryItemStatus.CORRECT;
            }
            linkedHashMap.put(strD1, courseTestSummaryItemStatus);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(linkedHashMap.keySet());
        linkedHashSet.addAll(skippedReviewIds);
        for (String str2 : linkedHashSet) {
            CourseTestSummaryItemStatus courseTestSummaryItemStatus3 = (CourseTestSummaryItemStatus) linkedHashMap.get(str2);
            if (courseTestSummaryItemStatus3 == null) {
                courseTestSummaryItemStatus3 = CourseTestSummaryItemStatus.SKIPPED;
            }
            linkedHashMap2.put(str2, courseTestSummaryItemStatus3);
        }
        return linkedHashMap2;
    }

    public static final void i(long j11) {
        v3.p[] pVarArr = v3.o.f53500b;
        if ((j11 & 1095216660480L) == 0) {
            v3.i.a("Cannot perform operation for Unspecified type.");
        }
    }

    public static final void j(long j11, long j12) {
        v3.p[] pVarArr = v3.o.f53500b;
        if ((j11 & 1095216660480L) == 0 || (1095216660480L & j12) == 0) {
            v3.i.a("Cannot perform operation for Unspecified type.");
        }
        if (v3.p.a(v3.o.b(j11), v3.o.b(j12))) {
            return;
        }
        v3.i.a("Cannot perform operation for " + ((Object) v3.p.b(v3.o.b(j11))) + " and " + ((Object) v3.p.b(v3.o.b(j12))));
    }

    public static float[] k(float[] fArr, int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int iMin = Math.min(i11, length);
        float[] fArr2 = new float[i11];
        System.arraycopy(fArr, 0, fArr2, 0, iMin);
        return fArr2;
    }

    public static com.bumptech.glide.l l(com.bumptech.glide.c cVar, List list, com.bumptech.glide.g gVar) {
        td.l aVar;
        td.l fVar;
        Class cls;
        wd.a aVar2 = cVar.f7607b;
        m0.n nVar = cVar.f7610e;
        com.bumptech.glide.i iVar = cVar.f7609d;
        Context applicationContext = iVar.getApplicationContext();
        a5.f fVar2 = iVar.f7636h;
        com.bumptech.glide.l lVar = new com.bumptech.glide.l();
        ce.k kVar = new ce.k();
        com.android.billingclient.api.m mVar = lVar.f7646g;
        synchronized (mVar) {
            mVar.f7554a.add(kVar);
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 27) {
            ce.s sVar = new ce.s();
            com.android.billingclient.api.m mVar2 = lVar.f7646g;
            synchronized (mVar2) {
                mVar2.f7554a.add(sVar);
            }
        }
        Resources resources = applicationContext.getResources();
        ArrayList arrayListE = lVar.e();
        ge.b bVar = new ge.b(applicationContext, arrayListE, aVar2, nVar);
        td.l i0Var = new ce.i0(aVar2, new p3(5));
        ce.o oVar = new ce.o(lVar.e(), resources.getDisplayMetrics(), aVar2, nVar);
        if (i11 < 28 || !((Map) fVar2.f378b).containsKey(com.bumptech.glide.d.class)) {
            td.l eVar = new ce.e(oVar, 0);
            aVar = new ce.a(2, oVar, nVar);
            fVar = eVar;
        } else {
            td.l fVar3 = new ce.f(1);
            fVar = new ce.f(0);
            aVar = fVar3;
        }
        if (i11 >= 28) {
            lVar.d("Animation", InputStream.class, Drawable.class, new ee.b(new ee.c(arrayListE, nVar), 1));
            lVar.d("Animation", ByteBuffer.class, Drawable.class, new ee.b(new ee.c(arrayListE, nVar), 0));
        }
        td.l fVar4 = new ee.f(applicationContext);
        td.m bVar2 = new ce.b(nVar);
        he.b c0Var = new com.android.billingclient.api.c0(4, (byte) 0);
        he.b dVar = new he.d(1);
        ContentResolver contentResolver = applicationContext.getContentResolver();
        lVar.b(ByteBuffer.class, new zd.x(5));
        lVar.b(InputStream.class, new m5(nVar, 12));
        lVar.d("Bitmap", ByteBuffer.class, Bitmap.class, fVar);
        lVar.d("Bitmap", InputStream.class, Bitmap.class, aVar);
        String str = Build.FINGERPRINT;
        if ("robolectric".equals(str)) {
            cls = ParcelFileDescriptor.class;
        } else {
            cls = ParcelFileDescriptor.class;
            lVar.d("Bitmap", cls, Bitmap.class, new ce.e(oVar, 1));
        }
        lVar.d("Bitmap", AssetFileDescriptor.class, Bitmap.class, new ce.i0(aVar2, new p20.c(4)));
        lVar.d("Bitmap", cls, Bitmap.class, i0Var);
        zd.r rVar = zd.x.f59202b;
        lVar.a(Bitmap.class, Bitmap.class, rVar);
        lVar.d("Bitmap", Bitmap.class, Bitmap.class, new ce.e0(0));
        lVar.c(Bitmap.class, bVar2);
        lVar.d("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new ce.a(resources, fVar));
        lVar.d("BitmapDrawable", InputStream.class, BitmapDrawable.class, new ce.a(resources, aVar));
        lVar.d("BitmapDrawable", cls, BitmapDrawable.class, new ce.a(resources, i0Var));
        lVar.c(BitmapDrawable.class, new ob.u(2, aVar2, bVar2));
        lVar.d("Animation", InputStream.class, ge.d.class, new ge.k(arrayListE, bVar, nVar));
        lVar.d("Animation", ByteBuffer.class, ge.d.class, bVar);
        lVar.c(ge.d.class, new tw.c(13));
        lVar.a(sd.d.class, sd.d.class, rVar);
        lVar.d("Bitmap", sd.d.class, Bitmap.class, new ce.e(aVar2, 2));
        lVar.d("legacy_append", Uri.class, Drawable.class, fVar4);
        lVar.d("legacy_append", Uri.class, Bitmap.class, new ce.a(1, fVar4, aVar2));
        lVar.h(new com.bumptech.glide.load.data.g(2));
        lVar.a(File.class, ByteBuffer.class, new zd.x(6));
        lVar.a(File.class, InputStream.class, new zd.g(new zd.x(9), 12));
        lVar.d("legacy_append", File.class, File.class, new ce.e0(2));
        lVar.a(File.class, cls, new zd.g(new zd.x(8), 12));
        lVar.a(File.class, File.class, rVar);
        lVar.h(new com.bumptech.glide.load.data.l(nVar));
        if (!"robolectric".equals(str)) {
            lVar.h(new com.bumptech.glide.load.data.g(1));
        }
        zd.r aVar3 = new oi.a(applicationContext);
        zd.r eVar2 = new m9.e(applicationContext);
        zd.r aVar4 = new hq.a(applicationContext, false);
        Class cls2 = Integer.TYPE;
        lVar.a(cls2, InputStream.class, aVar3);
        lVar.a(Integer.class, InputStream.class, aVar3);
        lVar.a(cls2, AssetFileDescriptor.class, eVar2);
        lVar.a(Integer.class, AssetFileDescriptor.class, eVar2);
        lVar.a(cls2, Drawable.class, aVar4);
        lVar.a(Integer.class, Drawable.class, aVar4);
        lVar.a(Uri.class, InputStream.class, new ae.b(applicationContext, 4));
        lVar.a(Uri.class, AssetFileDescriptor.class, new p.a(applicationContext, 2));
        zd.r dVar2 = new t7.d(resources, 12);
        zd.r aVar5 = new he.a(resources);
        zd.r dVar3 = new w00.d(resources);
        lVar.a(Integer.class, Uri.class, dVar2);
        lVar.a(cls2, Uri.class, dVar2);
        lVar.a(Integer.class, AssetFileDescriptor.class, aVar5);
        lVar.a(cls2, AssetFileDescriptor.class, aVar5);
        lVar.a(Integer.class, InputStream.class, dVar3);
        lVar.a(cls2, InputStream.class, dVar3);
        lVar.a(String.class, InputStream.class, new m5(11));
        lVar.a(Uri.class, InputStream.class, new m5(11));
        lVar.a(String.class, InputStream.class, new zd.x(13));
        lVar.a(String.class, cls, new zd.x(12));
        lVar.a(String.class, AssetFileDescriptor.class, new zd.x(11));
        lVar.a(Uri.class, InputStream.class, new tp.e(applicationContext.getAssets(), 8));
        lVar.a(Uri.class, AssetFileDescriptor.class, new yb.g(applicationContext.getAssets()));
        lVar.a(Uri.class, InputStream.class, new ae.b(applicationContext, 0));
        lVar.a(Uri.class, InputStream.class, new hd.b(applicationContext, 1));
        if (i11 >= 29) {
            lVar.a(Uri.class, InputStream.class, new ae.e(applicationContext, InputStream.class));
            lVar.a(Uri.class, cls, new ae.e(applicationContext, cls));
        }
        boolean zContainsKey = ((Map) fVar2.f378b).containsKey(com.bumptech.glide.g.class);
        lVar.a(Uri.class, InputStream.class, new zd.z(contentResolver, zContainsKey, 2));
        lVar.a(Uri.class, cls, new zd.z(contentResolver, zContainsKey, 1));
        lVar.a(Uri.class, AssetFileDescriptor.class, new zd.z(contentResolver, zContainsKey, 0));
        lVar.a(Uri.class, InputStream.class, new zd.x(14));
        lVar.a(URL.class, InputStream.class, new ay.k0(1));
        lVar.a(Uri.class, File.class, new p.a(applicationContext, 1));
        lVar.a(zd.h.class, InputStream.class, new dm.a(2));
        lVar.a(byte[].class, ByteBuffer.class, new zd.x(2));
        lVar.a(byte[].class, InputStream.class, new zd.x(4));
        lVar.a(Uri.class, Uri.class, rVar);
        lVar.a(Drawable.class, Drawable.class, rVar);
        lVar.d("legacy_append", Drawable.class, Drawable.class, new ce.e0(1));
        lVar.i(Bitmap.class, BitmapDrawable.class, new he.a(resources));
        lVar.i(Bitmap.class, byte[].class, c0Var);
        lVar.i(Drawable.class, byte[].class, new xq.c(aVar2, c0Var, dVar, 11));
        lVar.i(ge.d.class, byte[].class, dVar);
        td.l i0Var2 = new ce.i0(aVar2, new tw.c(4));
        lVar.d("legacy_append", ByteBuffer.class, Bitmap.class, i0Var2);
        lVar.d("legacy_append", ByteBuffer.class, BitmapDrawable.class, new ce.a(resources, i0Var2));
        Iterator it = list.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        if (gVar != null) {
            gVar.u(applicationContext, cVar, lVar);
        }
        return lVar;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002c  */
    /* JADX WARN: Code duplicated, block: B:17:0x0042  */
    /* JADX WARN: Code duplicated, block: B:41:0x0091  */
    /* JADX WARN: Code duplicated, block: B:46:0x009c A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b1 A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d7 A[SYNTHETIC] */
    public static r4.f[] m(String str) {
        int i11;
        String strTrim;
        float[] fArrK;
        ArrayList arrayList = new ArrayList();
        int i12 = 0;
        int i13 = 0;
        int i14 = 1;
        while (i14 < str.length()) {
            while (i14 < str.length()) {
                char cCharAt = str.charAt(i14);
                if ((cCharAt - 'Z') * (cCharAt - 'A') > 0) {
                    if ((cCharAt - 'z') * (cCharAt - 'a') > 0) {
                        continue;
                    } else if (cCharAt != 'e' && cCharAt != 'E') {
                        strTrim = str.substring(i13, i14).trim();
                        if (strTrim.isEmpty()) {
                            if (strTrim.charAt(i12) != 'z' || strTrim.charAt(i12) == 'Z') {
                                fArrK = new float[i12];
                            } else {
                                try {
                                    float[] fArr = new float[strTrim.length()];
                                    int length = strTrim.length();
                                    int i15 = i12;
                                    int i16 = 1;
                                    while (i16 < length) {
                                        int i17 = i12;
                                        int i18 = i17;
                                        int i19 = i18;
                                        int i21 = i19;
                                        for (int i22 = i16; i22 < strTrim.length(); i22++) {
                                            char cCharAt2 = strTrim.charAt(i22);
                                            if (cCharAt2 == ' ') {
                                                i17 = 0;
                                                i19 = 1;
                                            } else if (cCharAt2 != 'E' && cCharAt2 != 'e') {
                                                switch (cCharAt2) {
                                                    case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                                        i17 = 0;
                                                        i19 = 1;
                                                        break;
                                                    case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                                        if (i22 == i16 || i17 != 0) {
                                                            i17 = 0;
                                                        } else {
                                                            i17 = 0;
                                                            i19 = 1;
                                                            i21 = 1;
                                                        }
                                                        break;
                                                    case '.':
                                                        if (i18 == 0) {
                                                            i17 = 0;
                                                            i18 = 1;
                                                        } else {
                                                            i17 = 0;
                                                            i19 = 1;
                                                            i21 = 1;
                                                        }
                                                        break;
                                                    default:
                                                        i17 = 0;
                                                        break;
                                                }
                                            } else {
                                                i17 = 1;
                                            }
                                            if (i19 != 0) {
                                                if (i16 < i22) {
                                                    fArr[i15] = Float.parseFloat(strTrim.substring(i16, i22));
                                                    i15++;
                                                }
                                                if (i21 != 0) {
                                                    i16 = i22;
                                                } else {
                                                    i16 = i22 + 1;
                                                }
                                                i12 = 0;
                                            }
                                        }
                                        if (i16 < i22) {
                                            fArr[i15] = Float.parseFloat(strTrim.substring(i16, i22));
                                            i15++;
                                        }
                                        if (i21 != 0) {
                                            i16 = i22;
                                        } else {
                                            i16 = i22 + 1;
                                        }
                                        i12 = 0;
                                    }
                                    fArrK = k(fArr, i15);
                                    i12 = 0;
                                } catch (NumberFormatException e8) {
                                    throw new RuntimeException(ep.a.g("error in parsing \"", strTrim, "\""), e8);
                                }
                            }
                            arrayList.add(new r4.f(strTrim.charAt(i12), fArrK));
                        }
                        i13 = i14;
                        i14++;
                        i12 = 0;
                    }
                } else if (cCharAt != 'e') {
                    continue;
                }
                i14++;
            }
            strTrim = str.substring(i13, i14).trim();
            if (strTrim.isEmpty()) {
                if (strTrim.charAt(i12) != 'z') {
                    fArrK = new float[i12];
                } else {
                    fArrK = new float[i12];
                }
                arrayList.add(new r4.f(strTrim.charAt(i12), fArrK));
            }
            i13 = i14;
            i14++;
            i12 = 0;
        }
        if (i14 - i13 != 1 || i13 >= str.length()) {
            i11 = 0;
        } else {
            i11 = 0;
            arrayList.add(new r4.f(str.charAt(i13), new float[0]));
        }
        return (r4.f[]) arrayList.toArray(new r4.f[i11]);
    }

    public static Path n(String str) {
        Path path = new Path();
        try {
            K(m(str), path);
            return path;
        } catch (RuntimeException e8) {
            throw new RuntimeException("Error in parsing ".concat(str), e8);
        }
    }

    public static r4.f[] p(r4.f[] fVarArr) {
        r4.f[] fVarArr2 = new r4.f[fVarArr.length];
        for (int i11 = 0; i11 < fVarArr.length; i11++) {
            fVarArr2[i11] = new r4.f(fVarArr[i11]);
        }
        return fVarArr2;
    }

    public static View q(View view, int i11) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View viewFindViewById = viewGroup.getChildAt(i12).findViewById(i11);
            if (viewFindViewById != null) {
                return viewFindViewById;
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.Serializable, java.lang.Double[]] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.io.Serializable, java.lang.Float[]] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.io.Serializable, java.lang.Long[]] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.io.Serializable, java.lang.Integer[]] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.io.Serializable, java.lang.Byte[]] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.io.Serializable, java.lang.Boolean[]] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.io.Serializable, java.lang.String[]] */
    public static final Serializable r(DataInputStream dataInputStream, byte b3) throws IOException {
        if (b3 == 0) {
            return null;
        }
        if (b3 == 1) {
            return Boolean.valueOf(dataInputStream.readBoolean());
        }
        if (b3 == 2) {
            return Byte.valueOf(dataInputStream.readByte());
        }
        if (b3 == 3) {
            return Integer.valueOf(dataInputStream.readInt());
        }
        if (b3 == 4) {
            return Long.valueOf(dataInputStream.readLong());
        }
        if (b3 == 5) {
            return Float.valueOf(dataInputStream.readFloat());
        }
        if (b3 == 6) {
            return Double.valueOf(dataInputStream.readDouble());
        }
        if (b3 == 7) {
            return dataInputStream.readUTF();
        }
        int i11 = 0;
        if (b3 == 8) {
            int i12 = dataInputStream.readInt();
            ?? r9 = new Boolean[i12];
            while (i11 < i12) {
                r9[i11] = Boolean.valueOf(dataInputStream.readBoolean());
                i11++;
            }
            return r9;
        }
        if (b3 == 9) {
            int i13 = dataInputStream.readInt();
            ?? r11 = new Byte[i13];
            while (i11 < i13) {
                r11[i11] = Byte.valueOf(dataInputStream.readByte());
                i11++;
            }
            return r11;
        }
        if (b3 == 10) {
            int i14 = dataInputStream.readInt();
            ?? r12 = new Integer[i14];
            while (i11 < i14) {
                r12[i11] = Integer.valueOf(dataInputStream.readInt());
                i11++;
            }
            return r12;
        }
        if (b3 == 11) {
            int i15 = dataInputStream.readInt();
            ?? r13 = new Long[i15];
            while (i11 < i15) {
                r13[i11] = Long.valueOf(dataInputStream.readLong());
                i11++;
            }
            return r13;
        }
        if (b3 == 12) {
            int i16 = dataInputStream.readInt();
            ?? r14 = new Float[i16];
            while (i11 < i16) {
                r14[i11] = Float.valueOf(dataInputStream.readFloat());
                i11++;
            }
            return r14;
        }
        if (b3 == 13) {
            int i17 = dataInputStream.readInt();
            ?? r15 = new Double[i17];
            while (i11 < i17) {
                r15[i11] = Double.valueOf(dataInputStream.readDouble());
                i11++;
            }
            return r15;
        }
        if (b3 != 14) {
            throw new IllegalStateException(nv.p.j(b3, "Unsupported type "));
        }
        int i18 = dataInputStream.readInt();
        ?? r16 = new String[i18];
        while (i11 < i18) {
            String utf = dataInputStream.readUTF();
            if (kotlin.jvm.internal.m.a(utf, "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d")) {
                utf = null;
            }
            r16[i11] = utf;
            i11++;
        }
        return r16;
    }

    public static final ob.j s(ob.p pVar) {
        kotlin.jvm.internal.m.f(pVar, "<this>");
        return new ob.j(pVar.f44848a, pVar.f44866t);
    }

    public static Drawable u(Context context, Context context2, int i11, Resources.Theme theme) {
        try {
            if (f27634a) {
                return H(context2, i11, theme);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e8) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e8;
            }
            return context2.getDrawable(i11);
        } catch (NoClassDefFoundError unused2) {
            f27634a = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        Resources resources = context2.getResources();
        ThreadLocal threadLocal = q4.j.f47447a;
        return resources.getDrawable(i11, theme);
    }

    public static final long v(double d5) {
        return L(8589934592L, (float) d5);
    }

    public static final long w(String str) {
        kotlin.jvm.internal.m.f(str, "<this>");
        if (!oz.x.s0(str, "#", false)) {
            return g2.x.f28621h;
        }
        if (str.length() == 9) {
            String strSubstring = str.substring(7, 9);
            kotlin.jvm.internal.m.e(strSubstring, "substring(...)");
            String strSubstring2 = str.substring(1, 7);
            kotlin.jvm.internal.m.e(strSubstring2, "substring(...)");
            str = "#" + strSubstring + strSubstring2;
        }
        return g2.f0.c(Color.parseColor(str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v34 */
    /* JADX WARN: Type inference failed for: r10v35, types: [int] */
    /* JADX WARN: Type inference failed for: r10v36, types: [int] */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v21, types: [int] */
    /* JADX WARN: Type inference failed for: r12v42 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v16, types: [int] */
    /* JADX WARN: Type inference failed for: r14v34 */
    /* JADX WARN: Type inference failed for: r14v35 */
    /* JADX WARN: Type inference failed for: r15v10, types: [int] */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8, types: [int] */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r19v10 */
    /* JADX WARN: Type inference failed for: r19v11 */
    /* JADX WARN: Type inference failed for: r19v15 */
    /* JADX WARN: Type inference failed for: r19v8 */
    /* JADX WARN: Type inference failed for: r19v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    public static ArrayList x(Sentence sentence) {
        List listK;
        int i11;
        List listT;
        int i12;
        List listK2;
        List listT2;
        List listK3;
        List listT3;
        List listK4;
        List listT4;
        Iterator<Word> it;
        ?? r19;
        String word;
        boolean z11;
        List listK5;
        kotlin.jvm.internal.m.f(sentence, "sentence");
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        int i13 = cf.x.n().keyLanguage;
        int i14 = 10;
        ry.r rVar = ry.r.f50854a;
        int i15 = 0;
        int i16 = 1;
        if (i13 != 0) {
            int i17 = 6;
            if (i13 != 1) {
                if (i13 != 2) {
                    switch (i13) {
                        case 11:
                            break;
                        case 12:
                            break;
                        case 13:
                            break;
                        default:
                            List<Word> sentWords = sentence.getSentWords();
                            kotlin.jvm.internal.m.e(sentWords, "getSentWords(...)");
                            return qi.b.g(sentWords, true);
                    }
                }
                List<Word> sentWords2 = sentence.getSentWords();
                ArrayList arrayListR = b7.e0.r("getSentWords(...)", sentWords2);
                boolean z12 = false;
                for (Word word2 : sentWords2) {
                    if ((word2.getWordType() != i16 || kotlin.jvm.internal.m.a(word2.getWord(), " ")) && !TextUtils.isEmpty(word2.getWord())) {
                        if (kotlin.jvm.internal.m.a(word2.getWord(), " ")) {
                            word = word2.getWord();
                        } else {
                            String word3 = word2.getWord();
                            kotlin.jvm.internal.m.e(word3, "getWord(...)");
                            word = oz.q.i1(word3).toString();
                        }
                        int[] iArrO = O(word.length());
                        if (word.length() <= i16 || z12) {
                            z11 = z12;
                        } else {
                            while (true) {
                                String word4 = word2.getWord();
                                kotlin.jvm.internal.m.e(word4, "getWord(...)");
                                int length = oz.q.i1(word4).toString().length();
                                int i18 = i16;
                                for (int i19 = 0; i19 < length; i19++) {
                                    if (i19 != iArrO[i19]) {
                                        i18 = 0;
                                    }
                                }
                                if (i18 != 0) {
                                    iArrO = O(word.length());
                                    i16 = 1;
                                } else {
                                    z11 = true;
                                }
                            }
                        }
                        String zhuyin = word2.getZhuyin();
                        kotlin.jvm.internal.m.e(zhuyin, "getZhuyin(...)");
                        Pattern patternCompile = Pattern.compile(" ");
                        kotlin.jvm.internal.m.e(patternCompile, "compile(...)");
                        oz.q.U0(0);
                        Matcher matcher = patternCompile.matcher(zhuyin);
                        if (matcher.find()) {
                            ArrayList arrayList = new ArrayList(i14);
                            int iC = 0;
                            do {
                                iC = nv.p.c(matcher, zhuyin, iC, arrayList);
                            } while (matcher.find());
                            nv.p.B(iC, zhuyin, arrayList);
                            listK5 = arrayList;
                        } else {
                            listK5 = ns.o.K(zhuyin.toString());
                        }
                        ArrayList arrayListC1 = ry.m.c1(listK5);
                        int length2 = word.length();
                        for (int i21 = 0; i21 < length2; i21++) {
                            char cCharAt = word.charAt(i21);
                            if (kotlin.jvm.internal.m.a(String.valueOf(cCharAt), " ")) {
                                arrayListC1.add(oz.q.H0(word, cCharAt, 0, 6), " ");
                            }
                        }
                        int length3 = iArrO.length;
                        int i22 = 0;
                        while (i22 < length3) {
                            int i23 = iArrO[i22];
                            Word word5 = new Word();
                            word5.setWord(String.valueOf(word.charAt(i23)));
                            if (i23 < arrayListC1.size()) {
                                word5.setZhuyin((String) arrayListC1.get(i23));
                            }
                            word5.getWord();
                            word5.getZhuyin();
                            arrayListR.add(word5);
                            i22++;
                            i14 = 10;
                        }
                        z12 = z11;
                    } else {
                        i14 = 10;
                    }
                    i16 = 1;
                }
                return arrayListR;
            }
            List<Word> sentWords3 = sentence.getSentWords();
            ArrayList arrayListR2 = b7.e0.r("getSentWords(...)", sentWords3);
            Iterator<Word> it2 = sentWords3.iterator();
            boolean z13 = false;
            while (it2.hasNext()) {
                Word next = it2.next();
                if (next.getWordType() == 1 || TextUtils.isEmpty(next.getZhuyin())) {
                    it2 = it2;
                    z13 = z13;
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    HashMap map = new HashMap();
                    for (?? r12 = i15; r12 < 45; r12++) {
                        String str = qi.b.f47803a[r12];
                        String zhuyin2 = next.getZhuyin();
                        kotlin.jvm.internal.m.e(zhuyin2, "getZhuyin(...)");
                        int iI0 = oz.q.I0(zhuyin2, str, i15, i15, i17);
                        if (iI0 != -1) {
                            str.getClass();
                            map.put(Integer.valueOf(iI0), Integer.valueOf(str.length()));
                        }
                    }
                    String luoma = next.getLuoma();
                    kotlin.jvm.internal.m.e(luoma, "getLuoma(...)");
                    Pattern patternCompile2 = Pattern.compile(" ");
                    kotlin.jvm.internal.m.e(patternCompile2, "compile(...)");
                    oz.q.U0(i15);
                    Matcher matcher2 = patternCompile2.matcher(luoma);
                    if (matcher2.find()) {
                        ArrayList arrayList3 = new ArrayList(10);
                        ?? C = i15;
                        do {
                            C = nv.p.c(matcher2, luoma, C, arrayList3);
                        } while (matcher2.find());
                        nv.p.B(C, luoma, arrayList3);
                        listK3 = arrayList3;
                    } else {
                        listK3 = ns.o.K(luoma.toString());
                    }
                    if (listK3.isEmpty()) {
                        listT3 = rVar;
                    } else {
                        ListIterator listIterator = listK3.listIterator(listK3.size());
                        while (true) {
                            if (!listIterator.hasPrevious()) {
                                listT3 = rVar;
                            } else if (((String) listIterator.previous()).length() != 0) {
                                listT3 = b7.e0.t(listIterator, 1, listK3);
                            }
                        }
                    }
                    String[] strArr = (String[]) listT3.toArray(new String[i15]);
                    int length4 = next.getZhuyin().length();
                    ?? r14 = i15;
                    ?? r15 = r14;
                    ?? r9 = i15;
                    ?? r16 = r14;
                    while (r16 < length4) {
                        Iterator it3 = map.keySet().iterator();
                        ?? r11 = r9;
                        while (true) {
                            if (it3.hasNext()) {
                                r19 = r11;
                                Object next2 = it3.next();
                                it = it2;
                                kotlin.jvm.internal.m.e(next2, "next(...)");
                                int iIntValue = ((Number) next2).intValue();
                                if (r16 >= iIntValue) {
                                    Object obj = map.get(Integer.valueOf(iIntValue));
                                    kotlin.jvm.internal.m.c(obj);
                                    if (r16 < ((Number) obj).intValue() + iIntValue) {
                                        if (r16 != iIntValue) {
                                            z13 = z13;
                                            break;
                                        }
                                        String zhuyin3 = next.getZhuyin();
                                        kotlin.jvm.internal.m.e(zhuyin3, "getZhuyin(...)");
                                        Object obj2 = map.get(Integer.valueOf(iIntValue));
                                        kotlin.jvm.internal.m.c(obj2);
                                        String strSubstring = zhuyin3.substring(iIntValue, ((Number) obj2).intValue() + iIntValue);
                                        kotlin.jvm.internal.m.e(strSubstring, "substring(...)");
                                        Word word6 = new Word();
                                        word6.setWord(strSubstring);
                                        word6.setLuoma(strArr[r15]);
                                        arrayList2.add(word6);
                                        r19 = r19;
                                    }
                                }
                                it2 = it;
                                r11 = r19 == true ? 1 : 0;
                                z13 = z13;
                            } else {
                                it = it2;
                                r19 = r11;
                                String strValueOf = String.valueOf(next.getZhuyin().charAt(r16));
                                Word word7 = new Word();
                                word7.setWord(strValueOf);
                                word7.setLuoma(strArr[r15]);
                                arrayList2.add(word7);
                            }
                            r15++;
                            break;
                        }
                        it2 = it;
                        r9 = r19;
                        z13 = z13;
                        r16++;
                        r15 = r15;
                    }
                    Iterator<Word> it4 = it2;
                    boolean z14 = z13;
                    int i24 = r9 == true ? 1 : 0;
                    Collections.shuffle(arrayList2);
                    if (strArr.length <= 1 || z14) {
                        z13 = z14;
                    } else {
                        while (true) {
                            String luoma2 = next.getLuoma();
                            kotlin.jvm.internal.m.e(luoma2, "getLuoma(...)");
                            Pattern patternCompile3 = Pattern.compile(" ");
                            kotlin.jvm.internal.m.e(patternCompile3, "compile(...)");
                            oz.q.U0(i24 == true ? 1 : 0);
                            Matcher matcher3 = patternCompile3.matcher(luoma2);
                            if (matcher3.find()) {
                                ArrayList arrayList4 = new ArrayList(10);
                                int iC2 = i24 == true ? 1 : 0;
                                while (true) {
                                    iC2 = nv.p.c(matcher3, luoma2, iC2, arrayList4);
                                    if (matcher3.find()) {
                                        i24 = 0;
                                    } else {
                                        nv.p.B(iC2, luoma2, arrayList4);
                                        listK4 = arrayList4;
                                    }
                                }
                            } else {
                                listK4 = ns.o.K(luoma2.toString());
                            }
                            if (listK4.isEmpty()) {
                                listT4 = rVar;
                            } else {
                                ListIterator listIterator2 = listK4.listIterator(listK4.size());
                                while (true) {
                                    if (!listIterator2.hasPrevious()) {
                                        listT4 = rVar;
                                    } else if (((String) listIterator2.previous()).length() != 0) {
                                        listT4 = b7.e0.t(listIterator2, 1, listK4);
                                    }
                                }
                            }
                            String[] strArr2 = (String[]) listT4.toArray(new String[i24]);
                            int length5 = strArr2.length;
                            boolean z15 = true;
                            for (int i25 = 0; i25 < length5; i25++) {
                                if (kotlin.jvm.internal.m.a(strArr2[i25], ((Word) arrayList2.get(i25)).getLuoma())) {
                                    z15 = false;
                                }
                            }
                            if (z15) {
                                Collections.shuffle(arrayList2);
                                i24 = 0;
                            } else {
                                z13 = true;
                            }
                        }
                    }
                    arrayListR2.addAll(arrayList2);
                    it2 = it4;
                }
                i15 = 0;
                i17 = 6;
            }
            return arrayListR2;
        }
        List<Word> sentWords4 = sentence.getSentWords();
        ArrayList arrayListR3 = b7.e0.r("getSentWords(...)", sentWords4);
        int length6 = 0;
        for (Word word8 : sentWords4) {
            if (word8.getWordType() != 1 && !TextUtils.isEmpty(word8.getWord())) {
                length6 += word8.getWord().length();
            }
        }
        ArrayList arrayList5 = new ArrayList();
        int i26 = 0;
        for (Word word9 : sentWords4) {
            if (word9.getWordType() != 1 && !TextUtils.isEmpty(word9.getWord())) {
                String zhuyin4 = word9.getZhuyin();
                kotlin.jvm.internal.m.e(zhuyin4, "getZhuyin(...)");
                Pattern patternCompile4 = Pattern.compile(" ");
                kotlin.jvm.internal.m.e(patternCompile4, "compile(...)");
                oz.q.U0(0);
                Matcher matcher4 = patternCompile4.matcher(zhuyin4);
                if (matcher4.find()) {
                    ArrayList arrayList6 = new ArrayList(10);
                    int iC3 = 0;
                    do {
                        iC3 = nv.p.c(matcher4, zhuyin4, iC3, arrayList6);
                    } while (matcher4.find());
                    nv.p.B(iC3, zhuyin4, arrayList6);
                    listK = arrayList6;
                } else {
                    listK = ns.o.K(zhuyin4.toString());
                }
                if (listK.isEmpty()) {
                    i11 = 1;
                    listT = rVar;
                } else {
                    ListIterator listIterator3 = listK.listIterator(listK.size());
                    while (true) {
                        if (!listIterator3.hasPrevious()) {
                            i11 = 1;
                            listT = rVar;
                        } else if (((String) listIterator3.previous()).length() != 0) {
                            i11 = 1;
                            listT = b7.e0.t(listIterator3, 1, listK);
                        }
                    }
                }
                String[] strArr3 = (String[]) listT.toArray(new String[0]);
                if (strArr3.length == word9.getWord().length() - i11) {
                    StringBuilder sb2 = new StringBuilder(word9.getZhuyin());
                    sb2.replace(sb2.length() - i11, sb2.length(), " er");
                    String string = sb2.toString();
                    kotlin.jvm.internal.m.e(string, "toString(...)");
                    Matcher matcherW = nv.p.w(0, " ", "compile(...)", string);
                    if (matcherW.find()) {
                        ArrayList arrayList7 = new ArrayList(10);
                        int iC4 = 0;
                        do {
                            iC4 = nv.p.c(matcherW, string, iC4, arrayList7);
                        } while (matcherW.find());
                        nv.p.B(iC4, string, arrayList7);
                        listK2 = arrayList7;
                    } else {
                        listK2 = ns.o.K(string.toString());
                    }
                    if (listK2.isEmpty()) {
                        listT2 = rVar;
                    } else {
                        ListIterator listIterator4 = listK2.listIterator(listK2.size());
                        while (true) {
                            if (!listIterator4.hasPrevious()) {
                                listT2 = rVar;
                            } else if (((String) listIterator4.previous()).length() != 0) {
                                listT2 = b7.e0.t(listIterator4, 1, listK2);
                            }
                        }
                    }
                    i12 = 0;
                    strArr3 = (String[]) listT2.toArray(new String[0]);
                } else {
                    i12 = 0;
                }
                int length7 = word9.getWord().length();
                int i27 = i26;
                for (int i28 = i12; i28 < length7; i28++) {
                    Word word10 = new Word();
                    word10.setZhuyin(strArr3[i28]);
                    word10.setWord(String.valueOf(word9.getWord().charAt(i28)));
                    arrayList5.add(word10);
                    if (arrayList5.size() == 4) {
                        Collections.shuffle(arrayList5);
                        arrayListR3.addAll(arrayList5);
                        arrayList5.clear();
                    } else if (i27 == length6 - 1) {
                        Collections.shuffle(arrayList5);
                        arrayListR3.addAll(arrayList5);
                        arrayList5.clear();
                    }
                    i27++;
                }
                i26 = i27;
            }
        }
        return arrayListR3;
    }

    public static final int y(Context context) {
        kotlin.jvm.internal.m.f(context, "<this>");
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    public static final long z(double d5) {
        return L(4294967296L, (float) d5);
    }

    public void C(ja.a connection, Iterable iterable) {
        kotlin.jvm.internal.m.f(connection, "connection");
        if (iterable == null) {
            return;
        }
        ja.c cVarB1 = connection.B1(o());
        try {
            for (Object obj : iterable) {
                if (obj != null) {
                    f(cVarB1, obj);
                    cVarB1.r1();
                    cVarB1.reset();
                }
            }
            hz.b.h(cVarB1, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                hz.b.h(cVarB1, th2);
                throw th3;
            }
        }
    }

    public void D(ja.a connection, Object obj) {
        kotlin.jvm.internal.m.f(connection, "connection");
        if (obj == null) {
            return;
        }
        ja.c cVarB1 = connection.B1(o());
        try {
            f(cVarB1, obj);
            cVarB1.r1();
            hz.b.h(cVarB1, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                hz.b.h(cVarB1, th2);
                throw th3;
            }
        }
    }

    public long E(ja.a connection, Object obj) {
        kotlin.jvm.internal.m.f(connection, "connection");
        if (obj == null) {
            return -1L;
        }
        ja.c cVarB1 = connection.B1(o());
        try {
            f(cVarB1, obj);
            cVarB1.r1();
            hz.b.h(cVarB1, null);
            if (com.bumptech.glide.f.y(connection) == 0) {
                return -1L;
            }
            ja.c cVarB2 = connection.B1("SELECT last_insert_rowid()");
            try {
                cVarB2.r1();
                long j11 = cVarB2.getLong(0);
                hz.b.h(cVarB2, null);
                return j11;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    hz.b.h(cVarB2, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                hz.b.h(cVarB1, th4);
                throw th5;
            }
        }
    }

    public abstract void f(ja.c cVar, Object obj);

    public abstract String o();

    /* JADX WARN: Code duplicated, block: B:22:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:31:0x0108  */
    /* JADX WARN: Code duplicated, block: B:33:0x0135  */
    /* JADX WARN: Code duplicated, block: B:45:0x016f  */
    /* JADX WARN: Code duplicated, block: B:65:0x0203  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v50, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v53 */
    public static ArrayList t(Sentence sentence) {
        List listK;
        int i11;
        List listT;
        int i12;
        List listK2;
        List listT2;
        List listK3;
        List listT3;
        String word;
        int i13;
        String word2;
        kotlin.jvm.internal.m.f(sentence, "sentence");
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        int i14 = cf.x.n().keyLanguage;
        ry.r rVar = ry.r.f50854a;
        String str = xTCJ.osXXHUH;
        ?? r9 = 0;
        int i15 = 1;
        if (i14 != 0) {
            int i16 = 6;
            if (i14 != 1) {
                if (i14 != 2) {
                    switch (i14) {
                        case 11:
                            break;
                        case 12:
                            break;
                        case 13:
                            break;
                        default:
                            ArrayList arrayList = new ArrayList();
                            int size = sentence.getSentWords().size();
                            int i17 = 0;
                            while (i17 < size) {
                                Word word3 = sentence.getSentWords().get(i17);
                                int i18 = i17 + 1;
                                Word word4 = i18 < sentence.getSentWords().size() ? sentence.getSentWords().get(i18) : null;
                                if (word3.getWordType() != 1) {
                                    Word word5 = new Word();
                                    i13 = i18;
                                    word5.setWordId(word3.getWordId());
                                    String word6 = word3.getWord();
                                    kotlin.jvm.internal.m.e(word6, "getWord(...)");
                                    if (oz.x.k0(word6, "-", r9)) {
                                        LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                                        if (ry.l.D(new Integer[]{18, 69}, Integer.valueOf(cf.x.n().keyLanguage))) {
                                            String word7 = word3.getWord();
                                            kotlin.jvm.internal.m.e(word7, "getWord(...)");
                                            word2 = word7.substring(r9, word3.getWord().length() - 1);
                                            kotlin.jvm.internal.m.e(word2, "substring(...)");
                                        } else {
                                            word2 = word3.getWord();
                                        }
                                    } else {
                                        word2 = word3.getWord();
                                    }
                                    word5.setWord(word2);
                                    word5.setWordType(word3.getWordType());
                                    arrayList.add(word5);
                                    String word8 = word3.getWord();
                                    kotlin.jvm.internal.m.e(word8, "getWord(...)");
                                    if (!oz.x.k0(word8, MzwEyWCkjXL.ABJ, r9) || kotlin.jvm.internal.m.a(word3.getWord(), "po'")) {
                                        String word9 = word3.getWord();
                                        kotlin.jvm.internal.m.e(word9, "getWord(...)");
                                        if (oz.x.k0(word9, "-", r9)) {
                                            LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                                            if (!ry.l.D(new Integer[]{18, 69}, Integer.valueOf(cf.x.n().keyLanguage))) {
                                                LingoSkillApplication lingoSkillApplication4 = LingoSkillApplication.f21665b;
                                                if (ry.l.D(new Integer[]{5, 15, 53, 54}, Integer.valueOf(cf.x.n().keyLanguage))) {
                                                    Word word10 = new Word();
                                                    word10.setWord(str);
                                                    arrayList.add(word10);
                                                } else if (kotlin.jvm.internal.m.a(word3.getWord(), "-t-") && !kotlin.jvm.internal.m.a(word3.getWord(), "-") && (word4 == null || (!kotlin.jvm.internal.m.a(word4.getWord(), "-t-") && !kotlin.jvm.internal.m.a(word4.getWord(), "-")))) {
                                                    Word word11 = new Word();
                                                    word11.setWord(str);
                                                    arrayList.add(word11);
                                                }
                                            }
                                        } else {
                                            LingoSkillApplication lingoSkillApplication5 = LingoSkillApplication.f21665b;
                                            if (ry.l.D(new Integer[]{5, 15, 53, 54}, Integer.valueOf(cf.x.n().keyLanguage))) {
                                                Word word12 = new Word();
                                                word12.setWord(str);
                                                arrayList.add(word12);
                                            } else if (kotlin.jvm.internal.m.a(word3.getWord(), "-t-")) {
                                            }
                                        }
                                    }
                                } else {
                                    i13 = i18;
                                }
                                i17 = i13;
                                r9 = 0;
                            }
                            if (kotlin.jvm.internal.m.a(((Word) nv.p.f(1, arrayList)).getWord(), str)) {
                                arrayList.remove(arrayList.size() - 1);
                            }
                            ArrayList arrayList2 = new ArrayList();
                            int size2 = arrayList.size();
                            int i19 = 0;
                            while (i19 < size2) {
                                Object obj = arrayList.get(i19);
                                i19++;
                                Word word13 = (Word) obj;
                                if (word13.getWordType() != 1 && !TextUtils.isEmpty(word13.getWord())) {
                                    int length = word13.getWord().length();
                                    for (int i21 = 0; i21 < length; i21++) {
                                        Word word14 = new Word();
                                        String.valueOf(word13.getWord().charAt(i21));
                                        if (kotlin.jvm.internal.m.a(String.valueOf(word13.getWord().charAt(i21)), "́")) {
                                            LingoSkillApplication lingoSkillApplication6 = LingoSkillApplication.f21665b;
                                            if (cf.x.n().keyLanguage != 10 && cf.x.n().keyLanguage != 22) {
                                                word14.setWord(String.valueOf(word13.getWord().charAt(i21)));
                                                arrayList2.add(word14);
                                            }
                                        } else {
                                            word14.setWord(String.valueOf(word13.getWord().charAt(i21)));
                                            arrayList2.add(word14);
                                        }
                                    }
                                }
                            }
                            return arrayList2;
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                for (Word word15 : sentence.getSentWords()) {
                    if (word15.getWordType() != 1 || kotlin.jvm.internal.m.a(word15.getWord(), str)) {
                        arrayList3.add(word15);
                    }
                }
                ArrayList arrayList4 = new ArrayList();
                int size3 = arrayList3.size();
                int i22 = 0;
                while (i22 < size3) {
                    Object obj2 = arrayList3.get(i22);
                    i22++;
                    Word word16 = (Word) obj2;
                    if (word16.getWordType() != 1 || kotlin.jvm.internal.m.a(word16.getWord(), str)) {
                        if (!TextUtils.isEmpty(word16.getWord())) {
                            if (kotlin.jvm.internal.m.a(word16.getWord(), str)) {
                                Word word17 = new Word();
                                word17.setWord(str);
                                word17.setZhuyin(str);
                                arrayList4.add(word17);
                            } else {
                                if (kotlin.jvm.internal.m.a(word16.getWord(), str)) {
                                    word = word16.getWord();
                                } else {
                                    String word18 = word16.getWord();
                                    kotlin.jvm.internal.m.e(word18, "getWord(...)");
                                    word = oz.q.i1(word18).toString();
                                }
                                String zhuyin = word16.getZhuyin();
                                kotlin.jvm.internal.m.e(zhuyin, "getZhuyin(...)");
                                int i23 = 0;
                                ArrayList arrayListC1 = ry.m.c1(oz.q.W0(zhuyin, new String[]{str}, 0, 6));
                                kotlin.jvm.internal.m.c(word);
                                int length2 = word.length();
                                int i24 = 0;
                                while (i24 < length2) {
                                    char cCharAt = word.charAt(i24);
                                    if (kotlin.jvm.internal.m.a(String.valueOf(cCharAt), str)) {
                                        arrayListC1.add(oz.q.H0(word, cCharAt, i23, 6), str);
                                    }
                                    i24++;
                                    i23 = 0;
                                }
                                int length3 = word.length();
                                for (int i25 = 0; i25 < length3; i25++) {
                                    Word word19 = new Word();
                                    word19.setWord(String.valueOf(word.charAt(i25)));
                                    if (i25 < arrayListC1.size()) {
                                        word19.setZhuyin((String) arrayListC1.get(i25));
                                    }
                                    arrayList4.add(word19);
                                }
                            }
                        }
                    }
                }
                return arrayList4;
            }
            List<Word> sentWords = sentence.getSentWords();
            ArrayList arrayListR = b7.e0.r("getSentWords(...)", sentWords);
            Iterator<Word> it = sentWords.iterator();
            while (it.hasNext()) {
                Word next = it.next();
                if (next.getWordType() != i15 && !TextUtils.isEmpty(next.getZhuyin())) {
                    ArrayList arrayList5 = new ArrayList();
                    HashMap map = new HashMap();
                    for (int i26 = 0; i26 < 45; i26++) {
                        String str2 = qi.b.f47803a[i26];
                        String zhuyin2 = next.getZhuyin();
                        kotlin.jvm.internal.m.e(zhuyin2, "getZhuyin(...)");
                        int iI0 = oz.q.I0(zhuyin2, str2, 0, false, i16);
                        if (iI0 != -1) {
                            str2.getClass();
                            map.put(Integer.valueOf(iI0), Integer.valueOf(str2.length()));
                        }
                    }
                    String luoma = next.getLuoma();
                    kotlin.jvm.internal.m.e(luoma, "getLuoma(...)");
                    Pattern patternCompile = Pattern.compile(str);
                    kotlin.jvm.internal.m.e(patternCompile, "compile(...)");
                    oz.q.U0(0);
                    Matcher matcher = patternCompile.matcher(luoma);
                    if (matcher.find()) {
                        ArrayList arrayList6 = new ArrayList(10);
                        int iC = 0;
                        do {
                            iC = nv.p.c(matcher, luoma, iC, arrayList6);
                        } while (matcher.find());
                        nv.p.B(iC, luoma, arrayList6);
                        listK3 = arrayList6;
                    } else {
                        listK3 = ns.o.K(luoma.toString());
                    }
                    if (listK3.isEmpty()) {
                        listT3 = rVar;
                    } else {
                        ListIterator listIterator = listK3.listIterator(listK3.size());
                        while (true) {
                            if (!listIterator.hasPrevious()) {
                                listT3 = rVar;
                            } else if (((String) listIterator.previous()).length() != 0) {
                                listT3 = b7.e0.t(listIterator, i15, listK3);
                            }
                        }
                    }
                    String[] strArr = (String[]) listT3.toArray(new String[0]);
                    next.getLuoma();
                    next.getWordId();
                    int length4 = next.getZhuyin().length();
                    int i27 = 0;
                    int i28 = 0;
                    while (i27 < length4) {
                        Iterator it2 = map.keySet().iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                Object next2 = it2.next();
                                kotlin.jvm.internal.m.e(next2, "next(...)");
                                int iIntValue = ((Number) next2).intValue();
                                if (i27 >= iIntValue) {
                                    Object obj3 = map.get(Integer.valueOf(iIntValue));
                                    kotlin.jvm.internal.m.c(obj3);
                                    if (i27 < ((Number) obj3).intValue() + iIntValue) {
                                        if (i27 != iIntValue) {
                                            it = it;
                                            break;
                                        }
                                        String zhuyin3 = next.getZhuyin();
                                        kotlin.jvm.internal.m.e(zhuyin3, "getZhuyin(...)");
                                        Object obj4 = map.get(Integer.valueOf(iIntValue));
                                        kotlin.jvm.internal.m.c(obj4);
                                        String strSubstring = zhuyin3.substring(iIntValue, ((Number) obj4).intValue() + iIntValue);
                                        kotlin.jvm.internal.m.e(strSubstring, "substring(...)");
                                        Word word20 = new Word();
                                        word20.setWord(strSubstring);
                                        word20.setLuoma(strArr[i28]);
                                        arrayList5.add(word20);
                                    }
                                }
                                it = it;
                            } else {
                                String strValueOf = String.valueOf(next.getZhuyin().charAt(i27));
                                Word word21 = new Word();
                                word21.setWord(strValueOf);
                                word21.setLuoma(strArr[i28]);
                                arrayList5.add(word21);
                            }
                            i28++;
                            break;
                        }
                        i27++;
                        it = it;
                    }
                    arrayListR.addAll(arrayList5);
                    i15 = 1;
                    i16 = 6;
                }
            }
            return arrayListR;
        }
        ArrayList arrayList7 = new ArrayList();
        for (Word word22 : sentence.getSentWords()) {
            if (word22.getWordType() != 1) {
                arrayList7.add(word22);
            }
        }
        ArrayList arrayList8 = new ArrayList();
        int size4 = arrayList7.size();
        int i29 = 0;
        while (i29 < size4) {
            Object obj5 = arrayList7.get(i29);
            i29++;
            Word word23 = (Word) obj5;
            if (word23.getWordType() != 1 && !TextUtils.isEmpty(word23.getWord())) {
                String zhuyin4 = word23.getZhuyin();
                kotlin.jvm.internal.m.e(zhuyin4, "getZhuyin(...)");
                Pattern patternCompile2 = Pattern.compile(str);
                kotlin.jvm.internal.m.e(patternCompile2, "compile(...)");
                oz.q.U0(0);
                Matcher matcher2 = patternCompile2.matcher(zhuyin4);
                if (matcher2.find()) {
                    ArrayList arrayList9 = new ArrayList(10);
                    int iC2 = 0;
                    do {
                        iC2 = nv.p.c(matcher2, zhuyin4, iC2, arrayList9);
                    } while (matcher2.find());
                    nv.p.B(iC2, zhuyin4, arrayList9);
                    listK = arrayList9;
                } else {
                    listK = ns.o.K(zhuyin4.toString());
                }
                if (listK.isEmpty()) {
                    i11 = 1;
                    listT = rVar;
                } else {
                    ListIterator listIterator2 = listK.listIterator(listK.size());
                    while (true) {
                        if (!listIterator2.hasPrevious()) {
                            i11 = 1;
                            listT = rVar;
                        } else if (((String) listIterator2.previous()).length() != 0) {
                            i11 = 1;
                            listT = b7.e0.t(listIterator2, 1, listK);
                        }
                    }
                }
                String[] strArr2 = (String[]) listT.toArray(new String[0]);
                if (strArr2.length == word23.getWord().length() - i11) {
                    StringBuilder sb2 = new StringBuilder(word23.getZhuyin());
                    sb2.replace(sb2.length() - i11, sb2.length(), " er");
                    String string = sb2.toString();
                    kotlin.jvm.internal.m.e(string, "toString(...)");
                    Matcher matcherW = nv.p.w(0, str, "compile(...)", string);
                    if (matcherW.find()) {
                        ArrayList arrayList10 = new ArrayList(10);
                        int iC3 = 0;
                        do {
                            iC3 = nv.p.c(matcherW, string, iC3, arrayList10);
                        } while (matcherW.find());
                        nv.p.B(iC3, string, arrayList10);
                        listK2 = arrayList10;
                    } else {
                        listK2 = ns.o.K(string.toString());
                    }
                    if (listK2.isEmpty()) {
                        listT2 = rVar;
                    } else {
                        ListIterator listIterator3 = listK2.listIterator(listK2.size());
                        while (true) {
                            if (!listIterator3.hasPrevious()) {
                                listT2 = rVar;
                            } else if (((String) listIterator3.previous()).length() != 0) {
                                listT2 = b7.e0.t(listIterator3, 1, listK2);
                            }
                        }
                    }
                    i12 = 0;
                    strArr2 = (String[]) listT2.toArray(new String[0]);
                } else {
                    i12 = 0;
                }
                int length5 = word23.getWord().length();
                for (int i30 = i12; i30 < length5; i30++) {
                    Word word24 = new Word();
                    word24.setWord(String.valueOf(word23.getWord().charAt(i30)));
                    word24.setZhuyin(strArr2[i30]);
                    arrayList8.add(word24);
                }
            }
        }
        return arrayList8;
    }
}
