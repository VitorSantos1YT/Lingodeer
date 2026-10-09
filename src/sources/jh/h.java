package jh;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Size;
import android.util.SizeF;
import androidx.lifecycle.MutableLiveData;
import cf.x;
import com.adjust.sdk.Constants;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.ui.base.SplashActivity;
import com.lingodeer.data.model.CourseSentence;
import com.lingodeer.data.model.CourseWord;
import com.yalantis.ucrop.view.CropImageView;
import fb.a0;
import fr.p3;
import hh.p0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import jt.i0;
import jt.j0;
import kotlin.jvm.internal.w;
import l0.Eeqr.HOBXIlHxIkMBEA;
import l1.b1;
import l1.b3;
import l1.s;
import l1.t;
import n5.s0;
import n5.v;
import n5.y;
import n5.z;
import qp.m4;
import qy.b0;
import r.t1;
import ys.d0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class h {
    /* JADX WARN: Code duplicated, block: B:27:0x0026 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x0027  */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0011, code lost:
    
        if (r5 == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0015, code lost:
    
        return r2 - r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int a(int r2, int r3, int r4, boolean r5) {
        /*
            r0 = 0
            if (r3 < r4) goto L8
            if (r5 == 0) goto L6
            return r0
        L6:
            int r4 = r4 - r3
            return r4
        L8:
            if (r5 != 0) goto Ld
            if (r3 > r2) goto L16
            goto L11
        Ld:
            int r1 = r4 - r3
            if (r1 <= r2) goto L16
        L11:
            if (r5 == 0) goto L14
            goto L21
        L14:
            int r2 = r2 - r3
            return r2
        L16:
            if (r5 == 0) goto L1b
            if (r3 > r2) goto L24
            goto L1f
        L1b:
            int r1 = r4 - r3
            if (r1 <= r2) goto L24
        L1f:
            if (r5 != 0) goto L22
        L21:
            return r2
        L22:
            int r2 = r2 - r3
            return r2
        L24:
            if (r5 != 0) goto L27
            return r0
        L27:
            int r4 = r4 - r3
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: jh.h.a(int, int, int, boolean):int");
    }

    public static final Bundle b(qy.l... lVarArr) {
        Bundle bundle = new Bundle(lVarArr.length);
        for (qy.l lVar : lVarArr) {
            String str = (String) lVar.f48495a;
            Object obj = lVar.f48496b;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                kotlin.jvm.internal.m.c(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                    }
                    bundle.putSerializable(str, (Serializable) obj);
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                bundle.putBinder(str, (IBinder) obj);
            } else if (obj instanceof Size) {
                bundle.putSize(str, (Size) obj);
            } else {
                if (!(obj instanceof SizeF)) {
                    throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str + '\"');
                }
                bundle.putSizeF(str, (SizeF) obj);
            }
        }
        return bundle;
    }

    public static void c(int i11, int i12, int i13) {
        if (i11 < 0 || i12 > i13) {
            StringBuilder sbK = w4.c.k("startIndex: ", i11, ", endIndex: ", i12, ", size: ");
            sbK.append(i13);
            throw new IndexOutOfBoundsException(sbK.toString());
        }
        if (i11 > i12) {
            throw new IllegalArgumentException(nv.p.p("startIndex: ", i11, i12, " > endIndex: "));
        }
    }

    public static void d(int i11, int i12, int i13) {
        if (i11 < 0 || i12 > i13) {
            StringBuilder sbK = w4.c.k("fromIndex: ", i11, ", toIndex: ", i12, ", size: ");
            sbK.append(i13);
            throw new IndexOutOfBoundsException(sbK.toString());
        }
        if (i11 > i12) {
            throw new IllegalArgumentException(nv.p.p("fromIndex: ", i11, i12, " > toIndex: "));
        }
    }

    public static q6.m e(int i11) {
        int i12 = (i11 & 1) != 0 ? 8 : 10;
        return hz.b.d(i12, 1.0f / ((float) Math.cos(q6.n.f47509b / i12)), new q6.b(2), null);
    }

    public static v f(s0 serializer, n9.q qVar, List migrations, wz.d dVar, fz.a aVar) {
        kotlin.jvm.internal.m.f(serializer, "serializer");
        kotlin.jvm.internal.m.f(migrations, "migrations");
        z zVar = new z(serializer, y.f43427a, aVar);
        n5.b p3Var = qVar;
        if (qVar == null) {
            p3Var = new p3(24);
        }
        return new v(zVar, ns.o.K(new n5.d(migrations, null, 0)), p3Var, dVar);
    }

    public static String h(androidx.datastore.preferences.protobuf.i iVar) {
        StringBuilder sb2 = new StringBuilder(iVar.size());
        for (int i11 = 0; i11 < iVar.size(); i11++) {
            byte b3 = iVar.b(i11);
            if (b3 == 34) {
                sb2.append("\\\"");
            } else if (b3 == 39) {
                sb2.append("\\'");
            } else if (b3 != 92) {
                switch (b3) {
                    case 7:
                        sb2.append("\\a");
                        break;
                    case 8:
                        sb2.append("\\b");
                        break;
                    case 9:
                        sb2.append("\\t");
                        break;
                    case 10:
                        sb2.append("\\n");
                        break;
                    case 11:
                        sb2.append("\\v");
                        break;
                    case 12:
                        sb2.append("\\f");
                        break;
                    case 13:
                        sb2.append("\\r");
                        break;
                    default:
                        if (b3 < 32 || b3 > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((b3 >>> 6) & 3) + 48));
                            sb2.append((char) (((b3 >>> 3) & 7) + 48));
                            sb2.append((char) ((b3 & 7) + 48));
                        } else {
                            sb2.append((char) b3);
                        }
                        break;
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }

    public static final Object i(w9.m mVar, String str, xy.c cVar) {
        Object objA = mVar.a(str, new vr.a(6), cVar);
        return objA == wy.a.COROUTINE_SUSPENDED ? objA : b0.f48488a;
    }

    public static String j(long j11) {
        long j12 = j11 / 3600;
        long j13 = j11 - (3600 * j12);
        long j14 = j13 / 60;
        long j15 = j13 - (60 * j14);
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        if (x.n().locateLanguage == 51) {
            if (j12 <= 0) {
                return j14 + "د " + j15 + "ث";
            }
            return j12 + "س " + j14 + "د " + j15 + "ث";
        }
        if (j12 <= 0) {
            return j14 + "m " + j15 + "s";
        }
        return j12 + "h " + j14 + "m " + j15 + "s";
    }

    public static Drawable k(Context context, int i11) {
        return t1.b().c(context, i11);
    }

    public static String[] l(int i11, int i12) {
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        int i13 = x.n().keyLanguage;
        int i14 = 0;
        if (i13 == 0) {
            String[] strArr = new String[i12];
            while (i14 < i12) {
                int i15 = i14 + 1;
                strArr[i14] = defpackage.e.m(xt.b.a().q(), p0.l("cn-p-", i11, "-", i15, ".png"));
                i14 = i15;
            }
            return strArr;
        }
        if (i13 == 1) {
            String[] strArr2 = new String[i12];
            while (i14 < i12) {
                int i16 = i14 + 1;
                strArr2[i14] = defpackage.e.m(xt.b.a().q(), p0.l("jp-p-", i11, "-", i16, ".png"));
                i14 = i16;
            }
            return strArr2;
        }
        if (i13 == 2) {
            String[] strArr3 = new String[i12];
            while (i14 < i12) {
                int i17 = i14 + 1;
                strArr3[i14] = defpackage.e.m(xt.b.a().q(), p0.l("kr-p-", i11, "-", i17, ".png"));
                i14 = i17;
            }
            return strArr3;
        }
        if (i13 != 4) {
            if (i13 != 5) {
                if (i13 != 6) {
                    if (i13 != 8) {
                        if (i13 != 20) {
                            if (i13 != 22) {
                                if (i13 != 40) {
                                    if (i13 == 47 || i13 == 48) {
                                        String[] strArr4 = new String[i12];
                                        while (i14 < i12) {
                                            int i18 = i14 + 1;
                                            strArr4[i14] = defpackage.e.m(xt.b.a().q(), p0.l("esus-p-", i11, "-", i18, ".png"));
                                            i14 = i18;
                                        }
                                        return strArr4;
                                    }
                                    switch (i13) {
                                        case 10:
                                            break;
                                        case 11:
                                            String[] strArr5 = new String[i12];
                                            while (i14 < i12) {
                                                int i19 = i14 + 1;
                                                strArr5[i14] = defpackage.e.m(xt.b.a().q(), p0.l("cnup-p-", i11, "-", i19, ".png"));
                                                i14 = i19;
                                            }
                                            return strArr5;
                                        case 12:
                                            String[] strArr6 = new String[i12];
                                            while (i14 < i12) {
                                                int i21 = i14 + 1;
                                                strArr6[i14] = defpackage.e.m(xt.b.a().q(), p0.l("jpup-p-", i11, "-", i21, ".png"));
                                                i14 = i21;
                                            }
                                            return strArr6;
                                        case 13:
                                            String[] strArr7 = new String[i12];
                                            while (i14 < i12) {
                                                int i22 = i14 + 1;
                                                strArr7[i14] = defpackage.e.m(xt.b.a().q(), p0.l("krup-p-", i11, "-", i22, ".png"));
                                                i14 = i22;
                                            }
                                            return strArr7;
                                        case 14:
                                            break;
                                        case 15:
                                            break;
                                        case 16:
                                            break;
                                        case 17:
                                            break;
                                        default:
                                            return null;
                                    }
                                }
                            }
                            String[] strArr8 = new String[i12];
                            while (i14 < i12) {
                                int i23 = i14 + 1;
                                strArr8[i14] = defpackage.e.m(xt.b.a().q(), p0.l("ruoc-p-", i11, "-", i23, ".png"));
                                i14 = i23;
                            }
                            return strArr8;
                        }
                        String[] strArr9 = new String[i12];
                        while (i14 < i12) {
                            int i24 = i14 + 1;
                            strArr9[i14] = defpackage.e.m(xt.b.a().q(), p0.l("itoc-p-", i11, "-", i24, ".png"));
                            i14 = i24;
                        }
                        return strArr9;
                    }
                    String[] strArr10 = new String[i12];
                    while (i14 < i12) {
                        int i25 = i14 + 1;
                        strArr10[i14] = defpackage.e.m(xt.b.a().q(), p0.l("ptoc-p-", i11, "-", i25, ".png"));
                        i14 = i25;
                    }
                    return strArr10;
                }
                String[] strArr11 = new String[i12];
                while (i14 < i12) {
                    int i26 = i14 + 1;
                    strArr11[i14] = defpackage.e.m(xt.b.a().q(), p0.l("deoc-p-", i11, "-", i26, ".png"));
                    i14 = i26;
                }
                return strArr11;
            }
            String[] strArr12 = new String[i12];
            while (i14 < i12) {
                int i27 = i14 + 1;
                strArr12[i14] = defpackage.e.m(xt.b.a().q(), p0.l("froc-p-", i11, "-", i27, ".png"));
                i14 = i27;
            }
            return strArr12;
        }
        String[] strArr13 = new String[i12];
        while (i14 < i12) {
            int i28 = i14 + 1;
            strArr13[i14] = defpackage.e.m(xt.b.a().q(), p0.l("esoc-p-", i11, "-", i28, ".png"));
            i14 = i28;
        }
        return strArr13;
    }

    public static final void m(d0 d0Var, List audioPaths, ht.l audioPlayingState, fz.c cVar) {
        kotlin.jvm.internal.m.f(d0Var, "<this>");
        kotlin.jvm.internal.m.f(audioPaths, "audioPaths");
        kotlin.jvm.internal.m.f(audioPlayingState, "audioPlayingState");
        w wVar = new w();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(audioPaths);
        float f5 = audioPlayingState instanceof ht.i ? 0.8f : 1.0f;
        d0Var.d((String) arrayList.get(0), new ct.d(arrayList, wVar, f5, cVar, audioPlayingState, d0Var, null), f5);
        cVar.invoke(y(audioPlayingState, wVar.f38359a, f5));
        audioPlayingState.toString();
    }

    public static final a0 n(fb.l tracer, String label, Executor executor, fz.a aVar) {
        kotlin.jvm.internal.m.f(tracer, "tracer");
        kotlin.jvm.internal.m.f(label, "label");
        kotlin.jvm.internal.m.f(executor, "executor");
        MutableLiveData mutableLiveData = new MutableLiveData(a0.f27038c);
        return new a0(mutableLiveData, com.bumptech.glide.g.n(new com.google.firebase.inappmessaging.internal.r(executor, tracer, label, aVar, mutableLiveData)));
    }

    public static void o(Uri uri) {
        r();
        tf.d.f52153d.lock();
        m4 m4Var = tf.d.f52152c;
        if (m4Var != null) {
            Bundle bundle = new Bundle();
            try {
                ((d.a) ((d.c) m4Var.f48060b)).g((v.b) m4Var.f48061c, uri, bundle);
            } catch (RemoteException unused) {
            }
        }
        tf.d.f52153d.unlock();
    }

    public static oi.c p() {
        if (oi.c.f44924t == null) {
            synchronized (oi.c.class) {
                if (oi.c.f44924t == null) {
                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                    kotlin.jvm.internal.m.c(lingoSkillApplication);
                    oi.c.f44924t = new oi.c(lingoSkillApplication);
                }
            }
        }
        oi.c cVar = oi.c.f44924t;
        kotlin.jvm.internal.m.c(cVar);
        return cVar;
    }

    public static final List q(CourseSentence courseSentence) {
        kotlin.jvm.internal.m.f(courseSentence, "<this>");
        return ns.o.K(courseSentence.getAudioUri().toString());
    }

    public static void r() {
        qp.b bVar;
        m4 m4Var;
        tf.d.f52153d.lock();
        if (tf.d.f52152c == null && (bVar = tf.d.f52151b) != null) {
            d.c cVar = (d.c) bVar.f47832b;
            v.b bVar2 = new v.b();
            bVar2.attachInterface(bVar2, "android.support.customtabs.ICustomTabsCallback");
            new Handler(Looper.getMainLooper());
            try {
                m4Var = !((d.a) cVar).h(bVar2) ? null : new m4(cVar, bVar2, (ComponentName) bVar.f47833c, 5);
            } catch (RemoteException unused) {
            }
            tf.d.f52152c = m4Var;
        }
        tf.d.f52153d.unlock();
    }

    public static final q6.m s(float f5, q6.b rounding, List list) {
        kotlin.jvm.internal.m.f(rounding, "rounding");
        float f11 = 2;
        float f12 = f5 / f11;
        float f13 = CropImageView.DEFAULT_ASPECT_RATIO - f12;
        float f14 = 1.0f / f11;
        float f15 = CropImageView.DEFAULT_ASPECT_RATIO - f14;
        float f16 = f12 + CropImageView.DEFAULT_ASPECT_RATIO;
        float f17 = f14 + CropImageView.DEFAULT_ASPECT_RATIO;
        return hz.b.e(new float[]{f16, f17, f13, f17, f13, f15, f16, f15}, rounding, list, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO);
    }

    public static final j0 t(CourseSentence courseSentence, List options, long j11, l1.n nVar) {
        kotlin.jvm.internal.m.f(courseSentence, "courseSentence");
        kotlin.jvm.internal.m.f(options, "options");
        s sVar = (s) nVar;
        boolean zF = sVar.f(courseSentence);
        Object objQ = sVar.Q();
        l1.g gVar = l1.m.f39353a;
        if (zF || objQ == gVar) {
            objQ = t.B(ht.q.DEFAULT);
            sVar.o0(objQ);
        }
        b1 b1Var = (b1) objQ;
        s sVar2 = (s) nVar;
        boolean zF2 = sVar2.f(courseSentence);
        Object objQ2 = sVar2.Q();
        if (zF2 || objQ2 == gVar) {
            objQ2 = t.B(ht.a.f33722e);
            sVar2.o0(objQ2);
        }
        b1 b1Var2 = (b1) objQ2;
        s sVar3 = (s) nVar;
        boolean zF3 = sVar3.f(courseSentence);
        Object objQ3 = sVar3.Q();
        if (zF3 || objQ3 == gVar) {
            objQ3 = t.B(options);
            sVar3.o0(objQ3);
        }
        b1 b1Var3 = (b1) objQ3;
        s sVar4 = (s) nVar;
        Object objQ4 = sVar4.Q();
        if (objQ4 == gVar) {
            objQ4 = t.s(new i0(1, b1Var));
            sVar4.o0(objQ4);
        }
        b3 b3Var = (b3) objQ4;
        boolean zBooleanValue = ((Boolean) b3Var.getValue()).booleanValue();
        boolean zG = sVar4.g(zBooleanValue) | sVar4.f(courseSentence) | sVar4.e(j11) | sVar4.f(b1Var) | sVar4.f(b1Var2) | sVar4.f(b1Var3);
        Object objQ5 = sVar4.Q();
        if (zG || objQ5 == gVar) {
            j0 j0Var = new j0(courseSentence, j11, ((Boolean) b3Var.getValue()).booleanValue(), b1Var, b1Var2, b1Var3);
            sVar4.o0(j0Var);
            objQ5 = j0Var;
        }
        return (j0) objQ5;
    }

    public static final ArrayList u(CourseSentence courseSentence) {
        kotlin.jvm.internal.m.f(courseSentence, "<this>");
        List<CourseWord> courseWords = courseSentence.getCourseWords();
        ArrayList arrayList = new ArrayList();
        for (Object obj : courseWords) {
            CourseWord courseWord = (CourseWord) obj;
            if (courseWord.getWordType() != 1) {
                String str = courseWord.getWord();
                kotlin.jvm.internal.m.f(str, "str");
                Pattern patternCompile = Pattern.compile("[\\p{P}+~$`^=|<>～｀＄＾＋＝｜＜＞￥×]");
                kotlin.jvm.internal.m.e(patternCompile, "compile(...)");
                if (!patternCompile.matcher(str).matches() && !ry.l.D(new String[]{"..."}, str)) {
                    arrayList.add(obj);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(ry.n.W(arrayList, 10));
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj2 = arrayList.get(i11);
            i11++;
            arrayList2.add(((CourseWord) obj2).getAudioUri().toString());
        }
        return arrayList2;
    }

    public static final q6.m v(int i11, float f5, q6.b rounding) {
        kotlin.jvm.internal.m.f(rounding, "rounding");
        if (f5 <= CropImageView.DEFAULT_ASPECT_RATIO) {
            throw new IllegalArgumentException("Star radii must both be greater than 0");
        }
        if (f5 >= 1.0f) {
            throw new IllegalArgumentException("innerRadius must be less than radius");
        }
        float[] fArr = new float[i11 * 4];
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            float f11 = q6.n.f47509b / i11;
            long jE = q6.n.e(1.0f, 2 * f11 * i13);
            fArr[i12] = gb.r.y(jE) + CropImageView.DEFAULT_ASPECT_RATIO;
            fArr[i12 + 1] = gb.r.z(jE) + CropImageView.DEFAULT_ASPECT_RATIO;
            long jE2 = q6.n.e(f5, f11 * ((i13 * 2) + 1));
            int i14 = i12 + 3;
            fArr[i12 + 2] = gb.r.y(jE2) + CropImageView.DEFAULT_ASPECT_RATIO;
            i12 += 4;
            fArr[i14] = gb.r.z(jE2) + CropImageView.DEFAULT_ASPECT_RATIO;
        }
        return hz.b.e(fArr, rounding, null, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO);
    }

    public static final r5.d w(String name) {
        kotlin.jvm.internal.m.f(name, "name");
        return new r5.d(name);
    }

    public static final r5.d x(String name) {
        kotlin.jvm.internal.m.f(name, "name");
        return new r5.d(name);
    }

    public static final ht.l y(ht.l lVar, int i11, float f5) {
        kotlin.jvm.internal.m.f(lVar, "<this>");
        if (lVar instanceof ht.b) {
            List visemedMap = ((ht.b) lVar).f33723e;
            kotlin.jvm.internal.m.f(visemedMap, "visemedMap");
            return new ht.b(visemedMap, i11, f5);
        }
        if (lVar instanceof ht.c) {
            List visemedMap2 = ((ht.c) lVar).f33726e;
            kotlin.jvm.internal.m.f(visemedMap2, "visemedMap");
            return new ht.c(visemedMap2, i11, f5);
        }
        if (lVar instanceof ht.e) {
            List visemedMap3 = ((ht.e) lVar).f33732e;
            kotlin.jvm.internal.m.f(visemedMap3, "visemedMap");
            return new ht.e(visemedMap3, i11, f5);
        }
        if (lVar instanceof ht.f) {
            List visemedMap4 = ((ht.f) lVar).f33735e;
            kotlin.jvm.internal.m.f(visemedMap4, "visemedMap");
            return new ht.f(visemedMap4, i11, f5);
        }
        if (lVar instanceof ht.h) {
            List visemedMap5 = ((ht.h) lVar).f33739e;
            kotlin.jvm.internal.m.f(visemedMap5, "visemedMap");
            return new ht.h(visemedMap5, i11, f5);
        }
        if (!(lVar instanceof ht.i)) {
            return lVar;
        }
        List visemedMaps = ((ht.i) lVar).f33742e;
        kotlin.jvm.internal.m.f(visemedMaps, "visemedMaps");
        return new ht.i(visemedMaps, i11, f5);
    }

    public static Intent g(Context context, Bundle bundle) {
        String string;
        String string2 = bundle.getString(Constants.DEEPLINK);
        if (string2 == null || oz.q.K0(string2)) {
            String string3 = bundle.getString(HOBXIlHxIkMBEA.DRmkhhd);
            if (!kotlin.jvm.internal.m.a(string3, er.e.BILLING_5MIN.c()) ? !kotlin.jvm.internal.m.a(string3, er.e.DISCOUNT_LAST_1H.c()) : (string = bundle.getString("url")) == null || oz.q.K0(string)) {
                Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
                if (launchIntentForPackage == null) {
                    launchIntentForPackage = new Intent(context, (Class<?>) SplashActivity.class);
                    launchIntentForPackage.setAction("android.intent.action.MAIN");
                    launchIntentForPackage.addCategory("android.intent.category.LAUNCHER");
                }
                launchIntentForPackage.addFlags(268435456);
                if (bundle != null) {
                    launchIntentForPackage.putExtras(bundle);
                }
                return launchIntentForPackage;
            }
        }
        Intent intent = new Intent(context, (Class<?>) SplashActivity.class);
        intent.addFlags(268435456);
        intent.putExtras(bundle);
        return intent;
    }
}
