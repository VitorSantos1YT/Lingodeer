package oi;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.livedata.HeRS.DytezVyM;
import b0.h2;
import bh.a1;
import bh.f0;
import cf.x;
import com.android.billingclient.api.Purchase;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.DaoMaster;
import com.lingo.lingoskill.object.DaoSession;
import com.lingo.lingoskill.object.HwCharacterDao;
import com.lingodeer.R;
import com.lingodeer.data.env.Env;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import dv.u0;
import e6.p0;
import fr.j3;
import hj.w5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import jt.t0;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.z;
import lp.n;
import lp.o;
import nv.p;
import qh.c0;
import qx.h;
import qy.b0;
import qy.q;
import r.i2;
import r.s;
import r.t1;
import ry.l;
import ry.r;
import rz.e0;
import rz.o0;
import th.j;
import uz.x0;
import vt.k0;
import xy.i;
import yz.e;
import yz.f;
import z4.s0;
import z4.w0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class c implements tx.c {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static c f44924t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f44925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f44926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f44927c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f44928d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f44929e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f44930f;

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, Parcelable parcelable, Object obj4, Object obj5) {
        this.f44925a = obj;
        this.f44926b = obj2;
        this.f44927c = obj3;
        this.f44928d = parcelable;
        this.f44929e = obj4;
        this.f44930f = obj5;
    }

    public static final Object a(c cVar, Purchase purchase, p0 p0Var) {
        f fVar = o0.f50940a;
        Object objM = e0.M(e.f58387a, new n(purchase, cVar, null), p0Var);
        return objM == wy.a.COROUTINE_SUSPENDED ? objM : b0.f48488a;
    }

    public static final Object b(c cVar, i iVar) {
        f fVar = o0.f50940a;
        Object objM = e0.M(e.f58387a, new o(cVar, null), iVar);
        return objM == wy.a.COROUTINE_SUSPENDED ? objM : b0.f48488a;
    }

    public static boolean c(int[] iArr, int i11) {
        for (int i12 : iArr) {
            if (i12 == i11) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList e(Context context, int i11) {
        int iC = i2.c(context, R.attr.colorControlHighlight);
        int iB = i2.b(context, R.attr.colorButtonNormal);
        int[] iArr = i2.f48574b;
        int[] iArr2 = i2.f48576d;
        int iC2 = r4.c.c(iC, i11);
        return new ColorStateList(new int[][]{iArr, iArr2, i2.f48575c, i2.f48578f}, new int[]{iB, iC2, r4.c.c(iC, i11), i11});
    }

    public static int j(List list, int i11, long j11) {
        Iterator it = list.iterator();
        int i12 = -1;
        while (it.hasNext()) {
            qi.a aVar = (qi.a) it.next();
            if (aVar.f47798a == i11 && aVar.f47799b == j11) {
                i12 = aVar.f47800c;
            }
        }
        return i12;
    }

    public static ArrayList l(List list, int i11, long j11) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            qi.a aVar = (qi.a) it.next();
            if (aVar.f47798a == i11 && aVar.f47799b == j11) {
                arrayList.add(Integer.valueOf(aVar.f47800c));
            }
        }
        return arrayList;
    }

    public static LayerDrawable m(t1 t1Var, Context context, int i11) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i11);
        Drawable drawableC = t1Var.c(context, R.drawable.abc_star_black_48dp);
        Drawable drawableC2 = t1Var.c(context, R.drawable.abc_star_half_black_48dp);
        if ((drawableC instanceof BitmapDrawable) && drawableC.getIntrinsicWidth() == dimensionPixelSize && drawableC.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) drawableC;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableC.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableC.draw(canvas);
            bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((drawableC2 instanceof BitmapDrawable) && drawableC2.getIntrinsicWidth() == dimensionPixelSize && drawableC2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) drawableC2;
        } else {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            drawableC2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableC2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    public static void u(Drawable drawable, int i11, PorterDuff.Mode mode) {
        Drawable drawableMutate = drawable.mutate();
        if (mode == null) {
            mode = s.f48640b;
        }
        drawableMutate.setColorFilter(s.c(i11, mode));
    }

    @Override // tx.c
    public void accept(Object obj) {
        Long it = (Long) obj;
        m.f(it, "it");
        c0 c0Var = (c0) this.f44925a;
        ta.a aVar = c0Var.f36400f;
        m.c(aVar);
        ((w5) aVar).f33540r.removeView((ImageView) this.f44926b);
        ta.a aVar2 = c0Var.f36400f;
        m.c(aVar2);
        ((w5) aVar2).f33540r.removeView((ImageView) this.f44927c);
        ((Bitmap) this.f44928d).recycle();
        ((Bitmap) this.f44929e).recycle();
        ((Bitmap) this.f44930f).recycle();
    }

    public boolean d(List list, int i11, long j11) {
        Iterator it = list.iterator();
        boolean z11 = true;
        while (it.hasNext()) {
            qi.a aVar = (qi.a) it.next();
            if (aVar.f47798a == i11 && aVar.f47799b == j11) {
                z11 = false;
            }
        }
        return z11;
    }

    public DaoSession f() {
        Object value = ((q) this.f44925a).getValue();
        m.e(value, "getValue(...)");
        return (DaoSession) value;
    }

    public HwCharacterDao g() {
        Object value = ((q) this.f44926b).getValue();
        m.e(value, "getValue(...)");
        return (HwCharacterDao) value;
    }

    public int[] h(int i11) {
        if (((Env) this.f44926b).isPing) {
            switch (i11) {
                case 1:
                    return new int[]{35, 1, 2, 3, 4};
                case 2:
                    return new int[]{5, 6, 7, 8, 9};
                case 3:
                    return new int[]{10, 11, 12, 13, 14};
                case 4:
                    return new int[]{15, 16, 17, 18, 19};
                case 5:
                    return new int[]{20, 21, 22, 23, 24};
                case 6:
                    return new int[]{25, 26, 27, 28, 29};
                case 7:
                    return new int[]{30, 31, 32, 33, 34, 36, 38, 40};
                case 8:
                    return new int[]{41, 42, 43, 44, 45, 46, 47, 48};
                default:
                    return null;
            }
        }
        switch (i11) {
            case 1:
                return new int[]{85, 51, 52, 53, 54};
            case 2:
                return new int[]{55, 56, 57, 58, 59};
            case 3:
                return new int[]{60, 61, 62, 63, 64};
            case 4:
                return new int[]{65, 66, 67, 68, 69};
            case 5:
                return new int[]{70, 71, 72, 73, 74};
            case 6:
                return new int[]{75, 76, 77, 78, 79};
            case 7:
                return new int[]{80, 81, 82, 83, 84, 86, 88, 90};
            case 8:
                return new int[]{91, 92, 93, 94, 95, 96, 97, 98};
            default:
                return null;
        }
    }

    public List i() {
        List list = (List) this.f44925a;
        if (list != null) {
            return list;
        }
        m.n("mTestModels");
        throw null;
    }

    public ArrayList k(List list, int i11) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            qi.a aVar = (qi.a) it.next();
            if (aVar.f47798a == i11) {
                arrayList.add(Integer.valueOf(aVar.f47800c));
            }
        }
        return arrayList;
    }

    public void n(qi.a aVar, ArrayList arrayList, boolean z11, int i11) {
        int i12;
        int i13;
        ArrayList arrayList2 = arrayList;
        String str = (String) this.f44930f;
        int i14 = 4;
        int i15 = 3;
        Integer num = 47;
        ArrayList arrayList3 = (ArrayList) this.f44927c;
        Integer num2 = 48;
        if (arrayList2.size() == 1) {
            aVar.f47800c = ((Number) arrayList2.get(0)).intValue();
            return;
        }
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        int i16 = 7;
        if (l.D(new Integer[]{51, 55, 21, 61, 63, 65, 18, 19, 69}, Integer.valueOf(x.n().keyLanguage))) {
            Integer[] numArr = l.D(new Integer[]{51, 55, 61, 63, 65, 19}, Integer.valueOf(x.n().keyLanguage)) ? new Integer[]{3, 4, 5, 8, 10} : new Integer[]{3, 4, 5, 8, 10, 13};
            int size = arrayList2.size();
            int i17 = 0;
            while (i17 < size) {
                Object obj = arrayList2.get(i17);
                i17++;
                int iIntValue = ((Number) obj).intValue();
                if (l.D(numArr, Integer.valueOf(iIntValue))) {
                    ((List) arrayList3.get(0)).add(Integer.valueOf(iIntValue));
                }
            }
            if (((List) arrayList3.get(0)).size() != 0) {
                int iJ = j(i(), aVar.f47798a, aVar.f47799b);
                if (((List) arrayList3.get(0)).size() > 1) {
                    ((List) arrayList3.get(0)).remove(Integer.valueOf(iJ));
                }
                aVar.f47802e = (List) arrayList3.get(0);
                aVar.f47800c = ((Number) ((List) arrayList3.get(0)).get(j3.M(((List) arrayList3.get(0)).size()))).intValue();
                return;
            }
            ArrayList arrayListC1 = ry.m.c1(arrayList2);
            arrayListC1.remove((Object) 0);
            arrayListC1.remove((Object) 7);
            arrayListC1.remove((Object) 13);
            if (arrayListC1.size() > 0) {
                aVar.f47800c = ((Number) arrayListC1.get(j3.M(arrayListC1.size()))).intValue();
                return;
            } else {
                aVar.f47800c = -1;
                return;
            }
        }
        if (z11) {
            int size2 = arrayList2.size();
            int i18 = 0;
            while (i18 < size2) {
                Object obj2 = arrayList2.get(i18);
                i18++;
                int iIntValue2 = ((Number) obj2).intValue();
                arrayList3 = arrayList3;
                num = num;
                num2 = num2;
                LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                if (l.D(new Integer[]{num, num2, 49, 50, 53, 54}, Integer.valueOf(x.n().keyLanguage))) {
                    if (x.n().isAudioModel) {
                        if (iIntValue2 != 1) {
                            i13 = i14;
                            if (iIntValue2 == i13 || iIntValue2 == 10) {
                            }
                        } else {
                            i13 = i14;
                        }
                        ((List) arrayList3.get(0)).add(Integer.valueOf(iIntValue2));
                    } else {
                        i13 = i14;
                        if (iIntValue2 == 1 || iIntValue2 == 5 || iIntValue2 == 10) {
                            ((List) arrayList3.get(0)).add(Integer.valueOf(iIntValue2));
                        }
                    }
                    i14 = i13;
                    num = num;
                    num2 = num2;
                    arrayList3 = arrayList3;
                } else {
                    int i19 = i14;
                    if (iIntValue2 != i15 && iIntValue2 != 2) {
                        if (iIntValue2 != 6) {
                            i14 = i19;
                        }
                        i15 = 3;
                    }
                    ((List) arrayList3.get(0)).add(Integer.valueOf(iIntValue2));
                    i14 = 4;
                    i15 = 3;
                }
            }
            ArrayList arrayList4 = arrayList3;
            if (oz.q.v0(str, p.m(aVar.f47799b, ";", ";"), false)) {
                ((List) arrayList4.get(0)).remove((Object) 4);
            }
            if (((List) arrayList4.get(0)).size() == 0) {
                aVar.f47800c = ((Number) arrayList2.get(j3.M(arrayList2.size()))).intValue();
                return;
            }
            int iJ2 = j(i(), aVar.f47798a, aVar.f47799b);
            if (((List) arrayList4.get(0)).size() > 1) {
                ((List) arrayList4.get(0)).remove(Integer.valueOf(iJ2));
            }
            aVar.f47802e = (List) arrayList4.get(0);
            int iIntValue3 = ((Number) ((List) arrayList4.get(0)).get(j3.M(((List) arrayList4.get(0)).size()))).intValue();
            aVar.f47800c = iIntValue3;
            if (iIntValue3 == 12) {
                aVar.f47800c = 3;
                return;
            }
            return;
        }
        ((ArrayList) this.f44928d).add(Integer.valueOf(i11));
        int iO = o(i(), aVar.f47798a, aVar.f47799b);
        if (iO != 1) {
            if (iO >= 2) {
                aVar.f47800c = 13;
                return;
            }
            return;
        }
        int size3 = arrayList2.size();
        int i21 = 0;
        while (i21 < size3) {
            int i22 = i21 + 1;
            int iIntValue4 = ((Number) arrayList2.get(i21)).intValue();
            Integer num3 = num;
            Integer num4 = num2;
            LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
            if (!l.D(new Integer[]{num3, num4, 49, 50, 53, 54}, Integer.valueOf(x.n().keyLanguage))) {
                if (iIntValue4 != 1 && iIntValue4 != 5) {
                    if (iIntValue4 != 10) {
                    }
                }
                ((List) arrayList3.get(1)).add(Integer.valueOf(iIntValue4));
            } else if (x.n().isAudioModel) {
                if (iIntValue4 == 5 || iIntValue4 == i16) {
                    ((List) arrayList3.get(1)).add(Integer.valueOf(iIntValue4));
                }
            } else if (iIntValue4 == 1 || iIntValue4 == 5 || iIntValue4 == 10) {
                ((List) arrayList3.get(1)).add(Integer.valueOf(iIntValue4));
            }
            arrayList2 = arrayList;
            num = num3;
            num2 = num4;
            i21 = i22;
            i16 = 7;
        }
        if (oz.q.v0(str, p.m(aVar.f47799b, ";", ";"), false)) {
            ((List) arrayList3.get(1)).remove((Object) 5);
        }
        LingoSkillApplication lingoSkillApplication4 = LingoSkillApplication.f21665b;
        if (x.n().keyLanguage == 7) {
            ArrayList arrayListK = k(i(), aVar.f47798a);
            int size4 = arrayListK.size();
            i12 = 1;
            if (1 <= size4 && size4 < 2 && ((List) arrayList3.get(1)).size() > 1) {
                ((List) arrayList3.get(1)).remove(Integer.valueOf(((Number) arrayListK.get(0)).intValue()));
            } else if (arrayListK.size() >= 2 && ((List) arrayList3.get(1)).size() > 2) {
                int iIntValue5 = ((Number) p.f(1, arrayListK)).intValue();
                int iIntValue6 = ((Number) p.f(2, arrayListK)).intValue();
                ((List) arrayList3.get(1)).remove(Integer.valueOf(iIntValue5));
                ((List) arrayList3.get(1)).remove(Integer.valueOf(iIntValue6));
            }
            int iJ3 = j(i(), aVar.f47798a, aVar.f47799b);
            if (((List) arrayList3.get(1)).size() > 1) {
                ((List) arrayList3.get(1)).remove(Integer.valueOf(iJ3));
            }
        } else {
            i12 = 1;
        }
        if (((List) arrayList3.get(i12)).size() == 0) {
            aVar.f47800c = 13;
        } else {
            aVar.f47800c = ((Number) ((List) arrayList3.get(i12)).get(j3.M(((List) arrayList3.get(i12)).size()))).intValue();
            aVar.f47802e = (List) arrayList3.get(i12);
        }
    }

    public int o(List list, int i11, long j11) {
        Iterator it = list.iterator();
        int i12 = 0;
        while (it.hasNext()) {
            qi.a aVar = (qi.a) it.next();
            if (aVar.f47798a == i11 && aVar.f47799b == j11) {
                i12++;
            }
        }
        return i12;
    }

    public ColorStateList p(Context context, int i11) {
        if (i11 == R.drawable.abc_edit_text_material) {
            return o4.c.b(context, R.color.abc_tint_edittext);
        }
        if (i11 == 2131230840) {
            return o4.c.b(context, R.color.abc_tint_switch_track);
        }
        if (i11 != R.drawable.abc_switch_thumb_material) {
            if (i11 == R.drawable.abc_btn_default_mtrl_shape) {
                return e(context, i2.c(context, R.attr.colorButtonNormal));
            }
            if (i11 == R.drawable.abc_btn_borderless_material) {
                return e(context, 0);
            }
            if (i11 == R.drawable.abc_btn_colored_material) {
                return e(context, i2.c(context, R.attr.colorAccent));
            }
            if (i11 == 2131230835 || i11 == R.drawable.abc_spinner_textfield_background_material) {
                return o4.c.b(context, R.color.abc_tint_spinner);
            }
            if (c((int[]) this.f44926b, i11)) {
                return i2.d(context, R.attr.colorControlNormal);
            }
            if (c((int[]) this.f44929e, i11)) {
                return o4.c.b(context, R.color.abc_tint_default);
            }
            if (c((int[]) this.f44930f, i11)) {
                return o4.c.b(context, R.color.abc_tint_btn_checkable);
            }
            if (i11 == R.drawable.abc_seekbar_thumb_material) {
                return o4.c.b(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList colorStateListD = i2.d(context, R.attr.colorSwitchThumbNormal);
        if (colorStateListD == null || !colorStateListD.isStateful()) {
            iArr[0] = i2.f48574b;
            iArr2[0] = i2.b(context, R.attr.colorSwitchThumbNormal);
            iArr[1] = i2.f48577e;
            iArr2[1] = i2.c(context, R.attr.colorControlActivated);
            iArr[2] = i2.f48578f;
            iArr2[2] = i2.c(context, R.attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = i2.f48574b;
            iArr[0] = iArr3;
            iArr2[0] = colorStateListD.getColorForState(iArr3, 0);
            iArr[1] = i2.f48577e;
            iArr2[1] = i2.c(context, R.attr.colorControlActivated);
            iArr[2] = i2.f48578f;
            iArr2[2] = colorStateListD.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    /* JADX WARN: Code duplicated, block: B:138:0x039f  */
    /* JADX WARN: Code duplicated, block: B:199:0x03db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:205:0x0372 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:121:0x0372 -> B:112:0x035c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:143:0x03c3 -> B:109:0x0356). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public void q(qi.a r30, java.util.ArrayList r31, boolean r32) {
        /*
            Method dump skipped, instruction units count: 1028
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oi.c.q(qi.a, java.util.ArrayList, boolean):void");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public Object r(xy.c cVar) {
        om.p pVar;
        ArrayList arrayList = (ArrayList) this.f44929e;
        ArrayList arrayList2 = (ArrayList) this.f44928d;
        if (cVar instanceof om.p) {
            pVar = (om.p) cVar;
            int i11 = pVar.f45629c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                pVar.f45629c = i11 - Integer.MIN_VALUE;
            } else {
                pVar = new om.p(this, cVar);
            }
        } else {
            pVar = new om.p(this, cVar);
        }
        Object objU = pVar.f45627a;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = pVar.f45629c;
        int i13 = 0;
        if (i12 == 0) {
            com.bumptech.glide.e.F(objU);
            arrayList2.clear();
            k0 k0Var = (k0) ((c20.b) vc.a.m().f519c).f6515d.a(null, null, z.a(k0.class));
            LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
            f0 f0Var = new f0(((a1) k0Var).e(x.n().keyLanguage, false), i13);
            pVar.f45629c = 1;
            objU = x0.u(f0Var, pVar);
            if (objU == aVar) {
                return aVar;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(objU);
        }
        int iIntValue = ((Number) objU).intValue();
        for (int i14 = 1; i14 < iIntValue; i14++) {
            int[] iArrH = h(i14);
            m.c(iArrH);
            for (int i15 : iArrH) {
                arrayList2.add(new Integer(i15));
            }
        }
        while (i13 < 5) {
            int iM = j3.M(3);
            LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
            if (x.n().isPing) {
                om.o oVar = new om.o();
                oVar.f45625a = 5;
                arrayList.add(oVar);
            } else {
                om.o oVar2 = new om.o();
                oVar2.f45625a = iM + 5;
                arrayList.add(oVar2);
            }
            i13++;
        }
        Collections.shuffle(arrayList2);
        return b0.f48488a;
    }

    /* JADX WARN: Code duplicated, block: B:165:0x03a8  */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    public List s(String str) {
        List listK;
        List listT;
        String str2;
        int i11;
        List listK2;
        List listT2;
        String str3;
        List listK3;
        List listT3;
        int i12;
        int iC;
        List listK4;
        boolean z11;
        List listT4;
        List listK5;
        List listT5;
        List listK6;
        List listT6;
        List listK7;
        List listT7;
        boolean z12;
        List listK8;
        List listT8;
        ArrayList arrayList = (ArrayList) this.f44926b;
        ArrayList arrayList2 = (ArrayList) this.f44927c;
        this.f44925a = w4.c.m(str, "repeatRegex");
        ?? r9 = 0;
        Matcher matcherW = p.w(0, "#", "compile(...)", str);
        if (matcherW.find()) {
            ArrayList arrayList3 = new ArrayList(10);
            int iC2 = 0;
            do {
                iC2 = p.c(matcherW, str, iC2, arrayList3);
            } while (matcherW.find());
            p.B(iC2, str, arrayList3);
            listK = arrayList3;
        } else {
            listK = ns.o.K(str.toString());
        }
        boolean zIsEmpty = listK.isEmpty();
        r rVar = r.f50854a;
        if (zIsEmpty) {
            listT = rVar;
            break;
        }
        ListIterator listIterator = listK.listIterator(listK.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                listT = rVar;
                break;
            }
            if (((String) listIterator.previous()).length() != 0) {
                listT = b7.e0.t(listIterator, 1, listK);
                break;
            }
        }
        String[] strArr = (String[]) listT.toArray(new String[0]);
        ArrayList arrayList4 = new ArrayList();
        int length = strArr.length;
        int i13 = 0;
        while (true) {
            str2 = "input";
            if (i13 >= length) {
                break;
            }
            String strQ0 = strArr[i13];
            if (oz.x.s0(strQ0, "3:", r9)) {
                strQ0 = oz.x.q0(oz.x.q0(strQ0, ":-", ":0-"), ":;", ":0;");
            }
            Matcher matcherW2 = p.w(r9, ";", "compile(...)", strQ0);
            if (matcherW2.find()) {
                ArrayList arrayList5 = new ArrayList(10);
                int iC3 = 0;
                do {
                    iC3 = p.c(matcherW2, strQ0, iC3, arrayList5);
                } while (matcherW2.find());
                p.B(iC3, strQ0, arrayList5);
                listK6 = arrayList5;
            } else {
                listK6 = ns.o.K(strQ0.toString());
            }
            if (listK6.isEmpty()) {
                listT6 = rVar;
                break;
            }
            ListIterator listIterator2 = listK6.listIterator(listK6.size());
            while (true) {
                if (!listIterator2.hasPrevious()) {
                    listT6 = rVar;
                    break;
                }
                if (((String) listIterator2.previous()).length() != 0) {
                    listT6 = b7.e0.t(listIterator2, 1, listK6);
                    break;
                }
            }
            String[] strArr2 = (String[]) listT6.toArray(new String[0]);
            int i14 = strArr2.length > 2 ? Integer.parseInt(strArr2[2]) : 1;
            String str4 = strArr2[0];
            Matcher matcher = b7.e0.u(0, "-", "compile(...)", str4, "input").matcher(str4);
            if (matcher.find()) {
                ArrayList arrayList6 = new ArrayList(10);
                int iC4 = 0;
                do {
                    iC4 = p.c(matcher, str4, iC4, arrayList6);
                } while (matcher.find());
                p.B(iC4, str4, arrayList6);
                listK7 = arrayList6;
            } else {
                listK7 = ns.o.K(str4.toString());
            }
            if (listK7.isEmpty()) {
                listT7 = rVar;
                break;
            }
            ListIterator listIterator3 = listK7.listIterator(listK7.size());
            while (true) {
                if (!listIterator3.hasPrevious()) {
                    listT7 = rVar;
                    break;
                }
                if (((String) listIterator3.previous()).length() != 0) {
                    listT7 = b7.e0.t(listIterator3, 1, listK7);
                    break;
                }
            }
            String[] strArr3 = (String[]) listT7.toArray(new String[0]);
            if (strArr3.length >= 3) {
                int length2 = strArr3.length;
                int i15 = 0;
                z12 = true;
                while (i15 < length2) {
                    int i16 = i15;
                    String str5 = strArr3[i16];
                    r rVar2 = rVar;
                    int i17 = length;
                    Matcher matcher2 = b7.e0.u(0, ":", "compile(...)", str5, "input").matcher(str5);
                    if (matcher2.find()) {
                        ArrayList arrayList7 = new ArrayList(10);
                        int iC5 = 0;
                        do {
                            iC5 = p.c(matcher2, str5, iC5, arrayList7);
                        } while (matcher2.find());
                        p.B(iC5, str5, arrayList7);
                        listK8 = arrayList7;
                    } else {
                        listK8 = ns.o.K(str5.toString());
                    }
                    if (listK8.isEmpty()) {
                        listT8 = rVar2;
                        break;
                    }
                    ListIterator listIterator4 = listK8.listIterator(listK8.size());
                    while (true) {
                        if (!listIterator4.hasPrevious()) {
                            listT8 = rVar2;
                            break;
                        }
                        if (((String) listIterator4.previous()).length() != 0) {
                            listT8 = b7.e0.t(listIterator4, 1, listK8);
                            break;
                        }
                    }
                    String[] strArr4 = (String[]) listT8.toArray(new String[0]);
                    if ((!m.a(strArr4[0], "0") || !m.a(strArr4[2], "0")) && (!m.a(strArr4[0], "3") || !m.a(strArr4[2], "0"))) {
                        z12 = false;
                    }
                    i15 = i16 + 1;
                    rVar = rVar2;
                    length = i17;
                    i13 = i13;
                }
            } else {
                z12 = false;
            }
            r rVar3 = rVar;
            int i18 = length;
            int i19 = i13;
            if (z12) {
                arrayList4.add(str4);
            } else {
                for (int i21 : j3.P(strArr3.length, i14)) {
                    arrayList4.add(strArr3[i21]);
                }
            }
            i13 = i19 + 1;
            strArr = strArr;
            rVar = rVar3;
            length = i18;
            r9 = 0;
        }
        r rVar4 = rVar;
        int size = arrayList4.size();
        int i22 = 0;
        while (i22 < size) {
            Object obj = arrayList4.get(i22);
            m.e(obj, "get(...)");
            String str6 = (String) obj;
            int i23 = 0;
            if (oz.q.W0(str6, new String[]{"-"}, 0, 6).size() >= 3) {
                ArrayList arrayList8 = new ArrayList();
                List<String> listW0 = oz.q.W0(str6, new String[]{"-"}, 0, 6);
                int i24 = 6;
                for (String str7 : listW0) {
                    Matcher matcher3 = b7.e0.u(i23, ":", "compile(...)", str7, str2).matcher(str7);
                    if (matcher3.find()) {
                        ArrayList arrayList9 = new ArrayList(10);
                        int i25 = 0;
                        while (true) {
                            iC = p.c(matcher3, str7, i25, arrayList9);
                            if (!matcher3.find()) {
                                break;
                            }
                            i25 = iC;
                        }
                        p.B(iC, str7, arrayList9);
                        listK4 = arrayList9;
                    } else {
                        listK4 = ns.o.K(str7.toString());
                    }
                    if (listK4.isEmpty()) {
                        z11 = true;
                        listT4 = rVar4;
                        break;
                    }
                    ListIterator listIterator5 = listK4.listIterator(listK4.size());
                    while (true) {
                        if (!listIterator5.hasPrevious()) {
                            z11 = true;
                            listT4 = rVar4;
                            break;
                        }
                        if (!(((String) listIterator5.previous()).length() == 0)) {
                            z11 = true;
                            listT4 = b7.e0.t(listIterator5, 1, listK4);
                            break;
                        }
                    }
                    arrayList8.add(Long.valueOf(((String[]) listT4.toArray(new String[0]))[z11 ? 1 : 0]));
                    Pattern patternCompile = Pattern.compile(":");
                    m.e(patternCompile, "compile(...)");
                    oz.q.U0(0);
                    Matcher matcher4 = patternCompile.matcher(str7);
                    if (matcher4.find()) {
                        ArrayList arrayList10 = new ArrayList(10);
                        int iC6 = 0;
                        while (true) {
                            iC6 = p.c(matcher4, str7, iC6, arrayList10);
                            if (!matcher4.find()) {
                                break;
                            }
                            matcher4 = matcher4;
                        }
                        p.B(iC6, str7, arrayList10);
                        listK5 = arrayList10;
                    } else {
                        listK5 = ns.o.K(str7.toString());
                    }
                    if (listK5.isEmpty()) {
                        listT5 = rVar4;
                        break;
                    }
                    ListIterator listIterator6 = listK5.listIterator(listK5.size());
                    while (true) {
                        if (!listIterator6.hasPrevious()) {
                            listT5 = rVar4;
                            break;
                        }
                        if (!(((String) listIterator6.previous()).length() == 0)) {
                            listT5 = b7.e0.t(listIterator6, 1, listK5);
                            break;
                        }
                    }
                    i24 = Integer.parseInt(((String[]) listT5.toArray(new String[0]))[2]);
                    i23 = 0;
                    size = size;
                }
                i11 = size;
                int i26 = i23;
                int i27 = Integer.parseInt((String) oz.q.W0((CharSequence) listW0.get(i26), new String[]{":"}, i26, 6).get(i26));
                if (i27 != 0) {
                    if (i27 != 3) {
                        i12 = i24;
                    } else {
                        i12 = 14;
                    }
                } else if (i24 == 0) {
                    i12 = 6;
                } else {
                    i12 = i24;
                }
                qi.a aVar = new qi.a();
                aVar.f47798a = i27;
                aVar.f47799b = 0L;
                aVar.f47800c = i12;
                aVar.f47801d = arrayList8;
                i().add(aVar);
                str3 = str2;
            } else {
                i11 = size;
                String str8 = str2;
                arrayList.clear();
                arrayList2.clear();
                arrayList.add(new ArrayList());
                arrayList.add(new ArrayList());
                arrayList2.add(new ArrayList());
                arrayList2.add(new ArrayList());
                arrayList2.add(new ArrayList());
                arrayList2.add(new ArrayList());
                Pattern patternCompile2 = Pattern.compile(":");
                m.e(patternCompile2, "compile(...)");
                oz.q.U0(0);
                Matcher matcher5 = patternCompile2.matcher(str6);
                if (matcher5.find()) {
                    ArrayList arrayList11 = new ArrayList(10);
                    int iC7 = 0;
                    do {
                        iC7 = p.c(matcher5, str6, iC7, arrayList11);
                    } while (matcher5.find());
                    p.B(iC7, str6, arrayList11);
                    listK2 = arrayList11;
                } else {
                    listK2 = ns.o.K(str6.toString());
                }
                if (listK2.isEmpty()) {
                    listT2 = rVar4;
                    break;
                }
                ListIterator listIterator7 = listK2.listIterator(listK2.size());
                while (true) {
                    if (!listIterator7.hasPrevious()) {
                        listT2 = rVar4;
                        break;
                    }
                    if (!(((String) listIterator7.previous()).length() == 0)) {
                        listT2 = b7.e0.t(listIterator7, 1, listK2);
                        break;
                    }
                }
                String[] strArr5 = (String[]) listT2.toArray(new String[0]);
                qi.a aVar2 = new qi.a();
                aVar2.f47798a = Integer.parseInt(strArr5[0]);
                aVar2.f47799b = Integer.parseInt(strArr5[1]);
                String str9 = strArr5[2];
                str3 = str8;
                Matcher matcher6 = b7.e0.u(0, ",", "compile(...)", str9, str3).matcher(str9);
                if (matcher6.find()) {
                    ArrayList arrayList12 = new ArrayList(10);
                    int iC8 = 0;
                    do {
                        iC8 = p.c(matcher6, str9, iC8, arrayList12);
                    } while (matcher6.find());
                    p.B(iC8, str9, arrayList12);
                    listK3 = arrayList12;
                } else {
                    listK3 = ns.o.K(str9.toString());
                }
                if (listK3.isEmpty()) {
                    listT3 = rVar4;
                    break;
                }
                ListIterator listIterator8 = listK3.listIterator(listK3.size());
                while (true) {
                    if (!listIterator8.hasPrevious()) {
                        listT3 = rVar4;
                        break;
                    }
                    if (!(((String) listIterator8.previous()).length() == 0)) {
                        listT3 = b7.e0.t(listIterator8, 1, listK3);
                        break;
                    }
                }
                String[] strArr6 = (String[]) listT3.toArray(new String[0]);
                ArrayList arrayList13 = new ArrayList();
                for (String str10 : strArr6) {
                    arrayList13.add(Integer.valueOf(Integer.parseInt(str10)));
                }
                boolean zD = d(i(), aVar2.f47798a, aVar2.f47799b);
                if (aVar2.f47798a == 0) {
                    q(aVar2, arrayList13, zD);
                } else {
                    n(aVar2, arrayList13, zD, i22);
                }
                i().add(aVar2);
            }
            i22++;
            arrayList = arrayList;
            size = i11;
            str2 = str3;
        }
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        if (x.n().keyLanguage == 5) {
            return i();
        }
        ArrayList arrayList14 = new ArrayList();
        ArrayList arrayList15 = new ArrayList();
        int size2 = i().size();
        int i28 = 0;
        for (int i29 = 0; i29 < size2; i29++) {
            qi.a aVar3 = (qi.a) i().get(i29);
            int i30 = aVar3.f47798a;
            if (i30 == 1 && aVar3.f47800c == 13) {
                i28++;
                arrayList15.add(Long.valueOf(aVar3.f47799b));
            } else if (i30 == 1 && !arrayList15.contains(Long.valueOf(aVar3.f47799b))) {
                arrayList14.add(Integer.valueOf(i29));
            }
        }
        if (i28 < 2) {
            LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
            if (!l.D(new Integer[]{13, 12, 0, 11, 51, 55, 61, 18, 19, 69}, Integer.valueOf(x.n().keyLanguage))) {
                if (arrayList14.size() <= 1) {
                    if (arrayList14.size() == 1) {
                        List listI = i();
                        Object obj2 = arrayList14.get(0);
                        m.e(obj2, "get(...)");
                        Object obj3 = arrayList14.get(((Number) obj2).intValue());
                        m.e(obj3, "get(...)");
                        qi.a aVar4 = (qi.a) listI.get(((Number) obj3).intValue());
                        qi.a aVar5 = new qi.a();
                        aVar5.f47798a = aVar4.f47798a;
                        aVar5.f47799b = aVar4.f47799b;
                        aVar5.f47800c = 13;
                        i().add(aVar5);
                    }
                    return i();
                }
                int i31 = i28;
                for (int i32 : j3.O(arrayList14.size())) {
                    List listI2 = i();
                    Object obj4 = arrayList14.get(i32);
                    m.e(obj4, "get(...)");
                    qi.a aVar6 = (qi.a) listI2.get(((Number) obj4).intValue());
                    if (!arrayList15.contains(Long.valueOf(aVar6.f47799b))) {
                        qi.a aVar7 = new qi.a();
                        aVar7.f47798a = aVar6.f47798a;
                        aVar7.f47799b = aVar6.f47799b;
                        aVar7.f47800c = 13;
                        i().add(aVar7);
                        arrayList14.add(Integer.valueOf(i().size() - 1));
                        arrayList15.add(Long.valueOf(aVar6.f47799b));
                        i31++;
                    }
                    if (i31 >= 2) {
                        break;
                    }
                }
            }
        }
        if (oz.q.v0("release", "debug", false) && xt.b.f56282d) {
            t(i().subList(0, 1));
        }
        return i();
    }

    public void t(List list) {
        m.f(list, "<set-?>");
        this.f44925a = list;
    }

    public void v(n9.q dispose) {
        m.f(dispose, "dispose");
        View view = (View) this.f44926b;
        m.c(view);
        this.f44928d = (ConstraintLayout) view.findViewById(R.id.rl_answer_rect);
        View view2 = (View) this.f44926b;
        m.c(view2);
        this.f44929e = (RelativeLayout) view2.findViewById(R.id.content_mask);
        View view3 = (View) this.f44926b;
        m.c(view3);
        this.f44930f = (ImageView) view3.findViewById(R.id.answer_flag_img);
        ConstraintLayout constraintLayout = (ConstraintLayout) this.f44928d;
        m.c(constraintLayout);
        w0 w0VarB = s0.b(constraintLayout);
        w0VarB.a(CropImageView.DEFAULT_ASPECT_RATIO);
        w0VarB.e(300L);
        w0VarB.g(null);
        w0VarB.i();
        ImageView imageView = (ImageView) this.f44930f;
        m.c(imageView);
        w0 w0VarB2 = s0.b(imageView);
        w0VarB2.a(CropImageView.DEFAULT_ASPECT_RATIO);
        w0VarB2.e(300L);
        w0VarB2.g(null);
        w0VarB2.i();
        RelativeLayout relativeLayout = (RelativeLayout) this.f44929e;
        l.m mVar = (l.m) this.f44925a;
        m.c(mVar);
        int color = mVar.getColor(R.color.color_B3000000);
        l.m mVar2 = (l.m) this.f44925a;
        m.c(mVar2);
        ObjectAnimator.ofArgb(relativeLayout, "backgroundColor", color, mVar2.getColor(R.color.color_F6F6F6)).setDuration(300L).start();
        j.a(h.m(500L, TimeUnit.MILLISECONDS, ky.e.f38937b).h(new dm.a(this, 24), lp.c.f40185a), dispose);
    }

    public c(int i11) {
        switch (i11) {
            case 7:
                this.f44925a = new int[]{2131230850, 2131230848, 2131230774};
                this.f44926b = new int[]{2131230798, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
                this.f44927c = new int[]{2131230847, 2131230849, 2131230791, R.drawable.abc_text_cursor_material, 2131230844, 2131230845, 2131230846};
                this.f44928d = new int[]{2131230823, R.drawable.abc_cab_background_internal_bg, 2131230822};
                this.f44929e = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
                this.f44930f = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
                break;
            default:
                this.f44926b = new ArrayList();
                this.f44927c = new ArrayList();
                this.f44928d = new ArrayList();
                this.f44929e = new Long[]{2044L, 1767L, 440L, 2397L, 2398L, 2562L, 2563L, 2564L, 2565L, 441L, 2566L, 2567L, 2568L, 2569L, 2570L, 2396L};
                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                x.n();
                this.f44930f = BuildConfig.VERSION_NAME;
                break;
        }
    }

    public c(LingoSkillApplication lingoSkillApplication) {
        final int i11 = 0;
        this.f44925a = com.bumptech.glide.d.v(new fz.a(this) { // from class: oi.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f44923b;

            {
                this.f44923b = this;
            }

            @Override // fz.a
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        DaoSession daoSessionM210newSession = new DaoMaster(((d) ((q) this.f44923b.f44930f).getValue()).getWritableDatabase()).m210newSession();
                        org.greenrobot.greendao.database.a database = daoSessionM210newSession.getDatabase();
                        m.e(database, "getDatabase(...)");
                        database.k("CREATE TABLE IF NOT EXISTS \"Character\" (\"CharId\" INTEGER PRIMARY KEY NOT NULL ,\"Character\" TEXT,\"TCharacter\" TEXT,\"CharPath\" TEXT,\"TCharPath\" TEXT,\"Pinyin\" TEXT,\"Animation\" INTEGER,\"TranCHN\" TEXT,\"TranTCHN\" TEXT,\"TranJPN\" TEXT,\"TranKRN\" TEXT,\"TranENG\" TEXT,\"TranSPN\" TEXT,\"TranFRN\" TEXT,\"TranDEN\" TEXT,\"TranITN\" TEXT,\"TranPTG\" TEXT,\"TranVTN\" TEXT,\"TranRUS\" TEXT,\"TranTUR\" TEXT,\"TranIDN\" TEXT,\"TranARA\" TEXT,\"TranPOL\" TEXT,\"TranTHAI\" TEXT,\"TranHINDI\" TEXT,\"AnimationTipsTranCHN\" TEXT,\"AnimationTipsTranTCHN\" TEXT,\"AnimationTipsTranJPN\" TEXT,\"AnimationTipsTranKRN\" TEXT,\"AnimationTipsTranENG\" TEXT,\"AnimationTipsTranSPN\" TEXT,\"AnimationTipsTranFRN\" TEXT,\"AnimationTipsTranDEN\" TEXT,\"AnimationTipsTranITN\" TEXT,\"AnimationTipsTranPTG\" TEXT,\"AnimationTipsTranVTN\" TEXT,\"AnimationTipsTranRUS\" TEXT,\"AnimationTipsTranTUR\" TEXT,\"AnimationTipsTranIDN\" TEXT,\"AnimationTipsTranARA\" TEXT,\"AnimationTipsTranPOL\" TEXT,\"AnimationTipsTranTHAI\" TEXT,\"AnimationTipsTranHINDI\" TEXT,\"LevelIndex\" INTEGER NOT NULL ,\"CharIdInLGCharacter\" INTEGER NOT NULL );");
                        database.k("CREATE TABLE IF NOT EXISTS \"CharPart\" (\"PartId\" INTEGER PRIMARY KEY NOT NULL ,\"CharId\" INTEGER NOT NULL ,\"PartIndex\" INTEGER NOT NULL ,\"PartDirection\" TEXT,\"PartPath\" TEXT);");
                        database.k("CREATE TABLE IF NOT EXISTS \"TCharPart\" (\"CharId\" INTEGER NOT NULL ,\"PartDirection\" TEXT,\"PartId\" INTEGER PRIMARY KEY NOT NULL ,\"PartIndex\" INTEGER NOT NULL ,\"PartPath\" TEXT);");
                        database.k("CREATE TABLE IF NOT EXISTS \"CharGroup\" (\"PartGroupId\" INTEGER PRIMARY KEY NOT NULL ,\"PartGroupIndex\" INTEGER NOT NULL ,\"PartGroupList\" TEXT,\"PartGroupName\" TEXT,\"TPartGroupList\" TEXT,\"TPartGroupName\" TEXT);");
                        return daoSessionM210newSession;
                    case 1:
                        return this.f44923b.f().getHwCharacterDao();
                    case 2:
                        return this.f44923b.f().getHwCharPartDao();
                    case 3:
                        return this.f44923b.f().getHwTCharPartDao();
                    default:
                        return this.f44923b.f().getHwCharGroupDao();
                }
            }
        });
        final int i12 = 1;
        this.f44926b = com.bumptech.glide.d.v(new fz.a(this) { // from class: oi.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f44923b;

            {
                this.f44923b = this;
            }

            @Override // fz.a
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        DaoSession daoSessionM210newSession = new DaoMaster(((d) ((q) this.f44923b.f44930f).getValue()).getWritableDatabase()).m210newSession();
                        org.greenrobot.greendao.database.a database = daoSessionM210newSession.getDatabase();
                        m.e(database, "getDatabase(...)");
                        database.k("CREATE TABLE IF NOT EXISTS \"Character\" (\"CharId\" INTEGER PRIMARY KEY NOT NULL ,\"Character\" TEXT,\"TCharacter\" TEXT,\"CharPath\" TEXT,\"TCharPath\" TEXT,\"Pinyin\" TEXT,\"Animation\" INTEGER,\"TranCHN\" TEXT,\"TranTCHN\" TEXT,\"TranJPN\" TEXT,\"TranKRN\" TEXT,\"TranENG\" TEXT,\"TranSPN\" TEXT,\"TranFRN\" TEXT,\"TranDEN\" TEXT,\"TranITN\" TEXT,\"TranPTG\" TEXT,\"TranVTN\" TEXT,\"TranRUS\" TEXT,\"TranTUR\" TEXT,\"TranIDN\" TEXT,\"TranARA\" TEXT,\"TranPOL\" TEXT,\"TranTHAI\" TEXT,\"TranHINDI\" TEXT,\"AnimationTipsTranCHN\" TEXT,\"AnimationTipsTranTCHN\" TEXT,\"AnimationTipsTranJPN\" TEXT,\"AnimationTipsTranKRN\" TEXT,\"AnimationTipsTranENG\" TEXT,\"AnimationTipsTranSPN\" TEXT,\"AnimationTipsTranFRN\" TEXT,\"AnimationTipsTranDEN\" TEXT,\"AnimationTipsTranITN\" TEXT,\"AnimationTipsTranPTG\" TEXT,\"AnimationTipsTranVTN\" TEXT,\"AnimationTipsTranRUS\" TEXT,\"AnimationTipsTranTUR\" TEXT,\"AnimationTipsTranIDN\" TEXT,\"AnimationTipsTranARA\" TEXT,\"AnimationTipsTranPOL\" TEXT,\"AnimationTipsTranTHAI\" TEXT,\"AnimationTipsTranHINDI\" TEXT,\"LevelIndex\" INTEGER NOT NULL ,\"CharIdInLGCharacter\" INTEGER NOT NULL );");
                        database.k("CREATE TABLE IF NOT EXISTS \"CharPart\" (\"PartId\" INTEGER PRIMARY KEY NOT NULL ,\"CharId\" INTEGER NOT NULL ,\"PartIndex\" INTEGER NOT NULL ,\"PartDirection\" TEXT,\"PartPath\" TEXT);");
                        database.k("CREATE TABLE IF NOT EXISTS \"TCharPart\" (\"CharId\" INTEGER NOT NULL ,\"PartDirection\" TEXT,\"PartId\" INTEGER PRIMARY KEY NOT NULL ,\"PartIndex\" INTEGER NOT NULL ,\"PartPath\" TEXT);");
                        database.k("CREATE TABLE IF NOT EXISTS \"CharGroup\" (\"PartGroupId\" INTEGER PRIMARY KEY NOT NULL ,\"PartGroupIndex\" INTEGER NOT NULL ,\"PartGroupList\" TEXT,\"PartGroupName\" TEXT,\"TPartGroupList\" TEXT,\"TPartGroupName\" TEXT);");
                        return daoSessionM210newSession;
                    case 1:
                        return this.f44923b.f().getHwCharacterDao();
                    case 2:
                        return this.f44923b.f().getHwCharPartDao();
                    case 3:
                        return this.f44923b.f().getHwTCharPartDao();
                    default:
                        return this.f44923b.f().getHwCharGroupDao();
                }
            }
        });
        final int i13 = 2;
        this.f44927c = com.bumptech.glide.d.v(new fz.a(this) { // from class: oi.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f44923b;

            {
                this.f44923b = this;
            }

            @Override // fz.a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        DaoSession daoSessionM210newSession = new DaoMaster(((d) ((q) this.f44923b.f44930f).getValue()).getWritableDatabase()).m210newSession();
                        org.greenrobot.greendao.database.a database = daoSessionM210newSession.getDatabase();
                        m.e(database, "getDatabase(...)");
                        database.k("CREATE TABLE IF NOT EXISTS \"Character\" (\"CharId\" INTEGER PRIMARY KEY NOT NULL ,\"Character\" TEXT,\"TCharacter\" TEXT,\"CharPath\" TEXT,\"TCharPath\" TEXT,\"Pinyin\" TEXT,\"Animation\" INTEGER,\"TranCHN\" TEXT,\"TranTCHN\" TEXT,\"TranJPN\" TEXT,\"TranKRN\" TEXT,\"TranENG\" TEXT,\"TranSPN\" TEXT,\"TranFRN\" TEXT,\"TranDEN\" TEXT,\"TranITN\" TEXT,\"TranPTG\" TEXT,\"TranVTN\" TEXT,\"TranRUS\" TEXT,\"TranTUR\" TEXT,\"TranIDN\" TEXT,\"TranARA\" TEXT,\"TranPOL\" TEXT,\"TranTHAI\" TEXT,\"TranHINDI\" TEXT,\"AnimationTipsTranCHN\" TEXT,\"AnimationTipsTranTCHN\" TEXT,\"AnimationTipsTranJPN\" TEXT,\"AnimationTipsTranKRN\" TEXT,\"AnimationTipsTranENG\" TEXT,\"AnimationTipsTranSPN\" TEXT,\"AnimationTipsTranFRN\" TEXT,\"AnimationTipsTranDEN\" TEXT,\"AnimationTipsTranITN\" TEXT,\"AnimationTipsTranPTG\" TEXT,\"AnimationTipsTranVTN\" TEXT,\"AnimationTipsTranRUS\" TEXT,\"AnimationTipsTranTUR\" TEXT,\"AnimationTipsTranIDN\" TEXT,\"AnimationTipsTranARA\" TEXT,\"AnimationTipsTranPOL\" TEXT,\"AnimationTipsTranTHAI\" TEXT,\"AnimationTipsTranHINDI\" TEXT,\"LevelIndex\" INTEGER NOT NULL ,\"CharIdInLGCharacter\" INTEGER NOT NULL );");
                        database.k("CREATE TABLE IF NOT EXISTS \"CharPart\" (\"PartId\" INTEGER PRIMARY KEY NOT NULL ,\"CharId\" INTEGER NOT NULL ,\"PartIndex\" INTEGER NOT NULL ,\"PartDirection\" TEXT,\"PartPath\" TEXT);");
                        database.k("CREATE TABLE IF NOT EXISTS \"TCharPart\" (\"CharId\" INTEGER NOT NULL ,\"PartDirection\" TEXT,\"PartId\" INTEGER PRIMARY KEY NOT NULL ,\"PartIndex\" INTEGER NOT NULL ,\"PartPath\" TEXT);");
                        database.k("CREATE TABLE IF NOT EXISTS \"CharGroup\" (\"PartGroupId\" INTEGER PRIMARY KEY NOT NULL ,\"PartGroupIndex\" INTEGER NOT NULL ,\"PartGroupList\" TEXT,\"PartGroupName\" TEXT,\"TPartGroupList\" TEXT,\"TPartGroupName\" TEXT);");
                        return daoSessionM210newSession;
                    case 1:
                        return this.f44923b.f().getHwCharacterDao();
                    case 2:
                        return this.f44923b.f().getHwCharPartDao();
                    case 3:
                        return this.f44923b.f().getHwTCharPartDao();
                    default:
                        return this.f44923b.f().getHwCharGroupDao();
                }
            }
        });
        final int i14 = 3;
        this.f44928d = com.bumptech.glide.d.v(new fz.a(this) { // from class: oi.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f44923b;

            {
                this.f44923b = this;
            }

            @Override // fz.a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        DaoSession daoSessionM210newSession = new DaoMaster(((d) ((q) this.f44923b.f44930f).getValue()).getWritableDatabase()).m210newSession();
                        org.greenrobot.greendao.database.a database = daoSessionM210newSession.getDatabase();
                        m.e(database, "getDatabase(...)");
                        database.k("CREATE TABLE IF NOT EXISTS \"Character\" (\"CharId\" INTEGER PRIMARY KEY NOT NULL ,\"Character\" TEXT,\"TCharacter\" TEXT,\"CharPath\" TEXT,\"TCharPath\" TEXT,\"Pinyin\" TEXT,\"Animation\" INTEGER,\"TranCHN\" TEXT,\"TranTCHN\" TEXT,\"TranJPN\" TEXT,\"TranKRN\" TEXT,\"TranENG\" TEXT,\"TranSPN\" TEXT,\"TranFRN\" TEXT,\"TranDEN\" TEXT,\"TranITN\" TEXT,\"TranPTG\" TEXT,\"TranVTN\" TEXT,\"TranRUS\" TEXT,\"TranTUR\" TEXT,\"TranIDN\" TEXT,\"TranARA\" TEXT,\"TranPOL\" TEXT,\"TranTHAI\" TEXT,\"TranHINDI\" TEXT,\"AnimationTipsTranCHN\" TEXT,\"AnimationTipsTranTCHN\" TEXT,\"AnimationTipsTranJPN\" TEXT,\"AnimationTipsTranKRN\" TEXT,\"AnimationTipsTranENG\" TEXT,\"AnimationTipsTranSPN\" TEXT,\"AnimationTipsTranFRN\" TEXT,\"AnimationTipsTranDEN\" TEXT,\"AnimationTipsTranITN\" TEXT,\"AnimationTipsTranPTG\" TEXT,\"AnimationTipsTranVTN\" TEXT,\"AnimationTipsTranRUS\" TEXT,\"AnimationTipsTranTUR\" TEXT,\"AnimationTipsTranIDN\" TEXT,\"AnimationTipsTranARA\" TEXT,\"AnimationTipsTranPOL\" TEXT,\"AnimationTipsTranTHAI\" TEXT,\"AnimationTipsTranHINDI\" TEXT,\"LevelIndex\" INTEGER NOT NULL ,\"CharIdInLGCharacter\" INTEGER NOT NULL );");
                        database.k("CREATE TABLE IF NOT EXISTS \"CharPart\" (\"PartId\" INTEGER PRIMARY KEY NOT NULL ,\"CharId\" INTEGER NOT NULL ,\"PartIndex\" INTEGER NOT NULL ,\"PartDirection\" TEXT,\"PartPath\" TEXT);");
                        database.k("CREATE TABLE IF NOT EXISTS \"TCharPart\" (\"CharId\" INTEGER NOT NULL ,\"PartDirection\" TEXT,\"PartId\" INTEGER PRIMARY KEY NOT NULL ,\"PartIndex\" INTEGER NOT NULL ,\"PartPath\" TEXT);");
                        database.k("CREATE TABLE IF NOT EXISTS \"CharGroup\" (\"PartGroupId\" INTEGER PRIMARY KEY NOT NULL ,\"PartGroupIndex\" INTEGER NOT NULL ,\"PartGroupList\" TEXT,\"PartGroupName\" TEXT,\"TPartGroupList\" TEXT,\"TPartGroupName\" TEXT);");
                        return daoSessionM210newSession;
                    case 1:
                        return this.f44923b.f().getHwCharacterDao();
                    case 2:
                        return this.f44923b.f().getHwCharPartDao();
                    case 3:
                        return this.f44923b.f().getHwTCharPartDao();
                    default:
                        return this.f44923b.f().getHwCharGroupDao();
                }
            }
        });
        final int i15 = 4;
        this.f44929e = com.bumptech.glide.d.v(new fz.a(this) { // from class: oi.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f44923b;

            {
                this.f44923b = this;
            }

            @Override // fz.a
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        DaoSession daoSessionM210newSession = new DaoMaster(((d) ((q) this.f44923b.f44930f).getValue()).getWritableDatabase()).m210newSession();
                        org.greenrobot.greendao.database.a database = daoSessionM210newSession.getDatabase();
                        m.e(database, "getDatabase(...)");
                        database.k("CREATE TABLE IF NOT EXISTS \"Character\" (\"CharId\" INTEGER PRIMARY KEY NOT NULL ,\"Character\" TEXT,\"TCharacter\" TEXT,\"CharPath\" TEXT,\"TCharPath\" TEXT,\"Pinyin\" TEXT,\"Animation\" INTEGER,\"TranCHN\" TEXT,\"TranTCHN\" TEXT,\"TranJPN\" TEXT,\"TranKRN\" TEXT,\"TranENG\" TEXT,\"TranSPN\" TEXT,\"TranFRN\" TEXT,\"TranDEN\" TEXT,\"TranITN\" TEXT,\"TranPTG\" TEXT,\"TranVTN\" TEXT,\"TranRUS\" TEXT,\"TranTUR\" TEXT,\"TranIDN\" TEXT,\"TranARA\" TEXT,\"TranPOL\" TEXT,\"TranTHAI\" TEXT,\"TranHINDI\" TEXT,\"AnimationTipsTranCHN\" TEXT,\"AnimationTipsTranTCHN\" TEXT,\"AnimationTipsTranJPN\" TEXT,\"AnimationTipsTranKRN\" TEXT,\"AnimationTipsTranENG\" TEXT,\"AnimationTipsTranSPN\" TEXT,\"AnimationTipsTranFRN\" TEXT,\"AnimationTipsTranDEN\" TEXT,\"AnimationTipsTranITN\" TEXT,\"AnimationTipsTranPTG\" TEXT,\"AnimationTipsTranVTN\" TEXT,\"AnimationTipsTranRUS\" TEXT,\"AnimationTipsTranTUR\" TEXT,\"AnimationTipsTranIDN\" TEXT,\"AnimationTipsTranARA\" TEXT,\"AnimationTipsTranPOL\" TEXT,\"AnimationTipsTranTHAI\" TEXT,\"AnimationTipsTranHINDI\" TEXT,\"LevelIndex\" INTEGER NOT NULL ,\"CharIdInLGCharacter\" INTEGER NOT NULL );");
                        database.k("CREATE TABLE IF NOT EXISTS \"CharPart\" (\"PartId\" INTEGER PRIMARY KEY NOT NULL ,\"CharId\" INTEGER NOT NULL ,\"PartIndex\" INTEGER NOT NULL ,\"PartDirection\" TEXT,\"PartPath\" TEXT);");
                        database.k("CREATE TABLE IF NOT EXISTS \"TCharPart\" (\"CharId\" INTEGER NOT NULL ,\"PartDirection\" TEXT,\"PartId\" INTEGER PRIMARY KEY NOT NULL ,\"PartIndex\" INTEGER NOT NULL ,\"PartPath\" TEXT);");
                        database.k("CREATE TABLE IF NOT EXISTS \"CharGroup\" (\"PartGroupId\" INTEGER PRIMARY KEY NOT NULL ,\"PartGroupIndex\" INTEGER NOT NULL ,\"PartGroupList\" TEXT,\"PartGroupName\" TEXT,\"TPartGroupList\" TEXT,\"TPartGroupName\" TEXT);");
                        return daoSessionM210newSession;
                    case 1:
                        return this.f44923b.f().getHwCharacterDao();
                    case 2:
                        return this.f44923b.f().getHwCharPartDao();
                    case 3:
                        return this.f44923b.f().getHwTCharPartDao();
                    default:
                        return this.f44923b.f().getHwCharGroupDao();
                }
            }
        });
        this.f44930f = com.bumptech.glide.d.v(new com.google.firebase.sessions.a(lingoSkillApplication, 5));
    }

    public c(h2 logger, e20.a scope, kotlin.jvm.internal.e eVar, b20.a aVar, a20.a aVar2) {
        m.f(logger, "logger");
        m.f(scope, "scope");
        this.f44925a = logger;
        this.f44926b = scope;
        this.f44927c = eVar;
        this.f44928d = aVar;
        this.f44929e = aVar2;
        this.f44930f = "t:'" + f20.a.a(eVar) + "' - q:'" + aVar + '\'';
    }

    public c(Lifecycle lifeCycle, l.m mVar, mi.c billingClientLifecycle, wt.o0 userInfoUseCase, u0 netWorkClient, fz.c cVar) {
        m.f(lifeCycle, "lifeCycle");
        m.f(billingClientLifecycle, "billingClientLifecycle");
        m.f(userInfoUseCase, "userInfoUseCase");
        m.f(netWorkClient, "netWorkClient");
        this.f44925a = mVar;
        this.f44926b = billingClientLifecycle;
        this.f44927c = userInfoUseCase;
        this.f44928d = netWorkClient;
        ArrayList arrayList = new ArrayList();
        arrayList.add("basic_member_month_3");
        arrayList.add("basic_member_month_1");
        arrayList.add("basic_member_premium_month_1");
        arrayList.add("basic_member_premium_month_3");
        arrayList.add("basic_member_premium_month_12");
        arrayList.add("basic_member_premium_month_12_discount");
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add("s01_month_1");
        arrayList2.add("s01_month_3");
        arrayList2.add("s01_month_12");
        arrayList2.add("s01_month_12_new");
        arrayList2.add("s01_month_12_discount");
        arrayList.addAll(arrayList2);
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add("s02_month_1");
        arrayList3.add("s02_month_3");
        arrayList3.add("s02_month_12");
        arrayList3.add("s02_month_12_new");
        arrayList3.add("s02_month_12_discount");
        arrayList.addAll(arrayList3);
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add("s03_month_1");
        arrayList4.add("s03_month_3");
        arrayList4.add("s03_month_12");
        arrayList4.add("s03_month_12_new");
        arrayList4.add("s03_month_12_discount");
        arrayList.addAll(arrayList4);
        ArrayList arrayList5 = new ArrayList();
        arrayList5.add("s04_month_1");
        arrayList5.add("s04_month_3");
        arrayList5.add("s04_month_12");
        arrayList5.add("s04_month_12_new");
        arrayList5.add("s04_month_12_discount");
        arrayList.addAll(arrayList5);
        ArrayList arrayList6 = new ArrayList();
        arrayList6.add("s05_month_1");
        arrayList6.add("s05_month_3");
        arrayList6.add("s05_month_12");
        arrayList6.add("s05_month_12_new");
        arrayList6.add("s05_month_12_discount");
        arrayList.addAll(arrayList6);
        ArrayList arrayList7 = new ArrayList();
        arrayList7.add("s31_month_1");
        arrayList7.add("s31_month_3");
        arrayList7.add("s31_month_12");
        arrayList7.add("s31_month_12_new");
        arrayList7.add("s31_month_12_discount");
        arrayList.addAll(arrayList7);
        ArrayList arrayList8 = new ArrayList();
        arrayList8.add("s32_month_1");
        arrayList8.add("s32_month_3");
        arrayList8.add("s32_month_12");
        arrayList8.add("s32_month_12_new");
        arrayList8.add("s32_month_12_discount");
        arrayList.addAll(arrayList8);
        ArrayList arrayList9 = new ArrayList();
        arrayList9.add("s33_month_1");
        arrayList9.add("s33_month_3");
        arrayList9.add("s33_month_12");
        arrayList9.add("s33_month_12_new");
        arrayList9.add("s33_month_12_discount");
        arrayList.addAll(arrayList9);
        ArrayList arrayList10 = new ArrayList();
        arrayList10.add("s34_month_1");
        arrayList10.add("s34_month_3");
        arrayList10.add("s34_month_12");
        arrayList10.add("s34_month_12_new");
        arrayList10.add("s34_month_12_discount");
        arrayList.addAll(arrayList10);
        ArrayList arrayList11 = new ArrayList();
        arrayList11.add("s35_month_1");
        arrayList11.add("s35_month_3");
        arrayList11.add("s35_month_12");
        arrayList11.add("s35_month_12_new");
        arrayList11.add("s35_month_12_discount");
        arrayList.addAll(arrayList11);
        ArrayList arrayList12 = new ArrayList();
        arrayList12.add("sd1_month_1");
        arrayList12.add("sd1_month_3");
        arrayList12.add("sd1_month_12");
        arrayList.addAll(arrayList12);
        ArrayList arrayList13 = new ArrayList();
        arrayList13.add("sd2_month_1");
        arrayList13.add("sd2_month_3");
        arrayList13.add("sd2_month_12");
        arrayList.addAll(arrayList13);
        ArrayList arrayList14 = new ArrayList();
        int[] iArr = bq.r.f4959a;
        final int i11 = 0;
        for (int i12 = 0; i12 < 13; i12++) {
            int i13 = iArr[i12];
            int[] iArr2 = bq.r.f4959a;
            arrayList14.add("s35_sub_" + bq.m.q(i13) + "_m1");
            arrayList14.add("s35_sub_" + bq.m.q(i13) + "_m3");
            arrayList14.add("s35_sub_" + bq.m.q(i13) + "_m12");
            arrayList14.add("s34_sub_" + bq.m.q(i13) + "_m1");
            arrayList14.add("s34_sub_" + bq.m.q(i13) + "_m3");
            arrayList14.add("s34_sub_" + bq.m.q(i13) + "_m12");
        }
        arrayList.addAll(arrayList14);
        ArrayList arrayList15 = new ArrayList();
        int[] iArr3 = bq.r.f4959a;
        for (int i14 = 0; i14 < 13; i14++) {
            int i15 = iArr3[i14];
            int[] iArr4 = bq.r.f4959a;
            arrayList15.add("s35_all_" + bq.m.q(i15) + "_m1");
            arrayList15.add("s35_all_" + bq.m.q(i15) + "_m3");
            arrayList15.add("s35_all_" + bq.m.q(i15) + "_m12");
            arrayList15.add("s34_all_" + bq.m.q(i15) + "_m1");
            arrayList15.add("s34_all_" + bq.m.q(i15) + "_m3");
            arrayList15.add("s34_all_" + bq.m.q(i15) + "_m12");
        }
        arrayList.addAll(arrayList15);
        ArrayList arrayList16 = new ArrayList();
        arrayList16.add("club_android_month_1");
        arrayList16.add("club_android_month_12");
        arrayList.addAll(arrayList16);
        ArrayList arrayList17 = new ArrayList();
        arrayList17.add("club_android_35_month_1");
        arrayList17.add("club_android_35_month_12");
        arrayList17.add("club_android_35_month_6");
        arrayList.addAll(arrayList17);
        ArrayList arrayList18 = new ArrayList();
        arrayList18.add("club_android_34_month_1");
        arrayList18.add(DytezVyM.sUTeGZS);
        arrayList18.add("club_android_34_month_6");
        arrayList.addAll(arrayList18);
        ArrayList arrayList19 = new ArrayList();
        arrayList19.add("club_android_d7_35_month_1");
        arrayList19.add("club_android_d7_35_month_12");
        arrayList19.add("club_android_d7_35_month_6");
        arrayList.addAll(arrayList19);
        ArrayList arrayList20 = new ArrayList();
        arrayList20.add("club_android_d7_34_month_1");
        arrayList20.add("club_android_d7_34_month_12");
        arrayList20.add("club_android_d7_34_month_6");
        arrayList.addAll(arrayList20);
        ArrayList arrayList21 = new ArrayList();
        arrayList21.add("club_android_35_month_1");
        arrayList21.add("club_android_35_month_12_free_trial7");
        arrayList21.add("club_android_35_month_6");
        arrayList.addAll(arrayList21);
        ArrayList arrayList22 = new ArrayList();
        arrayList22.add("club_android_34_month_1");
        arrayList22.add("club_android_34_month_12_free_trial7");
        arrayList22.add("club_android_34_month_6");
        arrayList.addAll(arrayList22);
        arrayList.addAll(c.a.s());
        arrayList.addAll(c.a.q());
        arrayList.addAll(c.a.t());
        arrayList.addAll(c.a.r());
        this.f44929e = arrayList;
        ArrayList arrayList23 = new ArrayList();
        arrayList23.add("lifetime_membership_s71");
        arrayList23.add("lifetime_membership_s72");
        arrayList23.add("basic_member_premium_month_lifetime");
        arrayList23.add("lifetime_membership_discount");
        arrayList23.add("lifetime_membership_new");
        arrayList23.add("lifetime_membership_s31");
        arrayList23.add("lifetime_membership_s32");
        arrayList23.add("lifetime_membership_s33");
        arrayList23.add("lifetime_membership_s34");
        arrayList23.add("lifetime_membership_s35");
        arrayList23.add("lifetime_membership_s71");
        arrayList23.add("lifetime_membership_s72");
        arrayList23.add("multi_lifetime_10off");
        arrayList23.add("multi_lifetime_20off");
        arrayList23.add("multi_lifetime_30off");
        arrayList23.add("multi_lifetime_gift_plus");
        ArrayList arrayList24 = new ArrayList();
        int[] iArr5 = bq.r.f4959a;
        for (int i16 = 0; i16 < 13; i16++) {
            int i17 = iArr5[i16];
            int[] iArr6 = bq.r.f4959a;
            arrayList24.add("lifetime_membership_sub_" + bq.m.q(i17) + "_s35");
            arrayList24.add("lifetime_membership_sub_" + bq.m.q(i17) + "_s34");
        }
        arrayList23.addAll(arrayList24);
        ArrayList arrayList25 = new ArrayList();
        int[] iArr7 = bq.r.f4959a;
        for (int i18 = 0; i18 < 13; i18++) {
            int i19 = iArr7[i18];
            int[] iArr8 = bq.r.f4959a;
            arrayList25.add("lifetime_membership_all_" + bq.m.q(i19) + "_s35");
            arrayList25.add("lifetime_membership_all_" + bq.m.q(i19) + "_s34");
        }
        arrayList23.addAll(arrayList25);
        ArrayList arrayList26 = new ArrayList();
        arrayList26.add("club_android_34_lifetime");
        arrayList23.addAll(arrayList26);
        ArrayList arrayList27 = new ArrayList();
        arrayList27.add("club_android_35_lifetime");
        arrayList23.addAll(arrayList27);
        ArrayList arrayList28 = new ArrayList();
        arrayList28.add("club_android_34_discount_lifetime");
        arrayList23.addAll(arrayList28);
        ArrayList arrayList29 = new ArrayList();
        arrayList29.add("club_android_35_discount_lifetime");
        arrayList23.addAll(arrayList29);
        this.f44930f = arrayList23;
        lifeCycle.addObserver((mi.c) this.f44926b);
        ((mi.c) this.f44926b).f41156b.observe((l.m) this.f44925a, new ej.e(new fz.c(this) { // from class: lp.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ oi.c f40217b;

            {
                this.f40217b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i21 = i11;
                b0 b0Var = b0.f48488a;
                oi.c cVar2 = this.f40217b;
                vy.d dVar = null;
                switch (i21) {
                    case 0:
                        List list = (List) obj;
                        if (!xt.b.f56285g.get()) {
                            e0.B(LifecycleOwnerKt.getLifecycleScope((l.m) cVar2.f44925a), null, null, new b0.x0(15, list, cVar2, dVar), 3);
                        }
                        break;
                    default:
                        Boolean bool = (Boolean) obj;
                        if (bool != null && bool.booleanValue()) {
                            LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                            if (!x.n().isUnloginUser()) {
                                e0.B(LifecycleOwnerKt.getLifecycleScope((l.m) cVar2.f44925a), null, null, new m(cVar2, dVar, 0), 3);
                            }
                        }
                        break;
                }
                return b0Var;
            }
        }, 2));
        final int i21 = 1;
        try {
            ((mi.c) this.f44926b).f41157c.observe((l.m) this.f44925a, new ej.e(new j9.h(16, this, cVar), 2));
            ((mi.c) this.f44926b).f41159e.observe((l.m) this.f44925a, new ej.e(new fz.c(this) { // from class: lp.l

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ oi.c f40217b;

                {
                    this.f40217b = this;
                }

                @Override // fz.c
                public final Object invoke(Object obj) {
                    int i22 = i21;
                    b0 b0Var = b0.f48488a;
                    oi.c cVar2 = this.f40217b;
                    vy.d dVar = null;
                    switch (i22) {
                        case 0:
                            List list = (List) obj;
                            if (!xt.b.f56285g.get()) {
                                e0.B(LifecycleOwnerKt.getLifecycleScope((l.m) cVar2.f44925a), null, null, new b0.x0(15, list, cVar2, dVar), 3);
                            }
                            break;
                        default:
                            Boolean bool = (Boolean) obj;
                            if (bool != null && bool.booleanValue()) {
                                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                                if (!x.n().isUnloginUser()) {
                                    e0.B(LifecycleOwnerKt.getLifecycleScope((l.m) cVar2.f44925a), null, null, new m(cVar2, dVar, 0), 3);
                                }
                            }
                            break;
                    }
                    return b0Var;
                }
            }, 2));
        } catch (Exception unused) {
            LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
            if (x.n().isUnloginUser()) {
                return;
            }
            e0.B(LifecycleOwnerKt.getLifecycleScope((l.m) this.f44925a), null, null, new lp.m(this, null, i21), 3);
        }
    }

    public /* synthetic */ c(Lifecycle lifecycle, l.m mVar, mi.c cVar, wt.o0 o0Var, u0 u0Var) {
        this(lifecycle, mVar, cVar, o0Var, u0Var, new t0(29));
    }
}
