package e6;

import android.content.Context;
import android.os.Build;
import android.widget.RemoteViews;
import com.lingodeer.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f24877a = ry.x.Y(new qy.l(e1.Text, Integer.valueOf(R.layout.glance_text)), new qy.l(e1.List, Integer.valueOf(R.layout.glance_list)), new qy.l(e1.CheckBox, Integer.valueOf(R.layout.glance_check_box)), new qy.l(e1.CheckBoxBackport, Integer.valueOf(R.layout.glance_check_box_backport)), new qy.l(e1.Button, Integer.valueOf(R.layout.glance_button)), new qy.l(e1.Swtch, Integer.valueOf(R.layout.glance_swtch)), new qy.l(e1.SwtchBackport, Integer.valueOf(R.layout.glance_swtch_backport)), new qy.l(e1.Frame, Integer.valueOf(R.layout.glance_frame)), new qy.l(e1.ImageCrop, Integer.valueOf(R.layout.glance_image_crop)), new qy.l(e1.ImageCropDecorative, Integer.valueOf(R.layout.glance_image_crop_decorative)), new qy.l(e1.ImageFit, Integer.valueOf(R.layout.glance_image_fit)), new qy.l(e1.ImageFitDecorative, Integer.valueOf(R.layout.glance_image_fit_decorative)), new qy.l(e1.ImageFillBounds, Integer.valueOf(R.layout.glance_image_fill_bounds)), new qy.l(e1.ImageFillBoundsDecorative, Integer.valueOf(R.layout.glance_image_fill_bounds_decorative)), new qy.l(e1.LinearProgressIndicator, Integer.valueOf(R.layout.glance_linear_progress_indicator)), new qy.l(e1.CircularProgressIndicator, Integer.valueOf(R.layout.glance_circular_progress_indicator)), new qy.l(e1.VerticalGridOneColumn, Integer.valueOf(R.layout.glance_vertical_grid_one_column)), new qy.l(e1.VerticalGridTwoColumns, Integer.valueOf(R.layout.glance_vertical_grid_two_columns)), new qy.l(e1.VerticalGridThreeColumns, Integer.valueOf(R.layout.glance_vertical_grid_three_columns)), new qy.l(e1.VerticalGridFourColumns, Integer.valueOf(R.layout.glance_vertical_grid_four_columns)), new qy.l(e1.VerticalGridFiveColumns, Integer.valueOf(R.layout.glance_vertical_grid_five_columns)), new qy.l(e1.VerticalGridAutoFit, Integer.valueOf(R.layout.glance_vertical_grid_auto_fit)), new qy.l(e1.RadioButton, Integer.valueOf(R.layout.glance_radio_button)), new qy.l(e1.RadioButtonBackport, Integer.valueOf(R.layout.glance_radio_button_backport)));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f24878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f24879c;

    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, java.util.Map] */
    static {
        int size = e0.f24896f.size();
        f24878b = size;
        f24879c = Build.VERSION.SDK_INT >= 31 ? e0.f24898h : e0.f24898h / size;
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, java.util.Map] */
    public static final j1 a(x1 x1Var, c6.l lVar, int i11) {
        Context context = x1Var.f25078a;
        Integer numValueOf = Integer.valueOf(R.id.rootStubId);
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 31) {
            int i13 = e0.f24898h;
            if (i11 >= i13) {
                throw new IllegalArgumentException(nv.p.p("Index of the root view cannot be more than ", i13, i11, ", currently ").toString());
            }
            b1 b1Var = b1.Wrap;
            u1 u1Var = new u1(b1Var, b1Var);
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), e0.f24897g + i11);
            k6.t tVar = (k6.t) lVar.a(null, z0.f25098d);
            if (tVar != null) {
                ve.i.l(remoteViews, tVar, R.id.rootView);
            }
            k6.m mVar = (k6.m) lVar.a(null, z0.f25099e);
            if (mVar != null) {
                ve.i.k(remoteViews, mVar, R.id.rootView);
            }
            if (i12 >= 33) {
                remoteViews.removeAllViews(R.id.rootView);
            }
            return new j1(remoteViews, new u0(R.id.rootView, 0, i12 >= 33 ? ry.s.f50855a : ry.x.X(new qy.l(0, ry.x.X(new qy.l(u1Var, numValueOf)))), 2));
        }
        int i14 = f24878b * i11;
        int i15 = e0.f24898h;
        if (i14 >= i15) {
            throw new IllegalArgumentException(("Index of the root view cannot be more than " + (i15 / 4) + ", currently " + i11).toString());
        }
        k6.t tVar2 = (k6.t) lVar.a(null, z0.f25096b);
        p6.g gVar = p6.f.f46316a;
        p6.g gVar2 = tVar2 != null ? tVar2.f37954a : gVar;
        k6.m mVar2 = (k6.m) lVar.a(null, z0.f25097c);
        if (mVar2 != null) {
            gVar = mVar2.f37937a;
        }
        p6.e eVar = p6.e.f46315a;
        b1 b1Var2 = gVar2.equals(eVar) ? b1.MatchParent : b1.Wrap;
        b1 b1Var3 = gVar.equals(eVar) ? b1.MatchParent : b1.Wrap;
        b1 b1Var4 = b1.Fixed;
        u1 u1Var2 = new u1(b1Var2 == b1Var4 ? b1.Wrap : b1Var2, b1Var3 == b1Var4 ? b1.Wrap : b1Var3);
        Integer num = (Integer) e0.f24896f.get(u1Var2);
        if (num != null) {
            return new j1(new RemoteViews(context.getPackageName(), i14 + e0.f24897g + num.intValue()), new u0(0, 0, ry.x.X(new qy.l(0, ry.x.X(new qy.l(u1Var2, numValueOf)))), 3));
        }
        throw new IllegalStateException("Cannot find root element for size [" + b1Var2 + ", " + b1Var3 + ']');
    }

    public static final u0 b(RemoteViews remoteViews, x1 x1Var, e1 e1Var, int i11, c6.l lVar, k6.a aVar, k6.b bVar) {
        int iIntValue;
        if (i11 > 10) {
            Objects.toString(e1Var);
            new IllegalArgumentException(e1Var + " container cannot have more than 10 elements");
        }
        int i12 = i11 <= 10 ? i11 : 10;
        Integer numF = f(e1Var, lVar);
        if (numF != null) {
            iIntValue = numF.intValue();
        } else {
            v vVar = (v) e0.f24891a.get(new w(e1Var, i12, aVar, bVar));
            Integer numValueOf = vVar != null ? Integer.valueOf(vVar.f25057a) : null;
            if (numValueOf == null) {
                throw new IllegalArgumentException("Cannot find container " + e1Var + " with " + i11 + " children");
            }
            iIntValue = numValueOf.intValue();
        }
        Map map = (Map) e0.f24892b.get(e1Var);
        if (map == null) {
            throw new IllegalArgumentException("Cannot find generated children for " + e1Var);
        }
        u0 u0VarD = d(remoteViews, x1Var, iIntValue, lVar);
        int i13 = u0VarD.f25052a;
        u0 u0Var = new u0(i13, u0VarD.f25053b, map);
        if (Build.VERSION.SDK_INT >= 33) {
            remoteViews.removeAllViews(i13);
        }
        return u0Var;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public static final u0 c(RemoteViews remoteViews, x1 x1Var, e1 e1Var, c6.l lVar) {
        Integer numF = f(e1Var, lVar);
        if (numF != null || (numF = (Integer) f24877a.get(e1Var)) != null) {
            return d(remoteViews, x1Var, numF.intValue(), lVar);
        }
        throw new IllegalArgumentException("Cannot use `insertView` with a container like " + e1Var);
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, java.util.Map] */
    public static final u0 d(RemoteViews remoteViews, x1 x1Var, int i11, c6.l lVar) {
        Integer numValueOf;
        int i12 = x1Var.f25082e;
        k6.t tVar = (k6.t) lVar.a(null, z0.f25100f);
        p6.g gVar = p6.f.f46316a;
        p6.g gVar2 = tVar != null ? tVar.f37954a : gVar;
        k6.m mVar = (k6.m) lVar.a(null, z0.f25101t);
        if (mVar != null) {
            gVar = mVar.f37937a;
        }
        if (lVar.c()) {
            numValueOf = null;
        } else {
            if (x1Var.f25086i.getAndSet(true)) {
                throw new IllegalStateException("At most one view can be set as AppWidgetBackground.");
            }
            numValueOf = Integer.valueOf(android.R.id.background);
        }
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 33) {
            int iIntValue = numValueOf != null ? numValueOf.intValue() : x1Var.f25084g.incrementAndGet();
            RemoteViews remoteViewsA = y0.f25092a.a(x1Var.f25078a.getPackageName(), i11, iIntValue);
            int i14 = x1Var.f25085h.f25052a;
            if (i13 >= 31) {
                l1.f24972a.a(remoteViews, i14, remoteViewsA, i12);
            } else {
                remoteViews.addView(i14, remoteViewsA);
            }
            return new u0(iIntValue, 0, null, 6);
        }
        if (i13 >= 31) {
            p6.d dVar = p6.d.f46314a;
            return new u0(com.bumptech.glide.g.q(remoteViews, x1Var, e(remoteViews, x1Var, i12, gVar2.equals(dVar) ? b1.Expand : b1.Wrap, gVar.equals(dVar) ? b1.Expand : b1.Wrap), i11, numValueOf), 0, null, 6);
        }
        b1 b1VarG = g(gVar2);
        b1 b1VarG2 = g(gVar);
        int iE = e(remoteViews, x1Var, i12, b1VarG, b1VarG2);
        b1 b1Var = b1.Fixed;
        if (b1VarG != b1Var && b1VarG2 != b1Var) {
            return new u0(com.bumptech.glide.g.q(remoteViews, x1Var, iE, i11, numValueOf), 0, null, 6);
        }
        x0 x0Var = (x0) e0.f24895e.get(new u1(b1VarG, b1VarG2));
        if (x0Var != null) {
            return new u0(com.bumptech.glide.g.q(remoteViews, x1Var, R.id.glanceViewStub, i11, numValueOf), com.bumptech.glide.g.q(remoteViews, x1Var, iE, x0Var.f25077a, null), null, 4);
        }
        throw new IllegalArgumentException("Could not find complex layout for width=" + b1VarG + ", height=" + b1VarG2);
    }

    public static final int e(RemoteViews remoteViews, x1 x1Var, int i11, b1 b1Var, b1 b1Var2) {
        b1 b1Var3 = b1.Fixed;
        u1 u1Var = new u1(b1Var == b1Var3 ? b1.Wrap : b1Var, b1Var2 == b1Var3 ? b1.Wrap : b1Var2);
        Map map = (Map) x1Var.f25085h.f25054c.get(Integer.valueOf(i11));
        if (map == null) {
            throw new IllegalStateException(nv.p.j(i11, "Parent doesn't have child position "));
        }
        Integer num = (Integer) map.get(u1Var);
        if (num == null) {
            throw new IllegalStateException("No child for position " + i11 + " and size " + b1Var + " x " + b1Var2);
        }
        int iIntValue = num.intValue();
        Collection collectionValues = map.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            if (((Number) obj).intValue() != iIntValue) {
                arrayList.add(obj);
            }
        }
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj2 = arrayList.get(i12);
            i12++;
            com.bumptech.glide.g.q(remoteViews, x1Var, ((Number) obj2).intValue(), R.layout.glance_deleted_view, Integer.valueOf(R.id.deletedViewId));
        }
        return iIntValue;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, java.util.Map] */
    public static final Integer f(e1 e1Var, c6.l lVar) {
        if (Build.VERSION.SDK_INT >= 33) {
            a aVar = (a) lVar.a(null, z0.H);
            k6.t tVar = (k6.t) lVar.a(null, z0.K);
            p6.d dVar = p6.d.f46314a;
            boolean zEquals = tVar != null ? tVar.f37954a.equals(dVar) : false;
            k6.m mVar = (k6.m) lVar.a(null, z0.L);
            boolean zEquals2 = mVar != null ? mVar.f37937a.equals(dVar) : false;
            if (aVar != null) {
                k6.c cVar = aVar.f24874a;
                x0 x0Var = (x0) e0.f24893c.get(new s(e1Var, cVar.f37915a, cVar.f37916b));
                if (x0Var != null) {
                    return Integer.valueOf(x0Var.f25077a);
                }
                throw new IllegalArgumentException("Cannot find " + e1Var + " with alignment " + cVar);
            }
            if (zEquals || zEquals2) {
                x0 x0Var2 = (x0) e0.f24894d.get(new m1(e1Var, zEquals, zEquals2));
                if (x0Var2 != null) {
                    return Integer.valueOf(x0Var2.f25077a);
                }
                throw new IllegalArgumentException("Cannot find " + e1Var + " with defaultWeight set");
            }
        }
        return null;
    }

    public static final b1 g(p6.g gVar) {
        if (gVar instanceof p6.f) {
            return b1.Wrap;
        }
        if (gVar instanceof p6.d) {
            return b1.Expand;
        }
        if (gVar instanceof p6.e) {
            return b1.MatchParent;
        }
        if (gVar instanceof p6.c) {
            return b1.Fixed;
        }
        throw new NoWhenBranchMatchedException();
    }
}
