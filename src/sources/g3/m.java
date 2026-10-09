package g3;

import com.yalantis.ucrop.view.CropImageView;
import g2.w0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends kotlin.jvm.internal.n implements fz.e {
    public static final m H;
    public static final m K;
    public static final m L;
    public static final m M;
    public static final m N;
    public static final m O;
    public static final m P;
    public static final m Q;
    public static final m R;
    public static final m S;
    public static final m T;
    public static final m U;
    public static final m V;
    public static final m W;
    public static final m X;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m f28659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m f28660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m f28661d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final m f28662e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final m f28663f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final m f28664t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28665a;

    static {
        int i11 = 2;
        f28659b = new m(i11, 0);
        f28660c = new m(i11, 1);
        f28661d = new m(i11, 2);
        f28662e = new m(i11, 3);
        f28663f = new m(i11, 4);
        f28664t = new m(i11, 5);
        H = new m(i11, 6);
        K = new m(i11, 7);
        L = new m(i11, 8);
        M = new m(i11, 9);
        N = new m(i11, 10);
        O = new m(i11, 11);
        P = new m(i11, 12);
        Q = new m(i11, 13);
        R = new m(i11, 14);
        S = new m(i11, 15);
        T = new m(i11, 16);
        U = new m(i11, 17);
        V = new m(i11, 18);
        W = new m(i11, 19);
        X = new m(i11, 20);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(int i11, int i12) {
        super(i11);
        this.f28665a = i12;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        String str;
        qy.e eVar;
        switch (this.f28665a) {
            case 0:
                Collection collection = (List) obj;
                List list = (List) obj2;
                if (collection == null) {
                    collection = ry.r.f50854a;
                }
                return ry.m.H0(collection, list);
            case 1:
                return (a2.f) obj;
            case 2:
                List list2 = (List) obj;
                List list3 = (List) obj2;
                if (list2 == null) {
                    return list3;
                }
                ArrayList arrayListC1 = ry.m.c1(list2);
                arrayListC1.addAll(list3);
                return arrayListC1;
            case 3:
                return (a2.r) obj;
            case 4:
                return (a2.h) obj;
            case 5:
                return (qy.b0) obj;
            case 6:
                return (qy.b0) obj;
            case 7:
                throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
            case 8:
                throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
            case 9:
                return (qy.b0) obj;
            case 10:
                throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
            case 11:
                k kVar = (k) obj;
                int i11 = ((k) obj2).f28656a;
                return kVar;
            case 12:
                return (w0) obj;
            case 13:
                return (String) obj;
            case 14:
                List list4 = (List) obj;
                List list5 = (List) obj2;
                if (list4 == null) {
                    return list5;
                }
                ArrayList arrayListC2 = ry.m.c1(list4);
                arrayListC2.addAll(list5);
                return arrayListC2;
            case 15:
                Float f5 = (Float) obj;
                ((Number) obj2).floatValue();
                return f5;
            case 16:
                return (String) obj;
            case 17:
                Boolean bool = (Boolean) obj;
                ((Boolean) obj2).booleanValue();
                return bool;
            case 18:
                a aVar = (a) obj;
                a aVar2 = (a) obj2;
                if (aVar == null || (str = aVar.f28634a) == null) {
                    str = aVar2.f28634a;
                }
                if (aVar == null || (eVar = aVar.f28635b) == null) {
                    eVar = aVar2.f28635b;
                }
                return new a(str, eVar);
            case 19:
                return obj == null ? obj2 : obj;
            default:
                t tVar = (t) obj2;
                Object objValueOf = Float.valueOf(CropImageView.DEFAULT_ASPECT_RATIO);
                o oVar = ((t) obj).f28699d;
                a0 a0Var = x.f28728t;
                Object objG = oVar.f28691a.g(a0Var);
                if (objG == null) {
                    objG = objValueOf;
                }
                float fFloatValue = ((Number) objG).floatValue();
                Object objG2 = tVar.f28699d.f28691a.g(a0Var);
                if (objG2 != null) {
                    objValueOf = objG2;
                }
                return Integer.valueOf(Float.compare(fFloatValue, ((Number) objValueOf).floatValue()));
        }
    }
}
