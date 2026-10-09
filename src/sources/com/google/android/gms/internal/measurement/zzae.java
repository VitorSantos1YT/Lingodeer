package com.google.android.gms.internal.measurement;

import com.google.firebase.iid.QyE.SemtNwfPgIhi;
import com.tbruyelle.rxpermissions3.BuildConfig;
import defpackage.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzae implements Iterable, zzao, zzak {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TreeMap f11272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TreeMap f11273b;

    public zzae() {
        this.f11272a = new TreeMap();
        this.f11273b = new TreeMap();
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final zzao b() {
        zzae zzaeVar = new zzae();
        for (Map.Entry entry : this.f11272a.entrySet()) {
            boolean z11 = entry.getValue() instanceof zzak;
            TreeMap treeMap = zzaeVar.f11272a;
            if (z11) {
                treeMap.put((Integer) entry.getKey(), (zzao) entry.getValue());
            } else {
                treeMap.put((Integer) entry.getKey(), ((zzao) entry.getValue()).b());
            }
        }
        return zzaeVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzak
    public final zzao d(String str) {
        zzao zzaoVar;
        if ("length".equals(str)) {
            return new zzah(Double.valueOf(l()));
        }
        return (!h(str) || (zzaoVar = (zzao) this.f11273b.get(str)) == null) ? zzao.f11445j : zzaoVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzak
    public final void e(String str, zzao zzaoVar) {
        TreeMap treeMap = this.f11273b;
        if (zzaoVar == null) {
            treeMap.remove(str);
        } else {
            treeMap.put(str, zzaoVar);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzae)) {
            return false;
        }
        zzae zzaeVar = (zzae) obj;
        if (l() != zzaeVar.l()) {
            return false;
        }
        TreeMap treeMap = this.f11272a;
        if (treeMap.isEmpty()) {
            return zzaeVar.f11272a.isEmpty();
        }
        for (int iIntValue = ((Integer) treeMap.firstKey()).intValue(); iIntValue <= ((Integer) treeMap.lastKey()).intValue(); iIntValue++) {
            if (!m(iIntValue).equals(zzaeVar.m(iIntValue))) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzak
    public final boolean h(String str) {
        return "length".equals(str) || this.f11273b.containsKey(str);
    }

    public final int hashCode() {
        return this.f11272a.hashCode() * 31;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new zzad(this);
    }

    public final List j() {
        ArrayList arrayList = new ArrayList(l());
        for (int i11 = 0; i11 < l(); i11++) {
            arrayList.add(m(i11));
        }
        return arrayList;
    }

    public final Iterator k() {
        return this.f11272a.keySet().iterator();
    }

    public final int l() {
        TreeMap treeMap = this.f11272a;
        if (treeMap.isEmpty()) {
            return 0;
        }
        return ((Integer) treeMap.lastKey()).intValue() + 1;
    }

    public final zzao m(int i11) {
        zzao zzaoVar;
        if (i11 < l()) {
            return (!o(i11) || (zzaoVar = (zzao) this.f11272a.get(Integer.valueOf(i11))) == null) ? zzao.f11445j : zzaoVar;
        }
        throw new IndexOutOfBoundsException("Attempting to get element outside of current array");
    }

    public final void n(int i11, zzao zzaoVar) {
        if (i11 > 32468) {
            throw new IllegalStateException("Array too large");
        }
        if (i11 < 0) {
            throw new IndexOutOfBoundsException(e.g(i11, "Out of bounds index: ", new StringBuilder(String.valueOf(i11).length() + 21)));
        }
        TreeMap treeMap = this.f11272a;
        if (zzaoVar == null) {
            treeMap.remove(Integer.valueOf(i11));
        } else {
            treeMap.put(Integer.valueOf(i11), zzaoVar);
        }
    }

    public final void r(int i11) {
        TreeMap treeMap = this.f11272a;
        int iIntValue = ((Integer) treeMap.lastKey()).intValue();
        if (i11 > iIntValue || i11 < 0) {
            return;
        }
        treeMap.remove(Integer.valueOf(i11));
        if (i11 == iIntValue) {
            int i12 = i11 - 1;
            Integer numValueOf = Integer.valueOf(i12);
            if (treeMap.containsKey(numValueOf) || i12 < 0) {
                return;
            }
            treeMap.put(numValueOf, zzao.f11445j);
            return;
        }
        while (true) {
            i11++;
            if (i11 > ((Integer) treeMap.lastKey()).intValue()) {
                return;
            }
            Integer numValueOf2 = Integer.valueOf(i11);
            zzao zzaoVar = (zzao) treeMap.get(numValueOf2);
            if (zzaoVar != null) {
                treeMap.put(Integer.valueOf(i11 - 1), zzaoVar);
                treeMap.remove(numValueOf2);
            }
        }
    }

    public final String s(String str) {
        String str2;
        StringBuilder sb2 = new StringBuilder();
        if (!this.f11272a.isEmpty()) {
            int i11 = 0;
            while (true) {
                str2 = str == null ? BuildConfig.VERSION_NAME : str;
                if (i11 >= l()) {
                    break;
                }
                zzao zzaoVarM = m(i11);
                sb2.append(str2);
                if (!(zzaoVarM instanceof zzat) && !(zzaoVarM instanceof zzam)) {
                    sb2.append(zzaoVarM.zzc());
                }
                i11++;
            }
            sb2.delete(0, str2.length());
        }
        return sb2.toString();
    }

    public final String toString() {
        return s(",");
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final String zzc() {
        return s(",");
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final Double zzd() {
        TreeMap treeMap = this.f11272a;
        if (treeMap.size() == 1) {
            return m(0).zzd();
        }
        return treeMap.size() <= 0 ? Double.valueOf(0.0d) : Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final Boolean zze() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final Iterator zzf() {
        return new zzac(this, this.f11272a.keySet().iterator(), this.f11273b.keySet().iterator());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:101:0x0206  */
    /* JADX WARN: Code duplicated, block: B:103:0x0210  */
    /* JADX WARN: Code duplicated, block: B:105:0x0215  */
    /* JADX WARN: Code duplicated, block: B:107:0x0237  */
    /* JADX WARN: Code duplicated, block: B:108:0x023f  */
    /* JADX WARN: Code duplicated, block: B:111:0x024a  */
    /* JADX WARN: Code duplicated, block: B:113:0x0269  */
    /* JADX WARN: Code duplicated, block: B:114:0x026f  */
    /* JADX WARN: Code duplicated, block: B:118:0x027e A[LOOP:2: B:116:0x0279->B:118:0x027e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:120:0x028d  */
    /* JADX WARN: Code duplicated, block: B:122:0x0293  */
    /* JADX WARN: Code duplicated, block: B:125:0x029f  */
    /* JADX WARN: Code duplicated, block: B:127:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:129:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:131:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:134:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:137:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:139:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:141:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:143:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:145:0x0303  */
    /* JADX WARN: Code duplicated, block: B:147:0x0314  */
    /* JADX WARN: Code duplicated, block: B:148:0x0318  */
    /* JADX WARN: Code duplicated, block: B:152:0x0335 A[LOOP:3: B:151:0x0333->B:152:0x0335, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:154:0x0345  */
    /* JADX WARN: Code duplicated, block: B:156:0x034d  */
    /* JADX WARN: Code duplicated, block: B:158:0x0362  */
    /* JADX WARN: Code duplicated, block: B:161:0x0369  */
    /* JADX WARN: Code duplicated, block: B:164:0x0375  */
    /* JADX WARN: Code duplicated, block: B:172:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:174:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:176:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:178:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:180:0x03d3 A[LOOP:5: B:179:0x03d1->B:180:0x03d3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:183:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:185:0x0400  */
    /* JADX WARN: Code duplicated, block: B:187:0x040a  */
    /* JADX WARN: Code duplicated, block: B:189:0x040d  */
    /* JADX WARN: Code duplicated, block: B:191:0x0413  */
    /* JADX WARN: Code duplicated, block: B:197:0x042e  */
    /* JADX WARN: Code duplicated, block: B:198:0x0431  */
    /* JADX WARN: Code duplicated, block: B:201:0x043d  */
    /* JADX WARN: Code duplicated, block: B:203:0x0445  */
    /* JADX WARN: Code duplicated, block: B:206:0x0451  */
    /* JADX WARN: Code duplicated, block: B:208:0x045b  */
    /* JADX WARN: Code duplicated, block: B:210:0x0465  */
    /* JADX WARN: Code duplicated, block: B:212:0x047a  */
    /* JADX WARN: Code duplicated, block: B:214:0x0480  */
    /* JADX WARN: Code duplicated, block: B:216:0x0486  */
    /* JADX WARN: Code duplicated, block: B:218:0x048d  */
    /* JADX WARN: Code duplicated, block: B:220:0x0493  */
    /* JADX WARN: Code duplicated, block: B:222:0x049b  */
    /* JADX WARN: Code duplicated, block: B:224:0x04a1  */
    /* JADX WARN: Code duplicated, block: B:226:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:228:0x04bf A[LOOP:6: B:225:0x04ab->B:228:0x04bf, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:234:0x04dd A[LOOP:7: B:232:0x04d7->B:234:0x04dd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:238:0x0501 A[LOOP:8: B:236:0x04fb->B:238:0x0501, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:241:0x0526  */
    /* JADX WARN: Code duplicated, block: B:243:0x052e  */
    /* JADX WARN: Code duplicated, block: B:245:0x0538  */
    /* JADX WARN: Code duplicated, block: B:248:0x0554  */
    /* JADX WARN: Code duplicated, block: B:250:0x056e  */
    /* JADX WARN: Code duplicated, block: B:252:0x0578  */
    /* JADX WARN: Code duplicated, block: B:255:0x0589  */
    /* JADX WARN: Code duplicated, block: B:256:0x0590  */
    /* JADX WARN: Code duplicated, block: B:259:0x0597  */
    /* JADX WARN: Code duplicated, block: B:261:0x059d  */
    /* JADX WARN: Code duplicated, block: B:263:0x05a9  */
    /* JADX WARN: Code duplicated, block: B:272:0x05cd  */
    /* JADX WARN: Code duplicated, block: B:274:0x05d7  */
    /* JADX WARN: Code duplicated, block: B:276:0x05ec  */
    /* JADX WARN: Code duplicated, block: B:279:0x05f3  */
    /* JADX WARN: Code duplicated, block: B:281:0x05f9  */
    /* JADX WARN: Code duplicated, block: B:283:0x05ff  */
    /* JADX WARN: Code duplicated, block: B:285:0x0607  */
    /* JADX WARN: Code duplicated, block: B:287:0x060d  */
    /* JADX WARN: Code duplicated, block: B:289:0x0613  */
    /* JADX WARN: Code duplicated, block: B:291:0x0631  */
    /* JADX WARN: Code duplicated, block: B:292:0x063d  */
    /* JADX WARN: Code duplicated, block: B:294:0x0643  */
    /* JADX WARN: Code duplicated, block: B:297:0x0657  */
    /* JADX WARN: Code duplicated, block: B:299:0x0675  */
    /* JADX WARN: Code duplicated, block: B:302:0x067e A[LOOP:10: B:300:0x0676->B:302:0x067e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:305:0x0696 A[LOOP:11: B:305:0x0696->B:321:0x06e8, LOOP_START, PHI: r6 r32
      0x0696: PHI (r6v7 int) = (r6v6 int), (r6v8 int) binds: [B:304:0x0694, B:321:0x06e8] A[DONT_GENERATE, DONT_INLINE]
      0x0696: PHI (r32v1 java.util.TreeMap) = (r32v0 java.util.TreeMap), (r32v4 java.util.TreeMap) binds: [B:304:0x0694, B:321:0x06e8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:307:0x069c  */
    /* JADX WARN: Code duplicated, block: B:309:0x06aa  */
    /* JADX WARN: Code duplicated, block: B:311:0x06b0  */
    /* JADX WARN: Code duplicated, block: B:313:0x06b6  */
    /* JADX WARN: Code duplicated, block: B:314:0x06bc  */
    /* JADX WARN: Code duplicated, block: B:316:0x06c8  */
    /* JADX WARN: Code duplicated, block: B:318:0x06d6  */
    /* JADX WARN: Code duplicated, block: B:326:0x0710 A[ADDED_TO_REGION, LOOP:13: B:326:0x0710->B:327:0x0712, LOOP_START, PHI: r0
      0x0710: PHI (r0v34 int) = (r0v33 int), (r0v35 int) binds: [B:296:0x0655, B:327:0x0712] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:327:0x0712 A[LOOP:13: B:326:0x0710->B:327:0x0712, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:329:0x0724  */
    /* JADX WARN: Code duplicated, block: B:331:0x072c  */
    /* JADX WARN: Code duplicated, block: B:333:0x0732  */
    /* JADX WARN: Code duplicated, block: B:335:0x073f  */
    /* JADX WARN: Code duplicated, block: B:337:0x0753  */
    /* JADX WARN: Code duplicated, block: B:339:0x0759  */
    /* JADX WARN: Code duplicated, block: B:341:0x075f  */
    /* JADX WARN: Code duplicated, block: B:344:0x077c A[LOOP:14: B:342:0x0776->B:344:0x077c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:346:0x0793  */
    /* JADX WARN: Code duplicated, block: B:348:0x0799  */
    /* JADX WARN: Code duplicated, block: B:350:0x07a1  */
    /* JADX WARN: Code duplicated, block: B:352:0x07ad  */
    /* JADX WARN: Code duplicated, block: B:354:0x07b4  */
    /* JADX WARN: Code duplicated, block: B:356:0x07c6  */
    /* JADX WARN: Code duplicated, block: B:361:0x07da A[LOOP:16: B:359:0x07d4->B:361:0x07da, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:366:0x07fe  */
    /* JADX WARN: Code duplicated, block: B:368:0x0806  */
    /* JADX WARN: Code duplicated, block: B:370:0x0816  */
    /* JADX WARN: Code duplicated, block: B:380:0x01f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:391:0x04c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:400:0x0708 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:401:0x06ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:406:0x06de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:410:0x07f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:411:0x07f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:412:0x07ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x012c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0132  */
    /* JADX WARN: Code duplicated, block: B:58:0x013c  */
    /* JADX WARN: Code duplicated, block: B:61:0x0152  */
    /* JADX WARN: Code duplicated, block: B:63:0x0173  */
    /* JADX WARN: Code duplicated, block: B:65:0x0179  */
    /* JADX WARN: Code duplicated, block: B:67:0x017d  */
    /* JADX WARN: Code duplicated, block: B:68:0x0185  */
    /* JADX WARN: Code duplicated, block: B:69:0x0187  */
    /* JADX WARN: Code duplicated, block: B:73:0x0193  */
    /* JADX WARN: Code duplicated, block: B:81:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:83:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:85:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:88:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:90:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:92:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:95:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:97:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:99:0x0200  */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02dc, code lost:
    
        if (com.google.android.gms.internal.measurement.zzba.b(r7, r2, (com.google.android.gms.internal.measurement.zzan) r0, java.lang.Boolean.FALSE, java.lang.Boolean.TRUE).l() != r7.l()) goto L170;
     */
    @Override // com.google.android.gms.internal.measurement.zzao
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.measurement.zzao g(java.lang.String r38, com.google.android.gms.internal.measurement.zzg r39, java.util.ArrayList r40) {
        /*
            Method dump skipped, instruction units count: 2160
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzae.g(java.lang.String, com.google.android.gms.internal.measurement.zzg, java.util.ArrayList):com.google.android.gms.internal.measurement.zzao");
    }

    public final boolean o(int i11) {
        if (i11 >= 0) {
            TreeMap treeMap = this.f11272a;
            if (i11 <= ((Integer) treeMap.lastKey()).intValue()) {
                return treeMap.containsKey(Integer.valueOf(i11));
            }
        }
        throw new IndexOutOfBoundsException(e.g(i11, SemtNwfPgIhi.QaizBJnZo, new StringBuilder(String.valueOf(i11).length() + 21)));
    }

    public zzae(List list) {
        this();
        if (list != null) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                n(i11, (zzao) list.get(i11));
            }
        }
    }
}
