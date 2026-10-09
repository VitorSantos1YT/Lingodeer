package e2;

import android.os.Trace;
import android.view.KeyEvent;
import android.view.View;
import androidx.compose.ui.platform.AndroidComposeView;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import rt.mc;
import y.r0;
import y2.d2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AndroidComposeView f24736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AndroidComposeView f24737b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f24739d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public y.b0 f24741f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public e0 f24743h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e0 f24738c = new e0(2, 14, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n f24740e = new n(this);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final y.e0 f24742g = new y.e0(1);

    public p(AndroidComposeView androidComposeView, AndroidComposeView androidComposeView2) {
        this.f24736a = androidComposeView;
        this.f24737b = androidComposeView2;
        this.f24739d = new i(this, androidComposeView2);
    }

    public final boolean b(boolean z11) {
        mc mcVar;
        if (g() != null) {
            e0 e0VarG = g();
            j(null);
            if (e0VarG != null) {
                e0VarG.U0(b0.Active, b0.Inactive);
                if (!e0VarG.f58482a.P) {
                    v2.a.b("visitAncestors called on an unattached node");
                }
                z1.q qVar = e0VarG.f58482a.f58486e;
                y2.i0 i0VarX = y2.f.x(e0VarG);
                while (i0VarX != null) {
                    if ((((z1.q) i0VarX.f56892i0.f50089g).f58485d & 1024) != 0) {
                        while (qVar != null) {
                            if ((qVar.f58484c & 1024) != 0) {
                                n1.e eVar = null;
                                z1.q qVarF = qVar;
                                while (qVarF != null) {
                                    if (qVarF instanceof e0) {
                                        ((e0) qVarF).U0(b0.ActiveParent, b0.Inactive);
                                    } else if ((qVarF.f58484c & 1024) != 0 && (qVarF instanceof y2.n)) {
                                        int i11 = 0;
                                        for (z1.q qVar2 = ((y2.n) qVarF).R; qVar2 != null; qVar2 = qVar2.f58487f) {
                                            if ((qVar2.f58484c & 1024) != 0) {
                                                i11++;
                                                if (i11 == 1) {
                                                    qVarF = qVar2;
                                                } else {
                                                    if (eVar == null) {
                                                        eVar = new n1.e(new z1.q[16]);
                                                    }
                                                    if (qVarF != null) {
                                                        eVar.c(qVarF);
                                                        qVarF = null;
                                                    }
                                                    eVar.c(qVar2);
                                                }
                                            }
                                        }
                                        if (i11 == 1) {
                                        }
                                    }
                                    qVarF = y2.f.f(eVar);
                                }
                            }
                            qVar = qVar.f58486e;
                        }
                    }
                    i0VarX = i0VarX.w();
                    qVar = (i0VarX == null || (mcVar = i0VarX.f56892i0) == null) ? null : (d2) mcVar.f50088f;
                }
            }
        }
        return true;
    }

    public final boolean c(int i11, boolean z11, boolean z12) {
        boolean z13 = true;
        if (z11) {
            b(z11);
        } else {
            int i12 = m.f24732a[d.u(this.f24738c, i11).ordinal()];
            if (i12 == 1 || i12 == 2 || i12 == 3) {
                z13 = false;
            } else {
                if (i12 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                b(z11);
            }
        }
        if (z13 && z12) {
            d();
        }
        return z13;
    }

    public final void d() {
        AndroidComposeView androidComposeView = this.f24736a;
        if (androidComposeView.isFocused() || androidComposeView.hasFocus()) {
            androidComposeView.clearFocus();
        } else if (androidComposeView.hasFocus()) {
            View viewFindFocus = androidComposeView.findFocus();
            if (viewFindFocus != null) {
                viewFindFocus.clearFocus();
            }
            androidComposeView.clearFocus();
        }
    }

    /* JADX WARN: Code duplicated, block: B:118:0x015a A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x0172, B:130:0x0178, B:131:0x017b, B:133:0x0186, B:136:0x0194, B:140:0x019e, B:143:0x01a4, B:144:0x01a9, B:164:0x01e3, B:145:0x01ad, B:147:0x01b3, B:149:0x01b7, B:151:0x01bf, B:153:0x01c5, B:157:0x01cd, B:159:0x01d6, B:160:0x01da, B:161:0x01dd, B:165:0x01e8, B:166:0x01eb, B:168:0x01f1, B:170:0x01f5, B:173:0x01fe, B:175:0x0206, B:182:0x021d, B:184:0x0222, B:186:0x0226, B:209:0x0268, B:190:0x0232, B:192:0x0238, B:194:0x023c, B:196:0x0244, B:198:0x024a, B:202:0x0252, B:204:0x025b, B:205:0x025f, B:206:0x0262, B:210:0x026d, B:214:0x027d, B:216:0x0282, B:218:0x0286, B:241:0x02c8, B:222:0x0292, B:224:0x0298, B:226:0x029c, B:228:0x02a4, B:230:0x02aa, B:234:0x02b2, B:236:0x02bb, B:237:0x02bf, B:238:0x02c2, B:243:0x02cf, B:245:0x02d6, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007d, B:46:0x0087, B:77:0x00dc, B:79:0x00e0, B:49:0x008c, B:51:0x0092, B:53:0x0096, B:55:0x009e, B:57:0x00a4, B:61:0x00ac, B:63:0x00b5, B:64:0x00b9, B:65:0x00bc, B:68:0x00c2, B:69:0x00c7, B:70:0x00ca, B:72:0x00d0, B:74:0x00d4, B:80:0x00e6, B:82:0x00ec, B:83:0x00ef, B:85:0x00f9, B:88:0x0107, B:92:0x0111, B:123:0x0166, B:125:0x016a, B:95:0x0116, B:97:0x011c, B:99:0x0120, B:101:0x0128, B:103:0x012e, B:107:0x0136, B:109:0x013f, B:110:0x0143, B:111:0x0146, B:114:0x014c, B:115:0x0151, B:116:0x0154, B:118:0x015a, B:120:0x015e), top: B:254:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:125:0x016a A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x0172, B:130:0x0178, B:131:0x017b, B:133:0x0186, B:136:0x0194, B:140:0x019e, B:143:0x01a4, B:144:0x01a9, B:164:0x01e3, B:145:0x01ad, B:147:0x01b3, B:149:0x01b7, B:151:0x01bf, B:153:0x01c5, B:157:0x01cd, B:159:0x01d6, B:160:0x01da, B:161:0x01dd, B:165:0x01e8, B:166:0x01eb, B:168:0x01f1, B:170:0x01f5, B:173:0x01fe, B:175:0x0206, B:182:0x021d, B:184:0x0222, B:186:0x0226, B:209:0x0268, B:190:0x0232, B:192:0x0238, B:194:0x023c, B:196:0x0244, B:198:0x024a, B:202:0x0252, B:204:0x025b, B:205:0x025f, B:206:0x0262, B:210:0x026d, B:214:0x027d, B:216:0x0282, B:218:0x0286, B:241:0x02c8, B:222:0x0292, B:224:0x0298, B:226:0x029c, B:228:0x02a4, B:230:0x02aa, B:234:0x02b2, B:236:0x02bb, B:237:0x02bf, B:238:0x02c2, B:243:0x02cf, B:245:0x02d6, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007d, B:46:0x0087, B:77:0x00dc, B:79:0x00e0, B:49:0x008c, B:51:0x0092, B:53:0x0096, B:55:0x009e, B:57:0x00a4, B:61:0x00ac, B:63:0x00b5, B:64:0x00b9, B:65:0x00bc, B:68:0x00c2, B:69:0x00c7, B:70:0x00ca, B:72:0x00d0, B:74:0x00d4, B:80:0x00e6, B:82:0x00ec, B:83:0x00ef, B:85:0x00f9, B:88:0x0107, B:92:0x0111, B:123:0x0166, B:125:0x016a, B:95:0x0116, B:97:0x011c, B:99:0x0120, B:101:0x0128, B:103:0x012e, B:107:0x0136, B:109:0x013f, B:110:0x0143, B:111:0x0146, B:114:0x014c, B:115:0x0151, B:116:0x0154, B:118:0x015a, B:120:0x015e), top: B:254:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:126:0x016f  */
    /* JADX WARN: Code duplicated, block: B:315:0x00db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:316:0x008b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:322:0x00c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:335:0x0165 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:336:0x0115 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:337:0x0163 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x005c  */
    /* JADX WARN: Code duplicated, block: B:344:0x0151 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:346:0x014c A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x005e A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x0172, B:130:0x0178, B:131:0x017b, B:133:0x0186, B:136:0x0194, B:140:0x019e, B:143:0x01a4, B:144:0x01a9, B:164:0x01e3, B:145:0x01ad, B:147:0x01b3, B:149:0x01b7, B:151:0x01bf, B:153:0x01c5, B:157:0x01cd, B:159:0x01d6, B:160:0x01da, B:161:0x01dd, B:165:0x01e8, B:166:0x01eb, B:168:0x01f1, B:170:0x01f5, B:173:0x01fe, B:175:0x0206, B:182:0x021d, B:184:0x0222, B:186:0x0226, B:209:0x0268, B:190:0x0232, B:192:0x0238, B:194:0x023c, B:196:0x0244, B:198:0x024a, B:202:0x0252, B:204:0x025b, B:205:0x025f, B:206:0x0262, B:210:0x026d, B:214:0x027d, B:216:0x0282, B:218:0x0286, B:241:0x02c8, B:222:0x0292, B:224:0x0298, B:226:0x029c, B:228:0x02a4, B:230:0x02aa, B:234:0x02b2, B:236:0x02bb, B:237:0x02bf, B:238:0x02c2, B:243:0x02cf, B:245:0x02d6, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007d, B:46:0x0087, B:77:0x00dc, B:79:0x00e0, B:49:0x008c, B:51:0x0092, B:53:0x0096, B:55:0x009e, B:57:0x00a4, B:61:0x00ac, B:63:0x00b5, B:64:0x00b9, B:65:0x00bc, B:68:0x00c2, B:69:0x00c7, B:70:0x00ca, B:72:0x00d0, B:74:0x00d4, B:80:0x00e6, B:82:0x00ec, B:83:0x00ef, B:85:0x00f9, B:88:0x0107, B:92:0x0111, B:123:0x0166, B:125:0x016a, B:95:0x0116, B:97:0x011c, B:99:0x0120, B:101:0x0128, B:103:0x012e, B:107:0x0136, B:109:0x013f, B:110:0x0143, B:111:0x0146, B:114:0x014c, B:115:0x0151, B:116:0x0154, B:118:0x015a, B:120:0x015e), top: B:254:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0064 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x0172, B:130:0x0178, B:131:0x017b, B:133:0x0186, B:136:0x0194, B:140:0x019e, B:143:0x01a4, B:144:0x01a9, B:164:0x01e3, B:145:0x01ad, B:147:0x01b3, B:149:0x01b7, B:151:0x01bf, B:153:0x01c5, B:157:0x01cd, B:159:0x01d6, B:160:0x01da, B:161:0x01dd, B:165:0x01e8, B:166:0x01eb, B:168:0x01f1, B:170:0x01f5, B:173:0x01fe, B:175:0x0206, B:182:0x021d, B:184:0x0222, B:186:0x0226, B:209:0x0268, B:190:0x0232, B:192:0x0238, B:194:0x023c, B:196:0x0244, B:198:0x024a, B:202:0x0252, B:204:0x025b, B:205:0x025f, B:206:0x0262, B:210:0x026d, B:214:0x027d, B:216:0x0282, B:218:0x0286, B:241:0x02c8, B:222:0x0292, B:224:0x0298, B:226:0x029c, B:228:0x02a4, B:230:0x02aa, B:234:0x02b2, B:236:0x02bb, B:237:0x02bf, B:238:0x02c2, B:243:0x02cf, B:245:0x02d6, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007d, B:46:0x0087, B:77:0x00dc, B:79:0x00e0, B:49:0x008c, B:51:0x0092, B:53:0x0096, B:55:0x009e, B:57:0x00a4, B:61:0x00ac, B:63:0x00b5, B:64:0x00b9, B:65:0x00bc, B:68:0x00c2, B:69:0x00c7, B:70:0x00ca, B:72:0x00d0, B:74:0x00d4, B:80:0x00e6, B:82:0x00ec, B:83:0x00ef, B:85:0x00f9, B:88:0x0107, B:92:0x0111, B:123:0x0166, B:125:0x016a, B:95:0x0116, B:97:0x011c, B:99:0x0120, B:101:0x0128, B:103:0x012e, B:107:0x0136, B:109:0x013f, B:110:0x0143, B:111:0x0146, B:114:0x014c, B:115:0x0151, B:116:0x0154, B:118:0x015a, B:120:0x015e), top: B:254:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x006f A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x0172, B:130:0x0178, B:131:0x017b, B:133:0x0186, B:136:0x0194, B:140:0x019e, B:143:0x01a4, B:144:0x01a9, B:164:0x01e3, B:145:0x01ad, B:147:0x01b3, B:149:0x01b7, B:151:0x01bf, B:153:0x01c5, B:157:0x01cd, B:159:0x01d6, B:160:0x01da, B:161:0x01dd, B:165:0x01e8, B:166:0x01eb, B:168:0x01f1, B:170:0x01f5, B:173:0x01fe, B:175:0x0206, B:182:0x021d, B:184:0x0222, B:186:0x0226, B:209:0x0268, B:190:0x0232, B:192:0x0238, B:194:0x023c, B:196:0x0244, B:198:0x024a, B:202:0x0252, B:204:0x025b, B:205:0x025f, B:206:0x0262, B:210:0x026d, B:214:0x027d, B:216:0x0282, B:218:0x0286, B:241:0x02c8, B:222:0x0292, B:224:0x0298, B:226:0x029c, B:228:0x02a4, B:230:0x02aa, B:234:0x02b2, B:236:0x02bb, B:237:0x02bf, B:238:0x02c2, B:243:0x02cf, B:245:0x02d6, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007d, B:46:0x0087, B:77:0x00dc, B:79:0x00e0, B:49:0x008c, B:51:0x0092, B:53:0x0096, B:55:0x009e, B:57:0x00a4, B:61:0x00ac, B:63:0x00b5, B:64:0x00b9, B:65:0x00bc, B:68:0x00c2, B:69:0x00c7, B:70:0x00ca, B:72:0x00d0, B:74:0x00d4, B:80:0x00e6, B:82:0x00ec, B:83:0x00ef, B:85:0x00f9, B:88:0x0107, B:92:0x0111, B:123:0x0166, B:125:0x016a, B:95:0x0116, B:97:0x011c, B:99:0x0120, B:101:0x0128, B:103:0x012e, B:107:0x0136, B:109:0x013f, B:110:0x0143, B:111:0x0146, B:114:0x014c, B:115:0x0151, B:116:0x0154, B:118:0x015a, B:120:0x015e), top: B:254:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x007b A[ADDED_TO_REGION, LOOP:12: B:41:0x007b->B:69:0x00c7, LOOP_START, PHI: r7
      0x007b: PHI (r7v29 z1.q) = (r7v23 z1.q), (r7v30 z1.q) binds: [B:40:0x0079, B:69:0x00c7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x007d A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x0172, B:130:0x0178, B:131:0x017b, B:133:0x0186, B:136:0x0194, B:140:0x019e, B:143:0x01a4, B:144:0x01a9, B:164:0x01e3, B:145:0x01ad, B:147:0x01b3, B:149:0x01b7, B:151:0x01bf, B:153:0x01c5, B:157:0x01cd, B:159:0x01d6, B:160:0x01da, B:161:0x01dd, B:165:0x01e8, B:166:0x01eb, B:168:0x01f1, B:170:0x01f5, B:173:0x01fe, B:175:0x0206, B:182:0x021d, B:184:0x0222, B:186:0x0226, B:209:0x0268, B:190:0x0232, B:192:0x0238, B:194:0x023c, B:196:0x0244, B:198:0x024a, B:202:0x0252, B:204:0x025b, B:205:0x025f, B:206:0x0262, B:210:0x026d, B:214:0x027d, B:216:0x0282, B:218:0x0286, B:241:0x02c8, B:222:0x0292, B:224:0x0298, B:226:0x029c, B:228:0x02a4, B:230:0x02aa, B:234:0x02b2, B:236:0x02bb, B:237:0x02bf, B:238:0x02c2, B:243:0x02cf, B:245:0x02d6, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007d, B:46:0x0087, B:77:0x00dc, B:79:0x00e0, B:49:0x008c, B:51:0x0092, B:53:0x0096, B:55:0x009e, B:57:0x00a4, B:61:0x00ac, B:63:0x00b5, B:64:0x00b9, B:65:0x00bc, B:68:0x00c2, B:69:0x00c7, B:70:0x00ca, B:72:0x00d0, B:74:0x00d4, B:80:0x00e6, B:82:0x00ec, B:83:0x00ef, B:85:0x00f9, B:88:0x0107, B:92:0x0111, B:123:0x0166, B:125:0x016a, B:95:0x0116, B:97:0x011c, B:99:0x0120, B:101:0x0128, B:103:0x012e, B:107:0x0136, B:109:0x013f, B:110:0x0143, B:111:0x0146, B:114:0x014c, B:115:0x0151, B:116:0x0154, B:118:0x015a, B:120:0x015e), top: B:254:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x0083  */
    /* JADX WARN: Code duplicated, block: B:46:0x0087 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x0172, B:130:0x0178, B:131:0x017b, B:133:0x0186, B:136:0x0194, B:140:0x019e, B:143:0x01a4, B:144:0x01a9, B:164:0x01e3, B:145:0x01ad, B:147:0x01b3, B:149:0x01b7, B:151:0x01bf, B:153:0x01c5, B:157:0x01cd, B:159:0x01d6, B:160:0x01da, B:161:0x01dd, B:165:0x01e8, B:166:0x01eb, B:168:0x01f1, B:170:0x01f5, B:173:0x01fe, B:175:0x0206, B:182:0x021d, B:184:0x0222, B:186:0x0226, B:209:0x0268, B:190:0x0232, B:192:0x0238, B:194:0x023c, B:196:0x0244, B:198:0x024a, B:202:0x0252, B:204:0x025b, B:205:0x025f, B:206:0x0262, B:210:0x026d, B:214:0x027d, B:216:0x0282, B:218:0x0286, B:241:0x02c8, B:222:0x0292, B:224:0x0298, B:226:0x029c, B:228:0x02a4, B:230:0x02aa, B:234:0x02b2, B:236:0x02bb, B:237:0x02bf, B:238:0x02c2, B:243:0x02cf, B:245:0x02d6, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007d, B:46:0x0087, B:77:0x00dc, B:79:0x00e0, B:49:0x008c, B:51:0x0092, B:53:0x0096, B:55:0x009e, B:57:0x00a4, B:61:0x00ac, B:63:0x00b5, B:64:0x00b9, B:65:0x00bc, B:68:0x00c2, B:69:0x00c7, B:70:0x00ca, B:72:0x00d0, B:74:0x00d4, B:80:0x00e6, B:82:0x00ec, B:83:0x00ef, B:85:0x00f9, B:88:0x0107, B:92:0x0111, B:123:0x0166, B:125:0x016a, B:95:0x0116, B:97:0x011c, B:99:0x0120, B:101:0x0128, B:103:0x012e, B:107:0x0136, B:109:0x013f, B:110:0x0143, B:111:0x0146, B:114:0x014c, B:115:0x0151, B:116:0x0154, B:118:0x015a, B:120:0x015e), top: B:254:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x008c A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x0172, B:130:0x0178, B:131:0x017b, B:133:0x0186, B:136:0x0194, B:140:0x019e, B:143:0x01a4, B:144:0x01a9, B:164:0x01e3, B:145:0x01ad, B:147:0x01b3, B:149:0x01b7, B:151:0x01bf, B:153:0x01c5, B:157:0x01cd, B:159:0x01d6, B:160:0x01da, B:161:0x01dd, B:165:0x01e8, B:166:0x01eb, B:168:0x01f1, B:170:0x01f5, B:173:0x01fe, B:175:0x0206, B:182:0x021d, B:184:0x0222, B:186:0x0226, B:209:0x0268, B:190:0x0232, B:192:0x0238, B:194:0x023c, B:196:0x0244, B:198:0x024a, B:202:0x0252, B:204:0x025b, B:205:0x025f, B:206:0x0262, B:210:0x026d, B:214:0x027d, B:216:0x0282, B:218:0x0286, B:241:0x02c8, B:222:0x0292, B:224:0x0298, B:226:0x029c, B:228:0x02a4, B:230:0x02aa, B:234:0x02b2, B:236:0x02bb, B:237:0x02bf, B:238:0x02c2, B:243:0x02cf, B:245:0x02d6, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007d, B:46:0x0087, B:77:0x00dc, B:79:0x00e0, B:49:0x008c, B:51:0x0092, B:53:0x0096, B:55:0x009e, B:57:0x00a4, B:61:0x00ac, B:63:0x00b5, B:64:0x00b9, B:65:0x00bc, B:68:0x00c2, B:69:0x00c7, B:70:0x00ca, B:72:0x00d0, B:74:0x00d4, B:80:0x00e6, B:82:0x00ec, B:83:0x00ef, B:85:0x00f9, B:88:0x0107, B:92:0x0111, B:123:0x0166, B:125:0x016a, B:95:0x0116, B:97:0x011c, B:99:0x0120, B:101:0x0128, B:103:0x012e, B:107:0x0136, B:109:0x013f, B:110:0x0143, B:111:0x0146, B:114:0x014c, B:115:0x0151, B:116:0x0154, B:118:0x015a, B:120:0x015e), top: B:254:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x00e0 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x0172, B:130:0x0178, B:131:0x017b, B:133:0x0186, B:136:0x0194, B:140:0x019e, B:143:0x01a4, B:144:0x01a9, B:164:0x01e3, B:145:0x01ad, B:147:0x01b3, B:149:0x01b7, B:151:0x01bf, B:153:0x01c5, B:157:0x01cd, B:159:0x01d6, B:160:0x01da, B:161:0x01dd, B:165:0x01e8, B:166:0x01eb, B:168:0x01f1, B:170:0x01f5, B:173:0x01fe, B:175:0x0206, B:182:0x021d, B:184:0x0222, B:186:0x0226, B:209:0x0268, B:190:0x0232, B:192:0x0238, B:194:0x023c, B:196:0x0244, B:198:0x024a, B:202:0x0252, B:204:0x025b, B:205:0x025f, B:206:0x0262, B:210:0x026d, B:214:0x027d, B:216:0x0282, B:218:0x0286, B:241:0x02c8, B:222:0x0292, B:224:0x0298, B:226:0x029c, B:228:0x02a4, B:230:0x02aa, B:234:0x02b2, B:236:0x02bb, B:237:0x02bf, B:238:0x02c2, B:243:0x02cf, B:245:0x02d6, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007d, B:46:0x0087, B:77:0x00dc, B:79:0x00e0, B:49:0x008c, B:51:0x0092, B:53:0x0096, B:55:0x009e, B:57:0x00a4, B:61:0x00ac, B:63:0x00b5, B:64:0x00b9, B:65:0x00bc, B:68:0x00c2, B:69:0x00c7, B:70:0x00ca, B:72:0x00d0, B:74:0x00d4, B:80:0x00e6, B:82:0x00ec, B:83:0x00ef, B:85:0x00f9, B:88:0x0107, B:92:0x0111, B:123:0x0166, B:125:0x016a, B:95:0x0116, B:97:0x011c, B:99:0x0120, B:101:0x0128, B:103:0x012e, B:107:0x0136, B:109:0x013f, B:110:0x0143, B:111:0x0146, B:114:0x014c, B:115:0x0151, B:116:0x0154, B:118:0x015a, B:120:0x015e), top: B:254:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x00e6 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x0172, B:130:0x0178, B:131:0x017b, B:133:0x0186, B:136:0x0194, B:140:0x019e, B:143:0x01a4, B:144:0x01a9, B:164:0x01e3, B:145:0x01ad, B:147:0x01b3, B:149:0x01b7, B:151:0x01bf, B:153:0x01c5, B:157:0x01cd, B:159:0x01d6, B:160:0x01da, B:161:0x01dd, B:165:0x01e8, B:166:0x01eb, B:168:0x01f1, B:170:0x01f5, B:173:0x01fe, B:175:0x0206, B:182:0x021d, B:184:0x0222, B:186:0x0226, B:209:0x0268, B:190:0x0232, B:192:0x0238, B:194:0x023c, B:196:0x0244, B:198:0x024a, B:202:0x0252, B:204:0x025b, B:205:0x025f, B:206:0x0262, B:210:0x026d, B:214:0x027d, B:216:0x0282, B:218:0x0286, B:241:0x02c8, B:222:0x0292, B:224:0x0298, B:226:0x029c, B:228:0x02a4, B:230:0x02aa, B:234:0x02b2, B:236:0x02bb, B:237:0x02bf, B:238:0x02c2, B:243:0x02cf, B:245:0x02d6, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007d, B:46:0x0087, B:77:0x00dc, B:79:0x00e0, B:49:0x008c, B:51:0x0092, B:53:0x0096, B:55:0x009e, B:57:0x00a4, B:61:0x00ac, B:63:0x00b5, B:64:0x00b9, B:65:0x00bc, B:68:0x00c2, B:69:0x00c7, B:70:0x00ca, B:72:0x00d0, B:74:0x00d4, B:80:0x00e6, B:82:0x00ec, B:83:0x00ef, B:85:0x00f9, B:88:0x0107, B:92:0x0111, B:123:0x0166, B:125:0x016a, B:95:0x0116, B:97:0x011c, B:99:0x0120, B:101:0x0128, B:103:0x012e, B:107:0x0136, B:109:0x013f, B:110:0x0143, B:111:0x0146, B:114:0x014c, B:115:0x0151, B:116:0x0154, B:118:0x015a, B:120:0x015e), top: B:254:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x00ec A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x0172, B:130:0x0178, B:131:0x017b, B:133:0x0186, B:136:0x0194, B:140:0x019e, B:143:0x01a4, B:144:0x01a9, B:164:0x01e3, B:145:0x01ad, B:147:0x01b3, B:149:0x01b7, B:151:0x01bf, B:153:0x01c5, B:157:0x01cd, B:159:0x01d6, B:160:0x01da, B:161:0x01dd, B:165:0x01e8, B:166:0x01eb, B:168:0x01f1, B:170:0x01f5, B:173:0x01fe, B:175:0x0206, B:182:0x021d, B:184:0x0222, B:186:0x0226, B:209:0x0268, B:190:0x0232, B:192:0x0238, B:194:0x023c, B:196:0x0244, B:198:0x024a, B:202:0x0252, B:204:0x025b, B:205:0x025f, B:206:0x0262, B:210:0x026d, B:214:0x027d, B:216:0x0282, B:218:0x0286, B:241:0x02c8, B:222:0x0292, B:224:0x0298, B:226:0x029c, B:228:0x02a4, B:230:0x02aa, B:234:0x02b2, B:236:0x02bb, B:237:0x02bf, B:238:0x02c2, B:243:0x02cf, B:245:0x02d6, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007d, B:46:0x0087, B:77:0x00dc, B:79:0x00e0, B:49:0x008c, B:51:0x0092, B:53:0x0096, B:55:0x009e, B:57:0x00a4, B:61:0x00ac, B:63:0x00b5, B:64:0x00b9, B:65:0x00bc, B:68:0x00c2, B:69:0x00c7, B:70:0x00ca, B:72:0x00d0, B:74:0x00d4, B:80:0x00e6, B:82:0x00ec, B:83:0x00ef, B:85:0x00f9, B:88:0x0107, B:92:0x0111, B:123:0x0166, B:125:0x016a, B:95:0x0116, B:97:0x011c, B:99:0x0120, B:101:0x0128, B:103:0x012e, B:107:0x0136, B:109:0x013f, B:110:0x0143, B:111:0x0146, B:114:0x014c, B:115:0x0151, B:116:0x0154, B:118:0x015a, B:120:0x015e), top: B:254:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x00f9 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x0172, B:130:0x0178, B:131:0x017b, B:133:0x0186, B:136:0x0194, B:140:0x019e, B:143:0x01a4, B:144:0x01a9, B:164:0x01e3, B:145:0x01ad, B:147:0x01b3, B:149:0x01b7, B:151:0x01bf, B:153:0x01c5, B:157:0x01cd, B:159:0x01d6, B:160:0x01da, B:161:0x01dd, B:165:0x01e8, B:166:0x01eb, B:168:0x01f1, B:170:0x01f5, B:173:0x01fe, B:175:0x0206, B:182:0x021d, B:184:0x0222, B:186:0x0226, B:209:0x0268, B:190:0x0232, B:192:0x0238, B:194:0x023c, B:196:0x0244, B:198:0x024a, B:202:0x0252, B:204:0x025b, B:205:0x025f, B:206:0x0262, B:210:0x026d, B:214:0x027d, B:216:0x0282, B:218:0x0286, B:241:0x02c8, B:222:0x0292, B:224:0x0298, B:226:0x029c, B:228:0x02a4, B:230:0x02aa, B:234:0x02b2, B:236:0x02bb, B:237:0x02bf, B:238:0x02c2, B:243:0x02cf, B:245:0x02d6, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007d, B:46:0x0087, B:77:0x00dc, B:79:0x00e0, B:49:0x008c, B:51:0x0092, B:53:0x0096, B:55:0x009e, B:57:0x00a4, B:61:0x00ac, B:63:0x00b5, B:64:0x00b9, B:65:0x00bc, B:68:0x00c2, B:69:0x00c7, B:70:0x00ca, B:72:0x00d0, B:74:0x00d4, B:80:0x00e6, B:82:0x00ec, B:83:0x00ef, B:85:0x00f9, B:88:0x0107, B:92:0x0111, B:123:0x0166, B:125:0x016a, B:95:0x0116, B:97:0x011c, B:99:0x0120, B:101:0x0128, B:103:0x012e, B:107:0x0136, B:109:0x013f, B:110:0x0143, B:111:0x0146, B:114:0x014c, B:115:0x0151, B:116:0x0154, B:118:0x015a, B:120:0x015e), top: B:254:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x0105 A[ADDED_TO_REGION, LOOP:16: B:87:0x0105->B:115:0x0151, LOOP_START, PHI: r1
      0x0105: PHI (r1v15 z1.q) = (r1v9 z1.q), (r1v16 z1.q) binds: [B:86:0x0103, B:115:0x0151] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:88:0x0107 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x0172, B:130:0x0178, B:131:0x017b, B:133:0x0186, B:136:0x0194, B:140:0x019e, B:143:0x01a4, B:144:0x01a9, B:164:0x01e3, B:145:0x01ad, B:147:0x01b3, B:149:0x01b7, B:151:0x01bf, B:153:0x01c5, B:157:0x01cd, B:159:0x01d6, B:160:0x01da, B:161:0x01dd, B:165:0x01e8, B:166:0x01eb, B:168:0x01f1, B:170:0x01f5, B:173:0x01fe, B:175:0x0206, B:182:0x021d, B:184:0x0222, B:186:0x0226, B:209:0x0268, B:190:0x0232, B:192:0x0238, B:194:0x023c, B:196:0x0244, B:198:0x024a, B:202:0x0252, B:204:0x025b, B:205:0x025f, B:206:0x0262, B:210:0x026d, B:214:0x027d, B:216:0x0282, B:218:0x0286, B:241:0x02c8, B:222:0x0292, B:224:0x0298, B:226:0x029c, B:228:0x02a4, B:230:0x02aa, B:234:0x02b2, B:236:0x02bb, B:237:0x02bf, B:238:0x02c2, B:243:0x02cf, B:245:0x02d6, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007d, B:46:0x0087, B:77:0x00dc, B:79:0x00e0, B:49:0x008c, B:51:0x0092, B:53:0x0096, B:55:0x009e, B:57:0x00a4, B:61:0x00ac, B:63:0x00b5, B:64:0x00b9, B:65:0x00bc, B:68:0x00c2, B:69:0x00c7, B:70:0x00ca, B:72:0x00d0, B:74:0x00d4, B:80:0x00e6, B:82:0x00ec, B:83:0x00ef, B:85:0x00f9, B:88:0x0107, B:92:0x0111, B:123:0x0166, B:125:0x016a, B:95:0x0116, B:97:0x011c, B:99:0x0120, B:101:0x0128, B:103:0x012e, B:107:0x0136, B:109:0x013f, B:110:0x0143, B:111:0x0146, B:114:0x014c, B:115:0x0151, B:116:0x0154, B:118:0x015a, B:120:0x015e), top: B:254:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x010d  */
    /* JADX WARN: Code duplicated, block: B:92:0x0111 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x0172, B:130:0x0178, B:131:0x017b, B:133:0x0186, B:136:0x0194, B:140:0x019e, B:143:0x01a4, B:144:0x01a9, B:164:0x01e3, B:145:0x01ad, B:147:0x01b3, B:149:0x01b7, B:151:0x01bf, B:153:0x01c5, B:157:0x01cd, B:159:0x01d6, B:160:0x01da, B:161:0x01dd, B:165:0x01e8, B:166:0x01eb, B:168:0x01f1, B:170:0x01f5, B:173:0x01fe, B:175:0x0206, B:182:0x021d, B:184:0x0222, B:186:0x0226, B:209:0x0268, B:190:0x0232, B:192:0x0238, B:194:0x023c, B:196:0x0244, B:198:0x024a, B:202:0x0252, B:204:0x025b, B:205:0x025f, B:206:0x0262, B:210:0x026d, B:214:0x027d, B:216:0x0282, B:218:0x0286, B:241:0x02c8, B:222:0x0292, B:224:0x0298, B:226:0x029c, B:228:0x02a4, B:230:0x02aa, B:234:0x02b2, B:236:0x02bb, B:237:0x02bf, B:238:0x02c2, B:243:0x02cf, B:245:0x02d6, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007d, B:46:0x0087, B:77:0x00dc, B:79:0x00e0, B:49:0x008c, B:51:0x0092, B:53:0x0096, B:55:0x009e, B:57:0x00a4, B:61:0x00ac, B:63:0x00b5, B:64:0x00b9, B:65:0x00bc, B:68:0x00c2, B:69:0x00c7, B:70:0x00ca, B:72:0x00d0, B:74:0x00d4, B:80:0x00e6, B:82:0x00ec, B:83:0x00ef, B:85:0x00f9, B:88:0x0107, B:92:0x0111, B:123:0x0166, B:125:0x016a, B:95:0x0116, B:97:0x011c, B:99:0x0120, B:101:0x0128, B:103:0x012e, B:107:0x0136, B:109:0x013f, B:110:0x0143, B:111:0x0146, B:114:0x014c, B:115:0x0151, B:116:0x0154, B:118:0x015a, B:120:0x015e), top: B:254:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x0116 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x0172, B:130:0x0178, B:131:0x017b, B:133:0x0186, B:136:0x0194, B:140:0x019e, B:143:0x01a4, B:144:0x01a9, B:164:0x01e3, B:145:0x01ad, B:147:0x01b3, B:149:0x01b7, B:151:0x01bf, B:153:0x01c5, B:157:0x01cd, B:159:0x01d6, B:160:0x01da, B:161:0x01dd, B:165:0x01e8, B:166:0x01eb, B:168:0x01f1, B:170:0x01f5, B:173:0x01fe, B:175:0x0206, B:182:0x021d, B:184:0x0222, B:186:0x0226, B:209:0x0268, B:190:0x0232, B:192:0x0238, B:194:0x023c, B:196:0x0244, B:198:0x024a, B:202:0x0252, B:204:0x025b, B:205:0x025f, B:206:0x0262, B:210:0x026d, B:214:0x027d, B:216:0x0282, B:218:0x0286, B:241:0x02c8, B:222:0x0292, B:224:0x0298, B:226:0x029c, B:228:0x02a4, B:230:0x02aa, B:234:0x02b2, B:236:0x02bb, B:237:0x02bf, B:238:0x02c2, B:243:0x02cf, B:245:0x02d6, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007d, B:46:0x0087, B:77:0x00dc, B:79:0x00e0, B:49:0x008c, B:51:0x0092, B:53:0x0096, B:55:0x009e, B:57:0x00a4, B:61:0x00ac, B:63:0x00b5, B:64:0x00b9, B:65:0x00bc, B:68:0x00c2, B:69:0x00c7, B:70:0x00ca, B:72:0x00d0, B:74:0x00d4, B:80:0x00e6, B:82:0x00ec, B:83:0x00ef, B:85:0x00f9, B:88:0x0107, B:92:0x0111, B:123:0x0166, B:125:0x016a, B:95:0x0116, B:97:0x011c, B:99:0x0120, B:101:0x0128, B:103:0x012e, B:107:0x0136, B:109:0x013f, B:110:0x0143, B:111:0x0146, B:114:0x014c, B:115:0x0151, B:116:0x0154, B:118:0x015a, B:120:0x015e), top: B:254:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x011c A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x0172, B:130:0x0178, B:131:0x017b, B:133:0x0186, B:136:0x0194, B:140:0x019e, B:143:0x01a4, B:144:0x01a9, B:164:0x01e3, B:145:0x01ad, B:147:0x01b3, B:149:0x01b7, B:151:0x01bf, B:153:0x01c5, B:157:0x01cd, B:159:0x01d6, B:160:0x01da, B:161:0x01dd, B:165:0x01e8, B:166:0x01eb, B:168:0x01f1, B:170:0x01f5, B:173:0x01fe, B:175:0x0206, B:182:0x021d, B:184:0x0222, B:186:0x0226, B:209:0x0268, B:190:0x0232, B:192:0x0238, B:194:0x023c, B:196:0x0244, B:198:0x024a, B:202:0x0252, B:204:0x025b, B:205:0x025f, B:206:0x0262, B:210:0x026d, B:214:0x027d, B:216:0x0282, B:218:0x0286, B:241:0x02c8, B:222:0x0292, B:224:0x0298, B:226:0x029c, B:228:0x02a4, B:230:0x02aa, B:234:0x02b2, B:236:0x02bb, B:237:0x02bf, B:238:0x02c2, B:243:0x02cf, B:245:0x02d6, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007d, B:46:0x0087, B:77:0x00dc, B:79:0x00e0, B:49:0x008c, B:51:0x0092, B:53:0x0096, B:55:0x009e, B:57:0x00a4, B:61:0x00ac, B:63:0x00b5, B:64:0x00b9, B:65:0x00bc, B:68:0x00c2, B:69:0x00c7, B:70:0x00ca, B:72:0x00d0, B:74:0x00d4, B:80:0x00e6, B:82:0x00ec, B:83:0x00ef, B:85:0x00f9, B:88:0x0107, B:92:0x0111, B:123:0x0166, B:125:0x016a, B:95:0x0116, B:97:0x011c, B:99:0x0120, B:101:0x0128, B:103:0x012e, B:107:0x0136, B:109:0x013f, B:110:0x0143, B:111:0x0146, B:114:0x014c, B:115:0x0151, B:116:0x0154, B:118:0x015a, B:120:0x015e), top: B:254:0x0007 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [z1.q] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v16, types: [n1.e] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20, types: [n1.e] */
    /* JADX WARN: Type inference failed for: r0v24, types: [z1.q] */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v9, types: [z1.q] */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v4, types: [z1.q] */
    /* JADX WARN: Type inference failed for: r15v5, types: [z1.q] */
    /* JADX WARN: Type inference failed for: r15v9, types: [z1.q] */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v36, types: [n1.e] */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v40, types: [n1.e] */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v46 */
    /* JADX WARN: Type inference failed for: r1v47 */
    /* JADX WARN: Type inference failed for: r7v39 */
    public final boolean e(KeyEvent keyEvent, fz.a aVar) {
        z1.q qVar;
        y2.i0 i0VarX;
        Object obj;
        Object obj2;
        z1.q qVar2;
        mc mcVar;
        z1.q qVarF;
        n1.e eVar;
        z1.q qVar3;
        y2.i0 i0VarX2;
        Object obj3;
        Object obj4;
        mc mcVar2;
        n1.e eVar2;
        z1.q qVarF2;
        int size;
        mc mcVar3;
        e0 e0Var = this.f24738c;
        Trace.beginSection("FocusOwnerImpl:dispatchKeyEvent");
        try {
            if (this.f24739d.f24722e) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching key event while focus system is invalidated.");
                Trace.endSection();
                return false;
            }
            if (!k(keyEvent)) {
                Trace.endSection();
                return false;
            }
            e0 e0VarF = d.f(e0Var);
            if (e0VarF != null) {
                if (!e0VarF.f58482a.P) {
                    v2.a.b("visitLocalDescendants called on an unattached node");
                }
                z1.q qVar4 = e0VarF.f58482a;
                if ((qVar4.f58485d & 9216) != 0) {
                    qVar2 = null;
                    for (z1.q qVar5 = qVar4.f58487f; qVar5 != null; qVar5 = qVar5.f58487f) {
                        int i11 = qVar5.f58484c;
                        if ((i11 & 9216) != 0) {
                            if ((i11 & 1024) != 0) {
                                break;
                            }
                            qVar2 = qVar5;
                        }
                    }
                } else {
                    qVar2 = null;
                }
                if (qVar2 == null) {
                    if (e0VarF == null) {
                        if (!e0Var.f58482a.P) {
                            v2.a.b("visitAncestors called on an unattached node");
                        }
                        qVar = e0Var.f58482a.f58486e;
                        i0VarX = y2.f.x(e0Var);
                        loop15: while (true) {
                            if (i0VarX != null) {
                                obj = null;
                                break;
                            }
                            if ((((z1.q) i0VarX.f56892i0.f50089g).f58485d & OSSConstants.DEFAULT_BUFFER_SIZE) != 0) {
                                while (qVar != null) {
                                    if ((qVar.f58484c & OSSConstants.DEFAULT_BUFFER_SIZE) != 0) {
                                        qVarF = qVar;
                                        eVar = null;
                                        while (qVarF != null) {
                                            if (qVarF instanceof q2.e) {
                                                obj = qVarF;
                                                break loop15;
                                            }
                                            if ((qVarF.f58484c & OSSConstants.DEFAULT_BUFFER_SIZE) == 0) {
                                            }
                                            qVarF = y2.f.f(eVar);
                                        }
                                    }
                                    qVar = qVar.f58486e;
                                }
                            }
                            i0VarX = i0VarX.w();
                            if (i0VarX != null) {
                            }
                        }
                        obj2 = (q2.e) obj;
                        if (obj2 != null) {
                            qVar2 = ((z1.q) obj2).f58482a;
                        } else {
                            qVar2 = null;
                        }
                    } else {
                        if (!e0VarF.f58482a.P) {
                            v2.a.b("visitAncestors called on an unattached node");
                        }
                        qVar3 = e0VarF.f58482a;
                        i0VarX2 = y2.f.x(e0VarF);
                        loop11: while (true) {
                            if (i0VarX2 != null) {
                                obj3 = null;
                                break;
                            }
                            if ((((z1.q) i0VarX2.f56892i0.f50089g).f58485d & OSSConstants.DEFAULT_BUFFER_SIZE) != 0) {
                                while (qVar3 != null) {
                                    if ((qVar3.f58484c & OSSConstants.DEFAULT_BUFFER_SIZE) != 0) {
                                        eVar2 = null;
                                        qVarF2 = qVar3;
                                        while (qVarF2 != null) {
                                            if (qVarF2 instanceof q2.e) {
                                                obj3 = qVarF2;
                                                break loop11;
                                            }
                                            if ((qVarF2.f58484c & OSSConstants.DEFAULT_BUFFER_SIZE) == 0) {
                                            }
                                            qVarF2 = y2.f.f(eVar2);
                                        }
                                    }
                                    qVar3 = qVar3.f58486e;
                                }
                            }
                            i0VarX2 = i0VarX2.w();
                            if (i0VarX2 != null) {
                            }
                        }
                        obj4 = (q2.e) obj3;
                        if (obj4 != null) {
                            qVar2 = ((z1.q) obj4).f58482a;
                        } else {
                            if (!e0Var.f58482a.P) {
                                v2.a.b("visitAncestors called on an unattached node");
                            }
                            qVar = e0Var.f58482a.f58486e;
                            i0VarX = y2.f.x(e0Var);
                            loop15: while (true) {
                                if (i0VarX != null) {
                                    obj = null;
                                    break;
                                }
                                if ((((z1.q) i0VarX.f56892i0.f50089g).f58485d & OSSConstants.DEFAULT_BUFFER_SIZE) != 0) {
                                    while (qVar != null) {
                                        if ((qVar.f58484c & OSSConstants.DEFAULT_BUFFER_SIZE) != 0) {
                                            qVarF = qVar;
                                            eVar = null;
                                            while (qVarF != null) {
                                                if (qVarF instanceof q2.e) {
                                                    obj = qVarF;
                                                    break loop15;
                                                }
                                                if ((qVarF.f58484c & OSSConstants.DEFAULT_BUFFER_SIZE) == 0) {
                                                }
                                                qVarF = y2.f.f(eVar);
                                            }
                                        }
                                        qVar = qVar.f58486e;
                                    }
                                }
                                i0VarX = i0VarX.w();
                                if (i0VarX != null) {
                                }
                            }
                            obj2 = (q2.e) obj;
                            if (obj2 != null) {
                                qVar2 = ((z1.q) obj2).f58482a;
                            } else {
                                qVar2 = null;
                            }
                        }
                    }
                }
            } else if (e0VarF == null) {
                if (!e0Var.f58482a.P) {
                    v2.a.b("visitAncestors called on an unattached node");
                }
                qVar = e0Var.f58482a.f58486e;
                i0VarX = y2.f.x(e0Var);
                loop15: while (true) {
                    if (i0VarX != null) {
                        obj = null;
                        break;
                    }
                    if ((((z1.q) i0VarX.f56892i0.f50089g).f58485d & OSSConstants.DEFAULT_BUFFER_SIZE) != 0) {
                        while (qVar != null) {
                            if ((qVar.f58484c & OSSConstants.DEFAULT_BUFFER_SIZE) != 0) {
                                qVarF = qVar;
                                eVar = null;
                                while (qVarF != null) {
                                    if (qVarF instanceof q2.e) {
                                        obj = qVarF;
                                        break loop15;
                                    }
                                    if ((qVarF.f58484c & OSSConstants.DEFAULT_BUFFER_SIZE) == 0 && (qVarF instanceof y2.n)) {
                                        z1.q qVar6 = ((y2.n) qVarF).R;
                                        int i12 = 0;
                                        while (qVar6 != null) {
                                            if ((qVar6.f58484c & OSSConstants.DEFAULT_BUFFER_SIZE) != 0) {
                                                i12++;
                                                if (i12 == 1) {
                                                    qVarF = qVarF;
                                                    eVar = eVar;
                                                    eVar = eVar;
                                                    qVarF = qVar6;
                                                } else {
                                                    if (eVar == null) {
                                                        eVar = new n1.e(new z1.q[16]);
                                                    }
                                                    if (qVarF != null) {
                                                        eVar.c(qVarF);
                                                        qVarF = null;
                                                    }
                                                    eVar.c(qVar6);
                                                }
                                            } else {
                                                qVarF = qVarF;
                                                eVar = eVar;
                                            }
                                            qVar6 = qVar6.f58487f;
                                            qVarF = qVarF;
                                            eVar = eVar;
                                        }
                                        if (i12 == 1) {
                                            qVarF = qVarF;
                                            eVar = eVar;
                                        } else {
                                            qVarF = qVarF;
                                            eVar = eVar;
                                        }
                                    }
                                    qVarF = y2.f.f(eVar);
                                }
                            }
                            qVar = qVar.f58486e;
                        }
                    }
                    i0VarX = i0VarX.w();
                    qVar = (i0VarX != null || (mcVar = i0VarX.f56892i0) == null) ? null : (d2) mcVar.f50088f;
                }
                obj2 = (q2.e) obj;
                if (obj2 != null) {
                    qVar2 = ((z1.q) obj2).f58482a;
                } else {
                    qVar2 = null;
                }
            } else {
                if (!e0VarF.f58482a.P) {
                    v2.a.b("visitAncestors called on an unattached node");
                }
                qVar3 = e0VarF.f58482a;
                i0VarX2 = y2.f.x(e0VarF);
                loop11: while (true) {
                    if (i0VarX2 != null) {
                        obj3 = null;
                        break;
                    }
                    if ((((z1.q) i0VarX2.f56892i0.f50089g).f58485d & OSSConstants.DEFAULT_BUFFER_SIZE) != 0) {
                        while (qVar3 != null) {
                            if ((qVar3.f58484c & OSSConstants.DEFAULT_BUFFER_SIZE) != 0) {
                                eVar2 = null;
                                qVarF2 = qVar3;
                                while (qVarF2 != null) {
                                    if (qVarF2 instanceof q2.e) {
                                        obj3 = qVarF2;
                                        break loop11;
                                    }
                                    if ((qVarF2.f58484c & OSSConstants.DEFAULT_BUFFER_SIZE) == 0 && (qVarF2 instanceof y2.n)) {
                                        z1.q qVar7 = ((y2.n) qVarF2).R;
                                        int i13 = 0;
                                        while (qVar7 != null) {
                                            if ((qVar7.f58484c & OSSConstants.DEFAULT_BUFFER_SIZE) != 0) {
                                                i13++;
                                                if (i13 == 1) {
                                                    qVarF2 = qVarF2;
                                                    eVar2 = eVar2;
                                                    eVar2 = eVar2;
                                                    qVarF2 = qVar7;
                                                } else {
                                                    if (eVar2 == null) {
                                                        eVar2 = new n1.e(new z1.q[16]);
                                                    }
                                                    if (qVarF2 != null) {
                                                        eVar2.c(qVarF2);
                                                        qVarF2 = null;
                                                    }
                                                    eVar2.c(qVar7);
                                                }
                                            } else {
                                                qVarF2 = qVarF2;
                                                eVar2 = eVar2;
                                            }
                                            qVar7 = qVar7.f58487f;
                                            qVarF2 = qVarF2;
                                            eVar2 = eVar2;
                                        }
                                        if (i13 == 1) {
                                            qVarF2 = qVarF2;
                                            eVar2 = eVar2;
                                        } else {
                                            qVarF2 = qVarF2;
                                            eVar2 = eVar2;
                                        }
                                    }
                                    qVarF2 = y2.f.f(eVar2);
                                }
                            }
                            qVar3 = qVar3.f58486e;
                        }
                    }
                    i0VarX2 = i0VarX2.w();
                    qVar3 = (i0VarX2 != null || (mcVar2 = i0VarX2.f56892i0) == null) ? null : (d2) mcVar2.f50088f;
                }
                obj4 = (q2.e) obj3;
                if (obj4 != null) {
                    qVar2 = ((z1.q) obj4).f58482a;
                } else {
                    if (!e0Var.f58482a.P) {
                        v2.a.b("visitAncestors called on an unattached node");
                    }
                    qVar = e0Var.f58482a.f58486e;
                    i0VarX = y2.f.x(e0Var);
                    loop15: while (true) {
                        if (i0VarX != null) {
                            obj = null;
                            break;
                        }
                        if ((((z1.q) i0VarX.f56892i0.f50089g).f58485d & OSSConstants.DEFAULT_BUFFER_SIZE) != 0) {
                            while (qVar != null) {
                                if ((qVar.f58484c & OSSConstants.DEFAULT_BUFFER_SIZE) != 0) {
                                    qVarF = qVar;
                                    eVar = null;
                                    while (qVarF != null) {
                                        if (qVarF instanceof q2.e) {
                                            obj = qVarF;
                                            break loop15;
                                        }
                                        if ((qVarF.f58484c & OSSConstants.DEFAULT_BUFFER_SIZE) == 0) {
                                        }
                                        qVarF = y2.f.f(eVar);
                                    }
                                }
                                qVar = qVar.f58486e;
                            }
                        }
                        i0VarX = i0VarX.w();
                        if (i0VarX != null) {
                        }
                    }
                    obj2 = (q2.e) obj;
                    if (obj2 != null) {
                        qVar2 = ((z1.q) obj2).f58482a;
                    } else {
                        qVar2 = null;
                    }
                }
            }
            if (qVar2 != null) {
                if (!qVar2.f58482a.P) {
                    v2.a.b("visitAncestors called on an unattached node");
                }
                z1.q qVar8 = qVar2.f58482a.f58486e;
                y2.i0 i0VarX3 = y2.f.x(qVar2);
                ArrayList arrayList = null;
                while (i0VarX3 != null) {
                    if ((((z1.q) i0VarX3.f56892i0.f50089g).f58485d & OSSConstants.DEFAULT_BUFFER_SIZE) != 0) {
                        while (qVar8 != null) {
                            if ((qVar8.f58484c & OSSConstants.DEFAULT_BUFFER_SIZE) != 0) {
                                z1.q qVarF3 = qVar8;
                                n1.e eVar3 = null;
                                while (qVarF3 != null) {
                                    if (qVarF3 instanceof q2.e) {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        arrayList.add(qVarF3);
                                    } else if ((qVarF3.f58484c & OSSConstants.DEFAULT_BUFFER_SIZE) != 0 && (qVarF3 instanceof y2.n)) {
                                        int i14 = 0;
                                        for (z1.q qVar9 = ((y2.n) qVarF3).R; qVar9 != null; qVar9 = qVar9.f58487f) {
                                            if ((qVar9.f58484c & OSSConstants.DEFAULT_BUFFER_SIZE) != 0) {
                                                i14++;
                                                if (i14 == 1) {
                                                    qVarF3 = qVar9;
                                                } else {
                                                    if (eVar3 == null) {
                                                        eVar3 = new n1.e(new z1.q[16]);
                                                    }
                                                    if (qVarF3 != null) {
                                                        eVar3.c(qVarF3);
                                                        qVarF3 = null;
                                                    }
                                                    eVar3.c(qVar9);
                                                }
                                            }
                                        }
                                        if (i14 == 1) {
                                        }
                                    }
                                    qVarF3 = y2.f.f(eVar3);
                                }
                            }
                            qVar8 = qVar8.f58486e;
                        }
                    }
                    i0VarX3 = i0VarX3.w();
                    qVar8 = (i0VarX3 == null || (mcVar3 = i0VarX3.f56892i0) == null) ? null : (d2) mcVar3.f50088f;
                }
                if (arrayList != null && (size = arrayList.size() - 1) >= 0) {
                    while (true) {
                        int i15 = size - 1;
                        if (((q2.e) arrayList.get(size)).f(keyEvent)) {
                            Trace.endSection();
                            return true;
                        }
                        if (i15 < 0) {
                            break;
                        }
                        size = i15;
                    }
                }
                ?? F = qVar2.f58482a;
                ?? eVar4 = 0;
                while (F != 0) {
                    if (F instanceof q2.e) {
                        if (((q2.e) F).f(keyEvent)) {
                            Trace.endSection();
                            return true;
                        }
                    } else if ((F.f58484c & OSSConstants.DEFAULT_BUFFER_SIZE) != 0 && (F instanceof y2.n)) {
                        z1.q qVar10 = ((y2.n) F).R;
                        int i16 = 0;
                        while (qVar10 != null) {
                            if ((qVar10.f58484c & OSSConstants.DEFAULT_BUFFER_SIZE) != 0) {
                                i16++;
                                if (i16 == 1) {
                                    F = F;
                                    eVar4 = eVar4;
                                    eVar4 = eVar4;
                                    F = qVar10;
                                } else {
                                    if (eVar4 == 0) {
                                        eVar4 = new n1.e(new z1.q[16]);
                                    }
                                    if (F != 0) {
                                        eVar4.c(F);
                                        F = 0;
                                    }
                                    eVar4.c(qVar10);
                                }
                            } else {
                                F = F;
                                eVar4 = eVar4;
                            }
                            qVar10 = qVar10.f58487f;
                            F = F;
                            eVar4 = eVar4;
                        }
                        if (i16 == 1) {
                            F = F;
                            eVar4 = eVar4;
                        } else {
                            F = F;
                            eVar4 = eVar4;
                        }
                    }
                    F = y2.f.f(eVar4);
                }
                if (((Boolean) aVar.invoke()).booleanValue()) {
                    Trace.endSection();
                    return true;
                }
                ?? F2 = qVar2.f58482a;
                ?? eVar5 = 0;
                while (F2 != 0) {
                    if (F2 instanceof q2.e) {
                        if (((q2.e) F2).B(keyEvent)) {
                            Trace.endSection();
                            return true;
                        }
                    } else if ((F2.f58484c & OSSConstants.DEFAULT_BUFFER_SIZE) != 0 && (F2 instanceof y2.n)) {
                        z1.q qVar11 = ((y2.n) F2).R;
                        int i17 = 0;
                        while (qVar11 != null) {
                            if ((qVar11.f58484c & OSSConstants.DEFAULT_BUFFER_SIZE) != 0) {
                                i17++;
                                if (i17 == 1) {
                                    eVar5 = eVar5;
                                    F2 = F2;
                                    eVar5 = eVar5;
                                    F2 = qVar11;
                                } else {
                                    if (eVar5 == 0) {
                                        eVar5 = new n1.e(new z1.q[16]);
                                    }
                                    if (F2 != 0) {
                                        eVar5.c(F2);
                                        F2 = 0;
                                    }
                                    eVar5.c(qVar11);
                                }
                            } else {
                                eVar5 = eVar5;
                                F2 = F2;
                            }
                            qVar11 = qVar11.f58487f;
                            eVar5 = eVar5;
                            F2 = F2;
                        }
                        if (i17 == 1) {
                            eVar5 = eVar5;
                            F2 = F2;
                        } else {
                            eVar5 = eVar5;
                            F2 = F2;
                        }
                    }
                    F2 = y2.f.f(eVar5);
                }
                if (arrayList != null) {
                    int size2 = arrayList.size();
                    for (int i18 = 0; i18 < size2; i18++) {
                        if (((q2.e) arrayList.get(i18)).B(keyEvent)) {
                            Trace.endSection();
                            return true;
                        }
                    }
                }
            }
            Trace.endSection();
            return false;
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    /* JADX WARN: Type inference failed for: r6v14, types: [fz.c, kotlin.jvm.internal.n] */
    /* JADX WARN: Type inference failed for: r6v20, types: [fz.c, kotlin.jvm.internal.n] */
    public final Boolean f(int i11, f2.c cVar, fz.c cVar2) {
        boolean zA;
        e0 e0Var;
        mc mcVar;
        e0 e0Var2 = this.f24738c;
        e0 e0VarF = d.f(e0Var2);
        int i12 = 4;
        AndroidComposeView androidComposeView = this.f24737b;
        boolean zBooleanValue = false;
        if (e0VarF != null) {
            v3.m layoutDirection = androidComposeView.getLayoutDirection();
            t tVarV0 = e0VarF.V0();
            v vVar = tVarV0.f24755h;
            v vVar2 = tVarV0.f24756i;
            if (i11 == 1) {
                vVar = tVarV0.f24749b;
            } else if (i11 == 2) {
                vVar = tVarV0.f24750c;
            } else if (i11 == 5) {
                vVar = tVarV0.f24751d;
            } else if (i11 == 6) {
                vVar = tVarV0.f24752e;
            } else if (i11 == 3) {
                int i13 = g0.f24713a[layoutDirection.ordinal()];
                if (i13 != 1) {
                    if (i13 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    vVar = vVar2;
                }
                if (vVar == v.f24760b) {
                    vVar = null;
                }
                if (vVar == null) {
                    vVar = tVarV0.f24753f;
                }
            } else if (i11 == 4) {
                int i14 = g0.f24713a[layoutDirection.ordinal()];
                if (i14 == 1) {
                    vVar = vVar2;
                } else if (i14 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                if (vVar == v.f24760b) {
                    vVar = null;
                }
                if (vVar == null) {
                    vVar = tVarV0.f24754g;
                }
            } else {
                if (i11 != 7 && i11 != 8) {
                    throw new IllegalStateException("invalid FocusDirection");
                }
                a aVar = new a(i11);
                p pVar = (p) y2.f.y(e0VarF).getFocusOwner();
                e0 e0VarG = pVar.g();
                if (i11 == 7) {
                    tVarV0.f24757j.invoke(aVar);
                } else {
                    tVarV0.f24758k.invoke(aVar);
                }
                vVar = aVar.f24705b ? v.f24761c : e0VarG != pVar.g() ? v.f24762d : v.f24760b;
            }
            v vVar3 = v.f24761c;
            if (!kotlin.jvm.internal.m.a(vVar, vVar3)) {
                if (kotlin.jvm.internal.m.a(vVar, v.f24762d)) {
                    e0 e0VarF2 = d.f(e0Var2);
                    if (e0VarF2 != null) {
                        return (Boolean) cVar2.invoke(e0VarF2);
                    }
                } else {
                    v vVar4 = v.f24760b;
                    if (!kotlin.jvm.internal.m.a(vVar, vVar4)) {
                        if (vVar == vVar4) {
                            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                        }
                        if (vVar == vVar3) {
                            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                        }
                        n1.e eVar = vVar.f24763a;
                        int i15 = eVar.f43114c;
                        if (i15 == 0) {
                            System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
                        } else {
                            Object[] objArr = eVar.f43112a;
                            boolean z11 = false;
                            for (int i16 = 0; i16 < i15; i16++) {
                                z1.q qVar = (z1.q) ((x) objArr[i16]);
                                if (!qVar.f58482a.P) {
                                    v2.a.b("visitChildren called on an unattached node");
                                }
                                n1.e eVar2 = new n1.e(new z1.q[16]);
                                z1.q qVar2 = qVar.f58482a;
                                z1.q qVar3 = qVar2.f58487f;
                                if (qVar3 == null) {
                                    y2.f.b(eVar2, qVar2);
                                } else {
                                    eVar2.c(qVar3);
                                }
                                while (true) {
                                    int i17 = eVar2.f43114c;
                                    if (i17 == 0) {
                                        break;
                                    }
                                    z1.q qVarF = (z1.q) eVar2.l(i17 - 1);
                                    if ((qVarF.f58485d & 1024) == 0) {
                                        y2.f.b(eVar2, qVarF);
                                    } else {
                                        while (qVarF != null) {
                                            if ((qVarF.f58484c & 1024) != 0) {
                                                n1.e eVar3 = null;
                                                while (qVarF != null) {
                                                    if (qVarF instanceof e0) {
                                                        if (((Boolean) cVar2.invoke((e0) qVarF)).booleanValue()) {
                                                            z11 = true;
                                                            break;
                                                        }
                                                    } else if ((qVarF.f58484c & 1024) != 0 && (qVarF instanceof y2.n)) {
                                                        int i18 = 0;
                                                        for (z1.q qVar4 = ((y2.n) qVarF).R; qVar4 != null; qVar4 = qVar4.f58487f) {
                                                            if ((qVar4.f58484c & 1024) != 0) {
                                                                i18++;
                                                                if (i18 == 1) {
                                                                    qVarF = qVar4;
                                                                } else {
                                                                    if (eVar3 == null) {
                                                                        eVar3 = new n1.e(new z1.q[16]);
                                                                    }
                                                                    if (qVarF != null) {
                                                                        eVar3.c(qVarF);
                                                                        qVarF = null;
                                                                    }
                                                                    eVar3.c(qVar4);
                                                                }
                                                            }
                                                        }
                                                        if (i18 == 1) {
                                                        }
                                                    }
                                                    qVarF = y2.f.f(eVar3);
                                                }
                                                break;
                                            }
                                            qVarF = qVarF.f58487f;
                                        }
                                    }
                                }
                            }
                            zBooleanValue = z11;
                        }
                        return Boolean.valueOf(zBooleanValue);
                    }
                }
            }
            return null;
        }
        e0VarF = null;
        v3.m layoutDirection2 = androidComposeView.getLayoutDirection();
        a0.j jVar = new a0.j(e0VarF, this, cVar2);
        if (i11 == 1 || i11 == 2) {
            if (i11 == 1) {
                zA = d.k(e0Var2, jVar);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("This function should only be used for 1-D focus search");
                }
                zA = d.a(e0Var2, jVar);
            }
            return Boolean.valueOf(zA);
        }
        if (i11 == 3 || i11 == 4 || i11 == 5 || i11 == 6) {
            return d.D(i11, jVar, e0Var2, cVar);
        }
        if (i11 == 7) {
            int i19 = g0.f24713a[layoutDirection2.ordinal()];
            if (i19 != 1) {
                if (i19 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i12 = 3;
            }
            e0 e0VarF3 = d.f(e0Var2);
            if (e0VarF3 != null) {
                return d.D(i12, jVar, e0VarF3, cVar);
            }
            return null;
        }
        if (i11 != 8) {
            throw new IllegalStateException(("Focus search invoked with invalid FocusDirection " + ((Object) f.a(i11))).toString());
        }
        e0 e0VarF4 = d.f(e0Var2);
        if (e0VarF4 == null) {
            e0Var = null;
            break;
        }
        if (!e0VarF4.f58482a.P) {
            v2.a.b("visitAncestors called on an unattached node");
        }
        z1.q qVar5 = e0VarF4.f58482a.f58486e;
        y2.i0 i0VarX = y2.f.x(e0VarF4);
        loop5: while (true) {
            if (i0VarX == null) {
                e0Var = null;
                break;
            }
            if ((((z1.q) i0VarX.f56892i0.f50089g).f58485d & 1024) != 0) {
                while (qVar5 != null) {
                    if ((qVar5.f58484c & 1024) != 0) {
                        z1.q qVarF2 = qVar5;
                        n1.e eVar4 = null;
                        while (qVarF2 != null) {
                            if (qVarF2 instanceof e0) {
                                e0 e0Var3 = (e0) qVarF2;
                                if (e0Var3.V0().f24748a) {
                                    e0Var = e0Var3;
                                    break loop5;
                                }
                            } else if ((qVarF2.f58484c & 1024) != 0 && (qVarF2 instanceof y2.n)) {
                                int i21 = 0;
                                for (z1.q qVar6 = ((y2.n) qVarF2).R; qVar6 != null; qVar6 = qVar6.f58487f) {
                                    if ((qVar6.f58484c & 1024) != 0) {
                                        i21++;
                                        if (i21 == 1) {
                                            qVarF2 = qVar6;
                                        } else {
                                            if (eVar4 == null) {
                                                eVar4 = new n1.e(new z1.q[16]);
                                            }
                                            if (qVarF2 != null) {
                                                eVar4.c(qVarF2);
                                                qVarF2 = null;
                                            }
                                            eVar4.c(qVar6);
                                        }
                                    }
                                }
                                if (i21 != 1) {
                                    qVarF2 = y2.f.f(eVar4);
                                }
                            }
                            qVarF2 = y2.f.f(eVar4);
                        }
                    }
                    qVar5 = qVar5.f58486e;
                }
            }
            i0VarX = i0VarX.w();
            qVar5 = (i0VarX == null || (mcVar = i0VarX.f56892i0) == null) ? null : (d2) mcVar.f50088f;
        }
        if (e0Var != null && !e0Var.equals(e0Var2)) {
            zBooleanValue = ((Boolean) jVar.invoke(e0Var)).booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public final e0 g() {
        e0 e0Var = this.f24743h;
        if (e0Var == null || !e0Var.P) {
            return null;
        }
        return e0Var;
    }

    public final boolean h(int i11, boolean z11) {
        e0 e0VarG = g();
        AndroidComposeView androidComposeView = this.f24736a;
        if (e0VarG == null || !e0VarG.Q || !androidComposeView.u(i11)) {
            kotlin.jvm.internal.y yVar = new kotlin.jvm.internal.y();
            yVar.f38361a = Boolean.FALSE;
            e0 e0VarG2 = g();
            Boolean boolF = f(i11, androidComposeView.getEmbeddedViewFocusRect(), new ad.f(yVar, i11, 2));
            if (!kotlin.jvm.internal.m.a(boolF, Boolean.TRUE) || e0VarG2 == g()) {
                if (boolF != null && yVar.f38361a != null) {
                    if (!boolF.booleanValue() || !((Boolean) yVar.f38361a).booleanValue()) {
                        if ((i11 == 1 || i11 == 2) && z11 && c(i11, false, false)) {
                            Boolean boolF2 = f(i11, null, new o(i11, 1));
                            if (boolF2 != null ? boolF2.booleanValue() : false) {
                            }
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    public final boolean i(int i11) {
        if (!c(i11, false, false)) {
            return false;
        }
        Boolean boolF = f(i11, null, new o(i11, 0));
        boolean zBooleanValue = boolF != null ? boolF.booleanValue() : false;
        if (!zBooleanValue) {
            d();
        }
        return zBooleanValue;
    }

    public final void j(e0 e0Var) {
        e0 e0Var2 = this.f24743h;
        this.f24743h = e0Var;
        y.e0 e0Var3 = this.f24742g;
        Object[] objArr = e0Var3.f56686a;
        int i11 = e0Var3.f56687b;
        for (int i12 = 0; i12 < i11; i12++) {
            ((j) objArr[i12]).a(e0Var2, e0Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r21v3, types: [int] */
    /* JADX WARN: Type inference failed for: r21v4 */
    /* JADX WARN: Type inference failed for: r21v5 */
    /* JADX WARN: Type inference failed for: r3v18, types: [int] */
    public final boolean k(KeyEvent keyEvent) {
        int iNumberOfTrailingZeros;
        boolean z11;
        long j11;
        int iNumberOfTrailingZeros2;
        int i11;
        long[] jArr;
        int i12;
        long jB = q2.c.b(keyEvent);
        int iC = q2.c.c(keyEvent);
        int i13 = -862048943;
        long j12 = 0;
        int i14 = 8;
        int i15 = 0;
        boolean z12 = true;
        if (iC != 2) {
            if (iC != 1) {
                return true;
            }
            y.b0 b0Var = this.f24741f;
            if (b0Var == null || !b0Var.a(jB)) {
                return false;
            }
            y.b0 b0Var2 = this.f24741f;
            if (b0Var2 != null) {
                int iHashCode = Long.hashCode(jB) * (-862048943);
                int i16 = iHashCode ^ (iHashCode << 16);
                int i17 = i16 & 127;
                int i18 = b0Var2.f56663c;
                int i19 = i16 >>> 7;
                loop5: while (true) {
                    int i21 = i19 & i18;
                    long[] jArr2 = b0Var2.f56661a;
                    int i22 = i21 >> 3;
                    int i23 = (i21 & 7) << 3;
                    long j13 = ((jArr2[i22 + 1] << (64 - i23)) & ((-i23) >> 63)) | (jArr2[i22] >>> i23);
                    long j14 = (((long) i17) * 72340172838076673L) ^ j13;
                    for (long j15 = (~j14) & (j14 - 72340172838076673L) & (-9187201950435737472L); j15 != 0; j15 &= j15 - 1) {
                        iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j15) >> 3) + i21) & i18;
                        if (b0Var2.f56662b[iNumberOfTrailingZeros] == jB) {
                            break loop5;
                        }
                    }
                    if ((j13 & ((~j13) << 6) & (-9187201950435737472L)) != 0) {
                        iNumberOfTrailingZeros = -1;
                        break;
                    }
                    i15 += 8;
                    i19 = i21 + i15;
                }
                if (iNumberOfTrailingZeros >= 0) {
                    b0Var2.f56664d--;
                    long[] jArr3 = b0Var2.f56661a;
                    int i24 = b0Var2.f56663c;
                    int i25 = iNumberOfTrailingZeros >> 3;
                    int i26 = (iNumberOfTrailingZeros & 7) << 3;
                    long j16 = (jArr3[i25] & (~(255 << i26))) | (254 << i26);
                    jArr3[i25] = j16;
                    jArr3[(((iNumberOfTrailingZeros - 7) & i24) + (i24 & 7)) >> 3] = j16;
                    return true;
                }
            }
            return true;
        }
        y.b0 b0Var3 = this.f24741f;
        if (b0Var3 == null) {
            b0Var3 = new y.b0(3);
            this.f24741f = b0Var3;
        }
        y.b0 b0Var4 = b0Var3;
        int iHashCode2 = Long.hashCode(jB) * (-862048943);
        int i27 = iHashCode2 ^ (iHashCode2 << 16);
        int i28 = i27 >>> 7;
        int i29 = i27 & 127;
        int i30 = b0Var4.f56663c;
        int i31 = i28 & i30;
        int i32 = 0;
        loop0: while (true) {
            long[] jArr4 = b0Var4.f56661a;
            int i33 = i31 >> 3;
            int i34 = i13;
            int i35 = (i31 & 7) << 3;
            long j17 = (jArr4[i33] >>> i35) | ((jArr4[i33 + 1] << (64 - i35)) & ((-i35) >> 63));
            long j18 = i29;
            long j19 = j17 ^ (j18 * 72340172838076673L);
            long j21 = (j19 - 72340172838076673L) & (~j19) & (-9187201950435737472L);
            while (j21 != j12) {
                iNumberOfTrailingZeros2 = (i31 + (Long.numberOfTrailingZeros(j21) >> 3)) & i30;
                long j22 = j12;
                if (b0Var4.f56662b[iNumberOfTrailingZeros2] == jB) {
                    z11 = true;
                    break loop0;
                }
                j21 &= j21 - 1;
                j12 = j22;
            }
            long j23 = j12;
            if ((j17 & ((~j17) << 6) & (-9187201950435737472L)) != j23) {
                int iB = b0Var4.b(i28);
                if (b0Var4.f56665e != 0 || ((b0Var4.f56661a[iB >> 3] >> ((iB & 7) << 3)) & 255) == 254) {
                    z11 = true;
                    j11 = 128;
                } else {
                    int i36 = b0Var4.f56663c;
                    if (i36 > i14) {
                        long j24 = 128;
                        if (Long.compare((((long) b0Var4.f56664d) * 32) ^ Long.MIN_VALUE, (((long) i36) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr5 = b0Var4.f56661a;
                            int i37 = b0Var4.f56663c;
                            long[] jArr6 = b0Var4.f56662b;
                            int i38 = (i37 + 7) >> 3;
                            int i39 = 0;
                            while (i39 < i38) {
                                int i40 = i14;
                                long j25 = jArr5[i39] & (-9187201950435737472L);
                                jArr5[i39] = (-72340172838076674L) & ((~j25) + (j25 >>> 7));
                                i39++;
                                i14 = i40;
                                j24 = j24;
                                i28 = i28;
                            }
                            i11 = i28;
                            j11 = j24;
                            int iW = ry.l.W(jArr5);
                            int i41 = iW - 1;
                            jArr5[i41] = (jArr5[i41] & 72057594037927935L) | (-72057594037927936L);
                            jArr5[iW] = jArr5[0];
                            int i42 = 0;
                            while (i42 != i37) {
                                int i43 = i42 >> 3;
                                int i44 = (i42 & 7) << 3;
                                long j26 = (jArr5[i43] >> i44) & 255;
                                if (j26 != j11 && j26 == 254) {
                                    int iHashCode3 = Long.hashCode(jArr6[i42]) * i34;
                                    int i45 = iHashCode3 ^ (iHashCode3 << 16);
                                    int i46 = i45 >>> 7;
                                    int iB2 = b0Var4.b(i46);
                                    int i47 = i46 & i37;
                                    boolean z13 = z12;
                                    if (((iB2 - i47) & i37) / 8 == ((i42 - i47) & i37) / 8) {
                                        jArr5[i43] = (jArr5[i43] & (~(255 << i44))) | (((long) (i45 & 127)) << i44);
                                        jArr5[jArr5.length - 1] = (jArr5[0] & 72057594037927935L) | Long.MIN_VALUE;
                                        i42++;
                                    } else {
                                        int i48 = i42;
                                        int i49 = iB2 >> 3;
                                        long j27 = jArr5[i49];
                                        int i50 = (iB2 & 7) << 3;
                                        if (((j27 >> i50) & 255) == j11) {
                                            jArr5[i49] = (j27 & (~(255 << i50))) | (((long) (i45 & 127)) << i50);
                                            jArr5[i43] = (jArr5[i43] & (~(255 << i44))) | (j11 << i44);
                                            jArr6[iB2] = jArr6[i48];
                                            jArr6[i48] = j23;
                                            i12 = i48;
                                        } else {
                                            jArr5[i49] = (((long) (i45 & 127)) << i50) | (j27 & (~(255 << i50)));
                                            long j28 = jArr6[iB2];
                                            jArr6[iB2] = jArr6[i48];
                                            jArr6[i48] = j28;
                                            i12 = i48 - 1;
                                        }
                                        jArr5[jArr5.length - 1] = (jArr5[0] & 72057594037927935L) | Long.MIN_VALUE;
                                        i42 = i12 + 1;
                                    }
                                    z12 = z13;
                                } else {
                                    i42++;
                                }
                            }
                            z11 = z12;
                            b0Var4.f56665e = r0.a(b0Var4.f56663c) - b0Var4.f56664d;
                        } else {
                            j11 = 128;
                        }
                        iB = b0Var4.b(i11);
                    } else {
                        j11 = 128;
                    }
                    i11 = i28;
                    z11 = true;
                    int iB3 = r0.b(b0Var4.f56663c);
                    long[] jArr7 = b0Var4.f56661a;
                    long[] jArr8 = b0Var4.f56662b;
                    int i51 = b0Var4.f56663c;
                    b0Var4.c(iB3);
                    long[] jArr9 = b0Var4.f56661a;
                    long[] jArr10 = b0Var4.f56662b;
                    int i52 = b0Var4.f56663c;
                    int i53 = 0;
                    while (i53 < i51) {
                        if (((jArr7[i53 >> 3] >> ((i53 & 7) << 3)) & 255) < j11) {
                            long j29 = jArr8[i53];
                            int iHashCode4 = Long.hashCode(j29) * i34;
                            int i54 = iHashCode4 ^ (iHashCode4 << 16);
                            jArr = jArr9;
                            int iB4 = b0Var4.b(i54 >>> 7);
                            long j30 = i54 & 127;
                            int i55 = iB4 >> 3;
                            int i56 = (iB4 & 7) << 3;
                            long j31 = (jArr[i55] & (~(255 << i56))) | (j30 << i56);
                            jArr[i55] = j31;
                            jArr[(((iB4 - 7) & i52) + (i52 & 7)) >> 3] = j31;
                            jArr10[iB4] = j29;
                        } else {
                            jArr = jArr9;
                        }
                        i53++;
                        jArr9 = jArr;
                        jArr7 = jArr7;
                        jArr8 = jArr8;
                    }
                    iB = b0Var4.b(i11);
                }
                iNumberOfTrailingZeros2 = iB;
                b0Var4.f56664d++;
                int i57 = b0Var4.f56665e;
                long[] jArr11 = b0Var4.f56661a;
                int i58 = iNumberOfTrailingZeros2 >> 3;
                long j32 = jArr11[i58];
                int i59 = (iNumberOfTrailingZeros2 & 7) << 3;
                b0Var4.f56665e = i57 - (((j32 >> i59) & 255) == j11 ? z11 : 0);
                int i60 = b0Var4.f56663c;
                long j33 = (j32 & (~(255 << i59))) | (j18 << i59);
                jArr11[i58] = j33;
                jArr11[(((iNumberOfTrailingZeros2 - 7) & i60) + (i60 & 7)) >> 3] = j33;
                break;
            }
            i32 += 8;
            i31 = (i31 + i32) & i30;
            i14 = i14;
            i13 = i34;
            j12 = j23;
        }
        b0Var4.f56662b[iNumberOfTrailingZeros2] = jB;
        return z11;
    }
}
