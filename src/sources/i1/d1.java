package i1;

import b0.c2;
import b0.g2;
import b0.h2;
import b0.i2;
import b0.j2;
import b0.y1;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.yalantis.ucrop.view.CropImageView;
import h1.dc;
import h1.fc;
import h1.ha;
import h1.qa;
import h1.t6;
import h1.y4;
import j0.e2;
import j0.t1;
import kotlin.NoWhenBranchMatchedException;
import l1.b3;
import l1.k1;
import l1.x1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f33993b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final float f33998g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final float f33999h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final z1.r f34000i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f33992a = v3.b.a(0, 0, 0, 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f33994c = 12;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f33995d = 4;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f33996e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final float f33997f = 24;

    static {
        float f5 = 16;
        f33993b = f5;
        f33998g = f5;
        f33999h = f5;
        float f11 = 48;
        f34000i = e2.a(z1.o.f58481a, f11, f11);
    }

    /* JADX WARN: Code duplicated, block: B:221:0x0352  */
    /* JADX WARN: Code duplicated, block: B:234:0x0384  */
    /* JADX WARN: Failed to calculate best type for var: r12v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v2 ??, new type: l1.s
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v2 ??, new type: l1.s
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v2 ??, new type: l1.s
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v2 ??, new type: l1.s
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v11 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v11 ??, new type: l1.s
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v11 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v11 ??, new type: l1.s
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v11 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v11 ??, new type: l1.s
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v11 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v11 ??, new type: l1.s
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v15 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v15 ??, new type: l1.s
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v15 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v15 ??, new type: l1.s
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v15 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v15 ??, new type: l1.s
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v15 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v15 ??, new type: l1.s
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v16 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v16 ??, new type: l1.s
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v16 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v16 ??, new type: l1.s
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v16 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v16 ??, new type: l1.s
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v16 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v16 ??, new type: l1.s
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v20 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v20 ??, new type: l1.s
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v20 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v20 ??, new type: l1.s
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v20 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v20 ??, new type: l1.s
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v20 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v20 ??, new type: l1.s
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v22 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v22 ??, new type: l1.s
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v22 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v22 ??, new type: l1.s
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v22 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v22 ??, new type: l1.s
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v22 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v22 ??, new type: l1.s
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v23 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v23 ??, new type: l1.s
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v23 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v23 ??, new type: l1.s
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v24 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v24 ??, new type: l1.s
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v24 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v24 ??, new type: l1.s
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v2 l1.s, new type: l1.s
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.applyResolvedVars(TypeSearch.java:100)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:76)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.runMultiVariableSearch(FixTypesVisitor.java:119)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void a(e1 e1Var, String str, fz.e eVar, o3.f0 f0Var, fz.e eVar2, fz.e eVar3, fz.e eVar4, fz.e eVar5, fz.e eVar6, boolean z11, boolean z12, boolean z13, h0.i iVar, t1 t1Var, ha haVar, fz.e eVar7, l1.n nVar, int i11, int i12) {
        int i13;
        int i14;
        g0 g0Var;
        long j11;
        float f5;
        float f11;
        float f12;
        float f13;
        float f14;
        j3.y0 y0Var;
        float f15;
        t1.d dVarD;
        long j12;
        long j13;
        long j14;
        long j15;
        fz.e eVar8;
        l1.s sVar;
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(1514469103);
        if ((i11 & 6) == 0) {
            i13 = i11 | (sVar2.f(e1Var) ? 4 : 2);
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= sVar2.f(str) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= sVar2.h(eVar) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i13 |= sVar2.f(f0Var) ? 2048 : 1024;
        }
        int i15 = i11 & 24576;
        int i16 = OSSConstants.DEFAULT_BUFFER_SIZE;
        if (i15 == 0) {
            i13 |= sVar2.h(eVar2) ? 16384 : 8192;
        }
        if ((i11 & 196608) == 0) {
            i13 |= sVar2.h(eVar3) ? 131072 : 65536;
        }
        if ((i11 & 1572864) == 0) {
            i13 |= sVar2.h(eVar4) ? 1048576 : 524288;
        }
        if ((i11 & 12582912) == 0) {
            i13 |= sVar2.h(eVar5) ? 8388608 : 4194304;
        }
        if ((i11 & 100663296) == 0) {
            i13 |= sVar2.h(null) ? 67108864 : 33554432;
        }
        if ((i11 & 805306368) == 0) {
            i13 |= sVar2.h(null) ? 536870912 : 268435456;
        }
        int i17 = i13;
        if ((i12 & 6) == 0) {
            i14 = i12 | (sVar2.h(eVar6) ? 4 : 2);
        } else {
            i14 = i12;
        }
        if ((i12 & 48) == 0) {
            i14 |= sVar2.g(z11) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i14 |= sVar2.g(z12) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i14 |= sVar2.g(z13) ? 2048 : 1024;
        }
        if ((i12 & 24576) == 0) {
            if (sVar2.f(iVar)) {
                i16 = 16384;
            }
            i14 |= i16;
        }
        if ((i12 & 196608) == 0) {
            i14 |= sVar2.f(t1Var) ? 131072 : 65536;
        }
        if ((i12 & 1572864) == 0) {
            i14 |= sVar2.f(haVar) ? 1048576 : 524288;
        }
        if ((i12 & 12582912) == 0) {
            i14 |= sVar2.h(eVar7) ? 8388608 : 4194304;
        }
        int i18 = i14;
        if ((i17 & 306783379) == 306783378 && (i18 & 4793491) == 4793490 && sVar2.F()) {
            sVar2.W();
            eVar8 = eVar7;
            haVar = haVar;
            sVar = sVar2;
        } else {
            boolean z14 = ((i17 & 112) == 32) | ((i17 & 7168) == 2048);
            Object objQ = sVar2.Q();
            Object obj = l1.m.f39353a;
            if (z14 || objQ == obj) {
                objQ = f0Var.a(new j3.h(6, str, null));
                sVar2.o0(objQ);
            }
            String str2 = ((o3.d0) objQ).f44670a.f35700b;
            boolean zBooleanValue = ((Boolean) com.bumptech.glide.f.m(iVar, sVar2, (i18 >> 12) & 14).getValue()).booleanValue();
            if (zBooleanValue) {
                g0Var = g0.Focused;
            } else {
                g0Var = str2.length() == 0 ? g0.UnfocusedEmpty : g0.UnfocusedNotEmpty;
            }
            if (!z12) {
                j11 = haVar.f30374z;
            } else if (z13) {
                j11 = haVar.A;
            } else {
                j11 = zBooleanValue ? haVar.f30372x : haVar.f30373y;
            }
            dc dcVar = (dc) sVar2.j(fc.f30256a);
            j3.y0 y0Var2 = dcVar.f30177j;
            j3.y0 y0Var3 = dcVar.f30179l;
            long jB = y0Var2.b();
            long j16 = g2.x.f28622i;
            boolean z15 = (g2.x.d(jB, j16) && !g2.x.d(y0Var3.b(), j16)) || (!g2.x.d(y0Var2.b(), j16) && g2.x.d(y0Var3.b(), j16));
            long jB2 = y0Var3.b();
            if (z15 && jB2 == 16) {
                jB2 = j11;
            }
            long jB3 = y0Var2.b();
            long j17 = (z15 && jB3 == 16) ? j11 : jB3;
            boolean z16 = eVar2 != null;
            long j18 = jB2;
            c2 c2VarE = g2.e(g0Var, "TextFieldInputState", sVar2, 48, 0);
            h2 h2Var = c2VarE.f3458a;
            k1 k1Var = c2VarE.f3461d;
            j2 j2Var = b0.e.f3496j;
            g0 g0Var2 = (g0) h2Var.Y();
            sVar2.d0(-2036730335);
            int[] iArr = c1.f33991b;
            int i19 = iArr[g0Var2.ordinal()];
            float f16 = CropImageView.DEFAULT_ASPECT_RATIO;
            if (i19 == 1) {
                f5 = 1.0f;
            } else if (i19 != 2) {
                if (i19 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                f5 = 1.0f;
            } else {
                f5 = 0.0f;
            }
            sVar2.p(false);
            Float fValueOf = Float.valueOf(f5);
            g0 g0Var3 = (g0) k1Var.getValue();
            sVar2.d0(-2036730335);
            int i21 = iArr[g0Var3.ordinal()];
            if (i21 == 1) {
                f11 = 1.0f;
            } else if (i21 != 2) {
                if (i21 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            sVar2.p(false);
            Float fValueOf2 = Float.valueOf(f11);
            c2VarE.f();
            sVar2.d0(1276209157);
            i2 i2VarR = b0.e.r(150, 0, null, 6);
            sVar2.p(false);
            y1 y1VarC = g2.c(c2VarE, fValueOf, fValueOf2, i2VarR, j2Var, sVar2, 196608);
            e eVar9 = e.f34002c;
            g0 g0Var4 = (g0) h2Var.Y();
            sVar2.d0(1435837472);
            int i22 = iArr[g0Var4.ordinal()];
            if (i22 == 1) {
                f12 = 1.0f;
            } else {
                if (i22 != 2) {
                    if (i22 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (!z16) {
                    f12 = 1.0f;
                }
                f12 = 0.0f;
            }
            sVar2.p(false);
            Float fValueOf3 = Float.valueOf(f12);
            g0 g0Var5 = (g0) k1Var.getValue();
            sVar2.d0(1435837472);
            int i23 = iArr[g0Var5.ordinal()];
            if (i23 == 1) {
                f13 = 1.0f;
            } else {
                if (i23 != 2) {
                    if (i23 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (!z16) {
                    f13 = 1.0f;
                }
                f13 = 0.0f;
            }
            sVar2.p(false);
            y1 y1VarC2 = g2.c(c2VarE, fValueOf3, Float.valueOf(f13), (b0.c0) eVar9.invoke(c2VarE.f(), sVar2, 0), j2Var, sVar2, 196608);
            g0 g0Var6 = (g0) h2Var.Y();
            sVar2.d0(1128033978);
            int i24 = iArr[g0Var6.ordinal()];
            if (i24 == 1) {
                f14 = 1.0f;
            } else {
                if (i24 != 2) {
                    if (i24 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (z16) {
                    f14 = 0.0f;
                }
                f14 = 1.0f;
            }
            sVar2.p(false);
            Float fValueOf4 = Float.valueOf(f14);
            g0 g0Var7 = (g0) k1Var.getValue();
            sVar2.d0(1128033978);
            int i25 = iArr[g0Var7.ordinal()];
            if (i25 == 1) {
                f16 = 1.0f;
            } else {
                if (i25 != 2) {
                    if (i25 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (!z16) {
                }
                f16 = 1.0f;
            }
            sVar2.p(false);
            Float fValueOf5 = Float.valueOf(f16);
            c2VarE.f();
            sVar2.d0(-1868044898);
            long j19 = j17;
            i2 i2VarR2 = b0.e.r(150, 0, null, 6);
            sVar2.p(false);
            y1 y1VarC3 = g2.c(c2VarE, fValueOf4, fValueOf5, i2VarR2, j2Var, sVar2, 196608);
            g0 g0Var8 = (g0) k1Var.getValue();
            sVar2.d0(-107432127);
            long j21 = iArr[g0Var8.ordinal()] == 1 ? j18 : j19;
            sVar2.p(false);
            h2.c cVarG = g2.x.g(j21);
            boolean zF = sVar2.f(cVarG);
            Object objQ2 = sVar2.Q();
            if (zF || objQ2 == obj) {
                j2 j2Var2 = new j2(a0.c.f33t, new a0.o0(cVarG, 0));
                sVar2.o0(j2Var2);
                objQ2 = j2Var2;
            }
            j2 j2Var3 = (j2) objQ2;
            g0 g0Var9 = (g0) h2Var.Y();
            sVar2.d0(-107432127);
            long j22 = iArr[g0Var9.ordinal()] == 1 ? j18 : j19;
            sVar2.p(false);
            g2.x xVar = new g2.x(j22);
            g0 g0Var10 = (g0) k1Var.getValue();
            sVar2.d0(-107432127);
            long j23 = iArr[g0Var10.ordinal()] == 1 ? j18 : j19;
            sVar2.p(false);
            g2.x xVar2 = new g2.x(j23);
            c2VarE.f();
            sVar2.d0(1528582156);
            i2 i2VarR3 = b0.e.r(150, 0, null, 6);
            sVar2.p(false);
            y1 y1VarC4 = g2.c(c2VarE, xVar, xVar2, i2VarR3, j2Var3, sVar2, 196608);
            sVar2.d0(1023351670);
            sVar2.p(false);
            h2.c cVarG2 = g2.x.g(j11);
            boolean zF2 = sVar2.f(cVarG2);
            Object objQ3 = sVar2.Q();
            if (zF2 || objQ3 == obj) {
                j2 j2Var4 = new j2(a0.c.f33t, new a0.o0(cVarG2, 0));
                sVar2.o0(j2Var4);
                objQ3 = j2Var4;
            }
            j2 j2Var5 = (j2) objQ3;
            sVar2.d0(1023351670);
            sVar2.p(false);
            long j24 = j11;
            g2.x xVar3 = new g2.x(j24);
            sVar2.d0(1023351670);
            sVar2.p(false);
            g2.x xVar4 = new g2.x(j24);
            c2VarE.f();
            sVar2.d0(-543659263);
            i2 i2VarR4 = b0.e.r(150, 0, null, 6);
            sVar2.p(false);
            y1 y1VarC5 = g2.c(c2VarE, xVar3, xVar4, i2VarR4, j2Var5, sVar2, 196608);
            float fFloatValue = ((Number) y1VarC.L.getValue()).floatValue();
            sVar2.d0(-156998101);
            if (eVar2 == null) {
                f15 = fFloatValue;
                y0Var = y0Var2;
                dVarD = null;
            } else {
                y0Var = y0Var2;
                w0 w0Var = new w0(y0Var, y0Var3, fFloatValue, y1VarC5, eVar2, z15, y1VarC4);
                f15 = fFloatValue;
                dVarD = t1.e.d(-1236585568, w0Var, sVar2);
            }
            sVar2.p(r4);
            if (!z12) {
                j12 = haVar.D;
            } else if (z13) {
                j12 = haVar.E;
            } else {
                j12 = zBooleanValue ? haVar.B : haVar.C;
            }
            Object objQ4 = sVar2.Q();
            if (objQ4 == obj) {
                objQ4 = l1.t.t(new z0(y1VarC2, 0), l1.g.f39303t);
                sVar2.o0(objQ4);
            }
            b3 b3Var = (b3) objQ4;
            sVar2.d0(-156965270);
            t1.d dVarD2 = (eVar3 != null && str2.length() == 0 && ((Boolean) b3Var.getValue()).booleanValue()) ? t1.e.d(-660524084, new y0(y1VarC2, j12, y0Var, eVar3), sVar2) : null;
            sVar2.p(r4);
            Object objQ5 = sVar2.Q();
            if (objQ5 == obj) {
                objQ5 = l1.t.t(new z0(y1VarC3, 1), l1.g.f39303t);
                sVar2.o0(objQ5);
            }
            sVar2.d0(-156940524);
            sVar2.p(r4);
            sVar2.d0(-156921964);
            sVar2.p(r4);
            if (!z12) {
                j13 = haVar.f30366r;
            } else if (z13) {
                j13 = haVar.f30367s;
            } else {
                j13 = zBooleanValue ? haVar.f30364p : haVar.f30365q;
            }
            sVar2.d0(-156902962);
            t1.d dVarD3 = eVar4 == null ? null : t1.e.d(-130107406, new x0(j13, eVar4, 0), sVar2);
            sVar2.p(r4);
            if (!z12) {
                j14 = haVar.f30370v;
            } else if (z13) {
                j14 = haVar.f30371w;
            } else {
                j14 = zBooleanValue ? haVar.f30368t : haVar.f30369u;
            }
            sVar2.d0(-156893937);
            t1.d dVarD4 = eVar5 == null ? null : t1.e.d(2079816678, new x0(j14, eVar5, 1), sVar2);
            sVar2.p(r4);
            if (!z12) {
                j15 = haVar.H;
            } else if (z13) {
                j15 = haVar.I;
            } else {
                j15 = zBooleanValue ? haVar.F : haVar.G;
            }
            long j25 = j15;
            sVar2.d0(-156884470);
            t1.d dVarD5 = eVar6 == null ? null : t1.e.d(1263707005, new h1.p0(j25, y0Var3, eVar6, 1), sVar2);
            sVar2.p(r4);
            int i26 = c1.f33990a[e1Var.ordinal()];
            if (i26 == 1) {
                eVar8 = eVar7;
                l1.s sVar3 = sVar2;
                sVar3.d0(-568105095);
                qa.b(eVar, dVarD, dVarD2, dVarD3, dVarD4, null, null, z11, f15, t1.e.d(1750327932, new h1.b(5, eVar8), sVar3), dVarD5, t1Var, sVar3, ((i17 >> 3) & 112) | 6 | ((i18 << 21) & 234881024), ((i18 >> 9) & 896) | 6);
                sVar3.p(r4);
                sVar = sVar3;
            } else if (i26 != 2) {
                sVar2.d0(-565271199);
                sVar2.p(false);
                eVar8 = eVar7;
                sVar = sVar2;
            } else {
                sVar2.d0(-567018607);
                Object objQ6 = sVar2.Q();
                if (objQ6 == obj) {
                    objQ6 = l1.t.B(new f2.e(0L));
                    sVar2.o0(objQ6);
                }
                l1.b1 b1Var = (l1.b1) objQ6;
                eVar8 = eVar7;
                t1.d dVarD6 = t1.e.d(157291737, new y4(b1Var, t1Var, eVar8, 2), sVar2);
                boolean zC = sVar2.c(f15);
                Object objQ7 = sVar2.Q();
                if (zC || objQ7 == obj) {
                    objQ7 = new u0(f15, b1Var);
                    sVar2.o0(objQ7);
                }
                t6.c(eVar, dVarD2, dVarD, dVarD3, dVarD4, null, null, z11, f15, (fz.c) objQ7, dVarD6, dVarD5, t1Var, sVar2, ((i17 >> 3) & 112) | 6 | ((i18 << 21) & 234881024), ((i18 >> 6) & 7168) | 48);
                l1.s sVar4 = sVar2;
                sVar4.p(r4);
                sVar = sVar4;
            }
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new a1(e1Var, str, eVar, f0Var, eVar2, eVar3, eVar4, eVar5, eVar6, z11, z12, z13, iVar, t1Var, haVar, eVar8, i11, i12);
        }
    }

    public static final void b(long j11, j3.y0 y0Var, fz.e eVar, l1.n nVar, int i11) {
        int i12;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1208685580);
        if ((i11 & 6) == 0) {
            i12 = (sVar.e(j11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.f(y0Var) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar.h(eVar) ? 256 : 128;
        }
        if ((i12 & 147) == 146 && sVar.F()) {
            sVar.W();
        } else {
            p.a(j11, y0Var, eVar, sVar, i12 & 1022);
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new t0(j11, y0Var, eVar, i11, 1);
        }
    }

    public static final void c(long j11, fz.e eVar, l1.n nVar, int i11) {
        int i12;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(660142980);
        if ((i11 & 6) == 0) {
            i12 = (sVar.e(j11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(eVar) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && sVar.F()) {
            sVar.W();
        } else {
            l1.t.a(h1.h2.f30320a.a(new g2.x(j11)), eVar, sVar, (i12 & 112) | 8);
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new b1(j11, eVar, i11);
        }
    }

    public static final l1.b1 d(boolean z11, boolean z12, boolean z13, ha haVar, float f5, float f11, l1.n nVar, int i11) {
        long j11;
        b3 b3VarH;
        b3 b3VarA;
        if (!z11) {
            j11 = haVar.f30362n;
        } else if (z12) {
            j11 = haVar.f30363o;
        } else {
            j11 = z13 ? haVar.f30361l : haVar.m;
        }
        long j12 = j11;
        if (z11) {
            l1.s sVar = (l1.s) nVar;
            sVar.d0(1023053998);
            b3VarH = a0.t1.a(j12, b0.e.r(150, 0, null, 6), null, sVar, 48, 12);
            sVar.p(false);
        } else {
            l1.s sVar2 = (l1.s) nVar;
            sVar2.d0(1023165505);
            b3VarH = l1.t.H(new g2.x(j12), sVar2);
            sVar2.p(false);
        }
        if (z11) {
            l1.s sVar3 = (l1.s) nVar;
            sVar3.d0(1023269417);
            b3VarA = b0.h.a(z13 ? f5 : f11, b0.e.r(150, 0, null, 6), null, sVar3, 48, 12);
            sVar3.p(false);
        } else {
            l1.s sVar4 = (l1.s) nVar;
            sVar4.d0(1023478388);
            l1.b1 b1VarH = l1.t.H(new v3.f(f11), sVar4);
            sVar4.p(false);
            b3VarA = b1VarH;
        }
        return l1.t.H(d0.n.a(((g2.x) b3VarH.getValue()).f28624a, ((v3.f) b3VarA.getValue()).f53489a), nVar);
    }

    public static final Object e(w2.p0 p0Var) {
        Object objG = p0Var.G();
        w2.b0 b0Var = objG instanceof w2.b0 ? (w2.b0) objG : null;
        if (b0Var != null) {
            return b0Var.Q;
        }
        return null;
    }
}
