package yf;

import android.app.Activity;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import b7.e0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.m;
import lf.a1;
import lf.j1;
import lf.k;
import lf.l;
import lf.n;
import lf.z0;
import ns.o;
import qp.m3;
import qp.o2;
import re.i0;
import re.s;
import re.v;
import wf.g;
import wf.h;
import wf.j;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f57749a = n.f40066f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f57750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f57751c;

    public c(f fVar, int i11) {
        this.f57750b = i11;
        this.f57751c = fVar;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00a2  */
    public final boolean a(Object obj, boolean z11) {
        boolean zA;
        String str;
        switch (this.f57750b) {
            case 0:
                xf.d content = (xf.d) obj;
                m.f(content, "content");
                if (!(content instanceof xf.c)) {
                    return false;
                }
                int i11 = f.f57753i;
                l lVarU = v.u(content.getClass());
                return lVarU != null && k.a(lVarU);
            case 1:
                xf.d content2 = (xf.d) obj;
                m.f(content2, "content");
                return (content2 instanceof xf.f) || (content2 instanceof j);
            case 2:
                xf.d content3 = (xf.d) obj;
                m.f(content3, "content");
                if ((content3 instanceof xf.c) || (content3 instanceof xf.m)) {
                    return false;
                }
                if (z11) {
                    zA = true;
                } else {
                    zA = content3.f56030f != null ? k.a(h.HASHTAG) : true;
                    if ((content3 instanceof xf.f) && (str = ((xf.f) content3).f56032t) != null && str.length() != 0) {
                        if (zA && k.a(h.LINK_SHARE_QUOTES)) {
                            zA = true;
                        } else {
                            zA = false;
                        }
                    }
                }
                if (!zA) {
                    return false;
                }
                int i12 = f.f57753i;
                l lVarU2 = v.u(content3.getClass());
                return lVarU2 != null && k.a(lVarU2);
            case 3:
                xf.d content4 = (xf.d) obj;
                m.f(content4, "content");
                if (!(content4 instanceof xf.m)) {
                    return false;
                }
                int i13 = f.f57753i;
                l lVarU3 = v.u(content4.getClass());
                return lVarU3 != null && k.a(lVarU3);
            case 4:
                xf.d content5 = (xf.d) obj;
                m.f(content5, "content");
                int i14 = f.f57753i;
                Class<?> cls = content5.getClass();
                if (!xf.f.class.isAssignableFrom(cls)) {
                    if (!xf.l.class.isAssignableFrom(cls)) {
                        return false;
                    }
                    Date date = re.b.N;
                    if (!o.F()) {
                        return false;
                    }
                }
                return true;
            default:
                xf.d dVar = (xf.d) obj;
                if (dVar == null) {
                    return false;
                }
                wf.d dVar2 = xf.f.class.isAssignableFrom(dVar.getClass()) ? wf.d.MESSAGE_DIALOG : null;
                return dVar2 != null && k.a(dVar2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final lf.a b(Object obj) {
        Bundle bundle;
        wf.d dVar;
        Bundle bundle2;
        String str;
        int i11 = this.f57750b;
        wf.e eVar = g.f55118a;
        wf.f fVar = g.f55119b;
        wf.d dVar2 = null;
        f fVar2 = this.f57751c;
        switch (i11) {
            case 0:
                xf.d content = (xf.d) obj;
                m.f(content, "content");
                g.b(content, fVar);
                lf.a aVarA = fVar2.a();
                boolean zF = fVar2.f();
                int i12 = f.f57753i;
                l lVarU = v.u(content.getClass());
                if (lVarU == null) {
                    return null;
                }
                k.h(aVarA, new b(aVarA, content, zF, 0), lVarU);
                return aVarA;
            case 1:
                xf.d content2 = (xf.d) obj;
                m.f(content2, "content");
                f.e(fVar2, fVar2.b(), content2, d.FEED);
                lf.a aVarA2 = fVar2.a();
                if (content2 instanceof xf.f) {
                    g.b(content2, eVar);
                    xf.f fVar3 = (xf.f) content2;
                    bundle = new Bundle();
                    Uri uri = fVar3.f56025a;
                    j1.G("link", uri != null ? uri.toString() : null, bundle);
                    j1.G("quote", fVar3.f56032t, bundle);
                    xf.e eVar2 = fVar3.f56030f;
                    j1.G("hashtag", eVar2 != null ? eVar2.f56031a : null, bundle);
                } else {
                    if (!(content2 instanceof j)) {
                        return null;
                    }
                    j jVar = (j) content2;
                    bundle = new Bundle();
                    j1.G("to", jVar.f55121t, bundle);
                    j1.G("link", jVar.H, bundle);
                    j1.G("picture", jVar.N, bundle);
                    j1.G("source", jVar.O, bundle);
                    j1.G("name", jVar.K, bundle);
                    j1.G("caption", jVar.L, bundle);
                    j1.G("description", jVar.M, bundle);
                }
                k.j(aVarA2, "feed", bundle);
                return aVarA2;
            case 2:
                xf.d content3 = (xf.d) obj;
                m.f(content3, "content");
                f.e(fVar2, fVar2.b(), content3, d.NATIVE);
                g.b(content3, fVar);
                lf.a aVarA3 = fVar2.a();
                boolean zF2 = fVar2.f();
                int i13 = f.f57753i;
                l lVarU2 = v.u(content3.getClass());
                if (lVarU2 == null) {
                    return null;
                }
                k.h(aVarA3, new b(aVarA3, content3, zF2, 1), lVarU2);
                return aVarA3;
            case 3:
                xf.d content4 = (xf.d) obj;
                m.f(content4, "content");
                g.b(content4, g.f55120c);
                lf.a aVarA4 = fVar2.a();
                boolean zF3 = fVar2.f();
                int i14 = f.f57753i;
                l lVarU3 = v.u(content4.getClass());
                if (lVarU3 == null) {
                    return null;
                }
                k.h(aVarA4, new b(aVarA4, content4, zF3, 2), lVarU3);
                return aVarA4;
            case 4:
                xf.d content5 = (xf.d) obj;
                m.f(content5, "content");
                f.e(fVar2, fVar2.b(), content5, d.WEB);
                lf.a aVarA5 = fVar2.a();
                g.b(content5, eVar);
                boolean z11 = content5 instanceof xf.f;
                if (z11) {
                    xf.f fVar4 = (xf.f) content5;
                    bundle2 = new Bundle();
                    xf.e eVar3 = fVar4.f56030f;
                    j1.G("hashtag", eVar3 != null ? eVar3.f56031a : null, bundle2);
                    Uri uri2 = fVar4.f56025a;
                    if (uri2 != null) {
                        j1.G("href", uri2.toString(), bundle2);
                    }
                    j1.G("quote", fVar4.f56032t, bundle2);
                    dVar = null;
                } else {
                    if (!(content5 instanceof xf.l)) {
                        return null;
                    }
                    xf.l lVar = (xf.l) content5;
                    List list = lVar.f56044t;
                    UUID uuidA = aVarA5.a();
                    m3 m3Var = new m3(9);
                    ArrayList arrayList = (ArrayList) m3Var.f48058c;
                    List list2 = lVar.f56026b;
                    m3Var.f48056a = list2 == null ? null : Collections.unmodifiableList(list2);
                    m3Var.f48057b = lVar.f56030f;
                    m3Var.b(list);
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    int size = list.size();
                    int i15 = 0;
                    while (i15 < size) {
                        xf.k kVar = (xf.k) list.get(i15);
                        Bitmap bitmap = kVar.f56039b;
                        if (bitmap != null) {
                            z0 z0VarB = a1.b(uuidA, bitmap);
                            xf.j jVar2 = new xf.j(9);
                            jVar2.s0(kVar);
                            jVar2.f56036d = Uri.parse(z0VarB.f40142d);
                            jVar2.f56035c = null;
                            kVar = new xf.k(jVar2);
                            arrayList3.add(z0VarB);
                        }
                        arrayList2.add(kVar);
                        i15++;
                        dVar2 = null;
                    }
                    dVar = dVar2;
                    arrayList.clear();
                    m3Var.b(arrayList2);
                    a1.a(arrayList3);
                    xf.e eVar4 = (xf.e) m3Var.f48057b;
                    List listA1 = ry.m.a1(arrayList);
                    bundle2 = new Bundle();
                    j1.G("hashtag", eVar4 != null ? eVar4.f56031a : dVar, bundle2);
                    ArrayList arrayList4 = new ArrayList(ry.n.W(listA1, 10));
                    Iterator it = listA1.iterator();
                    while (it.hasNext()) {
                        arrayList4.add(String.valueOf(((xf.k) it.next()).f56040c));
                    }
                    bundle2.putStringArray("media", (String[]) arrayList4.toArray(new String[0]));
                }
                k.j(aVarA5, (z11 || (content5 instanceof xf.l)) ? "share" : dVar, bundle2);
                return aVarA5;
            default:
                xf.d dVar3 = (xf.d) obj;
                g.b(dVar3, fVar);
                a aVar = (a) fVar2;
                lf.a aVarA6 = aVar.a();
                Activity activityB = aVar.b();
                wf.d dVar4 = xf.f.class.isAssignableFrom(dVar3.getClass()) ? wf.d.MESSAGE_DIALOG : null;
                wf.d dVar5 = wf.d.MESSAGE_DIALOG;
                if (dVar4 == dVar5) {
                    str = "status";
                } else if (dVar4 == wf.d.MESSENGER_GENERIC_TEMPLATE) {
                    str = "GenericTemplate";
                } else {
                    str = dVar4 == wf.d.MESSENGER_MEDIA_TEMPLATE ? "MediaTemplate" : "unknown";
                }
                se.m mVar = new se.m(activityB, (String) null);
                Bundle bundleE = e0.e("fb_share_dialog_content_type", str);
                bundleE.putString("fb_share_dialog_content_uuid", aVarA6.a().toString());
                bundleE.putString("fb_share_dialog_content_page_id", dVar3.f56028d);
                s sVar = s.f49201a;
                if (i0.c()) {
                    mVar.g("fb_messenger_share_dialog_show", bundleE);
                }
                k.h(aVarA6, new o2(10, aVarA6, dVar3), xf.f.class.isAssignableFrom(dVar3.getClass()) ? dVar5 : null);
                return aVarA6;
        }
    }
}
