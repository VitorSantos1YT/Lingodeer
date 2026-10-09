package rq;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import hj.y1;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h extends j implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f49385a = new h(3, y1.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/lingo/lingoskill/databinding/CnPinyinTestModel04Binding;", 0);

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p4 = (LayoutInflater) obj;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        m.f(p4, "p0");
        return y1.a(p4, (ViewGroup) obj2, zBooleanValue);
    }
}
