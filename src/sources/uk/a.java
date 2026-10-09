package uk;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import fz.f;
import hj.d2;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a extends j implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f53017a = new a(3, d2.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/lingo/lingoskill/databinding/CnSentenceModelView13NotUseBinding;", 0);

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p4 = (LayoutInflater) obj;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        m.f(p4, "p0");
        return d2.a(p4, (ViewGroup) obj2, zBooleanValue);
    }
}
