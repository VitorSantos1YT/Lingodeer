package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzaee;
import com.google.android.gms.internal.measurement.zzahn;
import java.io.IOException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import y.b;
import y.e;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzad extends zzos {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f12612d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public HashSet f12613e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e f12614f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Long f12615g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Long f12616h;

    /* JADX WARN: Code duplicated, block: B:102:0x0239 A[LOOP:20: B:85:0x01e9->B:102:0x0239, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:117:0x026b  */
    /* JADX WARN: Code duplicated, block: B:121:0x0275  */
    /* JADX WARN: Code duplicated, block: B:123:0x0280  */
    /* JADX WARN: Code duplicated, block: B:125:0x028b  */
    /* JADX WARN: Code duplicated, block: B:131:0x02b9 A[Catch: all -> 0x02d4, SQLiteException -> 0x02d6, LOOP:11: B:131:0x02b9->B:566:?, LOOP_START, TryCatch #5 {SQLiteException -> 0x02d6, blocks: (B:129:0x02b3, B:131:0x02b9, B:133:0x02ca, B:139:0x02d8, B:142:0x02ed), top: B:476:0x02b3 }] */
    /* JADX WARN: Code duplicated, block: B:133:0x02ca A[Catch: all -> 0x02d4, SQLiteException -> 0x02d6, TryCatch #5 {SQLiteException -> 0x02d6, blocks: (B:129:0x02b3, B:131:0x02b9, B:133:0x02ca, B:139:0x02d8, B:142:0x02ed), top: B:476:0x02b3 }] */
    /* JADX WARN: Code duplicated, block: B:142:0x02ed A[Catch: all -> 0x02d4, SQLiteException -> 0x02d6, TRY_ENTER, TRY_LEAVE, TryCatch #5 {SQLiteException -> 0x02d6, blocks: (B:129:0x02b3, B:131:0x02b9, B:133:0x02ca, B:139:0x02d8, B:142:0x02ed), top: B:476:0x02b3 }] */
    /* JADX WARN: Code duplicated, block: B:159:0x032a  */
    /* JADX WARN: Code duplicated, block: B:162:0x0338  */
    /* JADX WARN: Code duplicated, block: B:164:0x034f  */
    /* JADX WARN: Code duplicated, block: B:190:0x044a  */
    /* JADX WARN: Code duplicated, block: B:194:0x045b  */
    /* JADX WARN: Code duplicated, block: B:196:0x047b  */
    /* JADX WARN: Code duplicated, block: B:202:0x0492  */
    /* JADX WARN: Code duplicated, block: B:206:0x04ae  */
    /* JADX WARN: Code duplicated, block: B:207:0x04b7  */
    /* JADX WARN: Code duplicated, block: B:211:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:217:0x04dc  */
    /* JADX WARN: Code duplicated, block: B:223:0x0512  */
    /* JADX WARN: Code duplicated, block: B:226:0x051b  */
    /* JADX WARN: Code duplicated, block: B:228:0x0527  */
    /* JADX WARN: Code duplicated, block: B:230:0x0549  */
    /* JADX WARN: Code duplicated, block: B:231:0x054d  */
    /* JADX WARN: Code duplicated, block: B:236:0x0566 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:247:0x0585  */
    /* JADX WARN: Code duplicated, block: B:249:0x05a1  */
    /* JADX WARN: Code duplicated, block: B:252:0x05b3  */
    /* JADX WARN: Code duplicated, block: B:255:0x05c0  */
    /* JADX WARN: Code duplicated, block: B:262:0x0608  */
    /* JADX WARN: Code duplicated, block: B:265:0x061c  */
    /* JADX WARN: Code duplicated, block: B:271:0x0652  */
    /* JADX WARN: Code duplicated, block: B:277:0x0693  */
    /* JADX WARN: Code duplicated, block: B:284:0x06bb  */
    /* JADX WARN: Code duplicated, block: B:290:0x06ca  */
    /* JADX WARN: Code duplicated, block: B:301:0x06f7 A[LOOP:8: B:278:0x0695->B:301:0x06f7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:302:0x06fa  */
    /* JADX WARN: Code duplicated, block: B:304:0x0700 A[PHI: r0 r20 r22
      0x0700: PHI (r0v77 java.util.Map) = (r0v79 java.util.Map), (r0v87 java.util.Map) binds: [B:317:0x072c, B:303:0x06fe] A[DONT_GENERATE, DONT_INLINE]
      0x0700: PHI (r20v11 android.database.Cursor) = (r20v12 android.database.Cursor), (r20v16 android.database.Cursor) binds: [B:317:0x072c, B:303:0x06fe] A[DONT_GENERATE, DONT_INLINE]
      0x0700: PHI (r22v12 com.google.android.gms.measurement.internal.zzbd) = (r22v13 com.google.android.gms.measurement.internal.zzbd), (r22v16 com.google.android.gms.measurement.internal.zzbd) binds: [B:317:0x072c, B:303:0x06fe] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:323:0x0739  */
    /* JADX WARN: Code duplicated, block: B:327:0x074d  */
    /* JADX WARN: Code duplicated, block: B:333:0x077d  */
    /* JADX WARN: Code duplicated, block: B:335:0x07aa  */
    /* JADX WARN: Code duplicated, block: B:337:0x07b1  */
    /* JADX WARN: Code duplicated, block: B:340:0x07c2 A[LOOP:10: B:331:0x0777->B:340:0x07c2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:344:0x07e6  */
    /* JADX WARN: Code duplicated, block: B:348:0x0800  */
    /* JADX WARN: Code duplicated, block: B:351:0x0808  */
    /* JADX WARN: Code duplicated, block: B:354:0x0817  */
    /* JADX WARN: Code duplicated, block: B:356:0x082a  */
    /* JADX WARN: Code duplicated, block: B:360:0x0863 A[Catch: all -> 0x0894, SQLiteException -> 0x08a4, LOOP:3: B:360:0x0863->B:382:0x08c9, LOOP_START, PHI: r4 r7
      0x0863: PHI (r4v38 java.util.Iterator) = (r4v31 java.util.Iterator), (r4v41 java.util.Iterator) binds: [B:359:0x0861, B:382:0x08c9] A[DONT_GENERATE, DONT_INLINE]
      0x0863: PHI (r7v50 com.google.android.gms.measurement.internal.zzic) = (r7v41 com.google.android.gms.measurement.internal.zzic), (r7v52 com.google.android.gms.measurement.internal.zzic) binds: [B:359:0x0861, B:382:0x08c9] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #12 {SQLiteException -> 0x08a4, blocks: (B:358:0x085d, B:360:0x0863, B:361:0x0868, B:363:0x0879), top: B:483:0x085d }] */
    /* JADX WARN: Code duplicated, block: B:365:0x0889  */
    /* JADX WARN: Code duplicated, block: B:371:0x089a  */
    /* JADX WARN: Code duplicated, block: B:382:0x08c9 A[LOOP:3: B:360:0x0863->B:382:0x08c9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:385:0x08d0  */
    /* JADX WARN: Code duplicated, block: B:398:0x08fc  */
    /* JADX WARN: Code duplicated, block: B:402:0x0906  */
    /* JADX WARN: Code duplicated, block: B:404:0x090a  */
    /* JADX WARN: Code duplicated, block: B:408:0x091a  */
    /* JADX WARN: Code duplicated, block: B:412:0x093b  */
    /* JADX WARN: Code duplicated, block: B:415:0x094c  */
    /* JADX WARN: Code duplicated, block: B:417:0x0961  */
    /* JADX WARN: Code duplicated, block: B:419:0x096f  */
    /* JADX WARN: Code duplicated, block: B:421:0x097a  */
    /* JADX WARN: Code duplicated, block: B:423:0x09a5  */
    /* JADX WARN: Code duplicated, block: B:426:0x09af  */
    /* JADX WARN: Code duplicated, block: B:439:0x0a06  */
    /* JADX WARN: Code duplicated, block: B:440:0x0a0f  */
    /* JADX WARN: Code duplicated, block: B:444:0x0a20 A[PHI: r16 r38
      0x0a20: PHI (r16v18 java.lang.String) = (r16v19 java.lang.String), (r2v40 java.lang.String) binds: [B:443:0x0a1e, B:441:0x0a10] A[DONT_GENERATE, DONT_INLINE]
      0x0a20: PHI (r38v3 java.util.Map) = (r38v4 java.util.Map), (r0v122 java.util.Map) binds: [B:443:0x0a1e, B:441:0x0a10] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:449:0x0a47  */
    /* JADX WARN: Code duplicated, block: B:462:0x0acb  */
    /* JADX WARN: Code duplicated, block: B:465:0x0ad3  */
    /* JADX WARN: Code duplicated, block: B:535:0x08c4 A[EDGE_INSN: B:535:0x08c4->B:381:0x08c4 BREAK  A[LOOP:3: B:360:0x0863->B:382:0x08c9], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:536:0x092c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:538:0x0a25 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:539:0x09f2 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:542:0x0a1a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:544:0x0aa1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:546:0x0a41 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:550:0x062a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:551:0x0641 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:553:0x0616 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:554:0x0616 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:556:0x06f2 A[EDGE_INSN: B:556:0x06f2->B:300:0x06f2 BREAK  A[LOOP:8: B:278:0x0695->B:301:0x06f7], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:558:0x076b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:559:0x075f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:563:0x07d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:564:0x07dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:569:0x049e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:571:0x048c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:574:0x04e8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:577:0x04d6 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:585:0x05c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:588:0x0355 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:602:0x0235 A[EDGE_INSN: B:602:0x0235->B:101:0x0235 BREAK  A[LOOP:20: B:85:0x01e9->B:102:0x0239], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0187  */
    /* JADX WARN: Code duplicated, block: B:67:0x018e  */
    /* JADX WARN: Code duplicated, block: B:74:0x01c8 A[Catch: all -> 0x01d4, SQLiteException -> 0x01d7, TRY_LEAVE, TryCatch #0 {SQLiteException -> 0x01d7, blocks: (B:72:0x01c2, B:74:0x01c8, B:83:0x01e2), top: B:468:0x01c2 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x01e2 A[Catch: all -> 0x01d4, SQLiteException -> 0x01d7, TRY_ENTER, TRY_LEAVE, TryCatch #0 {SQLiteException -> 0x01d7, blocks: (B:72:0x01c2, B:74:0x01c8, B:83:0x01e2), top: B:468:0x01c2 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v198 */
    /* JADX WARN: Type inference failed for: r0v199 */
    /* JADX WARN: Type inference failed for: r0v30, types: [y.e, y.t0] */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v52, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v16 */
    /* JADX WARN: Type inference failed for: r18v17 */
    /* JADX WARN: Type inference failed for: r18v19 */
    /* JADX WARN: Type inference failed for: r18v2, types: [com.google.android.gms.measurement.internal.zzic] */
    /* JADX WARN: Type inference failed for: r18v25 */
    /* JADX WARN: Type inference failed for: r18v26 */
    /* JADX WARN: Type inference failed for: r18v27 */
    /* JADX WARN: Type inference failed for: r18v28, types: [com.google.android.gms.measurement.internal.zzic] */
    /* JADX WARN: Type inference failed for: r18v33 */
    /* JADX WARN: Type inference failed for: r18v34 */
    /* JADX WARN: Type inference failed for: r19v16 */
    /* JADX WARN: Type inference failed for: r19v17 */
    /* JADX WARN: Type inference failed for: r19v18 */
    /* JADX WARN: Type inference failed for: r19v19 */
    /* JADX WARN: Type inference failed for: r19v21 */
    /* JADX WARN: Type inference failed for: r19v22 */
    /* JADX WARN: Type inference failed for: r19v23 */
    /* JADX WARN: Type inference failed for: r19v24 */
    /* JADX WARN: Type inference failed for: r19v25, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r19v29 */
    /* JADX WARN: Type inference failed for: r19v30 */
    /* JADX WARN: Type inference failed for: r19v31 */
    /* JADX WARN: Type inference failed for: r19v32 */
    /* JADX WARN: Type inference failed for: r19v33 */
    /* JADX WARN: Type inference failed for: r22v0 */
    /* JADX WARN: Type inference failed for: r22v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r22v19 */
    /* JADX WARN: Type inference failed for: r29v0 */
    /* JADX WARN: Type inference failed for: r29v1 */
    /* JADX WARN: Type inference failed for: r29v2 */
    /* JADX WARN: Type inference failed for: r29v4 */
    /* JADX WARN: Type inference failed for: r3v68, types: [com.google.android.gms.measurement.internal.zzgs] */
    /* JADX WARN: Type inference failed for: r3v80, types: [y.e, y.t0] */
    /* JADX WARN: Type inference failed for: r4v10, types: [y.e] */
    /* JADX WARN: Type inference failed for: r4v11, types: [y.t0] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v36, types: [com.google.android.gms.measurement.internal.zzgs] */
    /* JADX WARN: Type inference failed for: r4v54 */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v48 */
    /* JADX WARN: Type inference failed for: r5v49 */
    /* JADX WARN: Type inference failed for: r5v50 */
    /* JADX WARN: Type inference failed for: r5v51 */
    /* JADX WARN: Type inference failed for: r5v52 */
    /* JADX WARN: Type inference failed for: r5v53 */
    /* JADX WARN: Type inference failed for: r5v54 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v55 */
    /* JADX WARN: Type inference failed for: r7v56 */
    /* JADX WARN: Type inference failed for: r7v57, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v58, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v59, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v60 */
    /* JADX WARN: Type inference failed for: r7v61 */
    /* JADX WARN: Type inference failed for: r7v62 */
    /* JADX WARN: Type inference failed for: r7v63 */
    /* JADX WARN: Type inference failed for: r7v64, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v66 */
    /* JADX WARN: Type inference failed for: r7v71 */
    /* JADX WARN: Type inference failed for: r7v72 */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.String] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public final ArrayList k(String str, List list, List list2, Long l9, Long l11, boolean z11) throws Throwable {
        boolean z12;
        boolean z13;
        String str2;
        Map map;
        Object obj;
        ?? r9;
        Cursor cursorQuery;
        ?? r18;
        String str3;
        Object obj2;
        ?? r22;
        Map map2;
        String str4;
        zzic zzicVar;
        Map map3;
        Map map4;
        Map map5;
        String str5;
        com.google.android.gms.internal.measurement.zzii zziiVar;
        BitSet bitSet;
        BitSet bitSet2;
        e eVar;
        com.google.android.gms.internal.measurement.zzii zziiVar2;
        e eVar2;
        List<com.google.android.gms.internal.measurement.zzff> list3;
        long jLongValue;
        Integer numValueOf;
        int i11;
        boolean z14;
        Iterator it;
        com.google.android.gms.internal.measurement.zzik zzikVar;
        Long lValueOf;
        zzaw zzawVarH0;
        String str6;
        ?? eVar3;
        ?? r11;
        Cursor cursorRawQuery;
        ?? r12;
        e eVar4;
        Iterator it2;
        Integer num;
        com.google.android.gms.internal.measurement.zzii zziiVar3;
        List list4;
        ?? r19;
        Iterator it3;
        zzic zzicVar2;
        Integer numValueOf2;
        List arrayList;
        String str7;
        String str8;
        zzz zzzVar;
        ?? eVar5;
        Iterator it4;
        com.google.android.gms.internal.measurement.zzhs zzhsVar;
        com.google.android.gms.internal.measurement.zzhs zzhsVarA;
        zzbd zzbdVarQ;
        zzpg zzpgVar;
        long j11;
        String strD;
        Map map6;
        zzbd zzbdVar;
        Iterator it5;
        Integer num2;
        int iIntValue;
        Iterator it6;
        boolean z15;
        ?? r13;
        Map map7;
        Iterator it7;
        ?? r29;
        long j12;
        zzaa zzaaVar;
        ?? r210;
        int iZ;
        zzy zzyVar;
        boolean z16;
        boolean zG;
        String str9;
        e eVar6;
        Cursor cursor;
        String str10;
        Cursor cursor2;
        Cursor cursorQuery2;
        Integer numValueOf3;
        List list5;
        List arrayList2;
        zzpg zzpgVar2;
        ArrayList arrayList3;
        zzaw zzawVarH1;
        zzic zzicVar3;
        String str11;
        ContentValues contentValues;
        ?? eVar7;
        Iterator it8;
        String strA;
        Map map8;
        Iterator it9;
        Iterator it10;
        boolean zG2;
        com.google.android.gms.internal.measurement.zzfn zzfnVar;
        Integer numValueOf4;
        zzac zzacVar;
        Integer numValueOf5;
        zzic zzicVar4;
        String str12;
        e eVar8;
        Cursor cursor3;
        Cursor cursorQuery3;
        Integer numValueOf6;
        List list6;
        List arrayList4;
        e eVar9;
        int i12;
        ?? r14;
        Object obj3;
        ?? r15;
        ?? r110;
        ?? r111;
        List arrayList5;
        Preconditions.d(str);
        Preconditions.g(list);
        Preconditions.g(list2);
        this.f12612d = str;
        this.f12613e = new HashSet();
        this.f12614f = new e();
        this.f12615g = l9;
        this.f12616h = l11;
        Iterator it11 = list.iterator();
        while (true) {
            if (!it11.hasNext()) {
                z12 = false;
                break;
            }
            if ("_s".equals(((com.google.android.gms.internal.measurement.zzhs) it11.next()).D())) {
                z12 = true;
                break;
            }
        }
        zzahn.a();
        zzic zzicVar5 = this.f13202a;
        boolean zR = zzicVar5.f13097d.r(this.f12612d, zzfy.F0);
        zzahn.a();
        boolean zR2 = zzicVar5.f13097d.r(this.f12612d, zzfy.E0);
        String str13 = "events";
        zzpg zzpgVar3 = this.f13552b;
        if (z12) {
            zzaw zzawVarH2 = zzpgVar3.h0();
            String str14 = this.f12612d;
            zzawVarH2.h();
            zzawVarH2.g();
            Preconditions.d(str14);
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("current_session_count", (Integer) 0);
            try {
                zzawVarH2.X().update("events", contentValues2, "app_id = ?", new String[]{str14});
            } catch (SQLiteException e8) {
                zzawVarH2.f13202a.b().k().c(zzgu.o(str14), e8, "Error resetting session-scoped event counts. appId");
            }
        }
        Map map9 = Collections.EMPTY_MAP;
        String str15 = "Failed to merge filter. appId";
        Object objO = "Database error querying filters. appId";
        String str16 = "audience_id";
        try {
            try {
                try {
                    if (zR2 && zR) {
                        zzaw zzawVarH3 = zzpgVar3.h0();
                        zzic zzicVar6 = zzawVarH3.f13202a;
                        String str17 = this.f12612d;
                        Preconditions.d(str17);
                        z13 = z12;
                        e eVar10 = new e();
                        try {
                            String[] strArr = {"audience_id", "data"};
                            ?? Query = zzawVarH3.X().query("event_filters", strArr, "app_id=?", new String[]{str17}, null, null, null);
                            try {
                                try {
                                    if (Query.moveToFirst()) {
                                        str2 = "data";
                                        Query = Query;
                                        ?? r112 = strArr;
                                        while (true) {
                                            try {
                                                try {
                                                    com.google.android.gms.internal.measurement.zzff zzffVar = (com.google.android.gms.internal.measurement.zzff) ((com.google.android.gms.internal.measurement.zzfe) zzpk.R(com.google.android.gms.internal.measurement.zzff.K(), Query.getBlob(1))).p();
                                                    if (zzffVar.E()) {
                                                        Integer numValueOf7 = Integer.valueOf(Query.getInt(0));
                                                        List list7 = (List) eVar10.get(numValueOf7);
                                                        if (list7 == null) {
                                                            arrayList5 = new ArrayList();
                                                            eVar10.put(numValueOf7, arrayList5);
                                                        } else {
                                                            arrayList5 = list7;
                                                        }
                                                        arrayList5.add(zzffVar);
                                                        r112 = Query;
                                                    } else {
                                                        r112 = Query;
                                                    }
                                                } catch (IOException e10) {
                                                    r112 = Query;
                                                    zzicVar6.b().k().c(zzgu.o(str17), e10, "Failed to merge filter. appId");
                                                }
                                                try {
                                                    if (!r112.moveToNext()) {
                                                        break;
                                                    }
                                                    Query = r112;
                                                    r112 = r112;
                                                } catch (SQLiteException e11) {
                                                    e = e11;
                                                    r111 = r112;
                                                    r15 = r111;
                                                    try {
                                                        zzicVar6.b().k().c(zzgu.o(str17), e, "Database error querying filters. appId");
                                                        map9 = Collections.EMPTY_MAP;
                                                        if (r15 != 0) {
                                                            r15.close();
                                                        }
                                                        map = map9;
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        if (r15 != 0) {
                                                            r15.close();
                                                        }
                                                        throw th;
                                                    }
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    r110 = r112;
                                                    r15 = r110;
                                                    if (r15 != 0) {
                                                        r15.close();
                                                    }
                                                    throw th;
                                                }
                                            } catch (SQLiteException e12) {
                                                e = e12;
                                                r111 = Query;
                                                r15 = r111;
                                                zzicVar6.b().k().c(zzgu.o(str17), e, "Database error querying filters. appId");
                                                map9 = Collections.EMPTY_MAP;
                                                if (r15 != 0) {
                                                    r15.close();
                                                }
                                                map = map9;
                                                zzaw zzawVarH4 = zzpgVar3.h0();
                                                obj = zzawVarH4.f13202a;
                                                r9 = this.f12612d;
                                                zzawVarH4.h();
                                                zzawVarH4.g();
                                                Preconditions.d(r9);
                                                cursorQuery = zzawVarH4.X().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{r9}, null, null, null);
                                                if (cursorQuery.moveToFirst()) {
                                                    eVar9 = new e();
                                                    r18 = obj;
                                                    r22 = r9;
                                                    while (true) {
                                                        try {
                                                            i12 = cursorQuery.getInt(0);
                                                            try {
                                                                com.google.android.gms.internal.measurement.zzii zziiVar4 = (com.google.android.gms.internal.measurement.zzii) ((com.google.android.gms.internal.measurement.zzih) zzpk.R(com.google.android.gms.internal.measurement.zzii.G(), cursorQuery.getBlob(1))).p();
                                                                Object objValueOf = Integer.valueOf(i12);
                                                                eVar9.put(objValueOf, zziiVar4);
                                                                str3 = str15;
                                                                obj2 = objO;
                                                                obj3 = objValueOf;
                                                                r14 = r22;
                                                            } catch (IOException e13) {
                                                                zzgs zzgsVarK = r18.b().k();
                                                                str3 = str15;
                                                                str15 = "Failed to merge filter results. appId, audienceId, error";
                                                                obj2 = objO;
                                                                try {
                                                                    objO = zzgu.o(r22);
                                                                    Integer numValueOf8 = Integer.valueOf(i12);
                                                                    zzgsVarK.d("Failed to merge filter results. appId, audienceId, error", objO, numValueOf8, e13);
                                                                    obj3 = zzgsVarK;
                                                                    r14 = numValueOf8;
                                                                } catch (SQLiteException e14) {
                                                                    e = e14;
                                                                    r22 = r22;
                                                                    r18.b().k().c(zzgu.o(r22), e, "Database error querying filter results. appId");
                                                                    Map map10 = Collections.EMPTY_MAP;
                                                                    if (cursorQuery != null) {
                                                                        cursorQuery.close();
                                                                    }
                                                                    map2 = map10;
                                                                    if (map2.isEmpty()) {
                                                                        str5 = "audience_id";
                                                                        zzicVar = zzicVar5;
                                                                    } else {
                                                                        HashSet<Integer> hashSet = new HashSet(map2.keySet());
                                                                        if (z13) {
                                                                            String str18 = this.f12612d;
                                                                            zzawVarH0 = zzpgVar3.h0();
                                                                            str6 = this.f12612d;
                                                                            zzawVarH0.h();
                                                                            zzawVarH0.g();
                                                                            Preconditions.d(str6);
                                                                            eVar3 = new e();
                                                                            try {
                                                                                try {
                                                                                    cursorRawQuery = zzawVarH0.X().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str6, str6});
                                                                                    try {
                                                                                        if (cursorRawQuery.moveToFirst()) {
                                                                                            do {
                                                                                                numValueOf2 = Integer.valueOf(cursorRawQuery.getInt(0));
                                                                                                arrayList = (List) eVar3.get(numValueOf2);
                                                                                                if (arrayList == null) {
                                                                                                    arrayList = new ArrayList();
                                                                                                    eVar3.put(numValueOf2, arrayList);
                                                                                                }
                                                                                                arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                                                                            } while (cursorRawQuery.moveToNext());
                                                                                        } else {
                                                                                            eVar3 = Collections.EMPTY_MAP;
                                                                                        }
                                                                                    } catch (SQLiteException e15) {
                                                                                        e = e15;
                                                                                        zzawVarH0.f13202a.b().k().c(zzgu.o(str6), e, "Database error querying scoped filters. appId");
                                                                                        eVar3 = Collections.EMPTY_MAP;
                                                                                        r12 = eVar3;
                                                                                        if (cursorRawQuery != null) {
                                                                                        }
                                                                                        Preconditions.d(str18);
                                                                                        eVar4 = new e();
                                                                                        if (!map2.isEmpty()) {
                                                                                            it2 = map2.keySet().iterator();
                                                                                            while (it2.hasNext()) {
                                                                                                num = (Integer) it2.next();
                                                                                                num.getClass();
                                                                                                zziiVar3 = (com.google.android.gms.internal.measurement.zzii) map2.get(num);
                                                                                                list4 = (List) r12.get(num);
                                                                                                if (list4 != null) {
                                                                                                }
                                                                                                r19 = r12;
                                                                                                it3 = it2;
                                                                                                zzicVar2 = zzicVar5;
                                                                                                eVar4.put(num, zziiVar3);
                                                                                                r12 = r19;
                                                                                                str16 = str16;
                                                                                                it2 = it3;
                                                                                                zzicVar5 = zzicVar2;
                                                                                            }
                                                                                        }
                                                                                        str4 = str16;
                                                                                        zzicVar = zzicVar5;
                                                                                        map3 = eVar4;
                                                                                        map5 = map2;
                                                                                        map4 = map3;
                                                                                        for (Integer num3 : hashSet) {
                                                                                            num3.getClass();
                                                                                            zziiVar = (com.google.android.gms.internal.measurement.zzii) map4.get(num3);
                                                                                            bitSet = new BitSet();
                                                                                            bitSet2 = new BitSet();
                                                                                            eVar = new e();
                                                                                            if (zziiVar != null) {
                                                                                                for (com.google.android.gms.internal.measurement.zzhq zzhqVar : zziiVar.C()) {
                                                                                                    if (zzhqVar.y()) {
                                                                                                        com.google.android.gms.internal.measurement.zzii zziiVar5 = zziiVar;
                                                                                                        Integer numValueOf9 = Integer.valueOf(zzhqVar.z());
                                                                                                        if (zzhqVar.A()) {
                                                                                                            lValueOf = Long.valueOf(zzhqVar.B());
                                                                                                        } else {
                                                                                                            lValueOf = null;
                                                                                                        }
                                                                                                        eVar.put(numValueOf9, lValueOf);
                                                                                                        zziiVar = zziiVar5;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            zziiVar2 = zziiVar;
                                                                                            eVar2 = new e();
                                                                                            if (zziiVar2 != null) {
                                                                                                it = zziiVar2.E().iterator();
                                                                                                while (it.hasNext()) {
                                                                                                    zzikVar = (com.google.android.gms.internal.measurement.zzik) it.next();
                                                                                                    if (!zzikVar.y()) {
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            Map map11 = map4;
                                                                                            if (zziiVar2 != null) {
                                                                                                i11 = 0;
                                                                                                while (i11 < zziiVar2.z() * 64) {
                                                                                                    if (zzpk.L((zzaee) zziiVar2.y(), i11)) {
                                                                                                        z14 = zR;
                                                                                                        zzicVar.b().n().c(num3, Integer.valueOf(i11), "Filter already evaluated. audience ID, filter ID");
                                                                                                        bitSet2.set(i11);
                                                                                                        if (zzpk.L((zzaee) zziiVar2.A(), i11)) {
                                                                                                            bitSet.set(i11);
                                                                                                        }
                                                                                                        i11++;
                                                                                                        zR = z14;
                                                                                                    } else {
                                                                                                        z14 = zR;
                                                                                                    }
                                                                                                    eVar.remove(Integer.valueOf(i11));
                                                                                                    i11++;
                                                                                                    zR = z14;
                                                                                                }
                                                                                            }
                                                                                            boolean z17 = zR;
                                                                                            com.google.android.gms.internal.measurement.zzii zziiVar6 = (com.google.android.gms.internal.measurement.zzii) map5.get(num3);
                                                                                            if (zR2) {
                                                                                                for (com.google.android.gms.internal.measurement.zzff zzffVar2 : list3) {
                                                                                                    int iZ2 = zzffVar2.z();
                                                                                                    Integer num4 = num3;
                                                                                                    jLongValue = this.f12616h.longValue() / 1000;
                                                                                                    if (zzffVar2.H()) {
                                                                                                        jLongValue = this.f12615g.longValue() / 1000;
                                                                                                    }
                                                                                                    numValueOf = Integer.valueOf(iZ2);
                                                                                                    if (eVar.containsKey(numValueOf)) {
                                                                                                        eVar.put(numValueOf, Long.valueOf(jLongValue));
                                                                                                    }
                                                                                                    if (eVar2.containsKey(numValueOf)) {
                                                                                                        eVar2.put(numValueOf, Long.valueOf(jLongValue));
                                                                                                    }
                                                                                                    num3 = num4;
                                                                                                }
                                                                                            }
                                                                                            String str19 = str3;
                                                                                            this.f12614f.put(num3, new zzy(this, this.f12612d, zziiVar6, bitSet, bitSet2, eVar, eVar2));
                                                                                            map = map;
                                                                                            zR = z17;
                                                                                            str2 = str2;
                                                                                            map5 = map5;
                                                                                            str4 = str4;
                                                                                            zR2 = zR2;
                                                                                            str3 = str19;
                                                                                            map4 = map11;
                                                                                        }
                                                                                        str5 = str4;
                                                                                        str7 = str2;
                                                                                        String str20 = str3;
                                                                                        ?? r16 = obj2;
                                                                                        str8 = "Skipping failed audience ID";
                                                                                        if (!list.isEmpty()) {
                                                                                            zzzVar = new zzz(this);
                                                                                            eVar5 = new e();
                                                                                            it4 = list.iterator();
                                                                                            while (it4.hasNext()) {
                                                                                                zzhsVar = (com.google.android.gms.internal.measurement.zzhs) it4.next();
                                                                                                zzhsVarA = zzzVar.a(zzhsVar, this.f12612d);
                                                                                                if (zzhsVarA != null) {
                                                                                                    zzbdVarQ = zzpgVar3.h0().Q(this.f12612d, zzhsVar, zzhsVarA.D());
                                                                                                    zzpgVar3.h0().H(str13, zzbdVarQ);
                                                                                                    if (!z11) {
                                                                                                        String str21 = str13;
                                                                                                        zzpgVar = zzpgVar3;
                                                                                                        j11 = zzbdVarQ.f12691c;
                                                                                                        strD = zzhsVarA.D();
                                                                                                        map6 = (Map) eVar5.get(strD);
                                                                                                        if (map6 == null) {
                                                                                                            zzaw zzawVarH5 = zzpgVar.h0();
                                                                                                            zzic zzicVar7 = zzawVarH5.f13202a;
                                                                                                            str9 = this.f12612d;
                                                                                                            zzawVarH5.h();
                                                                                                            zzawVarH5.g();
                                                                                                            Preconditions.d(str9);
                                                                                                            Preconditions.d(strD);
                                                                                                            eVar6 = new e();
                                                                                                            try {
                                                                                                                try {
                                                                                                                    str10 = str9;
                                                                                                                    try {
                                                                                                                        cursorQuery2 = zzawVarH5.X().query("event_filters", new String[]{str5, str7}, "app_id=? AND event_name=?", new String[]{str9, strD}, null, null, null);
                                                                                                                        try {
                                                                                                                            try {
                                                                                                                                if (cursorQuery2.moveToFirst()) {
                                                                                                                                    zzbdVar = zzbdVarQ;
                                                                                                                                    while (true) {
                                                                                                                                        try {
                                                                                                                                            try {
                                                                                                                                                com.google.android.gms.internal.measurement.zzff zzffVar3 = (com.google.android.gms.internal.measurement.zzff) ((com.google.android.gms.internal.measurement.zzfe) zzpk.R(com.google.android.gms.internal.measurement.zzff.K(), cursorQuery2.getBlob(1))).p();
                                                                                                                                                numValueOf3 = Integer.valueOf(cursorQuery2.getInt(0));
                                                                                                                                                list5 = (List) eVar6.get(numValueOf3);
                                                                                                                                                if (list5 == null) {
                                                                                                                                                    cursor2 = cursorQuery2;
                                                                                                                                                    try {
                                                                                                                                                        try {
                                                                                                                                                            arrayList2 = new ArrayList();
                                                                                                                                                            eVar6.put(numValueOf3, arrayList2);
                                                                                                                                                        } catch (Throwable th4) {
                                                                                                                                                            th = th4;
                                                                                                                                                            cursor = cursor2;
                                                                                                                                                            if (cursor != null) {
                                                                                                                                                                cursor.close();
                                                                                                                                                            }
                                                                                                                                                            throw th;
                                                                                                                                                        }
                                                                                                                                                    } catch (SQLiteException e16) {
                                                                                                                                                        e = e16;
                                                                                                                                                        zzicVar7.b().k().c(zzgu.o(str10), e, r16);
                                                                                                                                                        map6 = Collections.EMPTY_MAP;
                                                                                                                                                        if (cursor2 != null) {
                                                                                                                                                            cursor2.close();
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                } else {
                                                                                                                                                    cursor2 = cursorQuery2;
                                                                                                                                                    arrayList2 = list5;
                                                                                                                                                }
                                                                                                                                                arrayList2.add(zzffVar3);
                                                                                                                                            } catch (IOException e17) {
                                                                                                                                                cursor2 = cursorQuery2;
                                                                                                                                                zzicVar7.b().k().c(zzgu.o(str10), e17, str20);
                                                                                                                                            }
                                                                                                                                            if (!cursor2.moveToNext()) {
                                                                                                                                                break;
                                                                                                                                            }
                                                                                                                                            cursorQuery2 = cursor2;
                                                                                                                                        } catch (SQLiteException e18) {
                                                                                                                                            e = e18;
                                                                                                                                            cursor2 = cursorQuery2;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    cursor2.close();
                                                                                                                                    map6 = eVar6;
                                                                                                                                } else {
                                                                                                                                    cursor2 = cursorQuery2;
                                                                                                                                    zzbdVar = zzbdVarQ;
                                                                                                                                    map6 = Collections.EMPTY_MAP;
                                                                                                                                    cursor2.close();
                                                                                                                                }
                                                                                                                            } catch (SQLiteException e19) {
                                                                                                                                e = e19;
                                                                                                                                cursor2 = cursorQuery2;
                                                                                                                                zzbdVar = zzbdVarQ;
                                                                                                                            }
                                                                                                                        } catch (Throwable th5) {
                                                                                                                            th = th5;
                                                                                                                            cursor2 = cursorQuery2;
                                                                                                                        }
                                                                                                                    } catch (SQLiteException e21) {
                                                                                                                        e = e21;
                                                                                                                        zzbdVar = zzbdVarQ;
                                                                                                                        cursor2 = null;
                                                                                                                        zzicVar7.b().k().c(zzgu.o(str10), e, r16);
                                                                                                                        map6 = Collections.EMPTY_MAP;
                                                                                                                        if (cursor2 != null) {
                                                                                                                            cursor2.close();
                                                                                                                        }
                                                                                                                        eVar5.put(strD, map6);
                                                                                                                        it5 = map6.keySet().iterator();
                                                                                                                        while (it5.hasNext()) {
                                                                                                                            num2 = (Integer) it5.next();
                                                                                                                            iIntValue = num2.intValue();
                                                                                                                            if (this.f12613e.contains(num2)) {
                                                                                                                                zzicVar.b().n().b(num2, "Skipping failed audience ID");
                                                                                                                            } else {
                                                                                                                                it6 = ((List) map6.get(num2)).iterator();
                                                                                                                                z15 = true;
                                                                                                                                r13 = eVar5;
                                                                                                                                while (true) {
                                                                                                                                    if (!it6.hasNext()) {
                                                                                                                                        map7 = map6;
                                                                                                                                        it7 = it5;
                                                                                                                                        r29 = r13;
                                                                                                                                        j12 = j11;
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    map7 = map6;
                                                                                                                                    com.google.android.gms.internal.measurement.zzff zzffVar4 = (com.google.android.gms.internal.measurement.zzff) it6.next();
                                                                                                                                    it7 = it5;
                                                                                                                                    r210 = r13;
                                                                                                                                    zzaaVar = new zzaa(this, this.f12612d, iIntValue, zzffVar4);
                                                                                                                                    Long l12 = this.f12615g;
                                                                                                                                    Long l13 = this.f12616h;
                                                                                                                                    iZ = zzffVar4.z();
                                                                                                                                    zzyVar = (zzy) this.f12614f.get(num2);
                                                                                                                                    if (zzyVar == null) {
                                                                                                                                        z16 = false;
                                                                                                                                    } else {
                                                                                                                                        z16 = zzyVar.f13678d.get(iZ);
                                                                                                                                    }
                                                                                                                                    j12 = j11;
                                                                                                                                    zG = zzaaVar.g(l12, l13, zzhsVarA, j12, zzbdVar, z16);
                                                                                                                                    if (!zG) {
                                                                                                                                        this.f12613e.add(num2);
                                                                                                                                        z15 = zG;
                                                                                                                                        r29 = r210;
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    l(num2).a(zzaaVar);
                                                                                                                                    z15 = zG;
                                                                                                                                    j11 = j12;
                                                                                                                                    map6 = map7;
                                                                                                                                    it5 = it7;
                                                                                                                                    r13 = r210;
                                                                                                                                }
                                                                                                                                if (!z15) {
                                                                                                                                    this.f12613e.add(num2);
                                                                                                                                }
                                                                                                                                j11 = j12;
                                                                                                                                map6 = map7;
                                                                                                                                it5 = it7;
                                                                                                                                eVar5 = r29;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        it4 = it4;
                                                                                                                        str13 = str21;
                                                                                                                        zzpgVar3 = zzpgVar;
                                                                                                                        zzzVar = zzzVar;
                                                                                                                    }
                                                                                                                } catch (SQLiteException e22) {
                                                                                                                    e = e22;
                                                                                                                    str10 = str9;
                                                                                                                }
                                                                                                                eVar5.put(strD, map6);
                                                                                                            } catch (Throwable th6) {
                                                                                                                th = th6;
                                                                                                                cursor = null;
                                                                                                            }
                                                                                                        } else {
                                                                                                            zzbdVar = zzbdVarQ;
                                                                                                        }
                                                                                                        it5 = map6.keySet().iterator();
                                                                                                        while (it5.hasNext()) {
                                                                                                            num2 = (Integer) it5.next();
                                                                                                            iIntValue = num2.intValue();
                                                                                                            if (this.f12613e.contains(num2)) {
                                                                                                                zzicVar.b().n().b(num2, "Skipping failed audience ID");
                                                                                                            } else {
                                                                                                                it6 = ((List) map6.get(num2)).iterator();
                                                                                                                z15 = true;
                                                                                                                r13 = eVar5;
                                                                                                                while (true) {
                                                                                                                    if (!it6.hasNext()) {
                                                                                                                        map7 = map6;
                                                                                                                        it7 = it5;
                                                                                                                        r29 = r13;
                                                                                                                        j12 = j11;
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    map7 = map6;
                                                                                                                    com.google.android.gms.internal.measurement.zzff zzffVar5 = (com.google.android.gms.internal.measurement.zzff) it6.next();
                                                                                                                    it7 = it5;
                                                                                                                    r210 = r13;
                                                                                                                    zzaaVar = new zzaa(this, this.f12612d, iIntValue, zzffVar5);
                                                                                                                    Long l14 = this.f12615g;
                                                                                                                    Long l15 = this.f12616h;
                                                                                                                    iZ = zzffVar5.z();
                                                                                                                    zzyVar = (zzy) this.f12614f.get(num2);
                                                                                                                    if (zzyVar == null) {
                                                                                                                        z16 = false;
                                                                                                                    } else {
                                                                                                                        z16 = zzyVar.f13678d.get(iZ);
                                                                                                                    }
                                                                                                                    j12 = j11;
                                                                                                                    zG = zzaaVar.g(l14, l15, zzhsVarA, j12, zzbdVar, z16);
                                                                                                                    if (!zG) {
                                                                                                                        this.f12613e.add(num2);
                                                                                                                        z15 = zG;
                                                                                                                        r29 = r210;
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    l(num2).a(zzaaVar);
                                                                                                                    z15 = zG;
                                                                                                                    j11 = j12;
                                                                                                                    map6 = map7;
                                                                                                                    it5 = it7;
                                                                                                                    r13 = r210;
                                                                                                                }
                                                                                                                if (!z15) {
                                                                                                                    this.f12613e.add(num2);
                                                                                                                }
                                                                                                                j11 = j12;
                                                                                                                map6 = map7;
                                                                                                                it5 = it7;
                                                                                                                eVar5 = r29;
                                                                                                            }
                                                                                                        }
                                                                                                        it4 = it4;
                                                                                                        str13 = str21;
                                                                                                        zzpgVar3 = zzpgVar;
                                                                                                        zzzVar = zzzVar;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        zzpgVar2 = zzpgVar3;
                                                                                        if (!z11) {
                                                                                            return new ArrayList();
                                                                                        }
                                                                                        if (!list2.isEmpty()) {
                                                                                            eVar7 = new e();
                                                                                            it8 = list2.iterator();
                                                                                            while (it8.hasNext()) {
                                                                                                com.google.android.gms.internal.measurement.zziu zziuVar = (com.google.android.gms.internal.measurement.zziu) it8.next();
                                                                                                strA = zziuVar.A();
                                                                                                map8 = (Map) eVar7.get(strA);
                                                                                                if (map8 == null) {
                                                                                                    zzaw zzawVarH6 = zzpgVar2.h0();
                                                                                                    zzicVar4 = zzawVarH6.f13202a;
                                                                                                    str12 = this.f12612d;
                                                                                                    zzawVarH6.h();
                                                                                                    zzawVarH6.g();
                                                                                                    Preconditions.d(str12);
                                                                                                    Preconditions.d(strA);
                                                                                                    eVar8 = new e();
                                                                                                    try {
                                                                                                        cursorQuery3 = zzawVarH6.X().query("property_filters", new String[]{str5, str7}, "app_id=? AND property_name=?", new String[]{str12, strA}, null, null, null);
                                                                                                        try {
                                                                                                            try {
                                                                                                                if (cursorQuery3.moveToFirst()) {
                                                                                                                    while (true) {
                                                                                                                        try {
                                                                                                                            com.google.android.gms.internal.measurement.zzfn zzfnVar2 = (com.google.android.gms.internal.measurement.zzfn) ((com.google.android.gms.internal.measurement.zzfm) zzpk.R(com.google.android.gms.internal.measurement.zzfn.G(), cursorQuery3.getBlob(1))).p();
                                                                                                                            numValueOf6 = Integer.valueOf(cursorQuery3.getInt(0));
                                                                                                                            list6 = (List) eVar8.get(numValueOf6);
                                                                                                                            if (list6 == null) {
                                                                                                                                it9 = it8;
                                                                                                                                try {
                                                                                                                                    arrayList4 = new ArrayList();
                                                                                                                                    eVar8.put(numValueOf6, arrayList4);
                                                                                                                                } catch (SQLiteException e23) {
                                                                                                                                    e = e23;
                                                                                                                                    zzicVar4 = zzicVar4;
                                                                                                                                    cursor3 = cursorQuery3;
                                                                                                                                    try {
                                                                                                                                        zzicVar4.b().k().c(zzgu.o(str12), e, r16);
                                                                                                                                        map8 = Collections.EMPTY_MAP;
                                                                                                                                        if (cursor3 != null) {
                                                                                                                                            cursor3.close();
                                                                                                                                        }
                                                                                                                                        eVar7.put(strA, map8);
                                                                                                                                        for (Integer num5 : map8.keySet()) {
                                                                                                                                            int iIntValue2 = num5.intValue();
                                                                                                                                            if (this.f12613e.contains(num5)) {
                                                                                                                                                zzicVar.b().n().b(num5, str8);
                                                                                                                                                break;
                                                                                                                                            }
                                                                                                                                            it10 = ((List) map8.get(num5)).iterator();
                                                                                                                                            zG2 = true;
                                                                                                                                            while (true) {
                                                                                                                                                if (it10.hasNext()) {
                                                                                                                                                    zzfnVar = (com.google.android.gms.internal.measurement.zzfn) it10.next();
                                                                                                                                                    if (Log.isLoggable(zzicVar.b().q(), 2)) {
                                                                                                                                                        zzgs zzgsVarN = zzicVar.b().n();
                                                                                                                                                        if (zzfnVar.y()) {
                                                                                                                                                            numValueOf5 = Integer.valueOf(zzfnVar.z());
                                                                                                                                                        } else {
                                                                                                                                                            numValueOf5 = null;
                                                                                                                                                        }
                                                                                                                                                        zzgsVarN.d("Evaluating filter. audience, filter, property", num5, numValueOf5, zzicVar.n().c(zzfnVar.A()));
                                                                                                                                                        zzicVar.b().n().b(zzpgVar2.k0().I(zzfnVar), "Filter definition");
                                                                                                                                                    }
                                                                                                                                                    if (zzfnVar.y()) {
                                                                                                                                                    }
                                                                                                                                                    zzgs zzgsVarL = zzicVar.b().l();
                                                                                                                                                    Object objO2 = zzgu.o(this.f12612d);
                                                                                                                                                    if (zzfnVar.y()) {
                                                                                                                                                        numValueOf4 = Integer.valueOf(zzfnVar.z());
                                                                                                                                                    } else {
                                                                                                                                                        numValueOf4 = null;
                                                                                                                                                    }
                                                                                                                                                    zzgsVarL.c(objO2, String.valueOf(numValueOf4), "Invalid property filter ID. appId, id");
                                                                                                                                                    this.f12613e.add(num5);
                                                                                                                                                    map8 = map8;
                                                                                                                                                    str8 = str8;
                                                                                                                                                } else {
                                                                                                                                                    map8 = map8;
                                                                                                                                                    str8 = str8;
                                                                                                                                                }
                                                                                                                                                if (!zG2) {
                                                                                                                                                    this.f12613e.add(num5);
                                                                                                                                                }
                                                                                                                                                map8 = map8;
                                                                                                                                                str8 = str8;
                                                                                                                                                l(num5).a(zzacVar);
                                                                                                                                                map8 = map8;
                                                                                                                                                str8 = str8;
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        it8 = it9;
                                                                                                                                    } catch (Throwable th7) {
                                                                                                                                        th = th7;
                                                                                                                                        if (cursor3 != null) {
                                                                                                                                            cursor3.close();
                                                                                                                                        }
                                                                                                                                        throw th;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                it9 = it8;
                                                                                                                                arrayList4 = list6;
                                                                                                                            }
                                                                                                                            arrayList4.add(zzfnVar2);
                                                                                                                        } catch (IOException e24) {
                                                                                                                            it9 = it8;
                                                                                                                            zzicVar4.b().k().c(zzgu.o(str12), e24, "Failed to merge filter");
                                                                                                                        }
                                                                                                                        try {
                                                                                                                            if (!cursorQuery3.moveToNext()) {
                                                                                                                                break;
                                                                                                                            }
                                                                                                                            it8 = it9;
                                                                                                                            zzicVar4 = zzicVar4;
                                                                                                                        } catch (SQLiteException e25) {
                                                                                                                            e = e25;
                                                                                                                            cursor3 = cursorQuery3;
                                                                                                                            zzicVar4.b().k().c(zzgu.o(str12), e, r16);
                                                                                                                            map8 = Collections.EMPTY_MAP;
                                                                                                                            if (cursor3 != null) {
                                                                                                                                cursor3.close();
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                    cursorQuery3.close();
                                                                                                                    map8 = eVar8;
                                                                                                                } else {
                                                                                                                    it9 = it8;
                                                                                                                    map8 = Collections.EMPTY_MAP;
                                                                                                                    cursorQuery3.close();
                                                                                                                }
                                                                                                            } catch (SQLiteException e26) {
                                                                                                                e = e26;
                                                                                                                it9 = it8;
                                                                                                            }
                                                                                                        } catch (Throwable th8) {
                                                                                                            th = th8;
                                                                                                            cursor3 = cursorQuery3;
                                                                                                            if (cursor3 != null) {
                                                                                                                cursor3.close();
                                                                                                            }
                                                                                                            throw th;
                                                                                                        }
                                                                                                    } catch (SQLiteException e27) {
                                                                                                        e = e27;
                                                                                                        it9 = it8;
                                                                                                        zzicVar4 = zzicVar4;
                                                                                                        cursor3 = null;
                                                                                                    } catch (Throwable th9) {
                                                                                                        th = th9;
                                                                                                        cursor3 = null;
                                                                                                    }
                                                                                                    eVar7.put(strA, map8);
                                                                                                } else {
                                                                                                    it9 = it8;
                                                                                                }
                                                                                                while (r4.hasNext()) {
                                                                                                    int iIntValue3 = num5.intValue();
                                                                                                    if (this.f12613e.contains(num5)) {
                                                                                                        zzicVar.b().n().b(num5, str8);
                                                                                                        break;
                                                                                                        break;
                                                                                                    }
                                                                                                    it10 = ((List) map8.get(num5)).iterator();
                                                                                                    zG2 = true;
                                                                                                    while (true) {
                                                                                                        if (it10.hasNext()) {
                                                                                                            zzfnVar = (com.google.android.gms.internal.measurement.zzfn) it10.next();
                                                                                                            if (Log.isLoggable(zzicVar.b().q(), 2)) {
                                                                                                                zzgs zzgsVarN2 = zzicVar.b().n();
                                                                                                                if (zzfnVar.y()) {
                                                                                                                    numValueOf5 = Integer.valueOf(zzfnVar.z());
                                                                                                                } else {
                                                                                                                    numValueOf5 = null;
                                                                                                                }
                                                                                                                zzgsVarN2.d("Evaluating filter. audience, filter, property", num5, numValueOf5, zzicVar.n().c(zzfnVar.A()));
                                                                                                                zzicVar.b().n().b(zzpgVar2.k0().I(zzfnVar), "Filter definition");
                                                                                                            }
                                                                                                            if (zzfnVar.y()) {
                                                                                                            }
                                                                                                            zzgs zzgsVarL2 = zzicVar.b().l();
                                                                                                            Object objO3 = zzgu.o(this.f12612d);
                                                                                                            if (zzfnVar.y()) {
                                                                                                                numValueOf4 = Integer.valueOf(zzfnVar.z());
                                                                                                            } else {
                                                                                                                numValueOf4 = null;
                                                                                                            }
                                                                                                            zzgsVarL2.c(objO3, String.valueOf(numValueOf4), "Invalid property filter ID. appId, id");
                                                                                                            this.f12613e.add(num5);
                                                                                                            map8 = map8;
                                                                                                            str8 = str8;
                                                                                                        } else {
                                                                                                            map8 = map8;
                                                                                                            str8 = str8;
                                                                                                        }
                                                                                                        if (!zG2) {
                                                                                                            this.f12613e.add(num5);
                                                                                                        }
                                                                                                        map8 = map8;
                                                                                                        str8 = str8;
                                                                                                        l(num5).a(zzacVar);
                                                                                                        map8 = map8;
                                                                                                        str8 = str8;
                                                                                                    }
                                                                                                }
                                                                                                it8 = it9;
                                                                                            }
                                                                                        }
                                                                                        arrayList3 = new ArrayList();
                                                                                        b<Integer> bVar = (b) this.f12614f.keySet();
                                                                                        bVar.removeAll(this.f12613e);
                                                                                        for (Integer num6 : bVar) {
                                                                                            int iIntValue4 = num6.intValue();
                                                                                            zzy zzyVar2 = (zzy) this.f12614f.get(num6);
                                                                                            Preconditions.g(zzyVar2);
                                                                                            com.google.android.gms.internal.measurement.zzhg zzhgVarB = zzyVar2.b(iIntValue4);
                                                                                            arrayList3.add(zzhgVarB);
                                                                                            zzawVarH1 = zzpgVar2.h0();
                                                                                            zzicVar3 = zzawVarH1.f13202a;
                                                                                            str11 = this.f12612d;
                                                                                            com.google.android.gms.internal.measurement.zzii zziiVarA = zzhgVarB.A();
                                                                                            zzawVarH1.h();
                                                                                            zzawVarH1.g();
                                                                                            Preconditions.d(str11);
                                                                                            Preconditions.g(zziiVarA);
                                                                                            byte[] bArrB = zziiVarA.b();
                                                                                            contentValues = new ContentValues();
                                                                                            contentValues.put("app_id", str11);
                                                                                            contentValues.put(str5, num6);
                                                                                            contentValues.put("current_results", bArrB);
                                                                                            try {
                                                                                                try {
                                                                                                    if (zzawVarH1.X().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                                                                                        zzicVar3.b().k().b(zzgu.o(str11), "Failed to insert filter results (got -1). appId");
                                                                                                    }
                                                                                                } catch (SQLiteException e28) {
                                                                                                    e = e28;
                                                                                                    zzicVar3.b().k().c(zzgu.o(str11), e, "Error storing filter results. appId");
                                                                                                }
                                                                                            } catch (SQLiteException e29) {
                                                                                                e = e29;
                                                                                            }
                                                                                        }
                                                                                        return arrayList3;
                                                                                    }
                                                                                } catch (SQLiteException e30) {
                                                                                    e = e30;
                                                                                    cursorRawQuery = null;
                                                                                } catch (Throwable th10) {
                                                                                    th = th10;
                                                                                    r11 = 0;
                                                                                    if (r11 != 0) {
                                                                                        r11.close();
                                                                                    }
                                                                                    throw th;
                                                                                }
                                                                                cursorRawQuery.close();
                                                                                r12 = eVar3;
                                                                                Preconditions.d(str18);
                                                                                eVar4 = new e();
                                                                                if (!map2.isEmpty()) {
                                                                                    it2 = map2.keySet().iterator();
                                                                                    while (it2.hasNext()) {
                                                                                        num = (Integer) it2.next();
                                                                                        num.getClass();
                                                                                        zziiVar3 = (com.google.android.gms.internal.measurement.zzii) map2.get(num);
                                                                                        list4 = (List) r12.get(num);
                                                                                        if (list4 != null) {
                                                                                        }
                                                                                        r19 = r12;
                                                                                        it3 = it2;
                                                                                        zzicVar2 = zzicVar5;
                                                                                        eVar4.put(num, zziiVar3);
                                                                                        r12 = r19;
                                                                                        str16 = str16;
                                                                                        it2 = it3;
                                                                                        zzicVar5 = zzicVar2;
                                                                                    }
                                                                                }
                                                                                str4 = str16;
                                                                                zzicVar = zzicVar5;
                                                                                map3 = eVar4;
                                                                            } catch (Throwable th11) {
                                                                                th = th11;
                                                                                r11 = hashSet;
                                                                            }
                                                                        } else {
                                                                            str4 = "audience_id";
                                                                            zzicVar = zzicVar5;
                                                                            map3 = map2;
                                                                        }
                                                                        map5 = map2;
                                                                        map4 = map3;
                                                                        while (r16.hasNext()) {
                                                                            num3.getClass();
                                                                            zziiVar = (com.google.android.gms.internal.measurement.zzii) map4.get(num3);
                                                                            bitSet = new BitSet();
                                                                            bitSet2 = new BitSet();
                                                                            eVar = new e();
                                                                            if (zziiVar != null) {
                                                                                while (r3.hasNext()) {
                                                                                    if (zzhqVar.y()) {
                                                                                        com.google.android.gms.internal.measurement.zzii zziiVar7 = zziiVar;
                                                                                        Integer numValueOf10 = Integer.valueOf(zzhqVar.z());
                                                                                        if (zzhqVar.A()) {
                                                                                            lValueOf = Long.valueOf(zzhqVar.B());
                                                                                        } else {
                                                                                            lValueOf = null;
                                                                                        }
                                                                                        eVar.put(numValueOf10, lValueOf);
                                                                                        zziiVar = zziiVar7;
                                                                                    }
                                                                                }
                                                                            }
                                                                            zziiVar2 = zziiVar;
                                                                            eVar2 = new e();
                                                                            if (zziiVar2 != null) {
                                                                                it = zziiVar2.E().iterator();
                                                                                while (it.hasNext()) {
                                                                                    zzikVar = (com.google.android.gms.internal.measurement.zzik) it.next();
                                                                                    if (!zzikVar.y()) {
                                                                                    }
                                                                                }
                                                                            }
                                                                            Map map12 = map4;
                                                                            if (zziiVar2 != null) {
                                                                                i11 = 0;
                                                                                while (i11 < zziiVar2.z() * 64) {
                                                                                    if (zzpk.L((zzaee) zziiVar2.y(), i11)) {
                                                                                        z14 = zR;
                                                                                        zzicVar.b().n().c(num3, Integer.valueOf(i11), "Filter already evaluated. audience ID, filter ID");
                                                                                        bitSet2.set(i11);
                                                                                        if (zzpk.L((zzaee) zziiVar2.A(), i11)) {
                                                                                            bitSet.set(i11);
                                                                                        }
                                                                                        i11++;
                                                                                        zR = z14;
                                                                                    } else {
                                                                                        z14 = zR;
                                                                                    }
                                                                                    eVar.remove(Integer.valueOf(i11));
                                                                                    i11++;
                                                                                    zR = z14;
                                                                                }
                                                                            }
                                                                            boolean z18 = zR;
                                                                            com.google.android.gms.internal.measurement.zzii zziiVar8 = (com.google.android.gms.internal.measurement.zzii) map5.get(num3);
                                                                            if (zR2) {
                                                                                while (r2.hasNext()) {
                                                                                    int iZ3 = zzffVar2.z();
                                                                                    Integer num7 = num3;
                                                                                    jLongValue = this.f12616h.longValue() / 1000;
                                                                                    if (zzffVar2.H()) {
                                                                                        jLongValue = this.f12615g.longValue() / 1000;
                                                                                    }
                                                                                    numValueOf = Integer.valueOf(iZ3);
                                                                                    if (eVar.containsKey(numValueOf)) {
                                                                                        eVar.put(numValueOf, Long.valueOf(jLongValue));
                                                                                    }
                                                                                    if (eVar2.containsKey(numValueOf)) {
                                                                                        eVar2.put(numValueOf, Long.valueOf(jLongValue));
                                                                                    }
                                                                                    num3 = num7;
                                                                                }
                                                                            }
                                                                            String str110 = str3;
                                                                            this.f12614f.put(num3, new zzy(this, this.f12612d, zziiVar8, bitSet, bitSet2, eVar, eVar2));
                                                                            map = map;
                                                                            zR = z18;
                                                                            str2 = str2;
                                                                            map5 = map5;
                                                                            str4 = str4;
                                                                            zR2 = zR2;
                                                                            str3 = str110;
                                                                            map4 = map12;
                                                                        }
                                                                        str5 = str4;
                                                                    }
                                                                    str7 = str2;
                                                                    String str22 = str3;
                                                                    ?? r17 = obj2;
                                                                    str8 = "Skipping failed audience ID";
                                                                    if (!list.isEmpty()) {
                                                                        zzzVar = new zzz(this);
                                                                        eVar5 = new e();
                                                                        it4 = list.iterator();
                                                                        while (it4.hasNext()) {
                                                                            zzhsVar = (com.google.android.gms.internal.measurement.zzhs) it4.next();
                                                                            zzhsVarA = zzzVar.a(zzhsVar, this.f12612d);
                                                                            if (zzhsVarA != null) {
                                                                                zzbdVarQ = zzpgVar3.h0().Q(this.f12612d, zzhsVar, zzhsVarA.D());
                                                                                zzpgVar3.h0().H(str13, zzbdVarQ);
                                                                                if (!z11) {
                                                                                    String str23 = str13;
                                                                                    zzpgVar = zzpgVar3;
                                                                                    j11 = zzbdVarQ.f12691c;
                                                                                    strD = zzhsVarA.D();
                                                                                    map6 = (Map) eVar5.get(strD);
                                                                                    if (map6 == null) {
                                                                                        zzaw zzawVarH7 = zzpgVar.h0();
                                                                                        zzic zzicVar8 = zzawVarH7.f13202a;
                                                                                        str9 = this.f12612d;
                                                                                        zzawVarH7.h();
                                                                                        zzawVarH7.g();
                                                                                        Preconditions.d(str9);
                                                                                        Preconditions.d(strD);
                                                                                        eVar6 = new e();
                                                                                        str10 = str9;
                                                                                        cursorQuery2 = zzawVarH7.X().query("event_filters", new String[]{str5, str7}, "app_id=? AND event_name=?", new String[]{str9, strD}, null, null, null);
                                                                                        if (cursorQuery2.moveToFirst()) {
                                                                                            zzbdVar = zzbdVarQ;
                                                                                            while (true) {
                                                                                                com.google.android.gms.internal.measurement.zzff zzffVar6 = (com.google.android.gms.internal.measurement.zzff) ((com.google.android.gms.internal.measurement.zzfe) zzpk.R(com.google.android.gms.internal.measurement.zzff.K(), cursorQuery2.getBlob(1))).p();
                                                                                                numValueOf3 = Integer.valueOf(cursorQuery2.getInt(0));
                                                                                                list5 = (List) eVar6.get(numValueOf3);
                                                                                                if (list5 == null) {
                                                                                                    cursor2 = cursorQuery2;
                                                                                                    arrayList2 = new ArrayList();
                                                                                                    eVar6.put(numValueOf3, arrayList2);
                                                                                                } else {
                                                                                                    cursor2 = cursorQuery2;
                                                                                                    arrayList2 = list5;
                                                                                                }
                                                                                                arrayList2.add(zzffVar6);
                                                                                                if (!cursor2.moveToNext()) {
                                                                                                    break;
                                                                                                    break;
                                                                                                }
                                                                                                cursorQuery2 = cursor2;
                                                                                            }
                                                                                            cursor2.close();
                                                                                            map6 = eVar6;
                                                                                        } else {
                                                                                            cursor2 = cursorQuery2;
                                                                                            zzbdVar = zzbdVarQ;
                                                                                            map6 = Collections.EMPTY_MAP;
                                                                                            cursor2.close();
                                                                                        }
                                                                                        eVar5.put(strD, map6);
                                                                                    } else {
                                                                                        zzbdVar = zzbdVarQ;
                                                                                    }
                                                                                    it5 = map6.keySet().iterator();
                                                                                    while (it5.hasNext()) {
                                                                                        num2 = (Integer) it5.next();
                                                                                        iIntValue = num2.intValue();
                                                                                        if (this.f12613e.contains(num2)) {
                                                                                            zzicVar.b().n().b(num2, "Skipping failed audience ID");
                                                                                        } else {
                                                                                            it6 = ((List) map6.get(num2)).iterator();
                                                                                            z15 = true;
                                                                                            r13 = eVar5;
                                                                                            while (true) {
                                                                                                if (!it6.hasNext()) {
                                                                                                    map7 = map6;
                                                                                                    it7 = it5;
                                                                                                    r29 = r13;
                                                                                                    j12 = j11;
                                                                                                    break;
                                                                                                }
                                                                                                map7 = map6;
                                                                                                com.google.android.gms.internal.measurement.zzff zzffVar7 = (com.google.android.gms.internal.measurement.zzff) it6.next();
                                                                                                it7 = it5;
                                                                                                r210 = r13;
                                                                                                zzaaVar = new zzaa(this, this.f12612d, iIntValue, zzffVar7);
                                                                                                Long l16 = this.f12615g;
                                                                                                Long l17 = this.f12616h;
                                                                                                iZ = zzffVar7.z();
                                                                                                zzyVar = (zzy) this.f12614f.get(num2);
                                                                                                if (zzyVar == null) {
                                                                                                    z16 = false;
                                                                                                } else {
                                                                                                    z16 = zzyVar.f13678d.get(iZ);
                                                                                                }
                                                                                                j12 = j11;
                                                                                                zG = zzaaVar.g(l16, l17, zzhsVarA, j12, zzbdVar, z16);
                                                                                                if (!zG) {
                                                                                                    this.f12613e.add(num2);
                                                                                                    z15 = zG;
                                                                                                    r29 = r210;
                                                                                                    break;
                                                                                                }
                                                                                                l(num2).a(zzaaVar);
                                                                                                z15 = zG;
                                                                                                j11 = j12;
                                                                                                map6 = map7;
                                                                                                it5 = it7;
                                                                                                r13 = r210;
                                                                                            }
                                                                                            if (!z15) {
                                                                                                this.f12613e.add(num2);
                                                                                            }
                                                                                            j11 = j12;
                                                                                            map6 = map7;
                                                                                            it5 = it7;
                                                                                            eVar5 = r29;
                                                                                        }
                                                                                    }
                                                                                    it4 = it4;
                                                                                    str13 = str23;
                                                                                    zzpgVar3 = zzpgVar;
                                                                                    zzzVar = zzzVar;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    zzpgVar2 = zzpgVar3;
                                                                    if (!z11) {
                                                                        return new ArrayList();
                                                                    }
                                                                    if (!list2.isEmpty()) {
                                                                        eVar7 = new e();
                                                                        it8 = list2.iterator();
                                                                        while (it8.hasNext()) {
                                                                            com.google.android.gms.internal.measurement.zziu zziuVar2 = (com.google.android.gms.internal.measurement.zziu) it8.next();
                                                                            strA = zziuVar2.A();
                                                                            map8 = (Map) eVar7.get(strA);
                                                                            if (map8 == null) {
                                                                                zzaw zzawVarH8 = zzpgVar2.h0();
                                                                                zzicVar4 = zzawVarH8.f13202a;
                                                                                str12 = this.f12612d;
                                                                                zzawVarH8.h();
                                                                                zzawVarH8.g();
                                                                                Preconditions.d(str12);
                                                                                Preconditions.d(strA);
                                                                                eVar8 = new e();
                                                                                cursorQuery3 = zzawVarH8.X().query("property_filters", new String[]{str5, str7}, "app_id=? AND property_name=?", new String[]{str12, strA}, null, null, null);
                                                                                if (cursorQuery3.moveToFirst()) {
                                                                                    while (true) {
                                                                                        com.google.android.gms.internal.measurement.zzfn zzfnVar3 = (com.google.android.gms.internal.measurement.zzfn) ((com.google.android.gms.internal.measurement.zzfm) zzpk.R(com.google.android.gms.internal.measurement.zzfn.G(), cursorQuery3.getBlob(1))).p();
                                                                                        numValueOf6 = Integer.valueOf(cursorQuery3.getInt(0));
                                                                                        list6 = (List) eVar8.get(numValueOf6);
                                                                                        if (list6 == null) {
                                                                                            it9 = it8;
                                                                                            arrayList4 = new ArrayList();
                                                                                            eVar8.put(numValueOf6, arrayList4);
                                                                                        } else {
                                                                                            it9 = it8;
                                                                                            arrayList4 = list6;
                                                                                        }
                                                                                        arrayList4.add(zzfnVar3);
                                                                                        if (!cursorQuery3.moveToNext()) {
                                                                                            break;
                                                                                            break;
                                                                                        }
                                                                                        it8 = it9;
                                                                                        zzicVar4 = zzicVar4;
                                                                                    }
                                                                                    cursorQuery3.close();
                                                                                    map8 = eVar8;
                                                                                } else {
                                                                                    it9 = it8;
                                                                                    map8 = Collections.EMPTY_MAP;
                                                                                    cursorQuery3.close();
                                                                                }
                                                                                eVar7.put(strA, map8);
                                                                            } else {
                                                                                it9 = it8;
                                                                            }
                                                                            while (r4.hasNext()) {
                                                                                int iIntValue5 = num5.intValue();
                                                                                if (this.f12613e.contains(num5)) {
                                                                                    zzicVar.b().n().b(num5, str8);
                                                                                    break;
                                                                                    break;
                                                                                }
                                                                                it10 = ((List) map8.get(num5)).iterator();
                                                                                zG2 = true;
                                                                                while (true) {
                                                                                    if (it10.hasNext()) {
                                                                                        zzfnVar = (com.google.android.gms.internal.measurement.zzfn) it10.next();
                                                                                        if (Log.isLoggable(zzicVar.b().q(), 2)) {
                                                                                            zzgs zzgsVarN3 = zzicVar.b().n();
                                                                                            if (zzfnVar.y()) {
                                                                                                numValueOf5 = Integer.valueOf(zzfnVar.z());
                                                                                            } else {
                                                                                                numValueOf5 = null;
                                                                                            }
                                                                                            zzgsVarN3.d("Evaluating filter. audience, filter, property", num5, numValueOf5, zzicVar.n().c(zzfnVar.A()));
                                                                                            zzicVar.b().n().b(zzpgVar2.k0().I(zzfnVar), "Filter definition");
                                                                                        }
                                                                                        if (zzfnVar.y()) {
                                                                                        }
                                                                                        zzgs zzgsVarL3 = zzicVar.b().l();
                                                                                        Object objO4 = zzgu.o(this.f12612d);
                                                                                        if (zzfnVar.y()) {
                                                                                            numValueOf4 = Integer.valueOf(zzfnVar.z());
                                                                                        } else {
                                                                                            numValueOf4 = null;
                                                                                        }
                                                                                        zzgsVarL3.c(objO4, String.valueOf(numValueOf4), "Invalid property filter ID. appId, id");
                                                                                        this.f12613e.add(num5);
                                                                                        map8 = map8;
                                                                                        str8 = str8;
                                                                                    } else {
                                                                                        map8 = map8;
                                                                                        str8 = str8;
                                                                                    }
                                                                                    if (!zG2) {
                                                                                        this.f12613e.add(num5);
                                                                                    }
                                                                                    map8 = map8;
                                                                                    str8 = str8;
                                                                                    l(num5).a(zzacVar);
                                                                                    map8 = map8;
                                                                                    str8 = str8;
                                                                                }
                                                                            }
                                                                            it8 = it9;
                                                                        }
                                                                    }
                                                                    arrayList3 = new ArrayList();
                                                                    b<Integer> bVar2 = (b) this.f12614f.keySet();
                                                                    bVar2.removeAll(this.f12613e);
                                                                    while (r3.hasNext()) {
                                                                        int iIntValue6 = num6.intValue();
                                                                        zzy zzyVar3 = (zzy) this.f12614f.get(num6);
                                                                        Preconditions.g(zzyVar3);
                                                                        com.google.android.gms.internal.measurement.zzhg zzhgVarB2 = zzyVar3.b(iIntValue6);
                                                                        arrayList3.add(zzhgVarB2);
                                                                        zzawVarH1 = zzpgVar2.h0();
                                                                        zzicVar3 = zzawVarH1.f13202a;
                                                                        str11 = this.f12612d;
                                                                        com.google.android.gms.internal.measurement.zzii zziiVarA2 = zzhgVarB2.A();
                                                                        zzawVarH1.h();
                                                                        zzawVarH1.g();
                                                                        Preconditions.d(str11);
                                                                        Preconditions.g(zziiVarA2);
                                                                        byte[] bArrB2 = zziiVarA2.b();
                                                                        contentValues = new ContentValues();
                                                                        contentValues.put("app_id", str11);
                                                                        contentValues.put(str5, num6);
                                                                        contentValues.put("current_results", bArrB2);
                                                                        if (zzawVarH1.X().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                                                            zzicVar3.b().k().b(zzgu.o(str11), "Failed to insert filter results (got -1). appId");
                                                                        }
                                                                    }
                                                                    return arrayList3;
                                                                }
                                                            }
                                                            try {
                                                                if (!cursorQuery.moveToNext()) {
                                                                    break;
                                                                }
                                                                str15 = str3;
                                                                objO = obj2;
                                                                r22 = r22;
                                                            } catch (SQLiteException e31) {
                                                                e = e31;
                                                                r18.b().k().c(zzgu.o(r22), e, "Database error querying filter results. appId");
                                                                Map map13 = Collections.EMPTY_MAP;
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                map2 = map13;
                                                            }
                                                        } catch (SQLiteException e32) {
                                                            e = e32;
                                                            r22 = r22;
                                                            r18 = r18;
                                                            str3 = str15;
                                                            obj2 = objO;
                                                            r22 = r22;
                                                            r18.b().k().c(zzgu.o(r22), e, "Database error querying filter results. appId");
                                                            Map map14 = Collections.EMPTY_MAP;
                                                            if (cursorQuery != null) {
                                                                cursorQuery.close();
                                                            }
                                                            map2 = map14;
                                                            if (map2.isEmpty()) {
                                                                str5 = "audience_id";
                                                                zzicVar = zzicVar5;
                                                            } else {
                                                                HashSet<Integer> hashSet2 = new HashSet(map2.keySet());
                                                                if (z13) {
                                                                    String str111 = this.f12612d;
                                                                    zzawVarH0 = zzpgVar3.h0();
                                                                    str6 = this.f12612d;
                                                                    zzawVarH0.h();
                                                                    zzawVarH0.g();
                                                                    Preconditions.d(str6);
                                                                    eVar3 = new e();
                                                                    cursorRawQuery = zzawVarH0.X().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str6, str6});
                                                                    if (cursorRawQuery.moveToFirst()) {
                                                                        do {
                                                                            numValueOf2 = Integer.valueOf(cursorRawQuery.getInt(0));
                                                                            arrayList = (List) eVar3.get(numValueOf2);
                                                                            if (arrayList == null) {
                                                                                arrayList = new ArrayList();
                                                                                eVar3.put(numValueOf2, arrayList);
                                                                            }
                                                                            arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                                                        } while (cursorRawQuery.moveToNext());
                                                                    } else {
                                                                        eVar3 = Collections.EMPTY_MAP;
                                                                    }
                                                                    cursorRawQuery.close();
                                                                    r12 = eVar3;
                                                                    Preconditions.d(str111);
                                                                    eVar4 = new e();
                                                                    if (!map2.isEmpty()) {
                                                                        it2 = map2.keySet().iterator();
                                                                        while (it2.hasNext()) {
                                                                            num = (Integer) it2.next();
                                                                            num.getClass();
                                                                            zziiVar3 = (com.google.android.gms.internal.measurement.zzii) map2.get(num);
                                                                            list4 = (List) r12.get(num);
                                                                            if (list4 != null) {
                                                                            }
                                                                            r19 = r12;
                                                                            it3 = it2;
                                                                            zzicVar2 = zzicVar5;
                                                                            eVar4.put(num, zziiVar3);
                                                                            r12 = r19;
                                                                            str16 = str16;
                                                                            it2 = it3;
                                                                            zzicVar5 = zzicVar2;
                                                                        }
                                                                    }
                                                                    str4 = str16;
                                                                    zzicVar = zzicVar5;
                                                                    map3 = eVar4;
                                                                } else {
                                                                    str4 = "audience_id";
                                                                    zzicVar = zzicVar5;
                                                                    map3 = map2;
                                                                }
                                                                map5 = map2;
                                                                map4 = map3;
                                                                while (r16.hasNext()) {
                                                                    num3.getClass();
                                                                    zziiVar = (com.google.android.gms.internal.measurement.zzii) map4.get(num3);
                                                                    bitSet = new BitSet();
                                                                    bitSet2 = new BitSet();
                                                                    eVar = new e();
                                                                    if (zziiVar != null) {
                                                                        while (r3.hasNext()) {
                                                                            if (zzhqVar.y()) {
                                                                                com.google.android.gms.internal.measurement.zzii zziiVar9 = zziiVar;
                                                                                Integer numValueOf11 = Integer.valueOf(zzhqVar.z());
                                                                                if (zzhqVar.A()) {
                                                                                    lValueOf = Long.valueOf(zzhqVar.B());
                                                                                } else {
                                                                                    lValueOf = null;
                                                                                }
                                                                                eVar.put(numValueOf11, lValueOf);
                                                                                zziiVar = zziiVar9;
                                                                            }
                                                                        }
                                                                    }
                                                                    zziiVar2 = zziiVar;
                                                                    eVar2 = new e();
                                                                    if (zziiVar2 != null) {
                                                                        it = zziiVar2.E().iterator();
                                                                        while (it.hasNext()) {
                                                                            zzikVar = (com.google.android.gms.internal.measurement.zzik) it.next();
                                                                            if (!zzikVar.y()) {
                                                                            }
                                                                        }
                                                                    }
                                                                    Map map15 = map4;
                                                                    if (zziiVar2 != null) {
                                                                        i11 = 0;
                                                                        while (i11 < zziiVar2.z() * 64) {
                                                                            if (zzpk.L((zzaee) zziiVar2.y(), i11)) {
                                                                                z14 = zR;
                                                                                zzicVar.b().n().c(num3, Integer.valueOf(i11), "Filter already evaluated. audience ID, filter ID");
                                                                                bitSet2.set(i11);
                                                                                if (zzpk.L((zzaee) zziiVar2.A(), i11)) {
                                                                                    bitSet.set(i11);
                                                                                }
                                                                                i11++;
                                                                                zR = z14;
                                                                            } else {
                                                                                z14 = zR;
                                                                            }
                                                                            eVar.remove(Integer.valueOf(i11));
                                                                            i11++;
                                                                            zR = z14;
                                                                        }
                                                                    }
                                                                    boolean z19 = zR;
                                                                    com.google.android.gms.internal.measurement.zzii zziiVar10 = (com.google.android.gms.internal.measurement.zzii) map5.get(num3);
                                                                    if (zR2) {
                                                                        while (r2.hasNext()) {
                                                                            int iZ4 = zzffVar2.z();
                                                                            Integer num8 = num3;
                                                                            jLongValue = this.f12616h.longValue() / 1000;
                                                                            if (zzffVar2.H()) {
                                                                                jLongValue = this.f12615g.longValue() / 1000;
                                                                            }
                                                                            numValueOf = Integer.valueOf(iZ4);
                                                                            if (eVar.containsKey(numValueOf)) {
                                                                                eVar.put(numValueOf, Long.valueOf(jLongValue));
                                                                            }
                                                                            if (eVar2.containsKey(numValueOf)) {
                                                                                eVar2.put(numValueOf, Long.valueOf(jLongValue));
                                                                            }
                                                                            num3 = num8;
                                                                        }
                                                                    }
                                                                    String str112 = str3;
                                                                    this.f12614f.put(num3, new zzy(this, this.f12612d, zziiVar10, bitSet, bitSet2, eVar, eVar2));
                                                                    map = map;
                                                                    zR = z19;
                                                                    str2 = str2;
                                                                    map5 = map5;
                                                                    str4 = str4;
                                                                    zR2 = zR2;
                                                                    str3 = str112;
                                                                    map4 = map15;
                                                                }
                                                                str5 = str4;
                                                            }
                                                            str7 = str2;
                                                            String str24 = str3;
                                                            ?? r113 = obj2;
                                                            str8 = "Skipping failed audience ID";
                                                            if (!list.isEmpty()) {
                                                                zzzVar = new zzz(this);
                                                                eVar5 = new e();
                                                                it4 = list.iterator();
                                                                while (it4.hasNext()) {
                                                                    zzhsVar = (com.google.android.gms.internal.measurement.zzhs) it4.next();
                                                                    zzhsVarA = zzzVar.a(zzhsVar, this.f12612d);
                                                                    if (zzhsVarA != null) {
                                                                        zzbdVarQ = zzpgVar3.h0().Q(this.f12612d, zzhsVar, zzhsVarA.D());
                                                                        zzpgVar3.h0().H(str13, zzbdVarQ);
                                                                        if (!z11) {
                                                                            String str25 = str13;
                                                                            zzpgVar = zzpgVar3;
                                                                            j11 = zzbdVarQ.f12691c;
                                                                            strD = zzhsVarA.D();
                                                                            map6 = (Map) eVar5.get(strD);
                                                                            if (map6 == null) {
                                                                                zzaw zzawVarH9 = zzpgVar.h0();
                                                                                zzic zzicVar9 = zzawVarH9.f13202a;
                                                                                str9 = this.f12612d;
                                                                                zzawVarH9.h();
                                                                                zzawVarH9.g();
                                                                                Preconditions.d(str9);
                                                                                Preconditions.d(strD);
                                                                                eVar6 = new e();
                                                                                str10 = str9;
                                                                                cursorQuery2 = zzawVarH9.X().query("event_filters", new String[]{str5, str7}, "app_id=? AND event_name=?", new String[]{str9, strD}, null, null, null);
                                                                                if (cursorQuery2.moveToFirst()) {
                                                                                    zzbdVar = zzbdVarQ;
                                                                                    while (true) {
                                                                                        com.google.android.gms.internal.measurement.zzff zzffVar8 = (com.google.android.gms.internal.measurement.zzff) ((com.google.android.gms.internal.measurement.zzfe) zzpk.R(com.google.android.gms.internal.measurement.zzff.K(), cursorQuery2.getBlob(1))).p();
                                                                                        numValueOf3 = Integer.valueOf(cursorQuery2.getInt(0));
                                                                                        list5 = (List) eVar6.get(numValueOf3);
                                                                                        if (list5 == null) {
                                                                                            cursor2 = cursorQuery2;
                                                                                            arrayList2 = new ArrayList();
                                                                                            eVar6.put(numValueOf3, arrayList2);
                                                                                        } else {
                                                                                            cursor2 = cursorQuery2;
                                                                                            arrayList2 = list5;
                                                                                        }
                                                                                        arrayList2.add(zzffVar8);
                                                                                        if (!cursor2.moveToNext()) {
                                                                                            break;
                                                                                            break;
                                                                                        }
                                                                                        cursorQuery2 = cursor2;
                                                                                    }
                                                                                    cursor2.close();
                                                                                    map6 = eVar6;
                                                                                } else {
                                                                                    cursor2 = cursorQuery2;
                                                                                    zzbdVar = zzbdVarQ;
                                                                                    map6 = Collections.EMPTY_MAP;
                                                                                    cursor2.close();
                                                                                }
                                                                                eVar5.put(strD, map6);
                                                                            } else {
                                                                                zzbdVar = zzbdVarQ;
                                                                            }
                                                                            it5 = map6.keySet().iterator();
                                                                            while (it5.hasNext()) {
                                                                                num2 = (Integer) it5.next();
                                                                                iIntValue = num2.intValue();
                                                                                if (this.f12613e.contains(num2)) {
                                                                                    zzicVar.b().n().b(num2, "Skipping failed audience ID");
                                                                                } else {
                                                                                    it6 = ((List) map6.get(num2)).iterator();
                                                                                    z15 = true;
                                                                                    r13 = eVar5;
                                                                                    while (true) {
                                                                                        if (!it6.hasNext()) {
                                                                                            map7 = map6;
                                                                                            it7 = it5;
                                                                                            r29 = r13;
                                                                                            j12 = j11;
                                                                                            break;
                                                                                        }
                                                                                        map7 = map6;
                                                                                        com.google.android.gms.internal.measurement.zzff zzffVar9 = (com.google.android.gms.internal.measurement.zzff) it6.next();
                                                                                        it7 = it5;
                                                                                        r210 = r13;
                                                                                        zzaaVar = new zzaa(this, this.f12612d, iIntValue, zzffVar9);
                                                                                        Long l18 = this.f12615g;
                                                                                        Long l19 = this.f12616h;
                                                                                        iZ = zzffVar9.z();
                                                                                        zzyVar = (zzy) this.f12614f.get(num2);
                                                                                        if (zzyVar == null) {
                                                                                            z16 = false;
                                                                                        } else {
                                                                                            z16 = zzyVar.f13678d.get(iZ);
                                                                                        }
                                                                                        j12 = j11;
                                                                                        zG = zzaaVar.g(l18, l19, zzhsVarA, j12, zzbdVar, z16);
                                                                                        if (!zG) {
                                                                                            this.f12613e.add(num2);
                                                                                            z15 = zG;
                                                                                            r29 = r210;
                                                                                            break;
                                                                                        }
                                                                                        l(num2).a(zzaaVar);
                                                                                        z15 = zG;
                                                                                        j11 = j12;
                                                                                        map6 = map7;
                                                                                        it5 = it7;
                                                                                        r13 = r210;
                                                                                    }
                                                                                    if (!z15) {
                                                                                        this.f12613e.add(num2);
                                                                                    }
                                                                                    j11 = j12;
                                                                                    map6 = map7;
                                                                                    it5 = it7;
                                                                                    eVar5 = r29;
                                                                                }
                                                                            }
                                                                            it4 = it4;
                                                                            str13 = str25;
                                                                            zzpgVar3 = zzpgVar;
                                                                            zzzVar = zzzVar;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            zzpgVar2 = zzpgVar3;
                                                            if (!z11) {
                                                                return new ArrayList();
                                                            }
                                                            if (!list2.isEmpty()) {
                                                                eVar7 = new e();
                                                                it8 = list2.iterator();
                                                                while (it8.hasNext()) {
                                                                    com.google.android.gms.internal.measurement.zziu zziuVar3 = (com.google.android.gms.internal.measurement.zziu) it8.next();
                                                                    strA = zziuVar3.A();
                                                                    map8 = (Map) eVar7.get(strA);
                                                                    if (map8 == null) {
                                                                        zzaw zzawVarH10 = zzpgVar2.h0();
                                                                        zzicVar4 = zzawVarH10.f13202a;
                                                                        str12 = this.f12612d;
                                                                        zzawVarH10.h();
                                                                        zzawVarH10.g();
                                                                        Preconditions.d(str12);
                                                                        Preconditions.d(strA);
                                                                        eVar8 = new e();
                                                                        cursorQuery3 = zzawVarH10.X().query("property_filters", new String[]{str5, str7}, "app_id=? AND property_name=?", new String[]{str12, strA}, null, null, null);
                                                                        if (cursorQuery3.moveToFirst()) {
                                                                            while (true) {
                                                                                com.google.android.gms.internal.measurement.zzfn zzfnVar4 = (com.google.android.gms.internal.measurement.zzfn) ((com.google.android.gms.internal.measurement.zzfm) zzpk.R(com.google.android.gms.internal.measurement.zzfn.G(), cursorQuery3.getBlob(1))).p();
                                                                                numValueOf6 = Integer.valueOf(cursorQuery3.getInt(0));
                                                                                list6 = (List) eVar8.get(numValueOf6);
                                                                                if (list6 == null) {
                                                                                    it9 = it8;
                                                                                    arrayList4 = new ArrayList();
                                                                                    eVar8.put(numValueOf6, arrayList4);
                                                                                } else {
                                                                                    it9 = it8;
                                                                                    arrayList4 = list6;
                                                                                }
                                                                                arrayList4.add(zzfnVar4);
                                                                                if (!cursorQuery3.moveToNext()) {
                                                                                    break;
                                                                                    break;
                                                                                }
                                                                                it8 = it9;
                                                                                zzicVar4 = zzicVar4;
                                                                            }
                                                                            cursorQuery3.close();
                                                                            map8 = eVar8;
                                                                        } else {
                                                                            it9 = it8;
                                                                            map8 = Collections.EMPTY_MAP;
                                                                            cursorQuery3.close();
                                                                        }
                                                                        eVar7.put(strA, map8);
                                                                    } else {
                                                                        it9 = it8;
                                                                    }
                                                                    while (r4.hasNext()) {
                                                                        int iIntValue7 = num5.intValue();
                                                                        if (this.f12613e.contains(num5)) {
                                                                            zzicVar.b().n().b(num5, str8);
                                                                            break;
                                                                            break;
                                                                        }
                                                                        it10 = ((List) map8.get(num5)).iterator();
                                                                        zG2 = true;
                                                                        while (true) {
                                                                            if (it10.hasNext()) {
                                                                                zzfnVar = (com.google.android.gms.internal.measurement.zzfn) it10.next();
                                                                                if (Log.isLoggable(zzicVar.b().q(), 2)) {
                                                                                    zzgs zzgsVarN4 = zzicVar.b().n();
                                                                                    if (zzfnVar.y()) {
                                                                                        numValueOf5 = Integer.valueOf(zzfnVar.z());
                                                                                    } else {
                                                                                        numValueOf5 = null;
                                                                                    }
                                                                                    zzgsVarN4.d("Evaluating filter. audience, filter, property", num5, numValueOf5, zzicVar.n().c(zzfnVar.A()));
                                                                                    zzicVar.b().n().b(zzpgVar2.k0().I(zzfnVar), "Filter definition");
                                                                                }
                                                                                if (zzfnVar.y()) {
                                                                                }
                                                                                zzgs zzgsVarL4 = zzicVar.b().l();
                                                                                Object objO5 = zzgu.o(this.f12612d);
                                                                                if (zzfnVar.y()) {
                                                                                    numValueOf4 = Integer.valueOf(zzfnVar.z());
                                                                                } else {
                                                                                    numValueOf4 = null;
                                                                                }
                                                                                zzgsVarL4.c(objO5, String.valueOf(numValueOf4), "Invalid property filter ID. appId, id");
                                                                                this.f12613e.add(num5);
                                                                                map8 = map8;
                                                                                str8 = str8;
                                                                            } else {
                                                                                map8 = map8;
                                                                                str8 = str8;
                                                                            }
                                                                            if (!zG2) {
                                                                                this.f12613e.add(num5);
                                                                            }
                                                                            map8 = map8;
                                                                            str8 = str8;
                                                                            l(num5).a(zzacVar);
                                                                            map8 = map8;
                                                                            str8 = str8;
                                                                        }
                                                                    }
                                                                    it8 = it9;
                                                                }
                                                            }
                                                            arrayList3 = new ArrayList();
                                                            b<Integer> bVar3 = (b) this.f12614f.keySet();
                                                            bVar3.removeAll(this.f12613e);
                                                            while (r3.hasNext()) {
                                                                int iIntValue8 = num6.intValue();
                                                                zzy zzyVar4 = (zzy) this.f12614f.get(num6);
                                                                Preconditions.g(zzyVar4);
                                                                com.google.android.gms.internal.measurement.zzhg zzhgVarB3 = zzyVar4.b(iIntValue8);
                                                                arrayList3.add(zzhgVarB3);
                                                                zzawVarH1 = zzpgVar2.h0();
                                                                zzicVar3 = zzawVarH1.f13202a;
                                                                str11 = this.f12612d;
                                                                com.google.android.gms.internal.measurement.zzii zziiVarA3 = zzhgVarB3.A();
                                                                zzawVarH1.h();
                                                                zzawVarH1.g();
                                                                Preconditions.d(str11);
                                                                Preconditions.g(zziiVarA3);
                                                                byte[] bArrB3 = zziiVarA3.b();
                                                                contentValues = new ContentValues();
                                                                contentValues.put("app_id", str11);
                                                                contentValues.put(str5, num6);
                                                                contentValues.put("current_results", bArrB3);
                                                                if (zzawVarH1.X().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                                                    zzicVar3.b().k().b(zzgu.o(str11), "Failed to insert filter results (got -1). appId");
                                                                }
                                                            }
                                                            return arrayList3;
                                                        }
                                                    }
                                                    cursorQuery.close();
                                                    obj = obj3;
                                                    r9 = r14;
                                                    map2 = eVar9;
                                                } else {
                                                    Map map16 = Collections.EMPTY_MAP;
                                                    cursorQuery.close();
                                                    map2 = map16;
                                                    str3 = "Failed to merge filter. appId";
                                                    obj2 = "Database error querying filters. appId";
                                                    obj = obj;
                                                    r9 = r9;
                                                }
                                                if (map2.isEmpty()) {
                                                    str5 = "audience_id";
                                                    zzicVar = zzicVar5;
                                                } else {
                                                    HashSet<Integer> hashSet3 = new HashSet(map2.keySet());
                                                    if (z13) {
                                                        String str113 = this.f12612d;
                                                        zzawVarH0 = zzpgVar3.h0();
                                                        str6 = this.f12612d;
                                                        zzawVarH0.h();
                                                        zzawVarH0.g();
                                                        Preconditions.d(str6);
                                                        eVar3 = new e();
                                                        cursorRawQuery = zzawVarH0.X().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str6, str6});
                                                        if (cursorRawQuery.moveToFirst()) {
                                                            do {
                                                                numValueOf2 = Integer.valueOf(cursorRawQuery.getInt(0));
                                                                arrayList = (List) eVar3.get(numValueOf2);
                                                                if (arrayList == null) {
                                                                    arrayList = new ArrayList();
                                                                    eVar3.put(numValueOf2, arrayList);
                                                                }
                                                                arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                                            } while (cursorRawQuery.moveToNext());
                                                        } else {
                                                            eVar3 = Collections.EMPTY_MAP;
                                                        }
                                                        cursorRawQuery.close();
                                                        r12 = eVar3;
                                                        Preconditions.d(str113);
                                                        eVar4 = new e();
                                                        if (!map2.isEmpty()) {
                                                            it2 = map2.keySet().iterator();
                                                            while (it2.hasNext()) {
                                                                num = (Integer) it2.next();
                                                                num.getClass();
                                                                zziiVar3 = (com.google.android.gms.internal.measurement.zzii) map2.get(num);
                                                                list4 = (List) r12.get(num);
                                                                if (list4 != null) {
                                                                }
                                                                r19 = r12;
                                                                it3 = it2;
                                                                zzicVar2 = zzicVar5;
                                                                eVar4.put(num, zziiVar3);
                                                                r12 = r19;
                                                                str16 = str16;
                                                                it2 = it3;
                                                                zzicVar5 = zzicVar2;
                                                            }
                                                        }
                                                        str4 = str16;
                                                        zzicVar = zzicVar5;
                                                        map3 = eVar4;
                                                    } else {
                                                        str4 = "audience_id";
                                                        zzicVar = zzicVar5;
                                                        map3 = map2;
                                                    }
                                                    map5 = map2;
                                                    map4 = map3;
                                                    while (r16.hasNext()) {
                                                        num3.getClass();
                                                        zziiVar = (com.google.android.gms.internal.measurement.zzii) map4.get(num3);
                                                        bitSet = new BitSet();
                                                        bitSet2 = new BitSet();
                                                        eVar = new e();
                                                        if (zziiVar != null) {
                                                            while (r3.hasNext()) {
                                                                if (zzhqVar.y()) {
                                                                    com.google.android.gms.internal.measurement.zzii zziiVar11 = zziiVar;
                                                                    Integer numValueOf12 = Integer.valueOf(zzhqVar.z());
                                                                    if (zzhqVar.A()) {
                                                                        lValueOf = Long.valueOf(zzhqVar.B());
                                                                    } else {
                                                                        lValueOf = null;
                                                                    }
                                                                    eVar.put(numValueOf12, lValueOf);
                                                                    zziiVar = zziiVar11;
                                                                }
                                                            }
                                                        }
                                                        zziiVar2 = zziiVar;
                                                        eVar2 = new e();
                                                        if (zziiVar2 != null) {
                                                            it = zziiVar2.E().iterator();
                                                            while (it.hasNext()) {
                                                                zzikVar = (com.google.android.gms.internal.measurement.zzik) it.next();
                                                                if (!zzikVar.y()) {
                                                                }
                                                            }
                                                        }
                                                        Map map17 = map4;
                                                        if (zziiVar2 != null) {
                                                            i11 = 0;
                                                            while (i11 < zziiVar2.z() * 64) {
                                                                if (zzpk.L((zzaee) zziiVar2.y(), i11)) {
                                                                    z14 = zR;
                                                                    zzicVar.b().n().c(num3, Integer.valueOf(i11), "Filter already evaluated. audience ID, filter ID");
                                                                    bitSet2.set(i11);
                                                                    if (zzpk.L((zzaee) zziiVar2.A(), i11)) {
                                                                        bitSet.set(i11);
                                                                    }
                                                                    i11++;
                                                                    zR = z14;
                                                                } else {
                                                                    z14 = zR;
                                                                }
                                                                eVar.remove(Integer.valueOf(i11));
                                                                i11++;
                                                                zR = z14;
                                                            }
                                                        }
                                                        boolean z110 = zR;
                                                        com.google.android.gms.internal.measurement.zzii zziiVar12 = (com.google.android.gms.internal.measurement.zzii) map5.get(num3);
                                                        if (zR2) {
                                                            while (r2.hasNext()) {
                                                                int iZ5 = zzffVar2.z();
                                                                Integer num9 = num3;
                                                                jLongValue = this.f12616h.longValue() / 1000;
                                                                if (zzffVar2.H()) {
                                                                    jLongValue = this.f12615g.longValue() / 1000;
                                                                }
                                                                numValueOf = Integer.valueOf(iZ5);
                                                                if (eVar.containsKey(numValueOf)) {
                                                                    eVar.put(numValueOf, Long.valueOf(jLongValue));
                                                                }
                                                                if (eVar2.containsKey(numValueOf)) {
                                                                    eVar2.put(numValueOf, Long.valueOf(jLongValue));
                                                                }
                                                                num3 = num9;
                                                            }
                                                        }
                                                        String str114 = str3;
                                                        this.f12614f.put(num3, new zzy(this, this.f12612d, zziiVar12, bitSet, bitSet2, eVar, eVar2));
                                                        map = map;
                                                        zR = z110;
                                                        str2 = str2;
                                                        map5 = map5;
                                                        str4 = str4;
                                                        zR2 = zR2;
                                                        str3 = str114;
                                                        map4 = map17;
                                                    }
                                                    str5 = str4;
                                                }
                                                str7 = str2;
                                                String str26 = str3;
                                                ?? r114 = obj2;
                                                str8 = "Skipping failed audience ID";
                                                if (!list.isEmpty()) {
                                                    zzzVar = new zzz(this);
                                                    eVar5 = new e();
                                                    it4 = list.iterator();
                                                    while (it4.hasNext()) {
                                                        zzhsVar = (com.google.android.gms.internal.measurement.zzhs) it4.next();
                                                        zzhsVarA = zzzVar.a(zzhsVar, this.f12612d);
                                                        if (zzhsVarA != null) {
                                                            zzbdVarQ = zzpgVar3.h0().Q(this.f12612d, zzhsVar, zzhsVarA.D());
                                                            zzpgVar3.h0().H(str13, zzbdVarQ);
                                                            if (!z11) {
                                                                String str27 = str13;
                                                                zzpgVar = zzpgVar3;
                                                                j11 = zzbdVarQ.f12691c;
                                                                strD = zzhsVarA.D();
                                                                map6 = (Map) eVar5.get(strD);
                                                                if (map6 == null) {
                                                                    zzaw zzawVarH11 = zzpgVar.h0();
                                                                    zzic zzicVar10 = zzawVarH11.f13202a;
                                                                    str9 = this.f12612d;
                                                                    zzawVarH11.h();
                                                                    zzawVarH11.g();
                                                                    Preconditions.d(str9);
                                                                    Preconditions.d(strD);
                                                                    eVar6 = new e();
                                                                    str10 = str9;
                                                                    cursorQuery2 = zzawVarH11.X().query("event_filters", new String[]{str5, str7}, "app_id=? AND event_name=?", new String[]{str9, strD}, null, null, null);
                                                                    if (cursorQuery2.moveToFirst()) {
                                                                        zzbdVar = zzbdVarQ;
                                                                        while (true) {
                                                                            com.google.android.gms.internal.measurement.zzff zzffVar10 = (com.google.android.gms.internal.measurement.zzff) ((com.google.android.gms.internal.measurement.zzfe) zzpk.R(com.google.android.gms.internal.measurement.zzff.K(), cursorQuery2.getBlob(1))).p();
                                                                            numValueOf3 = Integer.valueOf(cursorQuery2.getInt(0));
                                                                            list5 = (List) eVar6.get(numValueOf3);
                                                                            if (list5 == null) {
                                                                                cursor2 = cursorQuery2;
                                                                                arrayList2 = new ArrayList();
                                                                                eVar6.put(numValueOf3, arrayList2);
                                                                            } else {
                                                                                cursor2 = cursorQuery2;
                                                                                arrayList2 = list5;
                                                                            }
                                                                            arrayList2.add(zzffVar10);
                                                                            if (!cursor2.moveToNext()) {
                                                                                break;
                                                                                break;
                                                                            }
                                                                            cursorQuery2 = cursor2;
                                                                        }
                                                                        cursor2.close();
                                                                        map6 = eVar6;
                                                                    } else {
                                                                        cursor2 = cursorQuery2;
                                                                        zzbdVar = zzbdVarQ;
                                                                        map6 = Collections.EMPTY_MAP;
                                                                        cursor2.close();
                                                                    }
                                                                    eVar5.put(strD, map6);
                                                                } else {
                                                                    zzbdVar = zzbdVarQ;
                                                                }
                                                                it5 = map6.keySet().iterator();
                                                                while (it5.hasNext()) {
                                                                    num2 = (Integer) it5.next();
                                                                    iIntValue = num2.intValue();
                                                                    if (this.f12613e.contains(num2)) {
                                                                        zzicVar.b().n().b(num2, "Skipping failed audience ID");
                                                                    } else {
                                                                        it6 = ((List) map6.get(num2)).iterator();
                                                                        z15 = true;
                                                                        r13 = eVar5;
                                                                        while (true) {
                                                                            if (!it6.hasNext()) {
                                                                                map7 = map6;
                                                                                it7 = it5;
                                                                                r29 = r13;
                                                                                j12 = j11;
                                                                                break;
                                                                            }
                                                                            map7 = map6;
                                                                            com.google.android.gms.internal.measurement.zzff zzffVar11 = (com.google.android.gms.internal.measurement.zzff) it6.next();
                                                                            it7 = it5;
                                                                            r210 = r13;
                                                                            zzaaVar = new zzaa(this, this.f12612d, iIntValue, zzffVar11);
                                                                            Long l110 = this.f12615g;
                                                                            Long l111 = this.f12616h;
                                                                            iZ = zzffVar11.z();
                                                                            zzyVar = (zzy) this.f12614f.get(num2);
                                                                            if (zzyVar == null) {
                                                                                z16 = false;
                                                                            } else {
                                                                                z16 = zzyVar.f13678d.get(iZ);
                                                                            }
                                                                            j12 = j11;
                                                                            zG = zzaaVar.g(l110, l111, zzhsVarA, j12, zzbdVar, z16);
                                                                            if (!zG) {
                                                                                this.f12613e.add(num2);
                                                                                z15 = zG;
                                                                                r29 = r210;
                                                                                break;
                                                                            }
                                                                            l(num2).a(zzaaVar);
                                                                            z15 = zG;
                                                                            j11 = j12;
                                                                            map6 = map7;
                                                                            it5 = it7;
                                                                            r13 = r210;
                                                                        }
                                                                        if (!z15) {
                                                                            this.f12613e.add(num2);
                                                                        }
                                                                        j11 = j12;
                                                                        map6 = map7;
                                                                        it5 = it7;
                                                                        eVar5 = r29;
                                                                    }
                                                                }
                                                                it4 = it4;
                                                                str13 = str27;
                                                                zzpgVar3 = zzpgVar;
                                                                zzzVar = zzzVar;
                                                            }
                                                        }
                                                    }
                                                }
                                                zzpgVar2 = zzpgVar3;
                                                if (!z11) {
                                                    return new ArrayList();
                                                }
                                                if (!list2.isEmpty()) {
                                                    eVar7 = new e();
                                                    it8 = list2.iterator();
                                                    while (it8.hasNext()) {
                                                        com.google.android.gms.internal.measurement.zziu zziuVar4 = (com.google.android.gms.internal.measurement.zziu) it8.next();
                                                        strA = zziuVar4.A();
                                                        map8 = (Map) eVar7.get(strA);
                                                        if (map8 == null) {
                                                            zzaw zzawVarH12 = zzpgVar2.h0();
                                                            zzicVar4 = zzawVarH12.f13202a;
                                                            str12 = this.f12612d;
                                                            zzawVarH12.h();
                                                            zzawVarH12.g();
                                                            Preconditions.d(str12);
                                                            Preconditions.d(strA);
                                                            eVar8 = new e();
                                                            cursorQuery3 = zzawVarH12.X().query("property_filters", new String[]{str5, str7}, "app_id=? AND property_name=?", new String[]{str12, strA}, null, null, null);
                                                            if (cursorQuery3.moveToFirst()) {
                                                                while (true) {
                                                                    com.google.android.gms.internal.measurement.zzfn zzfnVar5 = (com.google.android.gms.internal.measurement.zzfn) ((com.google.android.gms.internal.measurement.zzfm) zzpk.R(com.google.android.gms.internal.measurement.zzfn.G(), cursorQuery3.getBlob(1))).p();
                                                                    numValueOf6 = Integer.valueOf(cursorQuery3.getInt(0));
                                                                    list6 = (List) eVar8.get(numValueOf6);
                                                                    if (list6 == null) {
                                                                        it9 = it8;
                                                                        arrayList4 = new ArrayList();
                                                                        eVar8.put(numValueOf6, arrayList4);
                                                                    } else {
                                                                        it9 = it8;
                                                                        arrayList4 = list6;
                                                                    }
                                                                    arrayList4.add(zzfnVar5);
                                                                    if (!cursorQuery3.moveToNext()) {
                                                                        break;
                                                                        break;
                                                                    }
                                                                    it8 = it9;
                                                                    zzicVar4 = zzicVar4;
                                                                }
                                                                cursorQuery3.close();
                                                                map8 = eVar8;
                                                            } else {
                                                                it9 = it8;
                                                                map8 = Collections.EMPTY_MAP;
                                                                cursorQuery3.close();
                                                            }
                                                            eVar7.put(strA, map8);
                                                        } else {
                                                            it9 = it8;
                                                        }
                                                        while (r4.hasNext()) {
                                                            int iIntValue9 = num5.intValue();
                                                            if (this.f12613e.contains(num5)) {
                                                                zzicVar.b().n().b(num5, str8);
                                                                break;
                                                                break;
                                                            }
                                                            it10 = ((List) map8.get(num5)).iterator();
                                                            zG2 = true;
                                                            while (true) {
                                                                if (it10.hasNext()) {
                                                                    zzfnVar = (com.google.android.gms.internal.measurement.zzfn) it10.next();
                                                                    if (Log.isLoggable(zzicVar.b().q(), 2)) {
                                                                        zzgs zzgsVarN5 = zzicVar.b().n();
                                                                        if (zzfnVar.y()) {
                                                                            numValueOf5 = Integer.valueOf(zzfnVar.z());
                                                                        } else {
                                                                            numValueOf5 = null;
                                                                        }
                                                                        zzgsVarN5.d("Evaluating filter. audience, filter, property", num5, numValueOf5, zzicVar.n().c(zzfnVar.A()));
                                                                        zzicVar.b().n().b(zzpgVar2.k0().I(zzfnVar), "Filter definition");
                                                                    }
                                                                    if (zzfnVar.y()) {
                                                                    }
                                                                    zzgs zzgsVarL5 = zzicVar.b().l();
                                                                    Object objO6 = zzgu.o(this.f12612d);
                                                                    if (zzfnVar.y()) {
                                                                        numValueOf4 = Integer.valueOf(zzfnVar.z());
                                                                    } else {
                                                                        numValueOf4 = null;
                                                                    }
                                                                    zzgsVarL5.c(objO6, String.valueOf(numValueOf4), "Invalid property filter ID. appId, id");
                                                                    this.f12613e.add(num5);
                                                                    map8 = map8;
                                                                    str8 = str8;
                                                                } else {
                                                                    map8 = map8;
                                                                    str8 = str8;
                                                                }
                                                                if (!zG2) {
                                                                    this.f12613e.add(num5);
                                                                }
                                                                map8 = map8;
                                                                str8 = str8;
                                                                l(num5).a(zzacVar);
                                                                map8 = map8;
                                                                str8 = str8;
                                                            }
                                                        }
                                                        it8 = it9;
                                                    }
                                                }
                                                arrayList3 = new ArrayList();
                                                b<Integer> bVar4 = (b) this.f12614f.keySet();
                                                bVar4.removeAll(this.f12613e);
                                                while (r3.hasNext()) {
                                                    int iIntValue10 = num6.intValue();
                                                    zzy zzyVar5 = (zzy) this.f12614f.get(num6);
                                                    Preconditions.g(zzyVar5);
                                                    com.google.android.gms.internal.measurement.zzhg zzhgVarB4 = zzyVar5.b(iIntValue10);
                                                    arrayList3.add(zzhgVarB4);
                                                    zzawVarH1 = zzpgVar2.h0();
                                                    zzicVar3 = zzawVarH1.f13202a;
                                                    str11 = this.f12612d;
                                                    com.google.android.gms.internal.measurement.zzii zziiVarA4 = zzhgVarB4.A();
                                                    zzawVarH1.h();
                                                    zzawVarH1.g();
                                                    Preconditions.d(str11);
                                                    Preconditions.g(zziiVarA4);
                                                    byte[] bArrB4 = zziiVarA4.b();
                                                    contentValues = new ContentValues();
                                                    contentValues.put("app_id", str11);
                                                    contentValues.put(str5, num6);
                                                    contentValues.put("current_results", bArrB4);
                                                    if (zzawVarH1.X().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                                        zzicVar3.b().k().b(zzgu.o(str11), "Failed to insert filter results (got -1). appId");
                                                    }
                                                }
                                                return arrayList3;
                                            }
                                        }
                                        r112.close();
                                        map = eVar10;
                                    } else {
                                        str2 = "data";
                                        Query.close();
                                    }
                                } catch (Throwable th12) {
                                    th = th12;
                                    r110 = Query;
                                }
                            } catch (SQLiteException e33) {
                                e = e33;
                                str2 = "data";
                            }
                        } catch (SQLiteException e34) {
                            e = e34;
                            str2 = "data";
                            r15 = 0;
                        } catch (Throwable th13) {
                            th = th13;
                            r15 = 0;
                        }
                        zzaw zzawVarH13 = zzpgVar3.h0();
                        obj = zzawVarH13.f13202a;
                        r9 = this.f12612d;
                        zzawVarH13.h();
                        zzawVarH13.g();
                        Preconditions.d(r9);
                        cursorQuery = zzawVarH13.X().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{r9}, null, null, null);
                        if (cursorQuery.moveToFirst()) {
                            Map map18 = Collections.EMPTY_MAP;
                            cursorQuery.close();
                            map2 = map18;
                            str3 = "Failed to merge filter. appId";
                            obj2 = "Database error querying filters. appId";
                            obj = obj;
                            r9 = r9;
                        } else {
                            eVar9 = new e();
                            r18 = obj;
                            r22 = r9;
                            while (true) {
                                i12 = cursorQuery.getInt(0);
                                com.google.android.gms.internal.measurement.zzii zziiVar13 = (com.google.android.gms.internal.measurement.zzii) ((com.google.android.gms.internal.measurement.zzih) zzpk.R(com.google.android.gms.internal.measurement.zzii.G(), cursorQuery.getBlob(1))).p();
                                Object objValueOf2 = Integer.valueOf(i12);
                                eVar9.put(objValueOf2, zziiVar13);
                                str3 = str15;
                                obj2 = objO;
                                obj3 = objValueOf2;
                                r14 = r22;
                                if (!cursorQuery.moveToNext()) {
                                    break;
                                    break;
                                }
                                str15 = str3;
                                objO = obj2;
                                r22 = r22;
                            }
                            cursorQuery.close();
                            obj = obj3;
                            r9 = r14;
                            map2 = eVar9;
                        }
                        if (map2.isEmpty()) {
                            str5 = "audience_id";
                            zzicVar = zzicVar5;
                        } else {
                            HashSet<Integer> hashSet4 = new HashSet(map2.keySet());
                            if (z13) {
                                String str115 = this.f12612d;
                                zzawVarH0 = zzpgVar3.h0();
                                str6 = this.f12612d;
                                zzawVarH0.h();
                                zzawVarH0.g();
                                Preconditions.d(str6);
                                eVar3 = new e();
                                cursorRawQuery = zzawVarH0.X().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str6, str6});
                                if (cursorRawQuery.moveToFirst()) {
                                    do {
                                        numValueOf2 = Integer.valueOf(cursorRawQuery.getInt(0));
                                        arrayList = (List) eVar3.get(numValueOf2);
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                            eVar3.put(numValueOf2, arrayList);
                                        }
                                        arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                    } while (cursorRawQuery.moveToNext());
                                } else {
                                    eVar3 = Collections.EMPTY_MAP;
                                }
                                cursorRawQuery.close();
                                r12 = eVar3;
                                Preconditions.d(str115);
                                eVar4 = new e();
                                if (!map2.isEmpty()) {
                                    it2 = map2.keySet().iterator();
                                    while (it2.hasNext()) {
                                        num = (Integer) it2.next();
                                        num.getClass();
                                        zziiVar3 = (com.google.android.gms.internal.measurement.zzii) map2.get(num);
                                        list4 = (List) r12.get(num);
                                        if (list4 != null || list4.isEmpty()) {
                                            r19 = r12;
                                            it3 = it2;
                                            zzicVar2 = zzicVar5;
                                            eVar4.put(num, zziiVar3);
                                            r12 = r19;
                                            str16 = str16;
                                            it2 = it3;
                                            zzicVar5 = zzicVar2;
                                        } else {
                                            ?? r115 = r12;
                                            it3 = it2;
                                            List listN = zzpgVar3.k0().N((zzaee) zziiVar3.A(), list4);
                                            if (listN.isEmpty()) {
                                                r12 = r115;
                                                it2 = it3;
                                            } else {
                                                com.google.android.gms.internal.measurement.zzih zzihVar = (com.google.android.gms.internal.measurement.zzih) zziiVar3.q();
                                                zzihVar.t();
                                                zzihVar.m();
                                                ((com.google.android.gms.internal.measurement.zzii) zzihVar.f11266b).K(listN);
                                                List listN2 = zzpgVar3.k0().N((zzaee) zziiVar3.y(), list4);
                                                zzihVar.s();
                                                zzihVar.m();
                                                ((com.google.android.gms.internal.measurement.zzii) zzihVar.f11266b).I(listN2);
                                                ArrayList arrayList6 = new ArrayList();
                                                Iterator it12 = zziiVar3.C().iterator();
                                                while (it12.hasNext()) {
                                                    Iterator it13 = it12;
                                                    com.google.android.gms.internal.measurement.zzhq zzhqVar2 = (com.google.android.gms.internal.measurement.zzhq) it12.next();
                                                    zzic zzicVar11 = zzicVar5;
                                                    if (!list4.contains(Integer.valueOf(zzhqVar2.z()))) {
                                                        arrayList6.add(zzhqVar2);
                                                    }
                                                    it12 = it13;
                                                    zzicVar5 = zzicVar11;
                                                }
                                                zzicVar2 = zzicVar5;
                                                zzihVar.u();
                                                zzihVar.m();
                                                ((com.google.android.gms.internal.measurement.zzii) zzihVar.f11266b).M(arrayList6);
                                                ArrayList arrayList7 = new ArrayList();
                                                for (com.google.android.gms.internal.measurement.zzik zzikVar2 : zziiVar3.E()) {
                                                    if (!list4.contains(Integer.valueOf(zzikVar2.z()))) {
                                                        arrayList7.add(zzikVar2);
                                                    }
                                                }
                                                zzihVar.v();
                                                zzihVar.m();
                                                ((com.google.android.gms.internal.measurement.zzii) zzihVar.f11266b).O(arrayList7);
                                                eVar4.put(num, (com.google.android.gms.internal.measurement.zzii) zzihVar.p());
                                                r19 = r115;
                                                r12 = r19;
                                                str16 = str16;
                                                it2 = it3;
                                                zzicVar5 = zzicVar2;
                                            }
                                        }
                                    }
                                }
                                str4 = str16;
                                zzicVar = zzicVar5;
                                map3 = eVar4;
                            } else {
                                str4 = "audience_id";
                                zzicVar = zzicVar5;
                                map3 = map2;
                            }
                            map5 = map2;
                            map4 = map3;
                            while (r16.hasNext()) {
                                num3.getClass();
                                zziiVar = (com.google.android.gms.internal.measurement.zzii) map4.get(num3);
                                bitSet = new BitSet();
                                bitSet2 = new BitSet();
                                eVar = new e();
                                if (zziiVar != null && zziiVar.D() != 0) {
                                    while (r3.hasNext()) {
                                        if (zzhqVar.y()) {
                                            com.google.android.gms.internal.measurement.zzii zziiVar14 = zziiVar;
                                            Integer numValueOf13 = Integer.valueOf(zzhqVar.z());
                                            if (zzhqVar.A()) {
                                                lValueOf = Long.valueOf(zzhqVar.B());
                                            } else {
                                                lValueOf = null;
                                            }
                                            eVar.put(numValueOf13, lValueOf);
                                            zziiVar = zziiVar14;
                                        }
                                    }
                                }
                                zziiVar2 = zziiVar;
                                eVar2 = new e();
                                if (zziiVar2 != null && zziiVar2.F() != 0) {
                                    it = zziiVar2.E().iterator();
                                    while (it.hasNext()) {
                                        zzikVar = (com.google.android.gms.internal.measurement.zzik) it.next();
                                        if (!zzikVar.y() && zzikVar.B() > 0) {
                                            eVar2.put(Integer.valueOf(zzikVar.z()), Long.valueOf(zzikVar.C(zzikVar.B() - 1)));
                                            it = it;
                                            map4 = map4;
                                        }
                                    }
                                }
                                Map map19 = map4;
                                if (zziiVar2 != null) {
                                    i11 = 0;
                                    while (i11 < zziiVar2.z() * 64) {
                                        if (zzpk.L((zzaee) zziiVar2.y(), i11)) {
                                            z14 = zR;
                                            zzicVar.b().n().c(num3, Integer.valueOf(i11), "Filter already evaluated. audience ID, filter ID");
                                            bitSet2.set(i11);
                                            if (zzpk.L((zzaee) zziiVar2.A(), i11)) {
                                                bitSet.set(i11);
                                            }
                                            i11++;
                                            zR = z14;
                                        } else {
                                            z14 = zR;
                                        }
                                        eVar.remove(Integer.valueOf(i11));
                                        i11++;
                                        zR = z14;
                                    }
                                }
                                boolean z111 = zR;
                                com.google.android.gms.internal.measurement.zzii zziiVar15 = (com.google.android.gms.internal.measurement.zzii) map5.get(num3);
                                if (zR2 && z111 && (list3 = (List) map.get(num3)) != null && this.f12616h != null && this.f12615g != null) {
                                    while (r2.hasNext()) {
                                        int iZ6 = zzffVar2.z();
                                        Integer num10 = num3;
                                        jLongValue = this.f12616h.longValue() / 1000;
                                        if (zzffVar2.H()) {
                                            jLongValue = this.f12615g.longValue() / 1000;
                                        }
                                        numValueOf = Integer.valueOf(iZ6);
                                        if (eVar.containsKey(numValueOf)) {
                                            eVar.put(numValueOf, Long.valueOf(jLongValue));
                                        }
                                        if (eVar2.containsKey(numValueOf)) {
                                            eVar2.put(numValueOf, Long.valueOf(jLongValue));
                                        }
                                        num3 = num10;
                                    }
                                }
                                String str116 = str3;
                                this.f12614f.put(num3, new zzy(this, this.f12612d, zziiVar15, bitSet, bitSet2, eVar, eVar2));
                                map = map;
                                zR = z111;
                                str2 = str2;
                                map5 = map5;
                                str4 = str4;
                                zR2 = zR2;
                                str3 = str116;
                                map4 = map19;
                            }
                            str5 = str4;
                        }
                        str7 = str2;
                        String str28 = str3;
                        ?? r116 = obj2;
                        str8 = "Skipping failed audience ID";
                        if (!list.isEmpty()) {
                            zzzVar = new zzz(this);
                            eVar5 = new e();
                            it4 = list.iterator();
                            while (it4.hasNext()) {
                                zzhsVar = (com.google.android.gms.internal.measurement.zzhs) it4.next();
                                zzhsVarA = zzzVar.a(zzhsVar, this.f12612d);
                                if (zzhsVarA != null) {
                                    zzbdVarQ = zzpgVar3.h0().Q(this.f12612d, zzhsVar, zzhsVarA.D());
                                    zzpgVar3.h0().H(str13, zzbdVarQ);
                                    if (!z11) {
                                        String str29 = str13;
                                        zzpgVar = zzpgVar3;
                                        j11 = zzbdVarQ.f12691c;
                                        strD = zzhsVarA.D();
                                        map6 = (Map) eVar5.get(strD);
                                        if (map6 == null) {
                                            zzaw zzawVarH14 = zzpgVar.h0();
                                            zzic zzicVar12 = zzawVarH14.f13202a;
                                            str9 = this.f12612d;
                                            zzawVarH14.h();
                                            zzawVarH14.g();
                                            Preconditions.d(str9);
                                            Preconditions.d(strD);
                                            eVar6 = new e();
                                            str10 = str9;
                                            cursorQuery2 = zzawVarH14.X().query("event_filters", new String[]{str5, str7}, "app_id=? AND event_name=?", new String[]{str9, strD}, null, null, null);
                                            if (cursorQuery2.moveToFirst()) {
                                                zzbdVar = zzbdVarQ;
                                                while (true) {
                                                    com.google.android.gms.internal.measurement.zzff zzffVar12 = (com.google.android.gms.internal.measurement.zzff) ((com.google.android.gms.internal.measurement.zzfe) zzpk.R(com.google.android.gms.internal.measurement.zzff.K(), cursorQuery2.getBlob(1))).p();
                                                    numValueOf3 = Integer.valueOf(cursorQuery2.getInt(0));
                                                    list5 = (List) eVar6.get(numValueOf3);
                                                    if (list5 == null) {
                                                        cursor2 = cursorQuery2;
                                                        arrayList2 = new ArrayList();
                                                        eVar6.put(numValueOf3, arrayList2);
                                                    } else {
                                                        cursor2 = cursorQuery2;
                                                        arrayList2 = list5;
                                                    }
                                                    arrayList2.add(zzffVar12);
                                                    if (!cursor2.moveToNext()) {
                                                        break;
                                                        break;
                                                    }
                                                    cursorQuery2 = cursor2;
                                                }
                                                cursor2.close();
                                                map6 = eVar6;
                                            } else {
                                                cursor2 = cursorQuery2;
                                                zzbdVar = zzbdVarQ;
                                                map6 = Collections.EMPTY_MAP;
                                                cursor2.close();
                                            }
                                            eVar5.put(strD, map6);
                                        } else {
                                            zzbdVar = zzbdVarQ;
                                        }
                                        it5 = map6.keySet().iterator();
                                        while (it5.hasNext()) {
                                            num2 = (Integer) it5.next();
                                            iIntValue = num2.intValue();
                                            if (this.f12613e.contains(num2)) {
                                                zzicVar.b().n().b(num2, "Skipping failed audience ID");
                                            } else {
                                                it6 = ((List) map6.get(num2)).iterator();
                                                z15 = true;
                                                r13 = eVar5;
                                                while (true) {
                                                    if (!it6.hasNext()) {
                                                        map7 = map6;
                                                        it7 = it5;
                                                        r29 = r13;
                                                        j12 = j11;
                                                        break;
                                                    }
                                                    map7 = map6;
                                                    com.google.android.gms.internal.measurement.zzff zzffVar13 = (com.google.android.gms.internal.measurement.zzff) it6.next();
                                                    it7 = it5;
                                                    r210 = r13;
                                                    zzaaVar = new zzaa(this, this.f12612d, iIntValue, zzffVar13);
                                                    Long l112 = this.f12615g;
                                                    Long l113 = this.f12616h;
                                                    iZ = zzffVar13.z();
                                                    zzyVar = (zzy) this.f12614f.get(num2);
                                                    if (zzyVar == null) {
                                                        z16 = false;
                                                    } else {
                                                        z16 = zzyVar.f13678d.get(iZ);
                                                    }
                                                    j12 = j11;
                                                    zG = zzaaVar.g(l112, l113, zzhsVarA, j12, zzbdVar, z16);
                                                    if (!zG) {
                                                        this.f12613e.add(num2);
                                                        z15 = zG;
                                                        r29 = r210;
                                                        break;
                                                    }
                                                    l(num2).a(zzaaVar);
                                                    z15 = zG;
                                                    j11 = j12;
                                                    map6 = map7;
                                                    it5 = it7;
                                                    r13 = r210;
                                                }
                                                if (!z15) {
                                                    this.f12613e.add(num2);
                                                }
                                                j11 = j12;
                                                map6 = map7;
                                                it5 = it7;
                                                eVar5 = r29;
                                            }
                                        }
                                        it4 = it4;
                                        str13 = str29;
                                        zzpgVar3 = zzpgVar;
                                        zzzVar = zzzVar;
                                    }
                                }
                            }
                        }
                        zzpgVar2 = zzpgVar3;
                        if (!z11) {
                            return new ArrayList();
                        }
                        if (!list2.isEmpty()) {
                            eVar7 = new e();
                            it8 = list2.iterator();
                            while (it8.hasNext()) {
                                com.google.android.gms.internal.measurement.zziu zziuVar5 = (com.google.android.gms.internal.measurement.zziu) it8.next();
                                strA = zziuVar5.A();
                                map8 = (Map) eVar7.get(strA);
                                if (map8 == null) {
                                    zzaw zzawVarH15 = zzpgVar2.h0();
                                    zzicVar4 = zzawVarH15.f13202a;
                                    str12 = this.f12612d;
                                    zzawVarH15.h();
                                    zzawVarH15.g();
                                    Preconditions.d(str12);
                                    Preconditions.d(strA);
                                    eVar8 = new e();
                                    cursorQuery3 = zzawVarH15.X().query("property_filters", new String[]{str5, str7}, "app_id=? AND property_name=?", new String[]{str12, strA}, null, null, null);
                                    if (cursorQuery3.moveToFirst()) {
                                        while (true) {
                                            com.google.android.gms.internal.measurement.zzfn zzfnVar6 = (com.google.android.gms.internal.measurement.zzfn) ((com.google.android.gms.internal.measurement.zzfm) zzpk.R(com.google.android.gms.internal.measurement.zzfn.G(), cursorQuery3.getBlob(1))).p();
                                            numValueOf6 = Integer.valueOf(cursorQuery3.getInt(0));
                                            list6 = (List) eVar8.get(numValueOf6);
                                            if (list6 == null) {
                                                it9 = it8;
                                                arrayList4 = new ArrayList();
                                                eVar8.put(numValueOf6, arrayList4);
                                            } else {
                                                it9 = it8;
                                                arrayList4 = list6;
                                            }
                                            arrayList4.add(zzfnVar6);
                                            if (!cursorQuery3.moveToNext()) {
                                                break;
                                                break;
                                            }
                                            it8 = it9;
                                            zzicVar4 = zzicVar4;
                                        }
                                        cursorQuery3.close();
                                        map8 = eVar8;
                                    } else {
                                        it9 = it8;
                                        map8 = Collections.EMPTY_MAP;
                                        cursorQuery3.close();
                                    }
                                    eVar7.put(strA, map8);
                                } else {
                                    it9 = it8;
                                }
                                while (r4.hasNext()) {
                                    int iIntValue11 = num5.intValue();
                                    if (this.f12613e.contains(num5)) {
                                        zzicVar.b().n().b(num5, str8);
                                        break;
                                        break;
                                    }
                                    it10 = ((List) map8.get(num5)).iterator();
                                    zG2 = true;
                                    while (true) {
                                        if (it10.hasNext()) {
                                            zzfnVar = (com.google.android.gms.internal.measurement.zzfn) it10.next();
                                            if (Log.isLoggable(zzicVar.b().q(), 2)) {
                                                zzgs zzgsVarN6 = zzicVar.b().n();
                                                if (zzfnVar.y()) {
                                                    numValueOf5 = Integer.valueOf(zzfnVar.z());
                                                } else {
                                                    numValueOf5 = null;
                                                }
                                                zzgsVarN6.d("Evaluating filter. audience, filter, property", num5, numValueOf5, zzicVar.n().c(zzfnVar.A()));
                                                zzicVar.b().n().b(zzpgVar2.k0().I(zzfnVar), "Filter definition");
                                            }
                                            if (zzfnVar.y() || zzfnVar.z() > 256) {
                                                zzgs zzgsVarL6 = zzicVar.b().l();
                                                Object objO7 = zzgu.o(this.f12612d);
                                                if (zzfnVar.y()) {
                                                    numValueOf4 = Integer.valueOf(zzfnVar.z());
                                                } else {
                                                    numValueOf4 = null;
                                                }
                                                zzgsVarL6.c(objO7, String.valueOf(numValueOf4), "Invalid property filter ID. appId, id");
                                                this.f12613e.add(num5);
                                                map8 = map8;
                                                str8 = str8;
                                            } else {
                                                zzacVar = new zzac(this, this.f12612d, iIntValue11, zzfnVar);
                                                Long l21 = this.f12615g;
                                                Long l22 = this.f12616h;
                                                int iZ7 = zzfnVar.z();
                                                zzy zzyVar6 = (zzy) this.f12614f.get(num5);
                                                zG2 = zzacVar.g(l21, l22, zziuVar5, zzyVar6 == null ? false : zzyVar6.f13678d.get(iZ7));
                                                if (zG2) {
                                                    l(num5).a(zzacVar);
                                                    map8 = map8;
                                                    str8 = str8;
                                                } else {
                                                    this.f12613e.add(num5);
                                                }
                                            }
                                        } else {
                                            map8 = map8;
                                            str8 = str8;
                                        }
                                        if (!zG2) {
                                            this.f12613e.add(num5);
                                        }
                                        map8 = map8;
                                        str8 = str8;
                                    }
                                }
                                it8 = it9;
                            }
                        }
                        arrayList3 = new ArrayList();
                        b<Integer> bVar5 = (b) this.f12614f.keySet();
                        bVar5.removeAll(this.f12613e);
                        while (r3.hasNext()) {
                            int iIntValue12 = num6.intValue();
                            zzy zzyVar7 = (zzy) this.f12614f.get(num6);
                            Preconditions.g(zzyVar7);
                            com.google.android.gms.internal.measurement.zzhg zzhgVarB5 = zzyVar7.b(iIntValue12);
                            arrayList3.add(zzhgVarB5);
                            zzawVarH1 = zzpgVar2.h0();
                            zzicVar3 = zzawVarH1.f13202a;
                            str11 = this.f12612d;
                            com.google.android.gms.internal.measurement.zzii zziiVarA5 = zzhgVarB5.A();
                            zzawVarH1.h();
                            zzawVarH1.g();
                            Preconditions.d(str11);
                            Preconditions.g(zziiVarA5);
                            byte[] bArrB5 = zziiVarA5.b();
                            contentValues = new ContentValues();
                            contentValues.put("app_id", str11);
                            contentValues.put(str5, num6);
                            contentValues.put("current_results", bArrB5);
                            if (zzawVarH1.X().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                zzicVar3.b().k().b(zzgu.o(str11), "Failed to insert filter results (got -1). appId");
                            }
                        }
                        return arrayList3;
                    }
                    z13 = z12;
                    str2 = "data";
                    if (cursorQuery.moveToFirst()) {
                        Map map110 = Collections.EMPTY_MAP;
                        cursorQuery.close();
                        map2 = map110;
                        str3 = "Failed to merge filter. appId";
                        obj2 = "Database error querying filters. appId";
                        obj = obj;
                        r9 = r9;
                    } else {
                        eVar9 = new e();
                        r18 = obj;
                        r22 = r9;
                        while (true) {
                            i12 = cursorQuery.getInt(0);
                            com.google.android.gms.internal.measurement.zzii zziiVar16 = (com.google.android.gms.internal.measurement.zzii) ((com.google.android.gms.internal.measurement.zzih) zzpk.R(com.google.android.gms.internal.measurement.zzii.G(), cursorQuery.getBlob(1))).p();
                            Object objValueOf3 = Integer.valueOf(i12);
                            eVar9.put(objValueOf3, zziiVar16);
                            str3 = str15;
                            obj2 = objO;
                            obj3 = objValueOf3;
                            r14 = r22;
                            if (!cursorQuery.moveToNext()) {
                                break;
                                break;
                            }
                            str15 = str3;
                            objO = obj2;
                            r22 = r22;
                        }
                        cursorQuery.close();
                        obj = obj3;
                        r9 = r14;
                        map2 = eVar9;
                    }
                } catch (SQLiteException e35) {
                    e = e35;
                    r18 = obj;
                    r22 = r9;
                }
            } catch (Throwable th14) {
                th = th14;
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                throw th;
            }
            cursorQuery = zzawVarH13.X().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{r9}, null, null, null);
        } catch (SQLiteException e36) {
            e = e36;
            r18 = obj;
            str3 = "Failed to merge filter. appId";
            obj2 = "Database error querying filters. appId";
            r22 = r9;
            cursorQuery = null;
        } catch (Throwable th15) {
            th = th15;
            cursorQuery = null;
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
        map = map9;
        zzaw zzawVarH16 = zzpgVar3.h0();
        obj = zzawVarH16.f13202a;
        r9 = this.f12612d;
        zzawVarH16.h();
        zzawVarH16.g();
        Preconditions.d(r9);
        if (map2.isEmpty()) {
            str5 = "audience_id";
            zzicVar = zzicVar5;
        } else {
            HashSet<Integer> hashSet5 = new HashSet(map2.keySet());
            if (z13) {
                String str117 = this.f12612d;
                zzawVarH0 = zzpgVar3.h0();
                str6 = this.f12612d;
                zzawVarH0.h();
                zzawVarH0.g();
                Preconditions.d(str6);
                eVar3 = new e();
                cursorRawQuery = zzawVarH0.X().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str6, str6});
                if (cursorRawQuery.moveToFirst()) {
                    do {
                        numValueOf2 = Integer.valueOf(cursorRawQuery.getInt(0));
                        arrayList = (List) eVar3.get(numValueOf2);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            eVar3.put(numValueOf2, arrayList);
                        }
                        arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                    } while (cursorRawQuery.moveToNext());
                } else {
                    eVar3 = Collections.EMPTY_MAP;
                }
                cursorRawQuery.close();
                r12 = eVar3;
                Preconditions.d(str117);
                eVar4 = new e();
                if (!map2.isEmpty()) {
                    it2 = map2.keySet().iterator();
                    while (it2.hasNext()) {
                        num = (Integer) it2.next();
                        num.getClass();
                        zziiVar3 = (com.google.android.gms.internal.measurement.zzii) map2.get(num);
                        list4 = (List) r12.get(num);
                        if (list4 != null) {
                        }
                        r19 = r12;
                        it3 = it2;
                        zzicVar2 = zzicVar5;
                        eVar4.put(num, zziiVar3);
                        r12 = r19;
                        str16 = str16;
                        it2 = it3;
                        zzicVar5 = zzicVar2;
                    }
                }
                str4 = str16;
                zzicVar = zzicVar5;
                map3 = eVar4;
            } else {
                str4 = "audience_id";
                zzicVar = zzicVar5;
                map3 = map2;
            }
            map5 = map2;
            map4 = map3;
            while (r16.hasNext()) {
                num3.getClass();
                zziiVar = (com.google.android.gms.internal.measurement.zzii) map4.get(num3);
                bitSet = new BitSet();
                bitSet2 = new BitSet();
                eVar = new e();
                if (zziiVar != null) {
                    while (r3.hasNext()) {
                        if (zzhqVar.y()) {
                            com.google.android.gms.internal.measurement.zzii zziiVar17 = zziiVar;
                            Integer numValueOf14 = Integer.valueOf(zzhqVar.z());
                            if (zzhqVar.A()) {
                                lValueOf = Long.valueOf(zzhqVar.B());
                            } else {
                                lValueOf = null;
                            }
                            eVar.put(numValueOf14, lValueOf);
                            zziiVar = zziiVar17;
                        }
                    }
                }
                zziiVar2 = zziiVar;
                eVar2 = new e();
                if (zziiVar2 != null) {
                    it = zziiVar2.E().iterator();
                    while (it.hasNext()) {
                        zzikVar = (com.google.android.gms.internal.measurement.zzik) it.next();
                        if (!zzikVar.y()) {
                        }
                    }
                }
                Map map111 = map4;
                if (zziiVar2 != null) {
                    i11 = 0;
                    while (i11 < zziiVar2.z() * 64) {
                        if (zzpk.L((zzaee) zziiVar2.y(), i11)) {
                            z14 = zR;
                            zzicVar.b().n().c(num3, Integer.valueOf(i11), "Filter already evaluated. audience ID, filter ID");
                            bitSet2.set(i11);
                            if (zzpk.L((zzaee) zziiVar2.A(), i11)) {
                                bitSet.set(i11);
                            }
                            i11++;
                            zR = z14;
                        } else {
                            z14 = zR;
                        }
                        eVar.remove(Integer.valueOf(i11));
                        i11++;
                        zR = z14;
                    }
                }
                boolean z112 = zR;
                com.google.android.gms.internal.measurement.zzii zziiVar18 = (com.google.android.gms.internal.measurement.zzii) map5.get(num3);
                if (zR2) {
                    while (r2.hasNext()) {
                        int iZ8 = zzffVar2.z();
                        Integer num11 = num3;
                        jLongValue = this.f12616h.longValue() / 1000;
                        if (zzffVar2.H()) {
                            jLongValue = this.f12615g.longValue() / 1000;
                        }
                        numValueOf = Integer.valueOf(iZ8);
                        if (eVar.containsKey(numValueOf)) {
                            eVar.put(numValueOf, Long.valueOf(jLongValue));
                        }
                        if (eVar2.containsKey(numValueOf)) {
                            eVar2.put(numValueOf, Long.valueOf(jLongValue));
                        }
                        num3 = num11;
                    }
                }
                String str118 = str3;
                this.f12614f.put(num3, new zzy(this, this.f12612d, zziiVar18, bitSet, bitSet2, eVar, eVar2));
                map = map;
                zR = z112;
                str2 = str2;
                map5 = map5;
                str4 = str4;
                zR2 = zR2;
                str3 = str118;
                map4 = map111;
            }
            str5 = str4;
        }
        str7 = str2;
        String str210 = str3;
        ?? r117 = obj2;
        str8 = "Skipping failed audience ID";
        if (!list.isEmpty()) {
            zzzVar = new zzz(this);
            eVar5 = new e();
            it4 = list.iterator();
            while (it4.hasNext()) {
                zzhsVar = (com.google.android.gms.internal.measurement.zzhs) it4.next();
                zzhsVarA = zzzVar.a(zzhsVar, this.f12612d);
                if (zzhsVarA != null) {
                    zzbdVarQ = zzpgVar3.h0().Q(this.f12612d, zzhsVar, zzhsVarA.D());
                    zzpgVar3.h0().H(str13, zzbdVarQ);
                    if (!z11) {
                        String str211 = str13;
                        zzpgVar = zzpgVar3;
                        j11 = zzbdVarQ.f12691c;
                        strD = zzhsVarA.D();
                        map6 = (Map) eVar5.get(strD);
                        if (map6 == null) {
                            zzaw zzawVarH17 = zzpgVar.h0();
                            zzic zzicVar13 = zzawVarH17.f13202a;
                            str9 = this.f12612d;
                            zzawVarH17.h();
                            zzawVarH17.g();
                            Preconditions.d(str9);
                            Preconditions.d(strD);
                            eVar6 = new e();
                            str10 = str9;
                            cursorQuery2 = zzawVarH17.X().query("event_filters", new String[]{str5, str7}, "app_id=? AND event_name=?", new String[]{str9, strD}, null, null, null);
                            if (cursorQuery2.moveToFirst()) {
                                zzbdVar = zzbdVarQ;
                                while (true) {
                                    com.google.android.gms.internal.measurement.zzff zzffVar14 = (com.google.android.gms.internal.measurement.zzff) ((com.google.android.gms.internal.measurement.zzfe) zzpk.R(com.google.android.gms.internal.measurement.zzff.K(), cursorQuery2.getBlob(1))).p();
                                    numValueOf3 = Integer.valueOf(cursorQuery2.getInt(0));
                                    list5 = (List) eVar6.get(numValueOf3);
                                    if (list5 == null) {
                                        cursor2 = cursorQuery2;
                                        arrayList2 = new ArrayList();
                                        eVar6.put(numValueOf3, arrayList2);
                                    } else {
                                        cursor2 = cursorQuery2;
                                        arrayList2 = list5;
                                    }
                                    arrayList2.add(zzffVar14);
                                    if (!cursor2.moveToNext()) {
                                        break;
                                        break;
                                    }
                                    cursorQuery2 = cursor2;
                                }
                                cursor2.close();
                                map6 = eVar6;
                            } else {
                                cursor2 = cursorQuery2;
                                zzbdVar = zzbdVarQ;
                                map6 = Collections.EMPTY_MAP;
                                cursor2.close();
                            }
                            eVar5.put(strD, map6);
                        } else {
                            zzbdVar = zzbdVarQ;
                        }
                        it5 = map6.keySet().iterator();
                        while (it5.hasNext()) {
                            num2 = (Integer) it5.next();
                            iIntValue = num2.intValue();
                            if (this.f12613e.contains(num2)) {
                                zzicVar.b().n().b(num2, "Skipping failed audience ID");
                            } else {
                                it6 = ((List) map6.get(num2)).iterator();
                                z15 = true;
                                r13 = eVar5;
                                while (true) {
                                    if (!it6.hasNext()) {
                                        map7 = map6;
                                        it7 = it5;
                                        r29 = r13;
                                        j12 = j11;
                                        break;
                                    }
                                    map7 = map6;
                                    com.google.android.gms.internal.measurement.zzff zzffVar15 = (com.google.android.gms.internal.measurement.zzff) it6.next();
                                    it7 = it5;
                                    r210 = r13;
                                    zzaaVar = new zzaa(this, this.f12612d, iIntValue, zzffVar15);
                                    Long l114 = this.f12615g;
                                    Long l115 = this.f12616h;
                                    iZ = zzffVar15.z();
                                    zzyVar = (zzy) this.f12614f.get(num2);
                                    if (zzyVar == null) {
                                        z16 = false;
                                    } else {
                                        z16 = zzyVar.f13678d.get(iZ);
                                    }
                                    j12 = j11;
                                    zG = zzaaVar.g(l114, l115, zzhsVarA, j12, zzbdVar, z16);
                                    if (!zG) {
                                        this.f12613e.add(num2);
                                        z15 = zG;
                                        r29 = r210;
                                        break;
                                    }
                                    l(num2).a(zzaaVar);
                                    z15 = zG;
                                    j11 = j12;
                                    map6 = map7;
                                    it5 = it7;
                                    r13 = r210;
                                }
                                if (!z15) {
                                    this.f12613e.add(num2);
                                }
                                j11 = j12;
                                map6 = map7;
                                it5 = it7;
                                eVar5 = r29;
                            }
                        }
                        it4 = it4;
                        str13 = str211;
                        zzpgVar3 = zzpgVar;
                        zzzVar = zzzVar;
                    }
                }
            }
        }
        zzpgVar2 = zzpgVar3;
        if (!z11) {
            return new ArrayList();
        }
        if (!list2.isEmpty()) {
            eVar7 = new e();
            it8 = list2.iterator();
            while (it8.hasNext()) {
                com.google.android.gms.internal.measurement.zziu zziuVar6 = (com.google.android.gms.internal.measurement.zziu) it8.next();
                strA = zziuVar6.A();
                map8 = (Map) eVar7.get(strA);
                if (map8 == null) {
                    zzaw zzawVarH18 = zzpgVar2.h0();
                    zzicVar4 = zzawVarH18.f13202a;
                    str12 = this.f12612d;
                    zzawVarH18.h();
                    zzawVarH18.g();
                    Preconditions.d(str12);
                    Preconditions.d(strA);
                    eVar8 = new e();
                    cursorQuery3 = zzawVarH18.X().query("property_filters", new String[]{str5, str7}, "app_id=? AND property_name=?", new String[]{str12, strA}, null, null, null);
                    if (cursorQuery3.moveToFirst()) {
                        while (true) {
                            com.google.android.gms.internal.measurement.zzfn zzfnVar7 = (com.google.android.gms.internal.measurement.zzfn) ((com.google.android.gms.internal.measurement.zzfm) zzpk.R(com.google.android.gms.internal.measurement.zzfn.G(), cursorQuery3.getBlob(1))).p();
                            numValueOf6 = Integer.valueOf(cursorQuery3.getInt(0));
                            list6 = (List) eVar8.get(numValueOf6);
                            if (list6 == null) {
                                it9 = it8;
                                arrayList4 = new ArrayList();
                                eVar8.put(numValueOf6, arrayList4);
                            } else {
                                it9 = it8;
                                arrayList4 = list6;
                            }
                            arrayList4.add(zzfnVar7);
                            if (!cursorQuery3.moveToNext()) {
                                break;
                                break;
                            }
                            it8 = it9;
                            zzicVar4 = zzicVar4;
                        }
                        cursorQuery3.close();
                        map8 = eVar8;
                    } else {
                        it9 = it8;
                        map8 = Collections.EMPTY_MAP;
                        cursorQuery3.close();
                    }
                    eVar7.put(strA, map8);
                } else {
                    it9 = it8;
                }
                while (r4.hasNext()) {
                    int iIntValue13 = num5.intValue();
                    if (this.f12613e.contains(num5)) {
                        zzicVar.b().n().b(num5, str8);
                        break;
                        break;
                    }
                    it10 = ((List) map8.get(num5)).iterator();
                    zG2 = true;
                    while (true) {
                        if (it10.hasNext()) {
                            zzfnVar = (com.google.android.gms.internal.measurement.zzfn) it10.next();
                            if (Log.isLoggable(zzicVar.b().q(), 2)) {
                                zzgs zzgsVarN7 = zzicVar.b().n();
                                if (zzfnVar.y()) {
                                    numValueOf5 = Integer.valueOf(zzfnVar.z());
                                } else {
                                    numValueOf5 = null;
                                }
                                zzgsVarN7.d("Evaluating filter. audience, filter, property", num5, numValueOf5, zzicVar.n().c(zzfnVar.A()));
                                zzicVar.b().n().b(zzpgVar2.k0().I(zzfnVar), "Filter definition");
                            }
                            if (zzfnVar.y()) {
                            }
                            zzgs zzgsVarL7 = zzicVar.b().l();
                            Object objO8 = zzgu.o(this.f12612d);
                            if (zzfnVar.y()) {
                                numValueOf4 = Integer.valueOf(zzfnVar.z());
                            } else {
                                numValueOf4 = null;
                            }
                            zzgsVarL7.c(objO8, String.valueOf(numValueOf4), "Invalid property filter ID. appId, id");
                            this.f12613e.add(num5);
                            map8 = map8;
                            str8 = str8;
                        } else {
                            map8 = map8;
                            str8 = str8;
                        }
                        if (!zG2) {
                            this.f12613e.add(num5);
                        }
                        map8 = map8;
                        str8 = str8;
                        l(num5).a(zzacVar);
                        map8 = map8;
                        str8 = str8;
                    }
                }
                it8 = it9;
            }
        }
        arrayList3 = new ArrayList();
        b<Integer> bVar6 = (b) this.f12614f.keySet();
        bVar6.removeAll(this.f12613e);
        while (r3.hasNext()) {
            int iIntValue14 = num6.intValue();
            zzy zzyVar8 = (zzy) this.f12614f.get(num6);
            Preconditions.g(zzyVar8);
            com.google.android.gms.internal.measurement.zzhg zzhgVarB6 = zzyVar8.b(iIntValue14);
            arrayList3.add(zzhgVarB6);
            zzawVarH1 = zzpgVar2.h0();
            zzicVar3 = zzawVarH1.f13202a;
            str11 = this.f12612d;
            com.google.android.gms.internal.measurement.zzii zziiVarA6 = zzhgVarB6.A();
            zzawVarH1.h();
            zzawVarH1.g();
            Preconditions.d(str11);
            Preconditions.g(zziiVarA6);
            byte[] bArrB6 = zziiVarA6.b();
            contentValues = new ContentValues();
            contentValues.put("app_id", str11);
            contentValues.put(str5, num6);
            contentValues.put("current_results", bArrB6);
            if (zzawVarH1.X().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                zzicVar3.b().k().b(zzgu.o(str11), "Failed to insert filter results (got -1). appId");
            }
        }
        return arrayList3;
    }

    public final zzy l(Integer num) {
        if (this.f12614f.containsKey(num)) {
            return (zzy) this.f12614f.get(num);
        }
        zzy zzyVar = new zzy(this, this.f12612d);
        this.f12614f.put(num, zzyVar);
        return zzyVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzos
    public final void j() {
    }
}
