package br;

import com.lingo.lingoskill.object.MergedBillingThemeBillingPage;
import com.lingodeer.course.smarttips.data.model.TextType;
import com.lingodeer.data.model.LessonState;
import java.util.List;
import mt.j4;
import rt.e3;
import rt.je;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c0 implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5013a = 5;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f5015c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f5016d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f5017e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qy.e f5018f;

    public /* synthetic */ c0(TextType textType, boolean z11, fz.c cVar, fz.a aVar, fz.c cVar2, int i11) {
        this.f5016d = textType;
        this.f5015c = z11;
        this.f5018f = cVar;
        this.f5014b = aVar;
        this.f5017e = cVar2;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f5013a) {
            case 0:
                ((Integer) obj2).getClass();
                int iM = l1.t.M(1);
                e.e((List) this.f5016d, (String) this.f5014b, (MergedBillingThemeBillingPage) this.f5017e, this.f5015c, (fz.c) this.f5018f, (l1.n) obj, iM);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iM2 = l1.t.M(1);
                es.j.d((String) this.f5014b, (LessonState) this.f5016d, (String) this.f5017e, (fz.a) this.f5018f, this.f5015c, (l1.n) obj, iM2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iM3 = l1.t.M(24577);
                iv.a.c((String) this.f5014b, (String) this.f5016d, this.f5015c, (fz.a) this.f5017e, (t1.d) this.f5018f, (l1.n) obj, iM3);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iM4 = l1.t.M(224257);
                mt.g.N((je) this.f5016d, this.f5015c, (String) this.f5014b, (fz.c) this.f5018f, (fz.a) this.f5017e, (l1.n) obj, iM4);
                break;
            case 4:
                ((Integer) obj2).getClass();
                int iM5 = l1.t.M(1);
                j4.a((e3) this.f5016d, (fz.a) this.f5014b, this.f5015c, (fz.a) this.f5017e, (fz.c) this.f5018f, (l1.n) obj, iM5);
                break;
            case 5:
                ((Integer) obj2).getClass();
                int iM6 = l1.t.M(27697);
                us.b.m((TextType) this.f5016d, this.f5015c, (fz.c) this.f5018f, (fz.a) this.f5014b, (fz.c) this.f5017e, (l1.n) obj, iM6);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM7 = l1.t.M(24625);
                xu.c.a((String) this.f5014b, (String) this.f5016d, (String) this.f5017e, this.f5015c, (fz.a) this.f5018f, (l1.n) obj, iM7);
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ c0(String str, LessonState lessonState, String str2, fz.a aVar, boolean z11, int i11) {
        this.f5014b = str;
        this.f5016d = lessonState;
        this.f5017e = str2;
        this.f5018f = aVar;
        this.f5015c = z11;
    }

    public /* synthetic */ c0(String str, String str2, String str3, boolean z11, fz.a aVar, int i11) {
        this.f5014b = str;
        this.f5016d = str2;
        this.f5017e = str3;
        this.f5015c = z11;
        this.f5018f = aVar;
    }

    public /* synthetic */ c0(String str, String str2, boolean z11, fz.a aVar, t1.d dVar, int i11) {
        this.f5014b = str;
        this.f5016d = str2;
        this.f5015c = z11;
        this.f5017e = aVar;
        this.f5018f = dVar;
    }

    public /* synthetic */ c0(List list, String str, MergedBillingThemeBillingPage mergedBillingThemeBillingPage, boolean z11, fz.c cVar, int i11) {
        this.f5016d = list;
        this.f5014b = str;
        this.f5017e = mergedBillingThemeBillingPage;
        this.f5015c = z11;
        this.f5018f = cVar;
    }

    public /* synthetic */ c0(e3 e3Var, fz.a aVar, boolean z11, fz.a aVar2, fz.c cVar, int i11) {
        this.f5016d = e3Var;
        this.f5014b = aVar;
        this.f5015c = z11;
        this.f5017e = aVar2;
        this.f5018f = cVar;
    }

    public /* synthetic */ c0(je jeVar, boolean z11, String str, fz.c cVar, fz.a aVar, int i11) {
        this.f5016d = jeVar;
        this.f5015c = z11;
        this.f5014b = str;
        this.f5018f = cVar;
        this.f5017e = aVar;
    }
}
