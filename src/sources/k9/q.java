package k9;

import android.os.Bundle;
import com.google.api.Service;
import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import h1.r4;
import h1.s1;
import h1.ua;
import h1.v1;
import j0.e2;
import j0.g0;
import j9.c0;
import j9.v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import l0.w;
import qy.b0;
import ry.x;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38003a;

    public /* synthetic */ q(int i11) {
        this.f38003a = i11;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        Bundle bundleB;
        switch (this.f38003a) {
            case 0:
                v vVar = (v) obj2;
                m9.g gVar = vVar.f36257b;
                LinkedHashMap linkedHashMap = gVar.m;
                ry.k<j9.e> kVar = gVar.f41075f;
                LinkedHashMap linkedHashMap2 = gVar.f41081l;
                ArrayList arrayList = new ArrayList();
                Bundle bundleB2 = jh.h.b((qy.l[]) Arrays.copyOf(new qy.l[0], 0));
                for (Map.Entry entry : x.h0(gVar.f41087s.f36186a).entrySet()) {
                    ((c0) entry.getValue()).getClass();
                }
                if (arrayList.isEmpty()) {
                    bundleB = null;
                } else {
                    bundleB = jh.h.b((qy.l[]) Arrays.copyOf(new qy.l[0], 0));
                    ef.e.y(bundleB2, "android-support-nav:controller:navigatorState:names", arrayList);
                    ef.e.w(bundleB, "android-support-nav:controller:navigatorState", bundleB2);
                }
                if (!kVar.isEmpty()) {
                    if (bundleB == null) {
                        bundleB = jh.h.b((qy.l[]) Arrays.copyOf(new qy.l[0], 0));
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (j9.e entry2 : kVar) {
                        kotlin.jvm.internal.m.f(entry2, "entry");
                        int i11 = entry2.f36188b.f36242b.f3958a;
                        String str = entry2.f36192f;
                        m9.c cVar = entry2.H;
                        Bundle bundleA = cVar.a();
                        Bundle bundleB3 = jh.h.b((qy.l[]) Arrays.copyOf(new qy.l[0], 0));
                        cVar.f41058h.b(bundleB3);
                        Bundle bundleB4 = jh.h.b((qy.l[]) Arrays.copyOf(new qy.l[0], 0));
                        ef.e.x("nav-entry-state:id", str, bundleB4);
                        bundleB4.putInt("nav-entry-state:destination-id", i11);
                        if (bundleA == null) {
                            bundleA = jh.h.b((qy.l[]) Arrays.copyOf(new qy.l[0], 0));
                        }
                        ef.e.w(bundleB4, "nav-entry-state:args", bundleA);
                        ef.e.w(bundleB4, "nav-entry-state:saved-state", bundleB3);
                        arrayList2.add(bundleB4);
                    }
                    bundleB.putParcelableArrayList("android-support-nav:controller:backStack", ew.a.J(arrayList2));
                }
                if (!linkedHashMap2.isEmpty()) {
                    if (bundleB == null) {
                        bundleB = jh.h.b((qy.l[]) Arrays.copyOf(new qy.l[0], 0));
                    }
                    int[] iArr = new int[linkedHashMap2.size()];
                    ArrayList arrayList3 = new ArrayList();
                    int i12 = 0;
                    for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                        int iIntValue = ((Number) entry3.getKey()).intValue();
                        String str2 = (String) entry3.getValue();
                        int i13 = i12 + 1;
                        iArr[i12] = iIntValue;
                        if (str2 == null) {
                            str2 = BuildConfig.VERSION_NAME;
                        }
                        arrayList3.add(str2);
                        i12 = i13;
                    }
                    bundleB.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
                    ef.e.y(bundleB, "android-support-nav:controller:backStackIds", arrayList3);
                }
                if (!linkedHashMap.isEmpty()) {
                    if (bundleB == null) {
                        bundleB = jh.h.b((qy.l[]) Arrays.copyOf(new qy.l[0], 0));
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (Map.Entry entry4 : linkedHashMap.entrySet()) {
                        String str3 = (String) entry4.getKey();
                        ry.k kVar2 = (ry.k) entry4.getValue();
                        arrayList4.add(str3);
                        ArrayList arrayList5 = new ArrayList();
                        Iterator it = kVar2.iterator();
                        while (it.hasNext()) {
                            m9.d dVar = ((j9.f) it.next()).f36196a;
                            dVar.getClass();
                            Bundle bundleB5 = jh.h.b((qy.l[]) Arrays.copyOf(new qy.l[0], 0));
                            ef.e.x("nav-entry-state:id", dVar.f41063a, bundleB5);
                            bundleB5.putInt("nav-entry-state:destination-id", dVar.f41064b);
                            Bundle bundleB6 = dVar.f41065c;
                            if (bundleB6 == null) {
                                bundleB6 = jh.h.b((qy.l[]) Arrays.copyOf(new qy.l[0], 0));
                            }
                            ef.e.w(bundleB5, "nav-entry-state:args", bundleB6);
                            ef.e.w(bundleB5, "nav-entry-state:saved-state", dVar.f41066d);
                            arrayList5.add(bundleB5);
                        }
                        String key = "android-support-nav:controller:backStackStates:" + str3;
                        kotlin.jvm.internal.m.f(key, "key");
                        bundleB.putParcelableArrayList(key, ew.a.J(arrayList5));
                    }
                    ef.e.y(bundleB, "android-support-nav:controller:backStackStates", arrayList4);
                }
                if (vVar.f36260e) {
                    if (bundleB == null) {
                        bundleB = jh.h.b((qy.l[]) Arrays.copyOf(new qy.l[0], 0));
                    }
                    bundleB.putBoolean("android-support-nav:controller:deepLinkHandled", vVar.f36260e);
                }
                return bundleB;
            case 1:
                l1.n nVar = (l1.n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ua.b(ub.a.e0(sVar, R.string.introduction), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar, 0, 0, 131070);
                } else {
                    sVar.W();
                }
                return b0.f48488a;
            case 2:
                l1.n nVar2 = (l1.n) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                l1.s sVar2 = (l1.s) nVar2;
                if (sVar2.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    r4.b(se.k.y(R.drawable.close_24px, sVar2, 0), null, null, ((s1) sVar2.j(v1.f31180a)).f31034q, sVar2, 48, 4);
                } else {
                    sVar2.W();
                }
                return b0.f48488a;
            case 3:
                w wVar = (w) obj2;
                return ns.o.L(Integer.valueOf(wVar.f39206e.f39181b.l()), Integer.valueOf(wVar.f39206e.f39182c.l()));
            case 4:
                l1.n nVar3 = (l1.n) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                l1.s sVar3 = (l1.s) nVar3;
                if (sVar3.T(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    ua.b(ub.a.e0(sVar3, R.string.warnings), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar3, 0, 0, 131070);
                } else {
                    sVar3.W();
                }
                return b0.f48488a;
            case 5:
                l1.n nVar4 = (l1.n) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                l1.s sVar4 = (l1.s) nVar4;
                if (sVar4.T(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    ua.b(ub.a.e0(sVar4, R.string.download_materials_error), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar4, 0, 0, 131070);
                } else {
                    sVar4.W();
                }
                return b0.f48488a;
            case 6:
                l1.n nVar5 = (l1.n) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                l1.s sVar5 = (l1.s) nVar5;
                if (sVar5.T(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    ua.b(ub.a.e0(sVar5, R.string.offline_learning), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar5, 0, 0, 131070);
                } else {
                    sVar5.W();
                }
                return b0.f48488a;
            case 7:
                l1.n nVar6 = (l1.n) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                l1.s sVar6 = (l1.s) nVar6;
                if (sVar6.T(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    ua.b(ub.a.e0(sVar6, R.string.offline_delete_dialog_title), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar6, 0, 0, 131070);
                } else {
                    sVar6.W();
                }
                return b0.f48488a;
            case 8:
                l1.n nVar7 = (l1.n) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                l1.s sVar7 = (l1.s) nVar7;
                if (sVar7.T(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    ua.b(ub.a.e0(sVar7, R.string.offline_delete_dialog_message), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar7, 0, 0, 131070);
                } else {
                    sVar7.W();
                }
                return b0.f48488a;
            case 9:
                l1.n nVar8 = (l1.n) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                l1.s sVar8 = (l1.s) nVar8;
                if (sVar8.T(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    d0.n.c(se.k.y(R.drawable.ic_lesson_index_download, sVar8, 0), null, e2.n(z1.o.f58481a, 24), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar8, 432, 120);
                } else {
                    sVar8.W();
                }
                return b0.f48488a;
            case 10:
                l1.n nVar9 = (l1.n) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                l1.s sVar9 = (l1.s) nVar9;
                if (sVar9.T(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    r4.b(se.k.y(R.drawable.delete_24px, sVar9, 0), null, null, ((s1) sVar9.j(v1.f31180a)).f31043z, sVar9, 48, 4);
                } else {
                    sVar9.W();
                }
                return b0.f48488a;
            case 11:
                ((Integer) obj2).intValue();
                return new m0.d(ob.f.a(1));
            case 12:
                m0.x xVar = (m0.x) obj2;
                return ns.o.L(Integer.valueOf(xVar.f40653d.f39181b.l()), Integer.valueOf(xVar.f40653d.f39182c.l()));
            case 13:
                ((Integer) obj2).getClass();
                l1.s sVar10 = (l1.s) ((l1.n) obj);
                sVar10.d0(1382084447);
                g0 g0Var = new g0();
                sVar10.p(false);
                return g0Var;
            case 14:
                l1.n nVar10 = (l1.n) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                l1.s sVar11 = (l1.s) nVar10;
                if (sVar11.T(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    ua.b(ub.a.e0(sVar11, R.string.bookmark_folder_create_action), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar11, 0, 0, 131070);
                } else {
                    sVar11.W();
                }
                return b0.f48488a;
            case 15:
                l1.n nVar11 = (l1.n) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                l1.s sVar12 = (l1.s) nVar11;
                if (sVar12.T(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    ua.b(ub.a.e0(sVar12, R.string.bookmark_folder_name_label), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar12, 0, 0, 131070);
                } else {
                    sVar12.W();
                }
                return b0.f48488a;
            case 16:
                l1.n nVar12 = (l1.n) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                l1.s sVar13 = (l1.s) nVar12;
                if (sVar13.T(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    ua.b(ub.a.e0(sVar13, R.string.knowledge_cards), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar13, 0, 0, 131070);
                } else {
                    sVar13.W();
                }
                return b0.f48488a;
            case 17:
                l1.n nVar13 = (l1.n) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                l1.s sVar14 = (l1.s) nVar13;
                if (sVar14.T(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    d0.n.c(se.k.y(R.drawable.ic_ack_save, sVar14, 0), null, null, null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar14, 48, 124);
                } else {
                    sVar14.W();
                }
                return b0.f48488a;
            case 18:
                l1.n nVar14 = (l1.n) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                l1.s sVar15 = (l1.s) nVar14;
                if (sVar15.T(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    ua.b(ub.a.e0(sVar15, R.string.bookmark_folder_title), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar15, 0, 0, 131070);
                } else {
                    sVar15.W();
                }
                return b0.f48488a;
            case 19:
                l1.n nVar15 = (l1.n) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                l1.s sVar16 = (l1.s) nVar15;
                if (sVar16.T(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    ua.b(ub.a.e0(sVar16, R.string.bookmark_folder_delete_action), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar16, 0, 0, 131070);
                } else {
                    sVar16.W();
                }
                return b0.f48488a;
            case 20:
                l1.n nVar16 = (l1.n) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                l1.s sVar17 = (l1.s) nVar16;
                if (sVar17.T(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    ua.b(ub.a.e0(sVar17, R.string.bookmark_folder_name_label), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar17, 0, 0, 131070);
                } else {
                    sVar17.W();
                }
                return b0.f48488a;
            case 21:
                l1.n nVar17 = (l1.n) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                l1.s sVar18 = (l1.s) nVar17;
                if (sVar18.T(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    r4.b(se.k.y(R.drawable.add_24px, sVar18, 0), null, null, ((s1) sVar18.j(v1.f31180a)).f31017a, sVar18, 48, 4);
                } else {
                    sVar18.W();
                }
                return b0.f48488a;
            case 22:
                l1.n nVar18 = (l1.n) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                l1.s sVar19 = (l1.s) nVar18;
                if (sVar19.T(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    ua.b(ub.a.e0(sVar19, R.string.bookmark_folder_delete_title), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar19, 0, 0, 131070);
                } else {
                    sVar19.W();
                }
                return b0.f48488a;
            case 23:
                l1.n nVar19 = (l1.n) obj;
                int iIntValue20 = ((Integer) obj2).intValue();
                l1.s sVar20 = (l1.s) nVar19;
                if (sVar20.T(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    ua.b(ub.a.e0(sVar20, R.string.bookmark_folder_delete_removes_bookmarks_message), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar20, 0, 0, 131070);
                } else {
                    sVar20.W();
                }
                return b0.f48488a;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                l1.n nVar20 = (l1.n) obj;
                int iIntValue21 = ((Integer) obj2).intValue();
                l1.s sVar21 = (l1.s) nVar20;
                if (sVar21.T(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    r4.b(se.k.y(R.drawable.more_vert_24px, sVar21, 0), null, null, ((s1) sVar21.j(v1.f31180a)).f31036s, sVar21, 48, 4);
                } else {
                    sVar21.W();
                }
                return b0.f48488a;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                l1.n nVar21 = (l1.n) obj;
                int iIntValue22 = ((Integer) obj2).intValue();
                l1.s sVar22 = (l1.s) nVar21;
                if (sVar22.T(iIntValue22 & 1, (iIntValue22 & 3) != 2)) {
                    ua.b(ub.a.e0(sVar22, R.string.bookmark_folder_rename_action), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar22, 0, 0, 131070);
                } else {
                    sVar22.W();
                }
                return b0.f48488a;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                l1.n nVar22 = (l1.n) obj;
                int iIntValue23 = ((Integer) obj2).intValue();
                l1.s sVar23 = (l1.s) nVar22;
                if (sVar23.T(iIntValue23 & 1, (iIntValue23 & 3) != 2)) {
                    ua.b(ub.a.e0(sVar23, R.string.srs_customize), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar23, 0, 0, 131070);
                } else {
                    sVar23.W();
                }
                return b0.f48488a;
            case 27:
                l1.n nVar23 = (l1.n) obj;
                int iIntValue24 = ((Integer) obj2).intValue();
                l1.s sVar24 = (l1.s) nVar23;
                if (sVar24.T(iIntValue24 & 1, (iIntValue24 & 3) != 2)) {
                    ua.b(ub.a.e0(sVar24, R.string.unit_to_practice), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar24, 0, 0, 131070);
                } else {
                    sVar24.W();
                }
                return b0.f48488a;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                l1.n nVar24 = (l1.n) obj;
                int iIntValue25 = ((Integer) obj2).intValue();
                l1.s sVar25 = (l1.s) nVar24;
                if (sVar25.T(iIntValue25 & 1, (iIntValue25 & 3) != 2)) {
                    ua.b(ub.a.e0(sVar25, R.string.practice_focused_on), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar25, 0, 0, 131070);
                } else {
                    sVar25.W();
                }
                return b0.f48488a;
            default:
                l1.n nVar25 = (l1.n) obj;
                int iIntValue26 = ((Integer) obj2).intValue();
                l1.s sVar26 = (l1.s) nVar25;
                if (sVar26.T(iIntValue26 & 1, (iIntValue26 & 3) != 2)) {
                    d0.n.c(se.k.y(R.drawable.ic_srs_index_settings, sVar26, 0), null, null, null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar26, 48, 124);
                } else {
                    sVar26.W();
                }
                return b0.f48488a;
        }
    }
}
