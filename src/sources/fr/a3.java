package fr;

import com.lingodeer.data.model.LastSyncTime;
import com.lingodeer.data.model.SRSStatus;
import com.lingodeer.network.model.ApiResponse;
import com.lingodeer.network.model.ConvertUtilsKt;
import com.lingodeer.network.model.ServerReviewDataItem;
import com.lingodeer.network.model.ServerReviewDataResponse;
import com.yalantis.ucrop.view.CropImageView;
import i0.pKy.shrCcjmOhAmRC;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a3 extends xy.i implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f27392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f27393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i3 f27394c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f27395d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(int i11, i3 i3Var, vy.d dVar) {
        super(1, dVar);
        this.f27394c = i3Var;
        this.f27395d = i11;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x041b  */
    /* JADX WARN: Code duplicated, block: B:210:0x033b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:77:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:79:0x030a  */
    /* JADX WARN: Code duplicated, block: B:80:0x030d  */
    /* JADX WARN: Code duplicated, block: B:83:0x0338  */
    /* JADX WARN: Code duplicated, block: B:88:0x036a  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code duplicated, block: B:91:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:94:0x03d1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:140:0x0548 -> B:141:0x0557). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:91:0x03bc -> B:92:0x03c9). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object e(fr.i3 r42, java.lang.String r43, xy.c r44) {
        /*
            Method dump skipped, instruction units count: 1722
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.a3.e(fr.i3, java.lang.String, xy.c):java.lang.Object");
    }

    @Override // xy.a
    public final vy.d create(vy.d dVar) {
        return new a3(this.f27395d, this.f27394c, dVar);
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        return ((a3) create((vy.d) obj)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0093  */
    /* JADX WARN: Code duplicated, block: B:29:0x009c  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c7 A[PHI: r3
      0x00c7: PHI (r3v11 boolean) = (r3v5 boolean), (r3v9 boolean), (r3v9 boolean), (r3v12 boolean) binds: [B:38:0x00c6, B:34:0x00b5, B:36:0x00c3, B:8:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:41:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:44:0x00db  */
    /* JADX WARN: Code duplicated, block: B:46:0x00de  */
    /* JADX WARN: Code duplicated, block: B:47:0x00df A[PHI: r9
      0x00df: PHI (r9v37 boolean) = (r9v20 boolean), (r9v34 boolean), (r9v38 boolean) binds: [B:26:0x0091, B:46:0x00de, B:45:0x00dc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x00eb  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006d, code lost:
    
        if (r9 == r2) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0087, code lost:
    
        if (r9 == r2) goto L49;
     */
    @Override // xy.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws javax.crypto.BadPaddingException, javax.crypto.NoSuchPaddingException, javax.crypto.IllegalBlockSizeException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.a3.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0080 A[PHI: r0 r1 r2 r3 r5 r8 r9
      0x0080: PHI (r0v10 java.util.List) = (r0v8 java.util.List), (r0v16 java.util.List) binds: [B:44:0x01d9, B:16:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x0080: PHI (r1v9 java.util.List) = (r1v7 java.util.List), (r1v12 java.util.List) binds: [B:44:0x01d9, B:16:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x0080: PHI (r2v10 com.lingodeer.data.model.LastSyncTime) = (r2v8 com.lingodeer.data.model.LastSyncTime), (r2v20 com.lingodeer.data.model.LastSyncTime) binds: [B:44:0x01d9, B:16:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x0080: PHI (r3v15 java.lang.Object) = (r3v14 java.lang.Object), (r3v1 java.lang.Object) binds: [B:44:0x01d9, B:16:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x0080: PHI (r5v13 java.lang.String) = (r5v11 java.lang.String), (r5v18 java.lang.String) binds: [B:44:0x01d9, B:16:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x0080: PHI (r8v7 java.lang.String) = (r8v5 java.lang.String), (r8v18 java.lang.String) binds: [B:44:0x01d9, B:16:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x0080: PHI (r9v6 fr.i3) = (r9v4 fr.i3), (r9v11 fr.i3) binds: [B:44:0x01d9, B:16:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:31:0x011b  */
    /* JADX WARN: Code duplicated, block: B:33:0x012e  */
    /* JADX WARN: Code duplicated, block: B:38:0x014e A[LOOP:4: B:37:0x014c->B:38:0x014e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:42:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:49:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:58:0x0225 A[LOOP:2: B:57:0x0223->B:58:0x0225, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:62:0x02da  */
    /* JADX WARN: Code duplicated, block: B:65:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:66:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:68:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:71:0x0348  */
    /* JADX WARN: Code duplicated, block: B:75:0x036c A[LOOP:0: B:73:0x0366->B:75:0x036c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:79:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:83:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:87:0x01fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Code duplicated, block: B:91:0x01e8 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x013a A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25, types: [com.lingodeer.data.model.LastSyncTime, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27, types: [com.lingodeer.data.model.LastSyncTime, fr.i3, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v38 */
    public static final Object j(i3 i3Var, String str, String str2, xy.c cVar) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException {
        u2 u2Var;
        LastSyncTime lastSyncTime;
        Object objU;
        i3 i3Var2;
        LastSyncTime lastSyncTime2;
        String str3;
        String str4;
        List list;
        ArrayList arrayList;
        ArrayList arrayList2;
        int size;
        int i11;
        vt.w0 w0Var;
        String str5;
        LastSyncTime lastSyncTime3;
        List list2;
        i3 i3Var3;
        String str6;
        List list3;
        SRSStatus sRSStatus;
        LastSyncTime lastSyncTime4;
        String str7;
        String str8;
        i3 i3Var4;
        ArrayList arrayList3;
        ArrayList arrayList4;
        int size2;
        int i12;
        ?? r9;
        boolean z11;
        Object objA;
        LastSyncTime lastSyncTime5;
        Object obj;
        i3 i3Var5;
        List list4;
        SRSStatus sRSStatus2;
        ApiResponse apiResponse;
        vt.r0 r0Var;
        LastSyncTime lastSyncTimeCopy$default;
        i3 i3Var6;
        String str9;
        boolean z12;
        ?? r11;
        ArrayList arrayList5;
        Iterator<T> it;
        vt.w0 w0Var2;
        List list5;
        ArrayList arrayList6;
        i3 i3Var7 = i3Var;
        String str10 = str;
        String str11 = str2;
        if (cVar instanceof u2) {
            u2Var = (u2) cVar;
            int i13 = u2Var.M;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                u2Var.M = i13 - Integer.MIN_VALUE;
            } else {
                u2Var = new u2(cVar);
            }
        } else {
            u2Var = new u2(cVar);
        }
        u2 u2Var2 = u2Var;
        Object objU2 = u2Var2.L;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        vy.d dVar = null;
        switch (u2Var2.M) {
            case 0:
                com.bumptech.glide.e.F(objU2);
                vt.r0 r0Var2 = i3Var7.f27607h;
                String id2 = ep.a.D(str10, "_", str11);
                kotlin.jvm.internal.m.f(id2, "id");
                gp.r rVar = new gp.r(new rt.h(22, (vt.s0) r0Var2, id2, dVar));
                u2Var2.f27886a = i3Var7;
                u2Var2.f27887b = str10;
                u2Var2.f27888c = str11;
                u2Var2.M = 1;
                objU2 = uz.x0.u(rVar, u2Var2);
                if (objU2 != aVar) {
                    lastSyncTime = (LastSyncTime) objU2;
                    bh.i0 i0VarA = ((vt.z0) i3Var7.f27606g).a();
                    u2Var2.f27886a = i3Var7;
                    u2Var2.f27887b = str10;
                    u2Var2.f27888c = str11;
                    u2Var2.f27889d = lastSyncTime;
                    u2Var2.M = 2;
                    objU = uz.x0.u(i0VarA, u2Var2);
                    if (objU != aVar) {
                        i3Var2 = i3Var7;
                        lastSyncTime2 = lastSyncTime;
                        objU2 = objU;
                        String str12 = str11;
                        str3 = str10;
                        str4 = str12;
                        list = (List) objU2;
                        arrayList = new ArrayList();
                        for (Object obj2 : list) {
                            sRSStatus = (SRSStatus) obj2;
                            if (sRSStatus.getLastModifierTime() >= sRSStatus.getLastStudyTime() || sRSStatus.getLastModifierTime() < sRSStatus.getLastReviewTime()) {
                                arrayList.add(obj2);
                            }
                        }
                        arrayList2 = new ArrayList(ry.n.W(arrayList, 10));
                        size = arrayList.size();
                        i11 = 0;
                        while (i11 < size) {
                            Object obj3 = arrayList.get(i11);
                            i11++;
                            SRSStatus sRSStatus3 = (SRSStatus) obj3;
                            arrayList2.add(SRSStatus.copy$default(sRSStatus3, null, 0L, 0L, 0, null, null, 0L, null, false, null, 0L, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, 0, 0, 0, 0, Math.max(sRSStatus3.getLastStudyTime(), sRSStatus3.getLastReviewTime()), true, null, 1310719, null));
                        }
                        w0Var = i3Var2.f27606g;
                        u2Var2.f27886a = i3Var2;
                        u2Var2.f27887b = str3;
                        u2Var2.f27888c = str4;
                        u2Var2.f27889d = lastSyncTime2;
                        u2Var2.f27890e = list;
                        u2Var2.f27891f = arrayList2;
                        u2Var2.M = 3;
                        if (((vt.z0) w0Var).e(arrayList2, u2Var2) != aVar) {
                            str5 = str3;
                            lastSyncTime3 = lastSyncTime2;
                            list2 = arrayList2;
                            i3Var3 = i3Var2;
                            str6 = str4;
                            list3 = list;
                            bh.i0 i0VarA2 = ((vt.z0) i3Var3.f27606g).a();
                            u2Var2.f27886a = i3Var3;
                            u2Var2.f27887b = str5;
                            u2Var2.f27888c = str6;
                            u2Var2.f27889d = lastSyncTime3;
                            u2Var2.f27890e = list3;
                            u2Var2.f27891f = list2;
                            u2Var2.M = 4;
                            objU2 = uz.x0.u(i0VarA2, u2Var2);
                            if (objU2 != aVar) {
                                lastSyncTime4 = lastSyncTime3;
                                List list6 = list3;
                                str7 = str6;
                                str8 = str5;
                                i3Var4 = i3Var3;
                                arrayList3 = new ArrayList();
                                for (Object obj4 : (Iterable) objU2) {
                                    sRSStatus2 = (SRSStatus) obj4;
                                    if (!sRSStatus2.getPendingUpdate() && kotlin.jvm.internal.m.a(sRSStatus2.getType(), str7) && kotlin.jvm.internal.m.a(sRSStatus2.getLan(), str8)) {
                                        arrayList3.add(obj4);
                                    }
                                }
                                arrayList4 = new ArrayList(ry.n.W(arrayList3, 10));
                                size2 = arrayList3.size();
                                i12 = 0;
                                while (i12 < size2) {
                                    Object obj5 = arrayList3.get(i12);
                                    i12++;
                                    SRSStatus sRSStatus4 = (SRSStatus) obj5;
                                    arrayList4.add(new ServerReviewDataItem(sRSStatus4.getId(), sRSStatus4.getLan(), sRSStatus4.getType(), sRSStatus4.getSRSMetaData(), sRSStatus4.getPracticeMetaData(), sRSStatus4.getLastModifierTime()));
                                }
                                ry.m.y0(ns.o.L(defpackage.e.h(lastSyncTime4.getLastSyncTime(), "lastSync="), nv.p.j(list6.size(), "localTotal="), nv.p.j(list2.size(), "fixed="), nv.p.j(arrayList3.size(), shrCcjmOhAmRC.olFjzc), nv.p.j(arrayList4.size(), "upload=")), ", ", null, null, null, 62);
                                j3.c(list2, v2.f27920a);
                                j3.c(arrayList3, w2.f27948a);
                                j3.c(arrayList4, x2.f27963a);
                                dv.u0 u0Var = i3Var4.f27611l;
                                String strW = ((o0) i3Var4.f27600a).w();
                                long lastSyncTime6 = lastSyncTime4.getLastSyncTime();
                                List listK = ns.o.K(str8);
                                List listK2 = ns.o.K(str7);
                                u2Var2.f27886a = i3Var4;
                                u2Var2.f27887b = str8;
                                u2Var2.f27888c = str7;
                                u2Var2.f27889d = lastSyncTime4;
                                u2Var2.f27890e = null;
                                u2Var2.f27891f = null;
                                u2Var2.f27892t = arrayList4;
                                u2Var2.M = 5;
                                r9 = 0;
                                z11 = true;
                                objA = u0Var.A(strW, lastSyncTime6, arrayList4, listK, listK2, u2Var2);
                                if (objA != aVar) {
                                    lastSyncTime5 = lastSyncTime4;
                                    obj = objA;
                                    i3Var5 = i3Var4;
                                    list4 = arrayList4;
                                    apiResponse = (ApiResponse) obj;
                                    if (!(apiResponse instanceof ApiResponse.Error)) {
                                        lastSyncTime5.getLastSyncTime();
                                        list4.size();
                                        ApiResponse.Error error = (ApiResponse.Error) apiResponse;
                                        error.getCode();
                                        error.getMessage();
                                        z12 = false;
                                    } else {
                                        if (apiResponse instanceof ApiResponse.Success) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        rz.e0.n(u2Var2.getContext());
                                        ApiResponse.Success success = (ApiResponse.Success) apiResponse;
                                        j3.c(((ServerReviewDataResponse) success.getData()).getM_new_items(), y2.f27990a);
                                        r0Var = i3Var5.f27607h;
                                        lastSyncTimeCopy$default = LastSyncTime.copy$default(lastSyncTime5, null, ((ServerReviewDataResponse) success.getData()).getCurrent_sync_timestamp(), 1, null);
                                        u2Var2.f27886a = i3Var5;
                                        u2Var2.f27887b = str8;
                                        u2Var2.f27888c = str7;
                                        u2Var2.f27889d = r9;
                                        u2Var2.f27890e = r9;
                                        u2Var2.f27891f = r9;
                                        u2Var2.f27892t = list4;
                                        u2Var2.H = apiResponse;
                                        u2Var2.M = 6;
                                        if (((vt.s0) r0Var).a(lastSyncTimeCopy$default, u2Var2) != aVar) {
                                            i3Var6 = i3Var5;
                                            str9 = str8;
                                            r11 = r9;
                                            List<ServerReviewDataItem> m_new_items = ((ServerReviewDataResponse) ((ApiResponse.Success) apiResponse).getData()).getM_new_items();
                                            arrayList5 = new ArrayList(ry.n.W(m_new_items, 10));
                                            it = m_new_items.iterator();
                                            while (it.hasNext()) {
                                                arrayList5.add(ConvertUtilsKt.toSRSStatus((ServerReviewDataItem) it.next()));
                                            }
                                            j3.c(arrayList5, z2.f28003a);
                                            rz.e0.n(u2Var2.getContext());
                                            w0Var2 = i3Var6.f27606g;
                                            u2Var2.f27886a = r11;
                                            u2Var2.f27887b = str9;
                                            u2Var2.f27888c = str7;
                                            u2Var2.f27889d = r11;
                                            u2Var2.f27890e = r11;
                                            u2Var2.f27891f = r11;
                                            u2Var2.f27892t = list4;
                                            u2Var2.H = apiResponse;
                                            u2Var2.K = arrayList5;
                                            u2Var2.M = 7;
                                            if (((vt.z0) w0Var2).e(arrayList5, u2Var2) != aVar) {
                                                list5 = list4;
                                                arrayList6 = arrayList5;
                                                ApiResponse.Success success2 = (ApiResponse.Success) apiResponse;
                                                ry.m.y0(ns.o.L(nv.p.j(list5.size(), "upload="), nv.p.j(((ServerReviewDataResponse) success2.getData()).getM_new_items().size(), "serverNew="), nv.p.j(arrayList6.size(), "persisted="), defpackage.e.h(((ServerReviewDataResponse) success2.getData()).getCurrent_sync_timestamp(), "currentSync=")), ", ", null, null, null, 62);
                                                z12 = z11;
                                            }
                                        }
                                    }
                                    return Boolean.valueOf(z12);
                                }
                            }
                        }
                    }
                }
                return aVar;
            case 1:
                String str13 = u2Var2.f27888c;
                str10 = u2Var2.f27887b;
                i3 i3Var8 = u2Var2.f27886a;
                com.bumptech.glide.e.F(objU2);
                str11 = str13;
                i3Var7 = i3Var8;
                lastSyncTime = (LastSyncTime) objU2;
                bh.i0 i0VarA3 = ((vt.z0) i3Var7.f27606g).a();
                u2Var2.f27886a = i3Var7;
                u2Var2.f27887b = str10;
                u2Var2.f27888c = str11;
                u2Var2.f27889d = lastSyncTime;
                u2Var2.M = 2;
                objU = uz.x0.u(i0VarA3, u2Var2);
                if (objU != aVar) {
                    i3Var2 = i3Var7;
                    lastSyncTime2 = lastSyncTime;
                    objU2 = objU;
                    String str14 = str11;
                    str3 = str10;
                    str4 = str14;
                    list = (List) objU2;
                    arrayList = new ArrayList();
                    while (r9.hasNext()) {
                        sRSStatus = (SRSStatus) obj2;
                        if (sRSStatus.getLastModifierTime() >= sRSStatus.getLastStudyTime()) {
                        }
                        arrayList.add(obj2);
                    }
                    arrayList2 = new ArrayList(ry.n.W(arrayList, 10));
                    size = arrayList.size();
                    i11 = 0;
                    while (i11 < size) {
                        Object obj6 = arrayList.get(i11);
                        i11++;
                        SRSStatus sRSStatus5 = (SRSStatus) obj6;
                        arrayList2.add(SRSStatus.copy$default(sRSStatus5, null, 0L, 0L, 0, null, null, 0L, null, false, null, 0L, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, 0, 0, 0, 0, Math.max(sRSStatus5.getLastStudyTime(), sRSStatus5.getLastReviewTime()), true, null, 1310719, null));
                    }
                    w0Var = i3Var2.f27606g;
                    u2Var2.f27886a = i3Var2;
                    u2Var2.f27887b = str3;
                    u2Var2.f27888c = str4;
                    u2Var2.f27889d = lastSyncTime2;
                    u2Var2.f27890e = list;
                    u2Var2.f27891f = arrayList2;
                    u2Var2.M = 3;
                    if (((vt.z0) w0Var).e(arrayList2, u2Var2) != aVar) {
                        str5 = str3;
                        lastSyncTime3 = lastSyncTime2;
                        list2 = arrayList2;
                        i3Var3 = i3Var2;
                        str6 = str4;
                        list3 = list;
                        bh.i0 i0VarA4 = ((vt.z0) i3Var3.f27606g).a();
                        u2Var2.f27886a = i3Var3;
                        u2Var2.f27887b = str5;
                        u2Var2.f27888c = str6;
                        u2Var2.f27889d = lastSyncTime3;
                        u2Var2.f27890e = list3;
                        u2Var2.f27891f = list2;
                        u2Var2.M = 4;
                        objU2 = uz.x0.u(i0VarA4, u2Var2);
                        if (objU2 != aVar) {
                            lastSyncTime4 = lastSyncTime3;
                            List list7 = list3;
                            str7 = str6;
                            str8 = str5;
                            i3Var4 = i3Var3;
                            arrayList3 = new ArrayList();
                            while (r3.hasNext()) {
                                sRSStatus2 = (SRSStatus) obj4;
                                if (!sRSStatus2.getPendingUpdate()) {
                                }
                            }
                            arrayList4 = new ArrayList(ry.n.W(arrayList3, 10));
                            size2 = arrayList3.size();
                            i12 = 0;
                            while (i12 < size2) {
                                Object obj7 = arrayList3.get(i12);
                                i12++;
                                SRSStatus sRSStatus6 = (SRSStatus) obj7;
                                arrayList4.add(new ServerReviewDataItem(sRSStatus6.getId(), sRSStatus6.getLan(), sRSStatus6.getType(), sRSStatus6.getSRSMetaData(), sRSStatus6.getPracticeMetaData(), sRSStatus6.getLastModifierTime()));
                            }
                            ry.m.y0(ns.o.L(defpackage.e.h(lastSyncTime4.getLastSyncTime(), "lastSync="), nv.p.j(list7.size(), "localTotal="), nv.p.j(list2.size(), "fixed="), nv.p.j(arrayList3.size(), shrCcjmOhAmRC.olFjzc), nv.p.j(arrayList4.size(), "upload=")), ", ", null, null, null, 62);
                            j3.c(list2, v2.f27920a);
                            j3.c(arrayList3, w2.f27948a);
                            j3.c(arrayList4, x2.f27963a);
                            dv.u0 u0Var2 = i3Var4.f27611l;
                            String strW2 = ((o0) i3Var4.f27600a).w();
                            long lastSyncTime7 = lastSyncTime4.getLastSyncTime();
                            List listK3 = ns.o.K(str8);
                            List listK4 = ns.o.K(str7);
                            u2Var2.f27886a = i3Var4;
                            u2Var2.f27887b = str8;
                            u2Var2.f27888c = str7;
                            u2Var2.f27889d = lastSyncTime4;
                            u2Var2.f27890e = null;
                            u2Var2.f27891f = null;
                            u2Var2.f27892t = arrayList4;
                            u2Var2.M = 5;
                            r9 = 0;
                            z11 = true;
                            objA = u0Var2.A(strW2, lastSyncTime7, arrayList4, listK3, listK4, u2Var2);
                            if (objA != aVar) {
                                lastSyncTime5 = lastSyncTime4;
                                obj = objA;
                                i3Var5 = i3Var4;
                                list4 = arrayList4;
                                apiResponse = (ApiResponse) obj;
                                if (!(apiResponse instanceof ApiResponse.Error)) {
                                    lastSyncTime5.getLastSyncTime();
                                    list4.size();
                                    ApiResponse.Error error2 = (ApiResponse.Error) apiResponse;
                                    error2.getCode();
                                    error2.getMessage();
                                    z12 = false;
                                } else {
                                    if (apiResponse instanceof ApiResponse.Success) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    rz.e0.n(u2Var2.getContext());
                                    ApiResponse.Success success3 = (ApiResponse.Success) apiResponse;
                                    j3.c(((ServerReviewDataResponse) success3.getData()).getM_new_items(), y2.f27990a);
                                    r0Var = i3Var5.f27607h;
                                    lastSyncTimeCopy$default = LastSyncTime.copy$default(lastSyncTime5, null, ((ServerReviewDataResponse) success3.getData()).getCurrent_sync_timestamp(), 1, null);
                                    u2Var2.f27886a = i3Var5;
                                    u2Var2.f27887b = str8;
                                    u2Var2.f27888c = str7;
                                    u2Var2.f27889d = r9;
                                    u2Var2.f27890e = r9;
                                    u2Var2.f27891f = r9;
                                    u2Var2.f27892t = list4;
                                    u2Var2.H = apiResponse;
                                    u2Var2.M = 6;
                                    if (((vt.s0) r0Var).a(lastSyncTimeCopy$default, u2Var2) != aVar) {
                                        i3Var6 = i3Var5;
                                        str9 = str8;
                                        r11 = r9;
                                        List<ServerReviewDataItem> m_new_items2 = ((ServerReviewDataResponse) ((ApiResponse.Success) apiResponse).getData()).getM_new_items();
                                        arrayList5 = new ArrayList(ry.n.W(m_new_items2, 10));
                                        it = m_new_items2.iterator();
                                        while (it.hasNext()) {
                                            arrayList5.add(ConvertUtilsKt.toSRSStatus((ServerReviewDataItem) it.next()));
                                        }
                                        j3.c(arrayList5, z2.f28003a);
                                        rz.e0.n(u2Var2.getContext());
                                        w0Var2 = i3Var6.f27606g;
                                        u2Var2.f27886a = r11;
                                        u2Var2.f27887b = str9;
                                        u2Var2.f27888c = str7;
                                        u2Var2.f27889d = r11;
                                        u2Var2.f27890e = r11;
                                        u2Var2.f27891f = r11;
                                        u2Var2.f27892t = list4;
                                        u2Var2.H = apiResponse;
                                        u2Var2.K = arrayList5;
                                        u2Var2.M = 7;
                                        if (((vt.z0) w0Var2).e(arrayList5, u2Var2) != aVar) {
                                            list5 = list4;
                                            arrayList6 = arrayList5;
                                            ApiResponse.Success success4 = (ApiResponse.Success) apiResponse;
                                            ry.m.y0(ns.o.L(nv.p.j(list5.size(), "upload="), nv.p.j(((ServerReviewDataResponse) success4.getData()).getM_new_items().size(), "serverNew="), nv.p.j(arrayList6.size(), "persisted="), defpackage.e.h(((ServerReviewDataResponse) success4.getData()).getCurrent_sync_timestamp(), "currentSync=")), ", ", null, null, null, 62);
                                            z12 = z11;
                                        }
                                    }
                                }
                                return Boolean.valueOf(z12);
                            }
                        }
                    }
                }
                return aVar;
            case 2:
                lastSyncTime2 = u2Var2.f27889d;
                str4 = u2Var2.f27888c;
                str3 = u2Var2.f27887b;
                i3Var2 = u2Var2.f27886a;
                com.bumptech.glide.e.F(objU2);
                list = (List) objU2;
                arrayList = new ArrayList();
                while (r9.hasNext()) {
                    sRSStatus = (SRSStatus) obj2;
                    if (sRSStatus.getLastModifierTime() >= sRSStatus.getLastStudyTime()) {
                    }
                    arrayList.add(obj2);
                }
                arrayList2 = new ArrayList(ry.n.W(arrayList, 10));
                size = arrayList.size();
                i11 = 0;
                while (i11 < size) {
                    Object obj8 = arrayList.get(i11);
                    i11++;
                    SRSStatus sRSStatus7 = (SRSStatus) obj8;
                    arrayList2.add(SRSStatus.copy$default(sRSStatus7, null, 0L, 0L, 0, null, null, 0L, null, false, null, 0L, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, 0, 0, 0, 0, Math.max(sRSStatus7.getLastStudyTime(), sRSStatus7.getLastReviewTime()), true, null, 1310719, null));
                }
                w0Var = i3Var2.f27606g;
                u2Var2.f27886a = i3Var2;
                u2Var2.f27887b = str3;
                u2Var2.f27888c = str4;
                u2Var2.f27889d = lastSyncTime2;
                u2Var2.f27890e = list;
                u2Var2.f27891f = arrayList2;
                u2Var2.M = 3;
                if (((vt.z0) w0Var).e(arrayList2, u2Var2) != aVar) {
                    str5 = str3;
                    lastSyncTime3 = lastSyncTime2;
                    list2 = arrayList2;
                    i3Var3 = i3Var2;
                    str6 = str4;
                    list3 = list;
                    bh.i0 i0VarA5 = ((vt.z0) i3Var3.f27606g).a();
                    u2Var2.f27886a = i3Var3;
                    u2Var2.f27887b = str5;
                    u2Var2.f27888c = str6;
                    u2Var2.f27889d = lastSyncTime3;
                    u2Var2.f27890e = list3;
                    u2Var2.f27891f = list2;
                    u2Var2.M = 4;
                    objU2 = uz.x0.u(i0VarA5, u2Var2);
                    if (objU2 != aVar) {
                        lastSyncTime4 = lastSyncTime3;
                        List list8 = list3;
                        str7 = str6;
                        str8 = str5;
                        i3Var4 = i3Var3;
                        arrayList3 = new ArrayList();
                        while (r3.hasNext()) {
                            sRSStatus2 = (SRSStatus) obj4;
                            if (!sRSStatus2.getPendingUpdate()) {
                            }
                        }
                        arrayList4 = new ArrayList(ry.n.W(arrayList3, 10));
                        size2 = arrayList3.size();
                        i12 = 0;
                        while (i12 < size2) {
                            Object obj9 = arrayList3.get(i12);
                            i12++;
                            SRSStatus sRSStatus8 = (SRSStatus) obj9;
                            arrayList4.add(new ServerReviewDataItem(sRSStatus8.getId(), sRSStatus8.getLan(), sRSStatus8.getType(), sRSStatus8.getSRSMetaData(), sRSStatus8.getPracticeMetaData(), sRSStatus8.getLastModifierTime()));
                        }
                        ry.m.y0(ns.o.L(defpackage.e.h(lastSyncTime4.getLastSyncTime(), "lastSync="), nv.p.j(list8.size(), "localTotal="), nv.p.j(list2.size(), "fixed="), nv.p.j(arrayList3.size(), shrCcjmOhAmRC.olFjzc), nv.p.j(arrayList4.size(), "upload=")), ", ", null, null, null, 62);
                        j3.c(list2, v2.f27920a);
                        j3.c(arrayList3, w2.f27948a);
                        j3.c(arrayList4, x2.f27963a);
                        dv.u0 u0Var3 = i3Var4.f27611l;
                        String strW3 = ((o0) i3Var4.f27600a).w();
                        long lastSyncTime8 = lastSyncTime4.getLastSyncTime();
                        List listK5 = ns.o.K(str8);
                        List listK6 = ns.o.K(str7);
                        u2Var2.f27886a = i3Var4;
                        u2Var2.f27887b = str8;
                        u2Var2.f27888c = str7;
                        u2Var2.f27889d = lastSyncTime4;
                        u2Var2.f27890e = null;
                        u2Var2.f27891f = null;
                        u2Var2.f27892t = arrayList4;
                        u2Var2.M = 5;
                        r9 = 0;
                        z11 = true;
                        objA = u0Var3.A(strW3, lastSyncTime8, arrayList4, listK5, listK6, u2Var2);
                        if (objA != aVar) {
                            lastSyncTime5 = lastSyncTime4;
                            obj = objA;
                            i3Var5 = i3Var4;
                            list4 = arrayList4;
                            apiResponse = (ApiResponse) obj;
                            if (!(apiResponse instanceof ApiResponse.Error)) {
                                lastSyncTime5.getLastSyncTime();
                                list4.size();
                                ApiResponse.Error error3 = (ApiResponse.Error) apiResponse;
                                error3.getCode();
                                error3.getMessage();
                                z12 = false;
                            } else {
                                if (apiResponse instanceof ApiResponse.Success) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                rz.e0.n(u2Var2.getContext());
                                ApiResponse.Success success5 = (ApiResponse.Success) apiResponse;
                                j3.c(((ServerReviewDataResponse) success5.getData()).getM_new_items(), y2.f27990a);
                                r0Var = i3Var5.f27607h;
                                lastSyncTimeCopy$default = LastSyncTime.copy$default(lastSyncTime5, null, ((ServerReviewDataResponse) success5.getData()).getCurrent_sync_timestamp(), 1, null);
                                u2Var2.f27886a = i3Var5;
                                u2Var2.f27887b = str8;
                                u2Var2.f27888c = str7;
                                u2Var2.f27889d = r9;
                                u2Var2.f27890e = r9;
                                u2Var2.f27891f = r9;
                                u2Var2.f27892t = list4;
                                u2Var2.H = apiResponse;
                                u2Var2.M = 6;
                                if (((vt.s0) r0Var).a(lastSyncTimeCopy$default, u2Var2) != aVar) {
                                    i3Var6 = i3Var5;
                                    str9 = str8;
                                    r11 = r9;
                                    List<ServerReviewDataItem> m_new_items3 = ((ServerReviewDataResponse) ((ApiResponse.Success) apiResponse).getData()).getM_new_items();
                                    arrayList5 = new ArrayList(ry.n.W(m_new_items3, 10));
                                    it = m_new_items3.iterator();
                                    while (it.hasNext()) {
                                        arrayList5.add(ConvertUtilsKt.toSRSStatus((ServerReviewDataItem) it.next()));
                                    }
                                    j3.c(arrayList5, z2.f28003a);
                                    rz.e0.n(u2Var2.getContext());
                                    w0Var2 = i3Var6.f27606g;
                                    u2Var2.f27886a = r11;
                                    u2Var2.f27887b = str9;
                                    u2Var2.f27888c = str7;
                                    u2Var2.f27889d = r11;
                                    u2Var2.f27890e = r11;
                                    u2Var2.f27891f = r11;
                                    u2Var2.f27892t = list4;
                                    u2Var2.H = apiResponse;
                                    u2Var2.K = arrayList5;
                                    u2Var2.M = 7;
                                    if (((vt.z0) w0Var2).e(arrayList5, u2Var2) != aVar) {
                                        list5 = list4;
                                        arrayList6 = arrayList5;
                                        ApiResponse.Success success6 = (ApiResponse.Success) apiResponse;
                                        ry.m.y0(ns.o.L(nv.p.j(list5.size(), "upload="), nv.p.j(((ServerReviewDataResponse) success6.getData()).getM_new_items().size(), "serverNew="), nv.p.j(arrayList6.size(), "persisted="), defpackage.e.h(((ServerReviewDataResponse) success6.getData()).getCurrent_sync_timestamp(), "currentSync=")), ", ", null, null, null, 62);
                                        z12 = z11;
                                    }
                                }
                            }
                            return Boolean.valueOf(z12);
                        }
                    }
                }
                return aVar;
            case 3:
                list2 = u2Var2.f27891f;
                list3 = u2Var2.f27890e;
                lastSyncTime3 = u2Var2.f27889d;
                str6 = u2Var2.f27888c;
                str5 = u2Var2.f27887b;
                i3Var3 = u2Var2.f27886a;
                com.bumptech.glide.e.F(objU2);
                bh.i0 i0VarA6 = ((vt.z0) i3Var3.f27606g).a();
                u2Var2.f27886a = i3Var3;
                u2Var2.f27887b = str5;
                u2Var2.f27888c = str6;
                u2Var2.f27889d = lastSyncTime3;
                u2Var2.f27890e = list3;
                u2Var2.f27891f = list2;
                u2Var2.M = 4;
                objU2 = uz.x0.u(i0VarA6, u2Var2);
                if (objU2 != aVar) {
                    lastSyncTime4 = lastSyncTime3;
                    List list9 = list3;
                    str7 = str6;
                    str8 = str5;
                    i3Var4 = i3Var3;
                    arrayList3 = new ArrayList();
                    while (r3.hasNext()) {
                        sRSStatus2 = (SRSStatus) obj4;
                        if (!sRSStatus2.getPendingUpdate()) {
                        }
                    }
                    arrayList4 = new ArrayList(ry.n.W(arrayList3, 10));
                    size2 = arrayList3.size();
                    i12 = 0;
                    while (i12 < size2) {
                        Object obj10 = arrayList3.get(i12);
                        i12++;
                        SRSStatus sRSStatus9 = (SRSStatus) obj10;
                        arrayList4.add(new ServerReviewDataItem(sRSStatus9.getId(), sRSStatus9.getLan(), sRSStatus9.getType(), sRSStatus9.getSRSMetaData(), sRSStatus9.getPracticeMetaData(), sRSStatus9.getLastModifierTime()));
                    }
                    ry.m.y0(ns.o.L(defpackage.e.h(lastSyncTime4.getLastSyncTime(), "lastSync="), nv.p.j(list9.size(), "localTotal="), nv.p.j(list2.size(), "fixed="), nv.p.j(arrayList3.size(), shrCcjmOhAmRC.olFjzc), nv.p.j(arrayList4.size(), "upload=")), ", ", null, null, null, 62);
                    j3.c(list2, v2.f27920a);
                    j3.c(arrayList3, w2.f27948a);
                    j3.c(arrayList4, x2.f27963a);
                    dv.u0 u0Var4 = i3Var4.f27611l;
                    String strW4 = ((o0) i3Var4.f27600a).w();
                    long lastSyncTime9 = lastSyncTime4.getLastSyncTime();
                    List listK7 = ns.o.K(str8);
                    List listK8 = ns.o.K(str7);
                    u2Var2.f27886a = i3Var4;
                    u2Var2.f27887b = str8;
                    u2Var2.f27888c = str7;
                    u2Var2.f27889d = lastSyncTime4;
                    u2Var2.f27890e = null;
                    u2Var2.f27891f = null;
                    u2Var2.f27892t = arrayList4;
                    u2Var2.M = 5;
                    r9 = 0;
                    z11 = true;
                    objA = u0Var4.A(strW4, lastSyncTime9, arrayList4, listK7, listK8, u2Var2);
                    if (objA != aVar) {
                        lastSyncTime5 = lastSyncTime4;
                        obj = objA;
                        i3Var5 = i3Var4;
                        list4 = arrayList4;
                        apiResponse = (ApiResponse) obj;
                        if (!(apiResponse instanceof ApiResponse.Error)) {
                            lastSyncTime5.getLastSyncTime();
                            list4.size();
                            ApiResponse.Error error4 = (ApiResponse.Error) apiResponse;
                            error4.getCode();
                            error4.getMessage();
                            z12 = false;
                        } else {
                            if (apiResponse instanceof ApiResponse.Success) {
                                throw new NoWhenBranchMatchedException();
                            }
                            rz.e0.n(u2Var2.getContext());
                            ApiResponse.Success success7 = (ApiResponse.Success) apiResponse;
                            j3.c(((ServerReviewDataResponse) success7.getData()).getM_new_items(), y2.f27990a);
                            r0Var = i3Var5.f27607h;
                            lastSyncTimeCopy$default = LastSyncTime.copy$default(lastSyncTime5, null, ((ServerReviewDataResponse) success7.getData()).getCurrent_sync_timestamp(), 1, null);
                            u2Var2.f27886a = i3Var5;
                            u2Var2.f27887b = str8;
                            u2Var2.f27888c = str7;
                            u2Var2.f27889d = r9;
                            u2Var2.f27890e = r9;
                            u2Var2.f27891f = r9;
                            u2Var2.f27892t = list4;
                            u2Var2.H = apiResponse;
                            u2Var2.M = 6;
                            if (((vt.s0) r0Var).a(lastSyncTimeCopy$default, u2Var2) != aVar) {
                                i3Var6 = i3Var5;
                                str9 = str8;
                                r11 = r9;
                                List<ServerReviewDataItem> m_new_items4 = ((ServerReviewDataResponse) ((ApiResponse.Success) apiResponse).getData()).getM_new_items();
                                arrayList5 = new ArrayList(ry.n.W(m_new_items4, 10));
                                it = m_new_items4.iterator();
                                while (it.hasNext()) {
                                    arrayList5.add(ConvertUtilsKt.toSRSStatus((ServerReviewDataItem) it.next()));
                                }
                                j3.c(arrayList5, z2.f28003a);
                                rz.e0.n(u2Var2.getContext());
                                w0Var2 = i3Var6.f27606g;
                                u2Var2.f27886a = r11;
                                u2Var2.f27887b = str9;
                                u2Var2.f27888c = str7;
                                u2Var2.f27889d = r11;
                                u2Var2.f27890e = r11;
                                u2Var2.f27891f = r11;
                                u2Var2.f27892t = list4;
                                u2Var2.H = apiResponse;
                                u2Var2.K = arrayList5;
                                u2Var2.M = 7;
                                if (((vt.z0) w0Var2).e(arrayList5, u2Var2) != aVar) {
                                    list5 = list4;
                                    arrayList6 = arrayList5;
                                    ApiResponse.Success success8 = (ApiResponse.Success) apiResponse;
                                    ry.m.y0(ns.o.L(nv.p.j(list5.size(), "upload="), nv.p.j(((ServerReviewDataResponse) success8.getData()).getM_new_items().size(), "serverNew="), nv.p.j(arrayList6.size(), "persisted="), defpackage.e.h(((ServerReviewDataResponse) success8.getData()).getCurrent_sync_timestamp(), "currentSync=")), ", ", null, null, null, 62);
                                    z12 = z11;
                                }
                            }
                        }
                        return Boolean.valueOf(z12);
                    }
                }
                return aVar;
            case 4:
                list2 = u2Var2.f27891f;
                list3 = u2Var2.f27890e;
                lastSyncTime3 = u2Var2.f27889d;
                str6 = u2Var2.f27888c;
                str5 = u2Var2.f27887b;
                i3Var3 = u2Var2.f27886a;
                com.bumptech.glide.e.F(objU2);
                lastSyncTime4 = lastSyncTime3;
                List list10 = list3;
                str7 = str6;
                str8 = str5;
                i3Var4 = i3Var3;
                arrayList3 = new ArrayList();
                while (r3.hasNext()) {
                    sRSStatus2 = (SRSStatus) obj4;
                    if (!sRSStatus2.getPendingUpdate()) {
                    }
                }
                arrayList4 = new ArrayList(ry.n.W(arrayList3, 10));
                size2 = arrayList3.size();
                i12 = 0;
                while (i12 < size2) {
                    Object obj11 = arrayList3.get(i12);
                    i12++;
                    SRSStatus sRSStatus10 = (SRSStatus) obj11;
                    arrayList4.add(new ServerReviewDataItem(sRSStatus10.getId(), sRSStatus10.getLan(), sRSStatus10.getType(), sRSStatus10.getSRSMetaData(), sRSStatus10.getPracticeMetaData(), sRSStatus10.getLastModifierTime()));
                }
                ry.m.y0(ns.o.L(defpackage.e.h(lastSyncTime4.getLastSyncTime(), "lastSync="), nv.p.j(list10.size(), "localTotal="), nv.p.j(list2.size(), "fixed="), nv.p.j(arrayList3.size(), shrCcjmOhAmRC.olFjzc), nv.p.j(arrayList4.size(), "upload=")), ", ", null, null, null, 62);
                j3.c(list2, v2.f27920a);
                j3.c(arrayList3, w2.f27948a);
                j3.c(arrayList4, x2.f27963a);
                dv.u0 u0Var5 = i3Var4.f27611l;
                String strW5 = ((o0) i3Var4.f27600a).w();
                long lastSyncTime10 = lastSyncTime4.getLastSyncTime();
                List listK9 = ns.o.K(str8);
                List listK10 = ns.o.K(str7);
                u2Var2.f27886a = i3Var4;
                u2Var2.f27887b = str8;
                u2Var2.f27888c = str7;
                u2Var2.f27889d = lastSyncTime4;
                u2Var2.f27890e = null;
                u2Var2.f27891f = null;
                u2Var2.f27892t = arrayList4;
                u2Var2.M = 5;
                r9 = 0;
                z11 = true;
                objA = u0Var5.A(strW5, lastSyncTime10, arrayList4, listK9, listK10, u2Var2);
                if (objA != aVar) {
                    lastSyncTime5 = lastSyncTime4;
                    obj = objA;
                    i3Var5 = i3Var4;
                    list4 = arrayList4;
                    apiResponse = (ApiResponse) obj;
                    if (!(apiResponse instanceof ApiResponse.Error)) {
                        lastSyncTime5.getLastSyncTime();
                        list4.size();
                        ApiResponse.Error error5 = (ApiResponse.Error) apiResponse;
                        error5.getCode();
                        error5.getMessage();
                        z12 = false;
                    } else {
                        if (apiResponse instanceof ApiResponse.Success) {
                            throw new NoWhenBranchMatchedException();
                        }
                        rz.e0.n(u2Var2.getContext());
                        ApiResponse.Success success9 = (ApiResponse.Success) apiResponse;
                        j3.c(((ServerReviewDataResponse) success9.getData()).getM_new_items(), y2.f27990a);
                        r0Var = i3Var5.f27607h;
                        lastSyncTimeCopy$default = LastSyncTime.copy$default(lastSyncTime5, null, ((ServerReviewDataResponse) success9.getData()).getCurrent_sync_timestamp(), 1, null);
                        u2Var2.f27886a = i3Var5;
                        u2Var2.f27887b = str8;
                        u2Var2.f27888c = str7;
                        u2Var2.f27889d = r9;
                        u2Var2.f27890e = r9;
                        u2Var2.f27891f = r9;
                        u2Var2.f27892t = list4;
                        u2Var2.H = apiResponse;
                        u2Var2.M = 6;
                        if (((vt.s0) r0Var).a(lastSyncTimeCopy$default, u2Var2) != aVar) {
                            i3Var6 = i3Var5;
                            str9 = str8;
                            r11 = r9;
                            List<ServerReviewDataItem> m_new_items5 = ((ServerReviewDataResponse) ((ApiResponse.Success) apiResponse).getData()).getM_new_items();
                            arrayList5 = new ArrayList(ry.n.W(m_new_items5, 10));
                            it = m_new_items5.iterator();
                            while (it.hasNext()) {
                                arrayList5.add(ConvertUtilsKt.toSRSStatus((ServerReviewDataItem) it.next()));
                            }
                            j3.c(arrayList5, z2.f28003a);
                            rz.e0.n(u2Var2.getContext());
                            w0Var2 = i3Var6.f27606g;
                            u2Var2.f27886a = r11;
                            u2Var2.f27887b = str9;
                            u2Var2.f27888c = str7;
                            u2Var2.f27889d = r11;
                            u2Var2.f27890e = r11;
                            u2Var2.f27891f = r11;
                            u2Var2.f27892t = list4;
                            u2Var2.H = apiResponse;
                            u2Var2.K = arrayList5;
                            u2Var2.M = 7;
                            if (((vt.z0) w0Var2).e(arrayList5, u2Var2) != aVar) {
                                list5 = list4;
                                arrayList6 = arrayList5;
                                ApiResponse.Success success10 = (ApiResponse.Success) apiResponse;
                                ry.m.y0(ns.o.L(nv.p.j(list5.size(), "upload="), nv.p.j(((ServerReviewDataResponse) success10.getData()).getM_new_items().size(), "serverNew="), nv.p.j(arrayList6.size(), "persisted="), defpackage.e.h(((ServerReviewDataResponse) success10.getData()).getCurrent_sync_timestamp(), "currentSync=")), ", ", null, null, null, 62);
                                z12 = z11;
                            }
                        }
                    }
                    return Boolean.valueOf(z12);
                }
                return aVar;
            case 5:
                list4 = u2Var2.f27892t;
                LastSyncTime lastSyncTime11 = u2Var2.f27889d;
                String str15 = u2Var2.f27888c;
                String str16 = u2Var2.f27887b;
                i3 i3Var9 = u2Var2.f27886a;
                com.bumptech.glide.e.F(objU2);
                str7 = str15;
                str8 = str16;
                z11 = true;
                i3Var5 = i3Var9;
                lastSyncTime5 = lastSyncTime11;
                obj = objU2;
                r9 = 0;
                apiResponse = (ApiResponse) obj;
                if (!(apiResponse instanceof ApiResponse.Error)) {
                    if (apiResponse instanceof ApiResponse.Success) {
                        throw new NoWhenBranchMatchedException();
                    }
                    rz.e0.n(u2Var2.getContext());
                    ApiResponse.Success success11 = (ApiResponse.Success) apiResponse;
                    j3.c(((ServerReviewDataResponse) success11.getData()).getM_new_items(), y2.f27990a);
                    r0Var = i3Var5.f27607h;
                    lastSyncTimeCopy$default = LastSyncTime.copy$default(lastSyncTime5, null, ((ServerReviewDataResponse) success11.getData()).getCurrent_sync_timestamp(), 1, null);
                    u2Var2.f27886a = i3Var5;
                    u2Var2.f27887b = str8;
                    u2Var2.f27888c = str7;
                    u2Var2.f27889d = r9;
                    u2Var2.f27890e = r9;
                    u2Var2.f27891f = r9;
                    u2Var2.f27892t = list4;
                    u2Var2.H = apiResponse;
                    u2Var2.M = 6;
                    if (((vt.s0) r0Var).a(lastSyncTimeCopy$default, u2Var2) != aVar) {
                        i3Var6 = i3Var5;
                        str9 = str8;
                        r11 = r9;
                        List<ServerReviewDataItem> m_new_items6 = ((ServerReviewDataResponse) ((ApiResponse.Success) apiResponse).getData()).getM_new_items();
                        arrayList5 = new ArrayList(ry.n.W(m_new_items6, 10));
                        it = m_new_items6.iterator();
                        while (it.hasNext()) {
                            arrayList5.add(ConvertUtilsKt.toSRSStatus((ServerReviewDataItem) it.next()));
                        }
                        j3.c(arrayList5, z2.f28003a);
                        rz.e0.n(u2Var2.getContext());
                        w0Var2 = i3Var6.f27606g;
                        u2Var2.f27886a = r11;
                        u2Var2.f27887b = str9;
                        u2Var2.f27888c = str7;
                        u2Var2.f27889d = r11;
                        u2Var2.f27890e = r11;
                        u2Var2.f27891f = r11;
                        u2Var2.f27892t = list4;
                        u2Var2.H = apiResponse;
                        u2Var2.K = arrayList5;
                        u2Var2.M = 7;
                        if (((vt.z0) w0Var2).e(arrayList5, u2Var2) != aVar) {
                            list5 = list4;
                            arrayList6 = arrayList5;
                            ApiResponse.Success success12 = (ApiResponse.Success) apiResponse;
                            ry.m.y0(ns.o.L(nv.p.j(list5.size(), "upload="), nv.p.j(((ServerReviewDataResponse) success12.getData()).getM_new_items().size(), "serverNew="), nv.p.j(arrayList6.size(), "persisted="), defpackage.e.h(((ServerReviewDataResponse) success12.getData()).getCurrent_sync_timestamp(), "currentSync=")), ", ", null, null, null, 62);
                            z12 = z11;
                        }
                    }
                    return aVar;
                }
                lastSyncTime5.getLastSyncTime();
                list4.size();
                ApiResponse.Error error6 = (ApiResponse.Error) apiResponse;
                error6.getCode();
                error6.getMessage();
                z12 = false;
                return Boolean.valueOf(z12);
            case 6:
                ApiResponse apiResponse2 = u2Var2.H;
                List list11 = u2Var2.f27892t;
                String str17 = u2Var2.f27888c;
                str9 = u2Var2.f27887b;
                i3Var6 = u2Var2.f27886a;
                com.bumptech.glide.e.F(objU2);
                apiResponse = apiResponse2;
                list4 = list11;
                str7 = str17;
                z11 = true;
                r11 = 0;
                List<ServerReviewDataItem> m_new_items7 = ((ServerReviewDataResponse) ((ApiResponse.Success) apiResponse).getData()).getM_new_items();
                arrayList5 = new ArrayList(ry.n.W(m_new_items7, 10));
                it = m_new_items7.iterator();
                while (it.hasNext()) {
                    arrayList5.add(ConvertUtilsKt.toSRSStatus((ServerReviewDataItem) it.next()));
                }
                j3.c(arrayList5, z2.f28003a);
                rz.e0.n(u2Var2.getContext());
                w0Var2 = i3Var6.f27606g;
                u2Var2.f27886a = r11;
                u2Var2.f27887b = str9;
                u2Var2.f27888c = str7;
                u2Var2.f27889d = r11;
                u2Var2.f27890e = r11;
                u2Var2.f27891f = r11;
                u2Var2.f27892t = list4;
                u2Var2.H = apiResponse;
                u2Var2.K = arrayList5;
                u2Var2.M = 7;
                if (((vt.z0) w0Var2).e(arrayList5, u2Var2) != aVar) {
                    list5 = list4;
                    arrayList6 = arrayList5;
                    ApiResponse.Success success13 = (ApiResponse.Success) apiResponse;
                    ry.m.y0(ns.o.L(nv.p.j(list5.size(), "upload="), nv.p.j(((ServerReviewDataResponse) success13.getData()).getM_new_items().size(), "serverNew="), nv.p.j(arrayList6.size(), "persisted="), defpackage.e.h(((ServerReviewDataResponse) success13.getData()).getCurrent_sync_timestamp(), "currentSync=")), ", ", null, null, null, 62);
                    z12 = z11;
                    return Boolean.valueOf(z12);
                }
                return aVar;
            case 7:
                arrayList6 = u2Var2.K;
                apiResponse = u2Var2.H;
                List list12 = u2Var2.f27892t;
                com.bumptech.glide.e.F(objU2);
                list5 = list12;
                z11 = true;
                ApiResponse.Success success14 = (ApiResponse.Success) apiResponse;
                ry.m.y0(ns.o.L(nv.p.j(list5.size(), "upload="), nv.p.j(((ServerReviewDataResponse) success14.getData()).getM_new_items().size(), "serverNew="), nv.p.j(arrayList6.size(), "persisted="), defpackage.e.h(((ServerReviewDataResponse) success14.getData()).getCurrent_sync_timestamp(), "currentSync=")), ", ", null, null, null, 62);
                z12 = z11;
                return Boolean.valueOf(z12);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
