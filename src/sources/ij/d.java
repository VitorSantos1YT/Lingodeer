package ij;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.database.sqlite.SQLiteOpenHelper;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import b7.w;
import bq.r;
import cf.x;
import com.adjust.sdk.Constants;
import com.android.billingclient.api.k0;
import com.google.zxing.pdf417.decoder.vBn.xTCJ;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.DaoMaster;
import com.lingo.lingoskill.object.DaoSession;
import com.lingo.lingoskill.object.JPCharDao;
import com.lingo.lingoskill.object.JPCharPartDao;
import com.lingo.lingoskill.object.LDCharacterDao;
import com.lingo.lingoskill.object.LessonDao;
import com.lingo.lingoskill.object.LevelDao;
import com.lingo.lingoskill.object.Model_Sentence_100Dao;
import com.lingo.lingoskill.object.SentenceDao;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import fb.g0;
import hj.w1;
import java.io.Serializable;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import jp.p0;
import n0.s;
import n0.y0;
import n9.f0;
import ns.o;
import ob.u;
import org.xmlpull.v1.XmlPullParserException;
import qy.b0;
import ry.v;
import y.d0;
import y.n0;
import z2.p2;
import z4.s0;
import z4.w0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements x7.h, tx.c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static d f34419e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f34421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f34422c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f34423d;

    public /* synthetic */ d(int i11, int i12, Object obj, String str) {
        this.f34420a = i12;
        this.f34422c = obj;
        this.f34421b = i11;
        this.f34423d = str;
    }

    public static d c(int i11, Resources.Theme theme, Resources resources) {
        int next;
        float f5;
        float f11;
        int i12;
        Shader.TileMode tileMode;
        Object radialGradient;
        Shader.TileMode tileMode2;
        XmlResourceParser xml = resources.getXml(i11);
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.getClass();
        int i13 = 19;
        Object obj = null;
        if (!name.equals("gradient")) {
            if (name.equals("selector")) {
                ColorStateList colorStateListB = q4.b.b(resources, xml, attributeSetAsAttributeSet, theme);
                return new d(obj, colorStateListB.getDefaultColor(), i13, colorStateListB);
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        String name2 = xml.getName();
        if (!name2.equals("gradient")) {
            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        TypedArray typedArrayH = q4.a.h(resources, theme, attributeSetAsAttributeSet, m4.a.f40862d);
        float f12 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startX") != null ? typedArrayH.getFloat(8, CropImageView.DEFAULT_ASPECT_RATIO) : 0.0f;
        float f13 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startY") != null ? typedArrayH.getFloat(9, CropImageView.DEFAULT_ASPECT_RATIO) : 0.0f;
        float f14 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endX") != null ? typedArrayH.getFloat(10, CropImageView.DEFAULT_ASPECT_RATIO) : 0.0f;
        float f15 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endY") != null ? typedArrayH.getFloat(11, CropImageView.DEFAULT_ASPECT_RATIO) : 0.0f;
        float f16 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerX") != null ? typedArrayH.getFloat(3, CropImageView.DEFAULT_ASPECT_RATIO) : 0.0f;
        float f17 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerY") != null ? typedArrayH.getFloat(4, CropImageView.DEFAULT_ASPECT_RATIO) : 0.0f;
        int i14 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "type") != null ? typedArrayH.getInt(2, 0) : 0;
        int color = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startColor") != null ? typedArrayH.getColor(0, 0) : 0;
        boolean z11 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null;
        int color2 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null ? typedArrayH.getColor(7, 0) : 0;
        int color3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endColor") != null ? typedArrayH.getColor(1, 0) : 0;
        int i15 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "tileMode") != null ? typedArrayH.getInt(6, 0) : 0;
        float f18 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "gradientRadius") != null ? typedArrayH.getFloat(5, CropImageView.DEFAULT_ASPECT_RATIO) : CropImageView.DEFAULT_ASPECT_RATIO;
        typedArrayH.recycle();
        int depth = xml.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        float f19 = f18;
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next2 = xml.next();
            f5 = f13;
            if (next2 == 1) {
                f11 = f14;
                break;
            }
            int depth2 = xml.getDepth();
            f11 = f14;
            if (depth2 < depth && next2 == 3) {
                break;
            }
            if (next2 == 2 && depth2 <= depth && xml.getName().equals("item")) {
                TypedArray typedArrayH2 = q4.a.h(resources, theme, attributeSetAsAttributeSet, m4.a.f40863e);
                boolean zHasValue = typedArrayH2.hasValue(0);
                boolean zHasValue2 = typedArrayH2.hasValue(1);
                if (!zHasValue || !zHasValue2) {
                    throw new XmlPullParserException(xml.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
                }
                int color4 = typedArrayH2.getColor(0, 0);
                float f21 = typedArrayH2.getFloat(1, CropImageView.DEFAULT_ASPECT_RATIO);
                typedArrayH2.recycle();
                arrayList2.add(Integer.valueOf(color4));
                arrayList.add(Float.valueOf(f21));
            }
            f13 = f5;
            f14 = f11;
        }
        u uVar = arrayList2.size() > 0 ? new u(arrayList2, arrayList) : null;
        if (uVar == null) {
            uVar = z11 ? new u(color, color2, color3) : new u(color, color3);
        }
        if (i14 == 1) {
            i12 = 0;
            if (f19 <= CropImageView.DEFAULT_ASPECT_RATIO) {
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            }
            int[] iArr = (int[]) uVar.f44891b;
            float[] fArr = (float[]) uVar.f44892c;
            if (i15 != 1) {
                tileMode = i15 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
            } else {
                tileMode = Shader.TileMode.REPEAT;
            }
            radialGradient = new RadialGradient(f16, f17, f19, iArr, fArr, tileMode);
        } else if (i14 != 2) {
            int[] iArr2 = (int[]) uVar.f44891b;
            float[] fArr2 = (float[]) uVar.f44892c;
            if (i15 != 1) {
                tileMode2 = i15 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
            } else {
                tileMode2 = Shader.TileMode.REPEAT;
            }
            i12 = 0;
            radialGradient = new LinearGradient(f12, f5, f11, f15, iArr2, fArr2, tileMode2);
        } else {
            i12 = 0;
            radialGradient = new SweepGradient(f16, f17, (int[]) uVar.f44891b, (float[]) uVar.f44892c);
        }
        return new d(radialGradient, i12, 19, (Object) null);
    }

    public static JPCharDao i() {
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
        JPCharDao jPCharDao = ((DaoSession) aVar.f23485b).getJPCharDao();
        kotlin.jvm.internal.m.e(jPCharDao, "getJPCharDao(...)");
        return jPCharDao;
    }

    public static JPCharPartDao j() {
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
        JPCharPartDao jPCharPartDao = ((DaoSession) aVar.f23485b).getJPCharPartDao();
        kotlin.jvm.internal.m.e(jPCharPartDao, "getJPCharPartDao(...)");
        return jPCharPartDao;
    }

    public static d z(String str) throws ProtocolException {
        io.grpc.okhttp.internal.l lVar;
        int i11;
        String strSubstring;
        if (str.startsWith("HTTP/1.")) {
            i11 = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int iCharAt = str.charAt(7) - '0';
            if (iCharAt == 0) {
                lVar = io.grpc.okhttp.internal.l.HTTP_1_0;
            } else {
                if (iCharAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                lVar = io.grpc.okhttp.internal.l.HTTP_1_1;
            }
        } else {
            if (!str.startsWith("ICY ")) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            lVar = io.grpc.okhttp.internal.l.HTTP_1_0;
            i11 = 4;
        }
        int i12 = i11 + 3;
        if (str.length() < i12) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        try {
            int i13 = Integer.parseInt(str.substring(i11, i12));
            if (str.length() <= i12) {
                strSubstring = BuildConfig.VERSION_NAME;
            } else {
                if (str.charAt(i12) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                strSubstring = str.substring(i11 + 4);
            }
            return new d(i13, 10, lVar, strSubstring);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object A(v vVar, xy.c cVar) {
        n9.h hVar;
        a00.e eVar;
        d dVar;
        if (cVar instanceof n9.h) {
            hVar = (n9.h) cVar;
            int i11 = hVar.f43578f;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                hVar.f43578f = i11 - Integer.MIN_VALUE;
            } else {
                hVar = new n9.h(this, cVar);
            }
        } else {
            hVar = new n9.h(this, cVar);
        }
        Object obj = hVar.f43576d;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = hVar.f43578f;
        if (i12 == 0) {
            com.bumptech.glide.e.F(obj);
            eVar = (a00.e) this.f34423d;
            hVar.f43573a = this;
            hVar.f43574b = vVar;
            hVar.f43575c = eVar;
            hVar.f43578f = 1;
            if (eVar.b(hVar) == aVar) {
                return aVar;
            }
            dVar = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a00.e eVar2 = hVar.f43575c;
            v vVar2 = hVar.f43574b;
            dVar = hVar.f43573a;
            com.bumptech.glide.e.F(obj);
            eVar = eVar2;
            vVar = vVar2;
        }
        try {
            dVar.f34421b = vVar.f50857a;
            ((y0) dVar.f34422c).a((f0) vVar.f50858b);
            return b0.f48488a;
        } finally {
            eVar.a(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0067  */
    /* JADX WARN: Code duplicated, block: B:49:0x0175  */
    /* JADX WARN: Code duplicated, block: B:51:0x0199  */
    /* JADX WARN: Code duplicated, block: B:52:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:53:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:63:0x0261  */
    public void B(boolean z11) {
        boolean z12;
        SQLiteOpenHelper aVar;
        int i11 = this.f34421b;
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        if (i11 != x.n().keyLanguage) {
            int[] iArr = r.f4959a;
            if (!oz.x.q0(oz.x.q0(bq.m.r(this.f34421b), "ocup", BuildConfig.VERSION_NAME), "up", BuildConfig.VERSION_NAME).equals(oz.x.q0(oz.x.q0(bq.m.r(x.n().keyLanguage), "ocup", BuildConfig.VERSION_NAME), "up", BuildConfig.VERSION_NAME)) || oz.x.s0(bq.m.r(this.f34421b), "jp", false) || oz.x.s0(bq.m.r(this.f34421b), "kr", false) || oz.x.s0(bq.m.r(this.f34421b), "cn", false)) {
                z12 = true;
            } else {
                z12 = false;
            }
        } else {
            z12 = false;
        }
        this.f34421b = x.n().keyLanguage;
        if (z12 || z11) {
            if (z12) {
                ((jj.a) this.f34422c).close();
                ((jj.a) this.f34422c).getDatabaseName();
            }
            int i12 = x.n().keyLanguage;
            if (i12 == 40) {
                LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                kotlin.jvm.internal.m.c(lingoSkillApplication2);
                aVar = new sl.a(lingoSkillApplication2, x.n(), 16);
            } else if (i12 == 57) {
                LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                kotlin.jvm.internal.m.c(lingoSkillApplication3);
                aVar = new ao.a(lingoSkillApplication3, x.n(), 24);
            } else if (i12 == 61) {
                LingoSkillApplication lingoSkillApplication4 = LingoSkillApplication.f21665b;
                kotlin.jvm.internal.m.c(lingoSkillApplication4);
                aVar = new ao.a(lingoSkillApplication4, x.n(), 15);
            } else if (i12 == 63) {
                LingoSkillApplication lingoSkillApplication5 = LingoSkillApplication.f21665b;
                kotlin.jvm.internal.m.c(lingoSkillApplication5);
                aVar = new sl.a(lingoSkillApplication5, x.n(), 12);
            } else if (i12 == 65) {
                LingoSkillApplication lingoSkillApplication6 = LingoSkillApplication.f21665b;
                kotlin.jvm.internal.m.c(lingoSkillApplication6);
                aVar = new ao.a(lingoSkillApplication6, x.n(), 2);
            } else if (i12 != 69) {
                switch (i12) {
                    case 0:
                        LingoSkillApplication lingoSkillApplication7 = LingoSkillApplication.f21665b;
                        kotlin.jvm.internal.m.c(lingoSkillApplication7);
                        aVar = new ao.a(lingoSkillApplication7, x.n(), 22);
                        break;
                    case 1:
                        LingoSkillApplication lingoSkillApplication8 = LingoSkillApplication.f21665b;
                        kotlin.jvm.internal.m.c(lingoSkillApplication8);
                        aVar = new ao.a(lingoSkillApplication8, x.n(), 6);
                        break;
                    case 2:
                        LingoSkillApplication lingoSkillApplication9 = LingoSkillApplication.f21665b;
                        kotlin.jvm.internal.m.c(lingoSkillApplication9);
                        aVar = new sl.a(lingoSkillApplication9, x.n(), 9);
                        break;
                    case 3:
                        LingoSkillApplication lingoSkillApplication10 = LingoSkillApplication.f21665b;
                        kotlin.jvm.internal.m.c(lingoSkillApplication10);
                        aVar = new sl.a(lingoSkillApplication10, x.n(), 14);
                        break;
                    case 4:
                        LingoSkillApplication lingoSkillApplication11 = LingoSkillApplication.f21665b;
                        kotlin.jvm.internal.m.c(lingoSkillApplication11);
                        aVar = new ao.a(lingoSkillApplication11, x.n(), 9);
                        break;
                    case 5:
                        LingoSkillApplication lingoSkillApplication12 = LingoSkillApplication.f21665b;
                        kotlin.jvm.internal.m.c(lingoSkillApplication12);
                        aVar = new ao.a(lingoSkillApplication12, x.n(), 26);
                        break;
                    case 6:
                        LingoSkillApplication lingoSkillApplication13 = LingoSkillApplication.f21665b;
                        kotlin.jvm.internal.m.c(lingoSkillApplication13);
                        aVar = new ao.a(lingoSkillApplication13, x.n(), 17);
                        break;
                    case 7:
                        LingoSkillApplication lingoSkillApplication14 = LingoSkillApplication.f21665b;
                        kotlin.jvm.internal.m.c(lingoSkillApplication14);
                        aVar = new ao.a(lingoSkillApplication14, x.n(), 13);
                        break;
                    case 8:
                        LingoSkillApplication lingoSkillApplication15 = LingoSkillApplication.f21665b;
                        kotlin.jvm.internal.m.c(lingoSkillApplication15);
                        aVar = new ao.a(lingoSkillApplication15, x.n(), 28);
                        break;
                    default:
                        switch (i12) {
                            case 10:
                            case 22:
                                LingoSkillApplication lingoSkillApplication16 = LingoSkillApplication.f21665b;
                                kotlin.jvm.internal.m.c(lingoSkillApplication16);
                                aVar = new ao.a(lingoSkillApplication16, x.n(), 0);
                                break;
                            case 11:
                                LingoSkillApplication lingoSkillApplication17 = LingoSkillApplication.f21665b;
                                kotlin.jvm.internal.m.c(lingoSkillApplication17);
                                aVar = new ao.a(lingoSkillApplication17, x.n(), 23);
                                break;
                            case 12:
                                LingoSkillApplication lingoSkillApplication18 = LingoSkillApplication.f21665b;
                                kotlin.jvm.internal.m.c(lingoSkillApplication18);
                                aVar = new ao.a(lingoSkillApplication18, x.n(), 8);
                                break;
                            case 13:
                                LingoSkillApplication lingoSkillApplication19 = LingoSkillApplication.f21665b;
                                kotlin.jvm.internal.m.c(lingoSkillApplication19);
                                aVar = new sl.a(lingoSkillApplication19, x.n(), 11);
                                break;
                            case 14:
                                LingoSkillApplication lingoSkillApplication110 = LingoSkillApplication.f21665b;
                                kotlin.jvm.internal.m.c(lingoSkillApplication110);
                                aVar = new ao.a(lingoSkillApplication110, x.n(), 9);
                                break;
                            case 15:
                                LingoSkillApplication lingoSkillApplication111 = LingoSkillApplication.f21665b;
                                kotlin.jvm.internal.m.c(lingoSkillApplication111);
                                aVar = new ao.a(lingoSkillApplication111, x.n(), 26);
                                break;
                            case 16:
                                LingoSkillApplication lingoSkillApplication112 = LingoSkillApplication.f21665b;
                                kotlin.jvm.internal.m.c(lingoSkillApplication112);
                                aVar = new ao.a(lingoSkillApplication112, x.n(), 17);
                                break;
                            case 17:
                                LingoSkillApplication lingoSkillApplication113 = LingoSkillApplication.f21665b;
                                kotlin.jvm.internal.m.c(lingoSkillApplication113);
                                aVar = new ao.a(lingoSkillApplication113, x.n(), 28);
                                break;
                            case 18:
                                LingoSkillApplication lingoSkillApplication20 = LingoSkillApplication.f21665b;
                                kotlin.jvm.internal.m.c(lingoSkillApplication20);
                                aVar = new sl.a(lingoSkillApplication20, x.n(), 0);
                                break;
                            case 19:
                                LingoSkillApplication lingoSkillApplication21 = LingoSkillApplication.f21665b;
                                kotlin.jvm.internal.m.c(lingoSkillApplication21);
                                aVar = new ao.a(lingoSkillApplication21, x.n(), 20);
                                break;
                            case 20:
                                LingoSkillApplication lingoSkillApplication22 = LingoSkillApplication.f21665b;
                                kotlin.jvm.internal.m.c(lingoSkillApplication22);
                                aVar = new sl.a(lingoSkillApplication22, x.n(), 16);
                                break;
                            case 21:
                                LingoSkillApplication lingoSkillApplication23 = LingoSkillApplication.f21665b;
                                kotlin.jvm.internal.m.c(lingoSkillApplication23);
                                aVar = new sl.a(lingoSkillApplication23, x.n(), 3);
                                break;
                            default:
                                switch (i12) {
                                    case 47:
                                    case 48:
                                        LingoSkillApplication lingoSkillApplication24 = LingoSkillApplication.f21665b;
                                        kotlin.jvm.internal.m.c(lingoSkillApplication24);
                                        aVar = new ao.a(lingoSkillApplication24, x.n(), 19);
                                        break;
                                    case 49:
                                    case 50:
                                        LingoSkillApplication lingoSkillApplication25 = LingoSkillApplication.f21665b;
                                        kotlin.jvm.internal.m.c(lingoSkillApplication25);
                                        aVar = new sl.a(lingoSkillApplication25, x.n(), 2);
                                        break;
                                    default:
                                        switch (i12) {
                                            case 53:
                                            case 54:
                                                LingoSkillApplication lingoSkillApplication26 = LingoSkillApplication.f21665b;
                                                kotlin.jvm.internal.m.c(lingoSkillApplication26);
                                                aVar = new sl.a(lingoSkillApplication26, x.n(), 18);
                                                break;
                                            case 55:
                                                break;
                                            default:
                                                throw new IllegalArgumentException();
                                        }
                                    case 51:
                                        LingoSkillApplication lingoSkillApplication27 = LingoSkillApplication.f21665b;
                                        kotlin.jvm.internal.m.c(lingoSkillApplication27);
                                        aVar = new sl.a(lingoSkillApplication27, x.n(), 6);
                                        break;
                                }
                                break;
                        }
                        break;
                }
            } else {
                LingoSkillApplication lingoSkillApplication28 = LingoSkillApplication.f21665b;
                kotlin.jvm.internal.m.c(lingoSkillApplication28);
                aVar = new ao.a(lingoSkillApplication28, x.n(), 11);
            }
            this.f34422c = aVar;
            DaoSession daoSessionNewSession = new DaoMaster(aVar.getWritableDatabase()).m210newSession();
            kotlin.jvm.internal.m.e(daoSessionNewSession, "newSession(...)");
            this.f34423d = daoSessionNewSession;
        }
        ((DaoSession) this.f34423d).clear();
    }

    public void C() {
        int i11 = this.f34421b * 2;
        Object[] objArrCopyOf = Arrays.copyOf((Object[]) this.f34422c, i11);
        kotlin.jvm.internal.m.e(objArrCopyOf, "copyOf(...)");
        this.f34422c = objArrCopyOf;
        int[] iArr = new int[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            iArr[i12] = -1;
        }
        ry.l.L(0, 0, (int[]) this.f34423d, iArr, 14);
        this.f34423d = iArr;
    }

    public synchronized boolean D(int i11) {
        synchronized (this) {
            f();
        }
        if (((SparseArray) this.f34422c).size() > 0) {
            o00.a.P(this, "Can't change the max network thread count, because the  network thread pool isn't in IDLE, please try again after all running tasks are completed or invoking FileDownloader#pauseAll directly.", new Object[0]);
            return false;
        }
        int iA = ew.e.a(i11);
        List<Runnable> listShutdownNow = ((ThreadPoolExecutor) this.f34423d).shutdownNow();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(iA, iA, 15L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ew.b("Network"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f34423d = threadPoolExecutor;
        if (listShutdownNow.size() > 0) {
            o00.a.P(this, "recreate the network thread pool and discard %d tasks", Integer.valueOf(listShutdownNow.size()));
        }
        return true;
    }

    public void E() {
        d();
        View view = (View) this.f34423d;
        if (view == null) {
            throw new NullPointerException("View cant be null!");
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "rotation", CropImageView.DEFAULT_ASPECT_RATIO, 360.0f);
        this.f34422c = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(this.f34421b);
        ((ObjectAnimator) this.f34422c).setRepeatMode(1);
        ((ObjectAnimator) this.f34422c).setRepeatCount(-1);
        ((ObjectAnimator) this.f34422c).setInterpolator(new LinearInterpolator());
        ((ObjectAnimator) this.f34422c).start();
    }

    public void F(long j11, int i11, int i12) {
        int i13;
        char c11;
        char c12;
        long[] jArr = (long[]) this.f34422c;
        long[] jArr2 = (long[]) this.f34423d;
        jArr2[0] = j11;
        int i14 = 1;
        while (i14 > 0) {
            i14--;
            long j12 = jArr2[i14];
            int i15 = 33554431;
            int i16 = ((int) j12) & 33554431;
            char c13 = 25;
            int i17 = ((int) (j12 >> 25)) & 33554431;
            char c14 = '2';
            int i18 = ((int) (j12 >> 50)) & 1023;
            int i19 = i18 == 1023 ? this.f34421b : (i18 * 3) + i17;
            if (i17 < 0) {
                return;
            }
            while (i17 < jArr.length - 2 && i17 < i19) {
                int i21 = i17 + 2;
                long j13 = jArr[i21];
                if ((((int) (j13 >> c13)) & i15) == i16) {
                    long j14 = jArr[i17];
                    int i22 = i17 + 1;
                    i13 = i15;
                    c11 = c13;
                    long j15 = jArr[i22];
                    c12 = c14;
                    jArr[i17] = (((long) (((int) j14) + i12)) & 4294967295L) | (((long) (((int) (j14 >> 32)) + i11)) << 32);
                    jArr[i22] = (((long) (((int) j15) + i12)) & 4294967295L) | (((long) (((int) (j15 >> 32)) + i11)) << 32);
                    jArr[i21] = (((j13 >> 63) & 1) << 60) | j13;
                    if ((((int) (j13 >> c12)) & 1023) > 0) {
                        jArr2[i14] = (h3.a.f31534b & j13) | (((long) ((i17 + 3) & i13)) << c11);
                        i14++;
                    }
                } else {
                    i13 = i15;
                    c11 = c13;
                    c12 = c14;
                }
                i17 += 3;
                i15 = i13;
                c13 = c11;
                c14 = c12;
            }
        }
    }

    public void G(int i11, fz.g gVar) {
        int i12 = i11 & 33554431;
        long[] jArr = (long[]) this.f34422c;
        int i13 = this.f34421b;
        for (int i14 = 0; i14 < jArr.length - 2 && i14 < i13; i14 += 3) {
            if ((((int) jArr[i14 + 2]) & 33554431) == i12) {
                long j11 = jArr[i14];
                long j12 = jArr[i14 + 1];
                gVar.f(Integer.valueOf((int) (j11 >> 32)), Integer.valueOf((int) j11), Integer.valueOf((int) (j12 >> 32)), Integer.valueOf((int) j12));
                return;
            }
        }
    }

    @Override // tx.c
    public void accept(Object obj) {
        switch (this.f34420a) {
            case 11:
                Long it = (Long) obj;
                kotlin.jvm.internal.m.f(it, "it");
                ImageView imageView = (ImageView) this.f34422c;
                imageView.setVisibility(0);
                w0 w0VarB = s0.b(imageView);
                w0VarB.c(1.0f);
                w0VarB.d(1.0f);
                w0VarB.f(new AccelerateInterpolator());
                w0VarB.e(200L);
                w0VarB.g(new km.e((km.f) this.f34423d, imageView, this.f34421b));
                w0VarB.i();
                break;
            default:
                Long it2 = (Long) obj;
                kotlin.jvm.internal.m.f(it2, "it");
                rq.g gVar = (rq.g) this.f34422c;
                mp.b bVar = gVar.f49357a;
                String str = (String) this.f34423d;
                ta.a aVar = gVar.f49363g;
                kotlin.jvm.internal.m.c(aVar);
                ImageView ivAudio = (ImageView) ((w1) aVar).f33503d.f32490c;
                kotlin.jvm.internal.m.e(ivAudio, "ivAudio");
                ((p0) bVar).H(ivAudio, str);
                int i11 = this.f34421b;
                if (i11 == 0) {
                    ta.a aVar2 = gVar.f49363g;
                    kotlin.jvm.internal.m.c(aVar2);
                    ObjectAnimator.ofPropertyValuesHolder(((w1) aVar2).f33504e, PropertyValuesHolder.ofFloat("scaleX", 1.0f, 0.8f, 1.0f), PropertyValuesHolder.ofFloat("scaleY", 1.0f, 0.8f, 1.0f)).setDuration(300L).start();
                } else if (i11 == 1) {
                    ta.a aVar3 = gVar.f49363g;
                    kotlin.jvm.internal.m.c(aVar3);
                    ObjectAnimator.ofPropertyValuesHolder(((w1) aVar3).f33505f, PropertyValuesHolder.ofFloat("scaleX", 1.0f, 0.8f, 1.0f), PropertyValuesHolder.ofFloat("scaleY", 1.0f, 0.8f, 1.0f)).setDuration(300L).start();
                } else {
                    ta.a aVar4 = gVar.f49363g;
                    kotlin.jvm.internal.m.c(aVar4);
                    ObjectAnimator.ofPropertyValuesHolder(((w1) aVar4).f33504e, PropertyValuesHolder.ofFloat("scaleX", 1.0f, 0.8f, 1.0f), PropertyValuesHolder.ofFloat("scaleY", 1.0f, 0.8f, 1.0f)).setDuration(300L).start();
                    ta.a aVar5 = gVar.f49363g;
                    kotlin.jvm.internal.m.c(aVar5);
                    ObjectAnimator.ofPropertyValuesHolder(((w1) aVar5).f33505f, PropertyValuesHolder.ofFloat("scaleX", 1.0f, 0.8f, 1.0f), PropertyValuesHolder.ofFloat("scaleY", 1.0f, 0.8f, 1.0f)).setDuration(300L).start();
                }
                break;
        }
    }

    public void b(int i11, s sVar) {
        if (i11 < 0) {
            i0.a.a("size should be >=0");
        }
        if (i11 == 0) {
            return;
        }
        n0.h hVar = new n0.h(this.f34421b, i11, sVar);
        this.f34421b += i11;
        ((n1.e) this.f34422c).c(hVar);
    }

    public void d() {
        ObjectAnimator objectAnimator = (ObjectAnimator) this.f34422c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.f34422c = null;
        }
    }

    public void e(xv.f fVar) {
        fVar.g(fVar.f56601f.q(fVar.f56597b.f6390a));
        xv.h hVar = fVar.f56596a;
        bw.c cVar = hVar.f56610a;
        cVar.e((byte) 1);
        hVar.f56611b.c(cVar.f6390a);
        hVar.i((byte) 1);
        synchronized (this) {
            ((SparseArray) this.f34422c).put(fVar.f56597b.f6390a, fVar);
        }
        ((ThreadPoolExecutor) this.f34423d).execute(fVar);
        int i11 = this.f34421b;
        if (i11 < 600) {
            this.f34421b = i11 + 1;
        } else {
            f();
            this.f34421b = 0;
        }
    }

    public synchronized void f() {
        try {
            SparseArray sparseArray = new SparseArray();
            int size = ((SparseArray) this.f34422c).size();
            for (int i11 = 0; i11 < size; i11++) {
                int iKeyAt = ((SparseArray) this.f34422c).keyAt(i11);
                xv.f fVar = (xv.f) ((SparseArray) this.f34422c).get(iKeyAt);
                if (fVar != null && fVar.h()) {
                    sparseArray.put(iKeyAt, fVar);
                }
            }
            this.f34422c = sparseArray;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public Object g(int i11) {
        SparseArray sparseArray = (SparseArray) this.f34422c;
        if (this.f34421b == -1) {
            this.f34421b = 0;
        }
        while (true) {
            int i12 = this.f34421b;
            if (i12 <= 0 || i11 >= sparseArray.keyAt(i12)) {
                break;
            }
            this.f34421b--;
        }
        while (this.f34421b < sparseArray.size() - 1 && i11 >= sparseArray.keyAt(this.f34421b + 1)) {
            this.f34421b++;
        }
        return sparseArray.valueAt(this.f34421b);
    }

    public n0.h h(int i11) {
        if (i11 < 0 || i11 >= this.f34421b) {
            StringBuilder sbI = w4.c.i(i11, "Index ", ", size ");
            sbI.append(this.f34421b);
            i0.a.e(sbI.toString());
        }
        n0.h hVar = (n0.h) this.f34423d;
        if (hVar != null) {
            int i12 = hVar.f42946a;
            if (i11 < hVar.f42947b + i12 && i12 <= i11) {
                return hVar;
            }
        }
        n1.e eVar = (n1.e) this.f34422c;
        n0.h hVar2 = (n0.h) eVar.f43112a[n0.l.e(i11, eVar)];
        this.f34423d = hVar2;
        return hVar2;
    }

    @Override // x7.h
    public x7.g k(x7.n nVar, long j11) {
        long j12;
        long position = nVar.getPosition();
        int iMin = (int) Math.min(112800, nVar.getLength() - position);
        w wVar = (w) this.f34423d;
        wVar.F(iMin);
        nVar.A(wVar.f4039a, 0, iMin);
        int i11 = wVar.f4041c;
        long j13 = -1;
        long j14 = -1;
        long j15 = -9223372036854775807L;
        while (true) {
            if (wVar.a() < 188) {
                j12 = -9223372036854775807L;
                break;
            }
            byte[] bArr = wVar.f4039a;
            int i12 = wVar.f4040b;
            while (true) {
                if (i12 >= i11) {
                    j12 = -9223372036854775807L;
                    break;
                }
                j12 = -9223372036854775807L;
                if (bArr[i12] == 71) {
                    break;
                }
                i12++;
            }
            int i13 = i12 + 188;
            if (i13 > i11) {
                break;
            }
            long jY = g0.y(wVar, i12, this.f34421b);
            if (jY != j12) {
                long jB = ((b7.b0) this.f34422c).b(jY);
                if (jB > j11) {
                    return j15 == j12 ? new x7.g(jB, -1, position) : new x7.g(-9223372036854775807L, 0, position + j14);
                }
                j15 = jB;
                if (100000 + j15 > j11) {
                    return new x7.g(-9223372036854775807L, 0, position + ((long) i12));
                }
                j14 = i12;
            }
            wVar.I(i13);
            j13 = i13;
        }
        return j15 != j12 ? new x7.g(j15, -2, position + j13) : x7.g.f55888d;
    }

    public int l(Object obj) {
        d0 d0Var = (d0) this.f34422c;
        int iD = d0Var.d(obj);
        if (iD >= 0) {
            return d0Var.f56679c[iD];
        }
        return -1;
    }

    public Object m(int i11) {
        Object[] objArr = (Object[]) this.f34423d;
        int i12 = i11 - this.f34421b;
        if (i12 < 0 || i12 >= objArr.length) {
            return null;
        }
        return objArr[i12];
    }

    public LDCharacterDao n() {
        LDCharacterDao lDCharacterDao = ((DaoSession) this.f34423d).getLDCharacterDao();
        kotlin.jvm.internal.m.e(lDCharacterDao, "getLDCharacterDao(...)");
        return lDCharacterDao;
    }

    @Override // x7.h
    public void o() {
        w wVar = (w) this.f34423d;
        byte[] bArr = b7.f0.f3976b;
        wVar.getClass();
        wVar.G(bArr, bArr.length);
    }

    public LessonDao p() {
        LessonDao lessonDao = ((DaoSession) this.f34423d).getLessonDao();
        kotlin.jvm.internal.m.e(lessonDao, "getLessonDao(...)");
        return lessonDao;
    }

    public LevelDao q() {
        LevelDao levelDao = ((DaoSession) this.f34423d).getLevelDao();
        kotlin.jvm.internal.m.e(levelDao, "getLevelDao(...)");
        return levelDao;
    }

    public Model_Sentence_100Dao r() {
        Model_Sentence_100Dao model_Sentence_100Dao = ((DaoSession) this.f34423d).getModel_Sentence_100Dao();
        kotlin.jvm.internal.m.e(model_Sentence_100Dao, "getModel_Sentence_100Dao(...)");
        return model_Sentence_100Dao;
    }

    public String s() {
        StringBuilder sb2 = new StringBuilder("$");
        int i11 = this.f34421b + 1;
        for (int i12 = 0; i12 < i11; i12++) {
            Object obj = ((Object[]) this.f34422c)[i12];
            if (obj instanceof e00.g) {
                e00.g gVar = (e00.g) obj;
                if (!kotlin.jvm.internal.m.a(gVar.e(), e00.m.f24701d)) {
                    int i13 = ((int[]) this.f34423d)[i12];
                    if (i13 >= 0) {
                        sb2.append(".");
                        sb2.append(gVar.g(i13));
                    }
                } else if (((int[]) this.f34423d)[i12] != -1) {
                    sb2.append("[");
                    sb2.append(((int[]) this.f34423d)[i12]);
                    sb2.append("]");
                }
            } else if (obj != i00.k.f33910a) {
                sb2.append("['");
                sb2.append(obj);
                sb2.append("']");
            }
        }
        return sb2.toString();
    }

    public int t() {
        int i11 = this.f34421b;
        if (i11 != 2) {
            return i11 != 3 ? 0 : 512;
        }
        return 2048;
    }

    public SentenceDao u() {
        SentenceDao sentenceDao = ((DaoSession) this.f34423d).getSentenceDao();
        kotlin.jvm.internal.m.e(sentenceDao, "getSentenceDao(...)");
        return sentenceDao;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable v(xy.c cVar) {
        n9.g gVar;
        d dVar;
        a00.e eVar;
        if (cVar instanceof n9.g) {
            gVar = (n9.g) cVar;
            int i11 = gVar.f43565e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                gVar.f43565e = i11 - Integer.MIN_VALUE;
            } else {
                gVar = new n9.g(this, cVar);
            }
        } else {
            gVar = new n9.g(this, cVar);
        }
        Object obj = gVar.f43563c;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = gVar.f43565e;
        if (i12 == 0) {
            com.bumptech.glide.e.F(obj);
            a00.e eVar2 = (a00.e) this.f34423d;
            gVar.f43561a = this;
            gVar.f43562b = eVar2;
            gVar.f43565e = 1;
            if (eVar2.b(gVar) == aVar) {
                return aVar;
            }
            dVar = this;
            eVar = eVar2;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            eVar = gVar.f43562b;
            dVar = gVar.f43561a;
            com.bumptech.glide.e.F(obj);
        }
        try {
            List listB = ((y0) dVar.f34422c).b();
            int size = (dVar.f34421b - listB.size()) + 1;
            ArrayList arrayList = new ArrayList(ry.n.W(listB, 10));
            int i13 = 0;
            for (Object obj2 : listB) {
                int i14 = i13 + 1;
                if (i13 < 0) {
                    o.V();
                    throw null;
                }
                arrayList.add(new v(i13 + size, (f0) obj2));
                i13 = i14;
            }
            eVar.a(null);
            return arrayList;
        } catch (Throwable th2) {
            eVar.a(null);
            throw th2;
        }
    }

    public void w(int i11, int i12, int i13, int i14, int i15, int i16, boolean z11, boolean z12, boolean z13, int i17) {
        long[] jArr = (long[]) this.f34422c;
        int i18 = this.f34421b;
        int i19 = i18 + 3;
        this.f34421b = i19;
        int length = jArr.length;
        if (length <= i19) {
            int iMax = Math.max(length * 2, i19);
            long[] jArrCopyOf = Arrays.copyOf(jArr, iMax);
            kotlin.jvm.internal.m.e(jArrCopyOf, "copyOf(...)");
            this.f34422c = jArrCopyOf;
            long[] jArrCopyOf2 = Arrays.copyOf((long[]) this.f34423d, iMax);
            kotlin.jvm.internal.m.e(jArrCopyOf2, "copyOf(...)");
            this.f34423d = jArrCopyOf2;
        }
        long[] jArr2 = (long[]) this.f34422c;
        jArr2[i18] = (((long) i12) << 32) | (((long) i13) & 4294967295L);
        jArr2[i18 + 1] = (((long) i14) << 32) | (((long) i15) & 4294967295L);
        int i21 = i16 & 33554431;
        jArr2[i18 + 2] = ((z13 ? 1L : 0L) << 63) | ((z12 ? 1L : 0L) << 62) | ((z11 ? 1L : 0L) << 61) | (((long) 1) << 60) | (((long) Math.min(0, 1023)) << 50) | (((long) i21) << 25) | ((long) (i11 & 33554431));
        if (i16 < 0) {
            return;
        }
        for (int i22 = i17 != -1 ? i17 : i18 - 3; i22 >= 0; i22 -= 3) {
            int i23 = i22 + 2;
            long j11 = jArr2[i23];
            if ((((int) j11) & 33554431) == i21) {
                jArr2[i23] = (j11 & h3.a.f31533a) | (((long) Math.min((i18 - i22) / 3, 1023)) << 50);
                return;
            }
        }
    }

    public boolean y() {
        ColorStateList colorStateList;
        return ((Shader) this.f34422c) == null && (colorStateList = (ColorStateList) this.f34423d) != null && colorStateList.isStateful();
    }

    public d(int i11, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.f34420a = 1;
        this.f34421b = i11;
        this.f34423d = str;
        this.f34422c = arrayList;
    }

    public String toString() {
        switch (this.f34420a) {
            case 8:
                return s();
            case 10:
                String str = (String) this.f34423d;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(((io.grpc.okhttp.internal.l) this.f34422c) == io.grpc.okhttp.internal.l.HTTP_1_0 ? "HTTP/1.0" : xTCJ.abzsk);
                sb2.append(' ');
                sb2.append(this.f34421b);
                if (str != null) {
                    sb2.append(' ');
                    sb2.append(str);
                }
                return sb2.toString();
            case 18:
                StringBuilder sb3 = new StringBuilder();
                sb3.append((String) this.f34422c);
                sb3.append("://");
                int i11 = -1;
                if (((String) this.f34423d).indexOf(58) != -1) {
                    sb3.append('[');
                    sb3.append((String) this.f34423d);
                    sb3.append(']');
                } else {
                    sb3.append((String) this.f34423d);
                }
                int i12 = this.f34421b;
                if (i12 == -1) {
                    String str2 = (String) this.f34422c;
                    if (str2.equals("http")) {
                        i12 = 80;
                    } else {
                        i12 = str2.equals(Constants.SCHEME) ? 443 : -1;
                    }
                }
                String str3 = (String) this.f34422c;
                if (str3.equals("http")) {
                    i11 = 80;
                } else if (str3.equals(Constants.SCHEME)) {
                    i11 = 443;
                }
                if (i12 != i11) {
                    sb3.append(':');
                    sb3.append(i12);
                }
                return sb3.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ d(int i11, boolean z11) {
        this.f34420a = i11;
    }

    public /* synthetic */ d(Object obj, int i11, int i12, Object obj2) {
        this.f34420a = i12;
        this.f34422c = obj;
        this.f34423d = obj2;
        this.f34421b = i11;
    }

    public d(ArrayList arrayList, int i11, MotionEvent motionEvent) {
        this.f34420a = 16;
        this.f34422c = arrayList;
        this.f34421b = i11;
        this.f34423d = motionEvent;
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("changes cannot be empty");
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:35:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:37:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:47:0x0165  */
    public d(LingoSkillApplication lingoSkillApplication) {
        Object aVar;
        Object aVar2;
        this.f34420a = 0;
        LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
        int i11 = x.n().keyLanguage;
        if (i11 == 40) {
            aVar = new sl.a(lingoSkillApplication, x.n(), 16);
        } else if (i11 == 57) {
            aVar = new ao.a(lingoSkillApplication, x.n(), 24);
        } else if (i11 == 61) {
            aVar = new ao.a(lingoSkillApplication, x.n(), 15);
        } else if (i11 == 63) {
            aVar = new sl.a(lingoSkillApplication, x.n(), 12);
        } else if (i11 == 65) {
            aVar = new ao.a(lingoSkillApplication, x.n(), 2);
        } else if (i11 != 69) {
            switch (i11) {
                case 0:
                    aVar = new ao.a(lingoSkillApplication, x.n(), 22);
                    break;
                case 1:
                    aVar = new ao.a(lingoSkillApplication, x.n(), 6);
                    break;
                case 2:
                    aVar = new sl.a(lingoSkillApplication, x.n(), 9);
                    break;
                case 3:
                    aVar = new sl.a(lingoSkillApplication, x.n(), 14);
                    break;
                case 4:
                    aVar = new ao.a(lingoSkillApplication, x.n(), 9);
                    break;
                case 5:
                    aVar = new ao.a(lingoSkillApplication, x.n(), 26);
                    break;
                case 6:
                    aVar = new ao.a(lingoSkillApplication, x.n(), 17);
                    break;
                case 7:
                    aVar = new ao.a(lingoSkillApplication, x.n(), 13);
                    break;
                case 8:
                    aVar = new ao.a(lingoSkillApplication, x.n(), 28);
                    break;
                default:
                    switch (i11) {
                        case 10:
                        case 22:
                            aVar2 = new ao.a(lingoSkillApplication, x.n(), 0);
                            aVar = aVar2;
                            break;
                        case 11:
                            aVar = new ao.a(lingoSkillApplication, x.n(), 23);
                            break;
                        case 12:
                            aVar = new ao.a(lingoSkillApplication, x.n(), 8);
                            break;
                        case 13:
                            aVar = new sl.a(lingoSkillApplication, x.n(), 11);
                            break;
                        case 14:
                            aVar = new ao.a(lingoSkillApplication, x.n(), 9);
                            break;
                        case 15:
                            aVar = new ao.a(lingoSkillApplication, x.n(), 26);
                            break;
                        case 16:
                            aVar = new ao.a(lingoSkillApplication, x.n(), 17);
                            break;
                        case 17:
                            aVar = new ao.a(lingoSkillApplication, x.n(), 28);
                            break;
                        case 18:
                            aVar2 = new sl.a(lingoSkillApplication, x.n(), 0);
                            aVar = aVar2;
                            break;
                        case 19:
                            aVar = new ao.a(lingoSkillApplication, x.n(), 20);
                            break;
                        case 20:
                            aVar = new sl.a(lingoSkillApplication, x.n(), 16);
                            break;
                        case 21:
                            aVar = new sl.a(lingoSkillApplication, x.n(), 3);
                            break;
                        default:
                            switch (i11) {
                                case 47:
                                case 48:
                                    aVar = new ao.a(lingoSkillApplication, x.n(), 19);
                                    break;
                                case 49:
                                case 50:
                                    aVar = new sl.a(lingoSkillApplication, x.n(), 2);
                                    break;
                                default:
                                    switch (i11) {
                                        case 53:
                                        case 54:
                                            aVar = new sl.a(lingoSkillApplication, x.n(), 18);
                                            break;
                                        case 55:
                                            break;
                                        default:
                                            throw new IllegalArgumentException();
                                    }
                                case 51:
                                    aVar = new sl.a(lingoSkillApplication, x.n(), 6);
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            aVar = new ao.a(lingoSkillApplication, x.n(), 11);
        }
        this.f34422c = aVar;
        this.f34421b = x.n().keyLanguage;
        DaoSession daoSessionNewSession = new DaoMaster(((jj.a) this.f34422c).getWritableDatabase()).m210newSession();
        kotlin.jvm.internal.m.e(daoSessionNewSession, "newSession(...)");
        this.f34423d = daoSessionNewSession;
        daoSessionNewSession.clear();
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00d2  */
    public d(lz.g gVar, n0.l lVar) {
        Object fVar;
        this.f34420a = 13;
        d dVarK = lVar.k();
        int i11 = gVar.f40532a;
        if (i11 < 0) {
            i0.a.c("negative nearestRange.first");
        }
        int iMin = Math.min(gVar.f40533b, dVarK.f34421b - 1);
        if (iMin < i11) {
            d0 d0Var = n0.f56743a;
            kotlin.jvm.internal.m.d(d0Var, "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.emptyObjectIntMap>");
            this.f34422c = d0Var;
            this.f34423d = new Object[0];
            this.f34421b = 0;
            return;
        }
        int i12 = (iMin - i11) + 1;
        this.f34423d = new Object[i12];
        this.f34421b = i11;
        d0 d0Var2 = new d0(i12);
        n1.e eVar = (n1.e) dVarK.f34422c;
        if (i11 < 0 || i11 >= dVarK.f34421b) {
            StringBuilder sbI = w4.c.i(i11, "Index ", ", size ");
            sbI.append(dVarK.f34421b);
            i0.a.e(sbI.toString());
        }
        if (iMin < 0 || iMin >= dVarK.f34421b) {
            StringBuilder sbI2 = w4.c.i(iMin, "Index ", ", size ");
            sbI2.append(dVarK.f34421b);
            i0.a.e(sbI2.toString());
        }
        if (iMin < i11) {
            i0.a.a("toIndex (" + iMin + ") should be not smaller than fromIndex (" + i11 + ')');
        }
        int iE = n0.l.e(i11, eVar);
        int i13 = ((n0.h) eVar.f43112a[iE]).f42946a;
        while (i13 <= iMin) {
            n0.h hVar = (n0.h) eVar.f43112a[iE];
            fz.c key = hVar.f42948c.getKey();
            int i14 = hVar.f42946a;
            int iMax = Math.max(i11, i14);
            int iMin2 = Math.min(iMin, (hVar.f42947b + i14) - 1);
            if (iMax <= iMin2) {
                while (true) {
                    if (key != null) {
                        fVar = key.invoke(Integer.valueOf(iMax - i14));
                        fVar = fVar == null ? new n0.f(iMax) : fVar;
                    }
                    d0Var2.g(iMax, fVar);
                    ((Object[]) this.f34423d)[iMax - this.f34421b] = fVar;
                    iMax = iMax != iMin2 ? iMax + 1 : iMax;
                }
            }
            i13 += hVar.f42947b;
            iE++;
        }
        this.f34422c = d0Var2;
    }

    public d(nf.f fVar) {
        this.f34420a = 17;
        this.f34422c = new SparseArray();
        this.f34423d = fVar;
        this.f34421b = -1;
    }

    public d(int i11, b7.b0 b0Var) {
        this.f34420a = 4;
        this.f34421b = i11;
        this.f34422c = b0Var;
        this.f34423d = new w();
    }

    public d(int i11) {
        this.f34420a = i11;
        switch (i11) {
            case 14:
                this.f34422c = new y0();
                this.f34423d = new a00.e();
                this.f34421b = -1;
                break;
            case 23:
                this.f34421b = 2000;
                break;
            default:
                this.f34422c = new n1.e(new n0.h[16]);
                break;
        }
    }

    public d(d7.e eVar) {
        this.f34420a = 9;
        k0 k0Var = new k0();
        k0Var.f7547b = new re.g0(3);
        this.f34423d = k0Var;
        this.f34422c = eVar;
        this.f34421b = 1;
    }

    public d(int i11, List courseTestModelDataList, vt.n0 n0Var) {
        this.f34420a = 15;
        kotlin.jvm.internal.m.f(courseTestModelDataList, "courseTestModelDataList");
        this.f34421b = i11;
        this.f34422c = courseTestModelDataList;
        this.f34423d = n0Var;
    }

    public d(int i11, String str, int i12, ArrayList arrayList, byte[] bArr) {
        List listUnmodifiableList;
        this.f34420a = 5;
        this.f34421b = i12;
        if (arrayList == null) {
            listUnmodifiableList = Collections.EMPTY_LIST;
        } else {
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
        }
        this.f34422c = listUnmodifiableList;
        this.f34423d = bArr;
    }

    public d(p2 p2Var) {
        this.f34420a = 3;
        this.f34422c = p2Var;
    }

    public d(mw.g0 g0Var) {
        this.f34420a = 22;
        this.f34423d = qe.d.a(150, new o20.w(this, 29));
        this.f34422c = g0Var;
    }
}
