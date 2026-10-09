package js;

import android.net.Uri;
import android.util.Log;
import androidx.lifecycle.ViewModelKt;
import av.d0;
import com.lingodeer.data.model.ChineseToneMetaData;
import com.lingodeer.data.model.CourseWord;
import com.lingodeer.data.model.LessonState;
import com.lingodeer.data.model.chinesetone.ChineseToneLesson;
import com.lingodeer.data.model.chinesetone.ChineseToneUnit;
import com.lingodeer.data.model.chinesetone.ChineseToneWord;
import com.lingodeer.data.model.uistate.CourseTestFinishSummaryUiState;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.List;
import ot.f1;
import rt.pc;
import rt.y9;
import rz.e0;
import uz.a1;
import uz.i1;
import uz.m0;
import uz.r0;
import uz.x0;
import vt.g0;
import vt.n0;
import wt.o0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class r extends y9 {

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final o0 f36823n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final hs.g f36824o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final g0 f36825p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ChineseToneLesson f36826q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final av.z f36827r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final ob.l f36828s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final r0 f36829t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final r0 f36830u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final r0 f36831v0;

    public r(n0 n0Var, vt.c cVar, vt.e eVar, ur.a aVar, wt.m mVar, o0 o0Var, hs.g gVar, g0 g0Var, ChineseToneLesson chineseToneLesson, av.z zVar) {
        super(n0Var, cVar, eVar, null, null, null);
        this.f36823n0 = o0Var;
        this.f36824o0 = gVar;
        this.f36825p0 = g0Var;
        this.f36826q0 = chineseToneLesson;
        this.f36827r0 = zVar;
        this.f36828s0 = new ob.l(n0Var, 25);
        e0.B(ViewModelKt.getViewModelScope(this), null, null, new gp.a(this, null, 18), 3);
        gp.r rVar = new gp.r(new l(chineseToneLesson, this, (vy.d) null));
        yz.f fVar = rz.o0.f50940a;
        yz.e eVar2 = yz.e.f58387a;
        uz.i iVarW = x0.w(rVar, eVar2);
        i1 i1Var = this.W;
        i1 i1Var2 = this.f50706c0;
        r0 r0Var = ((av.q) zVar).f3188e;
        this.f36829t0 = x0.A(x0.w(new m0(new uz.i[]{iVarW, i1Var, i1Var2, r0Var}, new q(this, n0Var, null)), eVar2), ViewModelKt.getViewModelScope(this), a1.a(2), new pc(CropImageView.DEFAULT_ASPECT_RATIO));
        this.f36830u0 = x0.A(new gp.t(r0Var, 15), ViewModelKt.getViewModelScope(this), a1.a(2), Boolean.valueOf(r0Var.f53391a.getValue() instanceof d0));
        this.f36831v0 = x0.A(x0.w(new no.g(l1.t.K(new fs.a(this, 3)), o0Var.f55339f, new p(cVar, this, null)), eVar2), ViewModelKt.getViewModelScope(this), a1.a(2), CourseTestFinishSummaryUiState.Loading.INSTANCE);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:103:0x0289  */
    /* JADX WARN: Code duplicated, block: B:104:0x028b  */
    /* JADX WARN: Code duplicated, block: B:107:0x0294 A[Catch: Exception -> 0x004c, TryCatch #1 {Exception -> 0x004c, blocks: (B:13:0x0047, B:89:0x0201, B:90:0x0212, B:92:0x0218, B:93:0x0226, B:17:0x0068, B:67:0x019c, B:69:0x01a0, B:71:0x01a6, B:74:0x01ad, B:58:0x015f, B:60:0x0165, B:63:0x017d, B:77:0x01b6, B:20:0x0089, B:105:0x0290, B:107:0x0294, B:109:0x029a, B:112:0x02a1, B:96:0x0252, B:98:0x0258, B:101:0x0270, B:114:0x02a6, B:23:0x009a, B:184:0x05a2, B:185:0x05b3, B:187:0x05b9, B:188:0x05c7, B:191:0x05d1, B:26:0x00a3, B:173:0x0582, B:177:0x058a, B:181:0x0598, B:29:0x00b6, B:212:0x06c2, B:213:0x06d3, B:215:0x06d9, B:216:0x06e7, B:32:0x00c4, B:226:0x072c, B:228:0x0744, B:229:0x0754, B:53:0x013b, B:57:0x0146, B:82:0x01dd, B:85:0x01ee, B:95:0x0239, B:118:0x02cb, B:122:0x0349, B:123:0x0388, B:125:0x038e, B:127:0x039b, B:128:0x039f, B:129:0x03e8, B:131:0x03ee, B:133:0x03fb, B:134:0x03ff, B:136:0x043c, B:137:0x045c, B:139:0x047a, B:140:0x049a, B:141:0x04b5, B:143:0x04bb, B:144:0x04cc, B:163:0x04fc, B:146:0x04d0, B:151:0x04dc, B:155:0x04e6, B:159:0x04f0, B:164:0x050b, B:121:0x033c, B:166:0x056d, B:169:0x0574, B:196:0x05f6, B:200:0x064f, B:205:0x069f, B:208:0x06ab, B:222:0x0717), top: B:236:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:110:0x029e  */
    /* JADX WARN: Code duplicated, block: B:112:0x02a1 A[Catch: Exception -> 0x004c, TryCatch #1 {Exception -> 0x004c, blocks: (B:13:0x0047, B:89:0x0201, B:90:0x0212, B:92:0x0218, B:93:0x0226, B:17:0x0068, B:67:0x019c, B:69:0x01a0, B:71:0x01a6, B:74:0x01ad, B:58:0x015f, B:60:0x0165, B:63:0x017d, B:77:0x01b6, B:20:0x0089, B:105:0x0290, B:107:0x0294, B:109:0x029a, B:112:0x02a1, B:96:0x0252, B:98:0x0258, B:101:0x0270, B:114:0x02a6, B:23:0x009a, B:184:0x05a2, B:185:0x05b3, B:187:0x05b9, B:188:0x05c7, B:191:0x05d1, B:26:0x00a3, B:173:0x0582, B:177:0x058a, B:181:0x0598, B:29:0x00b6, B:212:0x06c2, B:213:0x06d3, B:215:0x06d9, B:216:0x06e7, B:32:0x00c4, B:226:0x072c, B:228:0x0744, B:229:0x0754, B:53:0x013b, B:57:0x0146, B:82:0x01dd, B:85:0x01ee, B:95:0x0239, B:118:0x02cb, B:122:0x0349, B:123:0x0388, B:125:0x038e, B:127:0x039b, B:128:0x039f, B:129:0x03e8, B:131:0x03ee, B:133:0x03fb, B:134:0x03ff, B:136:0x043c, B:137:0x045c, B:139:0x047a, B:140:0x049a, B:141:0x04b5, B:143:0x04bb, B:144:0x04cc, B:163:0x04fc, B:146:0x04d0, B:151:0x04dc, B:155:0x04e6, B:159:0x04f0, B:164:0x050b, B:121:0x033c, B:166:0x056d, B:169:0x0574, B:196:0x05f6, B:200:0x064f, B:205:0x069f, B:208:0x06ab, B:222:0x0717), top: B:236:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x0258 A[Catch: Exception -> 0x004c, TRY_LEAVE, TryCatch #1 {Exception -> 0x004c, blocks: (B:13:0x0047, B:89:0x0201, B:90:0x0212, B:92:0x0218, B:93:0x0226, B:17:0x0068, B:67:0x019c, B:69:0x01a0, B:71:0x01a6, B:74:0x01ad, B:58:0x015f, B:60:0x0165, B:63:0x017d, B:77:0x01b6, B:20:0x0089, B:105:0x0290, B:107:0x0294, B:109:0x029a, B:112:0x02a1, B:96:0x0252, B:98:0x0258, B:101:0x0270, B:114:0x02a6, B:23:0x009a, B:184:0x05a2, B:185:0x05b3, B:187:0x05b9, B:188:0x05c7, B:191:0x05d1, B:26:0x00a3, B:173:0x0582, B:177:0x058a, B:181:0x0598, B:29:0x00b6, B:212:0x06c2, B:213:0x06d3, B:215:0x06d9, B:216:0x06e7, B:32:0x00c4, B:226:0x072c, B:228:0x0744, B:229:0x0754, B:53:0x013b, B:57:0x0146, B:82:0x01dd, B:85:0x01ee, B:95:0x0239, B:118:0x02cb, B:122:0x0349, B:123:0x0388, B:125:0x038e, B:127:0x039b, B:128:0x039f, B:129:0x03e8, B:131:0x03ee, B:133:0x03fb, B:134:0x03ff, B:136:0x043c, B:137:0x045c, B:139:0x047a, B:140:0x049a, B:141:0x04b5, B:143:0x04bb, B:144:0x04cc, B:163:0x04fc, B:146:0x04d0, B:151:0x04dc, B:155:0x04e6, B:159:0x04f0, B:164:0x050b, B:121:0x033c, B:166:0x056d, B:169:0x0574, B:196:0x05f6, B:200:0x064f, B:205:0x069f, B:208:0x06ab, B:222:0x0717), top: B:236:0x0032 }] */
    /* JADX WARN: Failed to find 'out' block for switch in B:144:0x04cc. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v26, types: [java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r11v27 */
    /* JADX WARN: Type inference failed for: r11v28 */
    /* JADX WARN: Type inference failed for: r11v29 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r16v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r16v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:104:0x028b -> B:105:0x0290). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x0197 -> B:67:0x019c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object I(js.r r52, com.lingodeer.data.model.TestModel r53, xy.c r54) {
        /*
            Method dump skipped, instruction units count: 1960
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: js.r.I(js.r, com.lingodeer.data.model.TestModel, xy.c):java.lang.Object");
    }

    public static List J(List list) {
        List listS;
        if (list.size() < 2) {
            return ns.o.S(list);
        }
        int i11 = 0;
        do {
            listS = ns.o.S(list);
            i11++;
            if (!listS.equals(list)) {
                break;
            }
        } while (i11 < 10);
        if (!listS.equals(list)) {
            return listS;
        }
        ArrayList arrayListC1 = ry.m.c1(listS);
        Object obj = arrayListC1.get(0);
        arrayListC1.set(0, arrayListC1.get(1));
        arrayListC1.set(1, obj);
        return arrayListC1;
    }

    @Override // rt.y9
    public final Object A(int i11, long j11, int i12, boolean z11, boolean z12, long j12, boolean z13, vy.d dVar) {
        boolean z14 = this.f50708d0 instanceof f1;
        qy.b0 b0Var = qy.b0.f48488a;
        if (!z14 && !z11) {
            this.f50720t.put(j11 + ":" + i12, new Integer(z13 ? 1 : -1));
        }
        return b0Var;
    }

    @Override // rt.y9
    public final void B(int i11, long j11, boolean z11) {
        this.f50720t.put(j11 + ":" + i11, new Integer(z11 ? 1 : -1));
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00a9 A[Catch: Exception -> 0x0042, TRY_ENTER, TryCatch #1 {Exception -> 0x0042, blocks: (B:15:0x003d, B:20:0x004d, B:77:0x019a, B:23:0x005c, B:73:0x017a, B:26:0x006b, B:63:0x014b, B:69:0x0158, B:29:0x0078, B:59:0x0122, B:30:0x0081, B:44:0x00c4, B:46:0x00c8, B:48:0x00d3, B:50:0x00e2, B:52:0x00e6, B:55:0x00fd, B:47:0x00d1, B:41:0x00a9), top: B:86:0x002d, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c4 A[Catch: Exception -> 0x0042, PHI: r0
      0x00c4: PHI (r0v12 java.lang.Object) = (r0v11 java.lang.Object), (r0v1 java.lang.Object) binds: [B:42:0x00c0, B:30:0x0081] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {Exception -> 0x0042, blocks: (B:15:0x003d, B:20:0x004d, B:77:0x019a, B:23:0x005c, B:73:0x017a, B:26:0x006b, B:63:0x014b, B:69:0x0158, B:29:0x0078, B:59:0x0122, B:30:0x0081, B:44:0x00c4, B:46:0x00c8, B:48:0x00d3, B:50:0x00e2, B:52:0x00e6, B:55:0x00fd, B:47:0x00d1, B:41:0x00a9), top: B:86:0x002d, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00c8 A[Catch: Exception -> 0x0042, TryCatch #1 {Exception -> 0x0042, blocks: (B:15:0x003d, B:20:0x004d, B:77:0x019a, B:23:0x005c, B:73:0x017a, B:26:0x006b, B:63:0x014b, B:69:0x0158, B:29:0x0078, B:59:0x0122, B:30:0x0081, B:44:0x00c4, B:46:0x00c8, B:48:0x00d3, B:50:0x00e2, B:52:0x00e6, B:55:0x00fd, B:47:0x00d1, B:41:0x00a9), top: B:86:0x002d, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00d1 A[Catch: Exception -> 0x0042, TryCatch #1 {Exception -> 0x0042, blocks: (B:15:0x003d, B:20:0x004d, B:77:0x019a, B:23:0x005c, B:73:0x017a, B:26:0x006b, B:63:0x014b, B:69:0x0158, B:29:0x0078, B:59:0x0122, B:30:0x0081, B:44:0x00c4, B:46:0x00c8, B:48:0x00d3, B:50:0x00e2, B:52:0x00e6, B:55:0x00fd, B:47:0x00d1, B:41:0x00a9), top: B:86:0x002d, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00e2 A[Catch: Exception -> 0x0042, TryCatch #1 {Exception -> 0x0042, blocks: (B:15:0x003d, B:20:0x004d, B:77:0x019a, B:23:0x005c, B:73:0x017a, B:26:0x006b, B:63:0x014b, B:69:0x0158, B:29:0x0078, B:59:0x0122, B:30:0x0081, B:44:0x00c4, B:46:0x00c8, B:48:0x00d3, B:50:0x00e2, B:52:0x00e6, B:55:0x00fd, B:47:0x00d1, B:41:0x00a9), top: B:86:0x002d, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0143  */
    /* JADX WARN: Code duplicated, block: B:62:0x0145  */
    /* JADX WARN: Code duplicated, block: B:65:0x0151 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:67:0x0155  */
    /* JADX WARN: Code duplicated, block: B:69:0x0158 A[Catch: Exception -> 0x0042, TryCatch #1 {Exception -> 0x0042, blocks: (B:15:0x003d, B:20:0x004d, B:77:0x019a, B:23:0x005c, B:73:0x017a, B:26:0x006b, B:63:0x014b, B:69:0x0158, B:29:0x0078, B:59:0x0122, B:30:0x0081, B:44:0x00c4, B:46:0x00c8, B:48:0x00d3, B:50:0x00e2, B:52:0x00e6, B:55:0x00fd, B:47:0x00d1, B:41:0x00a9), top: B:86:0x002d, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0176  */
    /* JADX WARN: Code duplicated, block: B:72:0x0177  */
    /* JADX WARN: Code duplicated, block: B:75:0x0198  */
    /* JADX WARN: Code duplicated, block: B:76:0x0199  */
    /* JADX WARN: Code duplicated, block: B:81:0x01c4 A[Catch: Exception -> 0x01d8, TRY_LEAVE, TryCatch #0 {Exception -> 0x01d8, blocks: (B:13:0x0038, B:81:0x01c4, B:32:0x0085, B:38:0x009f, B:35:0x008c, B:80:0x01b9, B:15:0x003d, B:20:0x004d, B:77:0x019a, B:23:0x005c, B:73:0x017a, B:26:0x006b, B:63:0x014b, B:69:0x0158, B:29:0x0078, B:59:0x0122, B:30:0x0081, B:44:0x00c4, B:46:0x00c8, B:48:0x00d3, B:50:0x00e2, B:52:0x00e6, B:55:0x00fd, B:47:0x00d1, B:41:0x00a9), top: B:86:0x002d, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x01d8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object K(xy.c cVar) {
        m mVar;
        ChineseToneUnit chineseToneUnit;
        List listN;
        int iIndexOf;
        int i11;
        Long l9;
        Long l11;
        LessonState lessonState;
        Long l12;
        Enum enumC;
        LessonState lessonState2;
        Long l13;
        Long l14;
        int i12;
        int i13;
        LessonState lessonState3;
        int i14;
        long jLongValue;
        LessonState lessonState4;
        int i15;
        int i16;
        int i17;
        long jLongValue2;
        LessonState lessonState5;
        Long l15;
        long j11;
        LessonState lessonState6;
        if (cVar instanceof m) {
            mVar = (m) cVar;
            int i18 = mVar.K;
            if ((i18 & Integer.MIN_VALUE) != 0) {
                mVar.K = i18 - Integer.MIN_VALUE;
            } else {
                mVar = new m(this, cVar);
            }
        } else {
            mVar = new m(this, cVar);
        }
        m mVar2 = mVar;
        Object objE = mVar2.f36798t;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i19 = mVar2.K;
        qy.b0 b0Var = qy.b0.f48488a;
        ChineseToneLesson chineseToneLesson = this.f36826q0;
        g0 g0Var = this.f36825p0;
        vy.d dVar = null;
        try {
            try {
                switch (i19) {
                    case 0:
                        com.bumptech.glide.e.F(objE);
                        long lessonId = chineseToneLesson.getLessonId();
                        LessonState lessonState7 = LessonState.StateRedo;
                        mVar2.K = 1;
                        if (((ds.g) g0Var).g(lessonId, lessonState7, mVar2) != aVar) {
                            if (chineseToneLesson.getUnitId() == 1) {
                                long unitId = chineseToneLesson.getUnitId();
                                mVar2.K = 2;
                                ds.g gVar = (ds.g) g0Var;
                                gVar.getClass();
                                objE = gVar.e(null, new bh.b(unitId, dVar, 12), mVar2);
                                if (objE == aVar) {
                                    chineseToneUnit = (ChineseToneUnit) objE;
                                    if (chineseToneUnit != null) {
                                        listN = ks.b.n(chineseToneUnit.getLessonList());
                                    } else {
                                        listN = ry.r.f50854a;
                                    }
                                    iIndexOf = listN.indexOf(new Long(chineseToneLesson.getLessonId()));
                                    if (iIndexOf >= 0 || iIndexOf % 2 != 1) {
                                        vt.c cVar2 = this.f50703b;
                                        mVar2.f36792a = null;
                                        mVar2.f36793b = null;
                                        mVar2.f36794c = null;
                                        mVar2.K = 8;
                                        ((vt.d) cVar2).b(mVar2);
                                        if (b0Var == aVar) {
                                            return b0Var;
                                        }
                                    } else {
                                        i11 = ((iIndexOf / 2) + 1) * 2;
                                        Long l16 = (Long) ry.m.t0(i11, listN);
                                        Long l17 = (Long) ry.m.t0(i11 + 1, listN);
                                        if (l16 == null || l17 == null) {
                                            vt.c cVar3 = this.f50703b;
                                            mVar2.f36792a = null;
                                            mVar2.f36793b = null;
                                            mVar2.f36794c = null;
                                            mVar2.K = 8;
                                            ((vt.d) cVar3).b(mVar2);
                                            if (b0Var == aVar) {
                                                return b0Var;
                                            }
                                        } else {
                                            long jLongValue3 = l16.longValue();
                                            long unitId2 = chineseToneLesson.getUnitId();
                                            mVar2.f36792a = l16;
                                            mVar2.f36793b = l17;
                                            mVar2.f36795d = iIndexOf;
                                            mVar2.f36796e = i11;
                                            mVar2.K = 3;
                                            Enum enumC2 = ((ds.g) g0Var).c(jLongValue3, unitId2, mVar2);
                                            if (enumC2 != aVar) {
                                                l9 = l17;
                                                objE = enumC2;
                                                l11 = l16;
                                                lessonState = (LessonState) objE;
                                                long jLongValue4 = l9.longValue();
                                                long unitId3 = chineseToneLesson.getUnitId();
                                                mVar2.f36792a = l11;
                                                mVar2.f36793b = l9;
                                                mVar2.f36794c = lessonState;
                                                mVar2.f36795d = iIndexOf;
                                                mVar2.f36796e = i11;
                                                mVar2.K = 4;
                                                l12 = l11;
                                                enumC = ((ds.g) g0Var).c(jLongValue4, unitId3, mVar2);
                                                if (enumC == aVar) {
                                                    lessonState2 = lessonState;
                                                    objE = enumC;
                                                    l13 = l9;
                                                    l14 = l12;
                                                    i12 = iIndexOf;
                                                    i13 = i11;
                                                    LessonState lessonState8 = (LessonState) objE;
                                                    lessonState3 = LessonState.StateLocked;
                                                    if (lessonState2 == lessonState3 || lessonState8 != lessonState3) {
                                                        i14 = 0;
                                                    } else {
                                                        i14 = 1;
                                                    }
                                                    if (i14 != 0) {
                                                        jLongValue = l14.longValue();
                                                        lessonState4 = LessonState.StateOpen;
                                                        mVar2.f36792a = l14;
                                                        mVar2.f36793b = l13;
                                                        mVar2.f36794c = null;
                                                        mVar2.f36795d = i12;
                                                        mVar2.f36796e = i13;
                                                        mVar2.f36797f = i14;
                                                        mVar2.K = 5;
                                                        if (((ds.g) g0Var).g(jLongValue, lessonState4, mVar2) != aVar) {
                                                            i15 = i12;
                                                            i16 = i13;
                                                            i17 = i14;
                                                            jLongValue2 = l13.longValue();
                                                            lessonState5 = LessonState.StateOpen;
                                                            mVar2.f36792a = l14;
                                                            mVar2.f36793b = null;
                                                            mVar2.f36794c = null;
                                                            mVar2.f36795d = i15;
                                                            mVar2.f36796e = i16;
                                                            mVar2.f36797f = i17;
                                                            mVar2.K = 6;
                                                            if (((ds.g) g0Var).g(jLongValue2, lessonState5, mVar2) == aVar) {
                                                                l15 = l14;
                                                                j11 = -l15.longValue();
                                                                lessonState6 = LessonState.StateOpen;
                                                                mVar2.f36792a = null;
                                                                mVar2.f36793b = null;
                                                                mVar2.f36794c = null;
                                                                mVar2.f36795d = i15;
                                                                mVar2.f36796e = i16;
                                                                mVar2.f36797f = i17;
                                                                mVar2.K = 7;
                                                                if (((ds.g) g0Var).g(j11, lessonState6, mVar2) != aVar) {
                                                                    vt.c cVar4 = this.f50703b;
                                                                    mVar2.f36792a = null;
                                                                    mVar2.f36793b = null;
                                                                    mVar2.f36794c = null;
                                                                    mVar2.K = 8;
                                                                    ((vt.d) cVar4).b(mVar2);
                                                                    if (b0Var == aVar) {
                                                                        return b0Var;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        vt.c cVar5 = this.f50703b;
                                                        mVar2.f36792a = null;
                                                        mVar2.f36793b = null;
                                                        mVar2.f36794c = null;
                                                        mVar2.K = 8;
                                                        ((vt.d) cVar5).b(mVar2);
                                                        if (b0Var == aVar) {
                                                            return b0Var;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                vt.c cVar6 = this.f50703b;
                                mVar2.f36792a = null;
                                mVar2.f36793b = null;
                                mVar2.f36794c = null;
                                mVar2.K = 8;
                                ((vt.d) cVar6).b(mVar2);
                                if (b0Var == aVar) {
                                    return b0Var;
                                }
                            }
                        }
                        return aVar;
                    case 1:
                        com.bumptech.glide.e.F(objE);
                        if (chineseToneLesson.getUnitId() == 1) {
                            long unitId4 = chineseToneLesson.getUnitId();
                            mVar2.K = 2;
                            ds.g gVar2 = (ds.g) g0Var;
                            gVar2.getClass();
                            objE = gVar2.e(null, new bh.b(unitId4, dVar, 12), mVar2);
                            if (objE == aVar) {
                                chineseToneUnit = (ChineseToneUnit) objE;
                                if (chineseToneUnit != null) {
                                    listN = ks.b.n(chineseToneUnit.getLessonList());
                                } else {
                                    listN = ry.r.f50854a;
                                }
                                iIndexOf = listN.indexOf(new Long(chineseToneLesson.getLessonId()));
                                if (iIndexOf >= 0) {
                                    vt.c cVar7 = this.f50703b;
                                    mVar2.f36792a = null;
                                    mVar2.f36793b = null;
                                    mVar2.f36794c = null;
                                    mVar2.K = 8;
                                    ((vt.d) cVar7).b(mVar2);
                                    if (b0Var == aVar) {
                                        return b0Var;
                                    }
                                } else {
                                    vt.c cVar8 = this.f50703b;
                                    mVar2.f36792a = null;
                                    mVar2.f36793b = null;
                                    mVar2.f36794c = null;
                                    mVar2.K = 8;
                                    ((vt.d) cVar8).b(mVar2);
                                    if (b0Var == aVar) {
                                        return b0Var;
                                    }
                                }
                            }
                        } else {
                            vt.c cVar9 = this.f50703b;
                            mVar2.f36792a = null;
                            mVar2.f36793b = null;
                            mVar2.f36794c = null;
                            mVar2.K = 8;
                            ((vt.d) cVar9).b(mVar2);
                            if (b0Var == aVar) {
                                return b0Var;
                            }
                        }
                        return aVar;
                    case 2:
                        com.bumptech.glide.e.F(objE);
                        chineseToneUnit = (ChineseToneUnit) objE;
                        if (chineseToneUnit != null) {
                            listN = ks.b.n(chineseToneUnit.getLessonList());
                        } else {
                            listN = ry.r.f50854a;
                        }
                        iIndexOf = listN.indexOf(new Long(chineseToneLesson.getLessonId()));
                        if (iIndexOf >= 0) {
                            vt.c cVar10 = this.f50703b;
                            mVar2.f36792a = null;
                            mVar2.f36793b = null;
                            mVar2.f36794c = null;
                            mVar2.K = 8;
                            ((vt.d) cVar10).b(mVar2);
                            if (b0Var == aVar) {
                                return b0Var;
                            }
                        } else {
                            vt.c cVar11 = this.f50703b;
                            mVar2.f36792a = null;
                            mVar2.f36793b = null;
                            mVar2.f36794c = null;
                            mVar2.K = 8;
                            ((vt.d) cVar11).b(mVar2);
                            if (b0Var == aVar) {
                                return b0Var;
                            }
                        }
                        return aVar;
                    case 3:
                        int i21 = mVar2.f36796e;
                        int i22 = mVar2.f36795d;
                        Long l18 = mVar2.f36793b;
                        Long l19 = mVar2.f36792a;
                        com.bumptech.glide.e.F(objE);
                        i11 = i21;
                        iIndexOf = i22;
                        l9 = l18;
                        l11 = l19;
                        lessonState = (LessonState) objE;
                        long jLongValue5 = l9.longValue();
                        long unitId5 = chineseToneLesson.getUnitId();
                        mVar2.f36792a = l11;
                        mVar2.f36793b = l9;
                        mVar2.f36794c = lessonState;
                        mVar2.f36795d = iIndexOf;
                        mVar2.f36796e = i11;
                        mVar2.K = 4;
                        l12 = l11;
                        enumC = ((ds.g) g0Var).c(jLongValue5, unitId5, mVar2);
                        if (enumC == aVar) {
                            lessonState2 = lessonState;
                            objE = enumC;
                            l13 = l9;
                            l14 = l12;
                            i12 = iIndexOf;
                            i13 = i11;
                            LessonState lessonState9 = (LessonState) objE;
                            lessonState3 = LessonState.StateLocked;
                            if (lessonState2 == lessonState3) {
                                i14 = 0;
                            } else {
                                i14 = 0;
                            }
                            if (i14 != 0) {
                                jLongValue = l14.longValue();
                                lessonState4 = LessonState.StateOpen;
                                mVar2.f36792a = l14;
                                mVar2.f36793b = l13;
                                mVar2.f36794c = null;
                                mVar2.f36795d = i12;
                                mVar2.f36796e = i13;
                                mVar2.f36797f = i14;
                                mVar2.K = 5;
                                if (((ds.g) g0Var).g(jLongValue, lessonState4, mVar2) != aVar) {
                                    i15 = i12;
                                    i16 = i13;
                                    i17 = i14;
                                    jLongValue2 = l13.longValue();
                                    lessonState5 = LessonState.StateOpen;
                                    mVar2.f36792a = l14;
                                    mVar2.f36793b = null;
                                    mVar2.f36794c = null;
                                    mVar2.f36795d = i15;
                                    mVar2.f36796e = i16;
                                    mVar2.f36797f = i17;
                                    mVar2.K = 6;
                                    if (((ds.g) g0Var).g(jLongValue2, lessonState5, mVar2) == aVar) {
                                        l15 = l14;
                                        j11 = -l15.longValue();
                                        lessonState6 = LessonState.StateOpen;
                                        mVar2.f36792a = null;
                                        mVar2.f36793b = null;
                                        mVar2.f36794c = null;
                                        mVar2.f36795d = i15;
                                        mVar2.f36796e = i16;
                                        mVar2.f36797f = i17;
                                        mVar2.K = 7;
                                        if (((ds.g) g0Var).g(j11, lessonState6, mVar2) != aVar) {
                                            vt.c cVar12 = this.f50703b;
                                            mVar2.f36792a = null;
                                            mVar2.f36793b = null;
                                            mVar2.f36794c = null;
                                            mVar2.K = 8;
                                            ((vt.d) cVar12).b(mVar2);
                                            if (b0Var == aVar) {
                                                return b0Var;
                                            }
                                        }
                                    }
                                }
                            } else {
                                vt.c cVar13 = this.f50703b;
                                mVar2.f36792a = null;
                                mVar2.f36793b = null;
                                mVar2.f36794c = null;
                                mVar2.K = 8;
                                ((vt.d) cVar13).b(mVar2);
                                if (b0Var == aVar) {
                                    return b0Var;
                                }
                            }
                        }
                        return aVar;
                    case 4:
                        i13 = mVar2.f36796e;
                        i12 = mVar2.f36795d;
                        lessonState2 = mVar2.f36794c;
                        l13 = mVar2.f36793b;
                        l14 = mVar2.f36792a;
                        com.bumptech.glide.e.F(objE);
                        LessonState lessonState10 = (LessonState) objE;
                        lessonState3 = LessonState.StateLocked;
                        if (lessonState2 == lessonState3) {
                            i14 = 0;
                        } else {
                            i14 = 0;
                        }
                        if (i14 != 0) {
                            jLongValue = l14.longValue();
                            lessonState4 = LessonState.StateOpen;
                            mVar2.f36792a = l14;
                            mVar2.f36793b = l13;
                            mVar2.f36794c = null;
                            mVar2.f36795d = i12;
                            mVar2.f36796e = i13;
                            mVar2.f36797f = i14;
                            mVar2.K = 5;
                            if (((ds.g) g0Var).g(jLongValue, lessonState4, mVar2) != aVar) {
                                i15 = i12;
                                i16 = i13;
                                i17 = i14;
                                jLongValue2 = l13.longValue();
                                lessonState5 = LessonState.StateOpen;
                                mVar2.f36792a = l14;
                                mVar2.f36793b = null;
                                mVar2.f36794c = null;
                                mVar2.f36795d = i15;
                                mVar2.f36796e = i16;
                                mVar2.f36797f = i17;
                                mVar2.K = 6;
                                if (((ds.g) g0Var).g(jLongValue2, lessonState5, mVar2) == aVar) {
                                    l15 = l14;
                                    j11 = -l15.longValue();
                                    lessonState6 = LessonState.StateOpen;
                                    mVar2.f36792a = null;
                                    mVar2.f36793b = null;
                                    mVar2.f36794c = null;
                                    mVar2.f36795d = i15;
                                    mVar2.f36796e = i16;
                                    mVar2.f36797f = i17;
                                    mVar2.K = 7;
                                    if (((ds.g) g0Var).g(j11, lessonState6, mVar2) != aVar) {
                                        vt.c cVar14 = this.f50703b;
                                        mVar2.f36792a = null;
                                        mVar2.f36793b = null;
                                        mVar2.f36794c = null;
                                        mVar2.K = 8;
                                        ((vt.d) cVar14).b(mVar2);
                                        if (b0Var == aVar) {
                                            return b0Var;
                                        }
                                    }
                                }
                            }
                        } else {
                            vt.c cVar15 = this.f50703b;
                            mVar2.f36792a = null;
                            mVar2.f36793b = null;
                            mVar2.f36794c = null;
                            mVar2.K = 8;
                            ((vt.d) cVar15).b(mVar2);
                            if (b0Var == aVar) {
                                return b0Var;
                            }
                        }
                        return aVar;
                    case 5:
                        i17 = mVar2.f36797f;
                        i16 = mVar2.f36796e;
                        i15 = mVar2.f36795d;
                        l13 = mVar2.f36793b;
                        l14 = mVar2.f36792a;
                        com.bumptech.glide.e.F(objE);
                        jLongValue2 = l13.longValue();
                        lessonState5 = LessonState.StateOpen;
                        mVar2.f36792a = l14;
                        mVar2.f36793b = null;
                        mVar2.f36794c = null;
                        mVar2.f36795d = i15;
                        mVar2.f36796e = i16;
                        mVar2.f36797f = i17;
                        mVar2.K = 6;
                        if (((ds.g) g0Var).g(jLongValue2, lessonState5, mVar2) == aVar) {
                            l15 = l14;
                            j11 = -l15.longValue();
                            lessonState6 = LessonState.StateOpen;
                            mVar2.f36792a = null;
                            mVar2.f36793b = null;
                            mVar2.f36794c = null;
                            mVar2.f36795d = i15;
                            mVar2.f36796e = i16;
                            mVar2.f36797f = i17;
                            mVar2.K = 7;
                            if (((ds.g) g0Var).g(j11, lessonState6, mVar2) != aVar) {
                                vt.c cVar16 = this.f50703b;
                                mVar2.f36792a = null;
                                mVar2.f36793b = null;
                                mVar2.f36794c = null;
                                mVar2.K = 8;
                                ((vt.d) cVar16).b(mVar2);
                                if (b0Var == aVar) {
                                    return b0Var;
                                }
                            }
                        }
                        return aVar;
                    case 6:
                        i17 = mVar2.f36797f;
                        i16 = mVar2.f36796e;
                        i15 = mVar2.f36795d;
                        l15 = mVar2.f36792a;
                        com.bumptech.glide.e.F(objE);
                        j11 = -l15.longValue();
                        lessonState6 = LessonState.StateOpen;
                        mVar2.f36792a = null;
                        mVar2.f36793b = null;
                        mVar2.f36794c = null;
                        mVar2.f36795d = i15;
                        mVar2.f36796e = i16;
                        mVar2.f36797f = i17;
                        mVar2.K = 7;
                        if (((ds.g) g0Var).g(j11, lessonState6, mVar2) != aVar) {
                            vt.c cVar17 = this.f50703b;
                            mVar2.f36792a = null;
                            mVar2.f36793b = null;
                            mVar2.f36794c = null;
                            mVar2.K = 8;
                            ((vt.d) cVar17).b(mVar2);
                            if (b0Var == aVar) {
                                return b0Var;
                            }
                        }
                        return aVar;
                    case 7:
                        com.bumptech.glide.e.F(objE);
                        vt.c cVar18 = this.f50703b;
                        mVar2.f36792a = null;
                        mVar2.f36793b = null;
                        mVar2.f36794c = null;
                        mVar2.K = 8;
                        ((vt.d) cVar18).b(mVar2);
                        if (b0Var == aVar) {
                            return aVar;
                        }
                        return b0Var;
                    case 8:
                        com.bumptech.glide.e.F(objE);
                        return b0Var;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } catch (Exception e8) {
                xy.f.a(Log.e("ChineseToneTestViewModel", "Unit 1 解锁后续课程失败", e8));
            }
        } catch (Exception unused) {
        }
    }

    public final CourseWord L(ChineseToneWord chineseToneWord) {
        kotlin.jvm.internal.m.f(chineseToneWord, "<this>");
        ChineseToneLesson chineseToneLesson = this.f36826q0;
        boolean zD = ry.l.D(new Long[]{3022L, 3019L}, Long.valueOf(chineseToneLesson.getLessonId()));
        String strNormalize = zD ? Normalizer.normalize(chineseToneWord.getWord(), Normalizer.Form.NFD) : BuildConfig.VERSION_NAME;
        String strNormalize2 = zD ? (String) oz.q.W0(chineseToneWord.getCharacter(), new String[]{"/"}, 0, 6).get(0) : Normalizer.normalize(chineseToneWord.getWord(), Normalizer.Form.NFD);
        long wordId = chineseToneWord.getWordId();
        kotlin.jvm.internal.m.c(strNormalize2);
        CourseWord courseWord = new CourseWord(wordId, strNormalize2, 4, BuildConfig.VERSION_NAME);
        Uri uri = Uri.parse(xt.b.a().c() + v10.c.m(chineseToneWord.getWordId()));
        kotlin.jvm.internal.m.c(strNormalize);
        return CourseWord.copy$default(courseWord, 0L, null, strNormalize, null, null, null, 0, 0, null, null, null, null, null, null, null, uri, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, null, null, new ChineseToneMetaData(chineseToneWord.getShengMu(), chineseToneWord.getYunMu(), chineseToneWord.getQingSheng(), chineseToneWord.getShengDiao(), chineseToneWord.getCharacter(), chineseToneLesson.getLessonId() == 15, chineseToneLesson.getUnitId() == 4), 0, -32773, 47, null);
    }
}
