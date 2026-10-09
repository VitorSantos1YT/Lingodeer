package pp;

import android.os.Bundle;
import cf.x;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.ReviewNew;
import com.lingodeer.data.env.Env;
import com.lingodeer.data.model.INTENTS;
import ij.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import jp.p0;
import kotlin.jvm.internal.m;
import nv.p;
import ry.l;
import tp.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class g extends e {
    public final int U;
    public final List V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(r rVar, int i11, ArrayList reviews) {
        super(rVar, false);
        m.f(reviews, "reviews");
        this.U = i11;
        this.V = reviews;
    }

    @Override // pp.e
    public final boolean d(qi.a testModel) {
        int i11;
        int i12;
        int i13;
        m.f(testModel, "testModel");
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        boolean zD = l.D(new Integer[]{1, 12}, Integer.valueOf(x.n().keyLanguage));
        Env env = this.f46980e;
        return !zD ? !l.D(new Integer[]{2, 13}, Integer.valueOf(x.n().keyLanguage)) ? l.D(new Integer[]{0, 11}, Integer.valueOf(x.n().keyLanguage)) && (((i11 = env.csDisplay) == 0 || i11 == 1) && testModel.f47798a == 0 && testModel.f47800c == 9) : (x.n().koDisPlay == 0 || x.n().koDisPlay == 1) && testModel.f47798a == 0 && testModel.f47800c == 9 : !(((i12 = env.jsDisPlay) == 1 || i12 == 2 || i12 == 5) && testModel.f47798a == 0 && ((i13 = testModel.f47800c) == 5 || i13 == 9));
    }

    @Override // pp.e
    public final ArrayList h() {
        return new ArrayList();
    }

    /* JADX WARN: Code duplicated, block: B:120:0x0227  */
    /* JADX WARN: Code duplicated, block: B:122:0x022f  */
    /* JADX WARN: Code duplicated, block: B:157:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:159:0x02db  */
    /* JADX WARN: Code duplicated, block: B:194:0x037f  */
    /* JADX WARN: Code duplicated, block: B:196:0x0389  */
    /* JADX WARN: Code duplicated, block: B:231:0x042d  */
    /* JADX WARN: Code duplicated, block: B:233:0x0437  */
    /* JADX WARN: Code duplicated, block: B:268:0x04db  */
    /* JADX WARN: Code duplicated, block: B:270:0x04e5  */
    /* JADX WARN: Code duplicated, block: B:305:0x0587  */
    /* JADX WARN: Code duplicated, block: B:307:0x0591  */
    /* JADX WARN: Code duplicated, block: B:317:0x05b3  */
    /* JADX WARN: Code duplicated, block: B:321:0x05c7  */
    /* JADX WARN: Code duplicated, block: B:327:0x05e9  */
    /* JADX WARN: Code duplicated, block: B:331:0x05fd  */
    /* JADX WARN: Code duplicated, block: B:332:0x0604  */
    /* JADX WARN: Code duplicated, block: B:336:0x0618  */
    /* JADX WARN: Code duplicated, block: B:337:0x061f  */
    /* JADX WARN: Code duplicated, block: B:341:0x0633  */
    /* JADX WARN: Code duplicated, block: B:347:0x0654  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:351:0x0666  */
    /* JADX WARN: Code duplicated, block: B:352:0x066d  */
    /* JADX WARN: Code duplicated, block: B:356:0x0680  */
    /* JADX WARN: Code duplicated, block: B:357:0x0687  */
    /* JADX WARN: Code duplicated, block: B:361:0x069b  */
    /* JADX WARN: Code duplicated, block: B:387:0x0724  */
    /* JADX WARN: Code duplicated, block: B:389:0x072e  */
    /* JADX WARN: Code duplicated, block: B:424:0x07d0  */
    /* JADX WARN: Code duplicated, block: B:426:0x07da  */
    /* JADX WARN: Code duplicated, block: B:461:0x087e  */
    /* JADX WARN: Code duplicated, block: B:463:0x0888  */
    /* JADX WARN: Code duplicated, block: B:46:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:498:0x092c  */
    /* JADX WARN: Code duplicated, block: B:500:0x0936  */
    /* JADX WARN: Code duplicated, block: B:535:0x09da  */
    /* JADX WARN: Code duplicated, block: B:537:0x09e4  */
    /* JADX WARN: Code duplicated, block: B:547:0x0a06  */
    /* JADX WARN: Code duplicated, block: B:551:0x0a18  */
    /* JADX WARN: Code duplicated, block: B:554:0x0a2d  */
    /* JADX WARN: Code duplicated, block: B:556:0x0a34  */
    /* JADX WARN: Code duplicated, block: B:558:0x0a4f  */
    /* JADX WARN: Code duplicated, block: B:560:0x0a5d  */
    /* JADX WARN: Code duplicated, block: B:561:0x0a5e  */
    /* JADX WARN: Code duplicated, block: B:562:0x0a61  */
    /* JADX WARN: Code duplicated, block: B:564:0x0a66 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:565:0x0a68  */
    /* JADX WARN: Code duplicated, block: B:568:0x0a77  */
    /* JADX WARN: Code duplicated, block: B:569:0x0a7b  */
    /* JADX WARN: Code duplicated, block: B:571:0x0a7e  */
    /* JADX WARN: Code duplicated, block: B:574:0x0a86  */
    /* JADX WARN: Code duplicated, block: B:576:0x0a90  */
    /* JADX WARN: Code duplicated, block: B:584:0x0aa6 A[LOOP:26: B:552:0x0a29->B:584:0x0aa6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:590:0x00e3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:593:0x00de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:597:0x018e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:599:0x0187 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:603:0x023d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:605:0x0238 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:608:0x02e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:611:0x02e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:614:0x0397 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:617:0x0392 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:620:0x0445 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:623:0x0440 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:626:0x04f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:629:0x04ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:633:0x059f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:635:0x059a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:638:0x073c A[EDGE_INSN: B:638:0x073c->B:394:0x073c BREAK  A[LOOP:17: B:370:0x06d2->B:392:0x0737], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:641:0x0737 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:644:0x07e8 A[EDGE_INSN: B:644:0x07e8->B:431:0x07e8 BREAK  A[LOOP:19: B:407:0x077e->B:429:0x07e3], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:647:0x07e3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:650:0x0896 A[EDGE_INSN: B:650:0x0896->B:468:0x0896 BREAK  A[LOOP:21: B:444:0x082c->B:466:0x0891], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:653:0x0891 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:657:0x0944 A[EDGE_INSN: B:657:0x0944->B:505:0x0944 BREAK  A[LOOP:23: B:481:0x08da->B:503:0x093f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:659:0x093f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:663:0x09f2 A[EDGE_INSN: B:663:0x09f2->B:542:0x09f2 BREAK  A[LOOP:25: B:518:0x0988->B:540:0x09ed], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:665:0x09ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:666:0x0aa9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:667:0x0aa9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:668:0x0a9f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:669:0x0a9c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:671:0x0a99 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x0176  */
    /* JADX WARN: Code duplicated, block: B:85:0x017e  */
    @Override // pp.e
    public final void r(Bundle bundle) {
        am.a aVar;
        int i11;
        ArrayList arrayList;
        int size;
        int i12;
        int i13;
        qi.a aVar2;
        int iA;
        List listA;
        hi.a aVarL;
        List listB;
        lp.a aVar3;
        ArrayList arrayList2;
        int i14;
        hi.a aVarL2;
        ArrayList arrayList3;
        int i15;
        hi.a aVarL3;
        ArrayList arrayList4;
        int i16;
        hi.a aVarL4;
        ArrayList arrayList5;
        int i17;
        hi.a aVarL5;
        ArrayList arrayList6;
        int i18;
        hi.a aVarL6;
        ArrayList arrayList7;
        int i19;
        hi.a aVarL7;
        ArrayList arrayList8;
        int i21;
        hi.a aVarL8;
        ArrayList arrayList9;
        int i22;
        hi.a aVarL9;
        ArrayList arrayList10;
        int i23;
        hi.a aVarL10;
        ArrayList arrayList11;
        int i24;
        hi.a aVarL11;
        ArrayList arrayList12;
        ArrayList arrayList13;
        int i25;
        hi.a aVarL12;
        ArrayList arrayList14;
        ArrayList arrayList15;
        int i26;
        hi.a aVarL13;
        ArrayList arrayList16;
        ArrayList arrayList17;
        int i27;
        hi.a aVarL14;
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        int i28 = x.n().keyLanguage;
        int i29 = 0;
        List reviews = this.V;
        p0 view = this.f46976a;
        if (i28 == 40) {
            if (bundle != null && bundle.containsKey(INTENTS.EXTRA_INDEX)) {
                m.f(view, "view");
                aVar3 = new am.a(view, 1);
            } else {
                m.f(view, "view");
                m.f(reviews, "reviews");
                aVar = new am.a(view, 1);
                aVar.f755h = reviews;
                Collections.shuffle(reviews);
                i11 = 0;
                while (true) {
                    arrayList = aVar.f40180d;
                    if (i11 < 3) {
                        size = reviews.size();
                        i12 = 0;
                        while (true) {
                            if (i12 < size) {
                                ReviewNew reviewNew = (ReviewNew) reviews.get(i12);
                                aVar2 = new qi.a();
                                aVar2.f47799b = (int) reviewNew.getId();
                                iA = p.a(reviewNew, "getElemType(...)");
                                aVar2.f47798a = iA;
                                if (iA == 0) {
                                    listB = lp.a.b(aVar2.f47799b);
                                    aVar2.f47802e = listB;
                                    if (listB.size() > 0) {
                                        aVar.k(aVar2);
                                        aVarL = aVar.l(aVar2);
                                        if (aVarL != null) {
                                            arrayList.add(aVar2);
                                            aVar.f40181e.add(aVarL);
                                        }
                                        if (i11 > 0) {
                                            i13 = 20;
                                            if (arrayList.size() >= 20) {
                                            }
                                        }
                                        i12++;
                                    }
                                    i12++;
                                } else {
                                    if (iA == 1) {
                                        listA = lp.a.a(aVar2.f47799b);
                                        aVar2.f47802e = listA;
                                        if (listA.size() > 0) {
                                            aVar.k(aVar2);
                                        }
                                        i12++;
                                    } else if (iA == 2) {
                                        aVar2.f47800c = 2;
                                    }
                                    aVarL = aVar.l(aVar2);
                                    if (aVarL != null) {
                                        arrayList.add(aVar2);
                                        aVar.f40181e.add(aVarL);
                                    }
                                    if (i11 > 0) {
                                        i13 = 20;
                                        if (arrayList.size() >= 20) {
                                        }
                                    }
                                    i12++;
                                }
                            } else {
                                i13 = 20;
                            }
                        }
                        if (arrayList.size() < i13) {
                            i11++;
                        }
                    }
                }
                aVar.h(arrayList);
                aVar.i(aVar.f40181e);
                aVar3 = aVar;
            }
        } else if (i28 != 57) {
            if (i28 != 61) {
                if (i28 != 63) {
                    if (i28 != 65) {
                        if (i28 != 69) {
                            int i30 = this.U;
                            switch (i28) {
                                case 0:
                                    if (bundle == null || !bundle.containsKey(INTENTS.EXTRA_INDEX)) {
                                        aVar3 = new ti.a(view, i30, reviews);
                                    } else {
                                        m.f(view, "view");
                                        aVar3 = new ti.a(view, 15);
                                    }
                                    break;
                                case 1:
                                    if (bundle == null || !bundle.containsKey(INTENTS.EXTRA_INDEX)) {
                                        aVar3 = new hm.a(view, i30, reviews);
                                    } else {
                                        m.f(view, "view");
                                        aVar3 = new hm.a(view, 7);
                                    }
                                    break;
                                case 2:
                                    if (bundle == null || !bundle.containsKey(INTENTS.EXTRA_INDEX)) {
                                        aVar3 = new bn.b(view, i30, reviews);
                                    } else {
                                        m.f(view, "view");
                                        aVar3 = new bn.b(view, 3);
                                    }
                                    break;
                                case 3:
                                    if (bundle != null && bundle.containsKey(INTENTS.EXTRA_INDEX)) {
                                        m.f(view, "view");
                                        aVar3 = new ck.c(view, 4);
                                    } else {
                                        aVar3 = new ck.c(view, reviews);
                                    }
                                    break;
                                case 4:
                                    if (bundle == null || !bundle.containsKey(INTENTS.EXTRA_INDEX)) {
                                        aVar3 = new ik.a(view, reviews);
                                    } else {
                                        m.f(view, "view");
                                        aVar3 = new ik.a(view, 8);
                                    }
                                    break;
                                case 5:
                                    if (bundle == null || !bundle.containsKey(INTENTS.EXTRA_INDEX)) {
                                        aVar3 = new vk.a(view, reviews);
                                    } else {
                                        m.f(view, "view");
                                        aVar3 = new vk.a(view, 17);
                                    }
                                    break;
                                case 6:
                                    if (bundle == null || !bundle.containsKey(INTENTS.EXTRA_INDEX)) {
                                        aVar3 = new qj.a(view, reviews);
                                    } else {
                                        m.f(view, "view");
                                        aVar3 = new qj.a(view, 14);
                                    }
                                    break;
                                case 7:
                                    if (bundle != null && bundle.containsKey(INTENTS.EXTRA_INDEX)) {
                                        m.f(view, "view");
                                        aVar3 = new lq.a(view, 11);
                                    } else {
                                        aVar3 = new lq.a(view, reviews);
                                    }
                                    break;
                                case 8:
                                    if (bundle == null || !bundle.containsKey(INTENTS.EXTRA_INDEX)) {
                                        aVar3 = new vn.a(view, reviews);
                                    } else {
                                        m.f(view, "view");
                                        aVar3 = new vn.a(view, 19);
                                    }
                                    break;
                                default:
                                    switch (i28) {
                                        case 10:
                                        case 22:
                                            if (bundle != null && bundle.containsKey(INTENTS.EXTRA_INDEX)) {
                                                m.f(view, "view");
                                                aVar3 = new fo.a(view, 6);
                                            } else {
                                                m.f(view, "view");
                                                m.f(reviews, "reviews");
                                                fo.a aVar4 = new fo.a(view, 6);
                                                aVar4.f27350h = reviews;
                                                Collections.shuffle(reviews);
                                                int i31 = 0;
                                                while (true) {
                                                    arrayList7 = aVar4.f40180d;
                                                    if (i31 < 3) {
                                                        int size2 = reviews.size();
                                                        int i32 = 0;
                                                        while (true) {
                                                            if (i32 < size2) {
                                                                ReviewNew reviewNew2 = (ReviewNew) reviews.get(i32);
                                                                qi.a aVar5 = new qi.a();
                                                                aVar5.f47799b = (int) reviewNew2.getId();
                                                                int iA2 = p.a(reviewNew2, "getElemType(...)");
                                                                aVar5.f47798a = iA2;
                                                                if (iA2 == 0) {
                                                                    List listB2 = lp.a.b(aVar5.f47799b);
                                                                    aVar5.f47802e = listB2;
                                                                    if (listB2.size() > 0) {
                                                                        aVar4.k(aVar5);
                                                                        aVarL7 = aVar4.l(aVar5);
                                                                        if (aVarL7 != null) {
                                                                            arrayList7.add(aVar5);
                                                                            aVar4.f40181e.add(aVarL7);
                                                                        }
                                                                        if (i31 > 0) {
                                                                            i19 = 20;
                                                                            if (arrayList7.size() >= 20) {
                                                                            }
                                                                        }
                                                                    }
                                                                    i32++;
                                                                } else {
                                                                    if (iA2 == 1) {
                                                                        List listA2 = lp.a.a(aVar5.f47799b);
                                                                        aVar5.f47802e = listA2;
                                                                        if (listA2.size() > 0) {
                                                                            aVar4.k(aVar5);
                                                                        }
                                                                        i32++;
                                                                    } else if (iA2 == 2) {
                                                                        aVar5.f47800c = 2;
                                                                    }
                                                                    aVarL7 = aVar4.l(aVar5);
                                                                    if (aVarL7 != null) {
                                                                        arrayList7.add(aVar5);
                                                                        aVar4.f40181e.add(aVarL7);
                                                                    }
                                                                    if (i31 > 0) {
                                                                        i19 = 20;
                                                                        if (arrayList7.size() >= 20) {
                                                                        }
                                                                    }
                                                                    i32++;
                                                                }
                                                                i32++;
                                                            } else {
                                                                i19 = 20;
                                                            }
                                                        }
                                                        if (arrayList7.size() < i19) {
                                                            i31++;
                                                        }
                                                    }
                                                }
                                                aVar4.h(arrayList7);
                                                aVar4.i(aVar4.f40181e);
                                                aVar3 = aVar4;
                                            }
                                            break;
                                        case 11:
                                            if (bundle == null) {
                                                aVar3 = new ti.a(view, i30, reviews);
                                            } else {
                                                aVar3 = new ti.a(view, i30, reviews);
                                            }
                                            break;
                                        case 12:
                                            if (bundle == null) {
                                                aVar3 = new hm.a(view, i30, reviews);
                                            } else {
                                                aVar3 = new hm.a(view, i30, reviews);
                                            }
                                            break;
                                        case 13:
                                            if (bundle == null) {
                                                aVar3 = new bn.b(view, i30, reviews);
                                            } else {
                                                aVar3 = new bn.b(view, i30, reviews);
                                            }
                                            break;
                                        case 14:
                                            if (bundle == null) {
                                                aVar3 = new ik.a(view, reviews);
                                            } else {
                                                aVar3 = new ik.a(view, reviews);
                                            }
                                            break;
                                        case 15:
                                            if (bundle == null) {
                                                aVar3 = new vk.a(view, reviews);
                                            } else {
                                                aVar3 = new vk.a(view, reviews);
                                            }
                                            break;
                                        case 16:
                                            if (bundle == null) {
                                                aVar3 = new qj.a(view, reviews);
                                            } else {
                                                aVar3 = new qj.a(view, reviews);
                                            }
                                            break;
                                        case 17:
                                            if (bundle == null) {
                                                aVar3 = new vn.a(view, reviews);
                                            } else {
                                                aVar3 = new vn.a(view, reviews);
                                            }
                                            break;
                                        case 18:
                                            if (bundle != null && bundle.containsKey(INTENTS.EXTRA_INDEX)) {
                                                m.f(view, "view");
                                                aVar3 = new vl.a(view, 18);
                                            } else {
                                                m.f(view, "view");
                                                m.f(reviews, "reviews");
                                                vl.a aVar6 = new vl.a(view, 18);
                                                aVar6.f54074h = reviews;
                                                Collections.shuffle(reviews);
                                                int i33 = 0;
                                                while (true) {
                                                    arrayList8 = aVar6.f40180d;
                                                    if (i33 < 3) {
                                                        int size3 = reviews.size();
                                                        int i34 = 0;
                                                        while (true) {
                                                            if (i34 < size3) {
                                                                ReviewNew reviewNew3 = (ReviewNew) reviews.get(i34);
                                                                qi.a aVar7 = new qi.a();
                                                                aVar7.f47799b = (int) reviewNew3.getId();
                                                                int iA3 = p.a(reviewNew3, "getElemType(...)");
                                                                aVar7.f47798a = iA3;
                                                                if (iA3 == 0) {
                                                                    List listB3 = lp.a.b(aVar7.f47799b);
                                                                    aVar7.f47802e = listB3;
                                                                    if (listB3.size() > 0) {
                                                                        aVar6.k(aVar7);
                                                                        aVarL8 = aVar6.l(aVar7);
                                                                        if (aVarL8 != null) {
                                                                            arrayList8.add(aVar7);
                                                                            aVar6.f40181e.add(aVarL8);
                                                                        }
                                                                        if (i33 > 0) {
                                                                            i21 = 20;
                                                                            if (arrayList8.size() >= 20) {
                                                                            }
                                                                        }
                                                                    }
                                                                    i34++;
                                                                } else {
                                                                    if (iA3 == 1) {
                                                                        List listA3 = lp.a.a(aVar7.f47799b);
                                                                        aVar7.f47802e = listA3;
                                                                        if (listA3.size() > 0) {
                                                                            aVar6.k(aVar7);
                                                                        }
                                                                        i34++;
                                                                    } else if (iA3 == 2) {
                                                                        aVar7.f47800c = 2;
                                                                    }
                                                                    aVarL8 = aVar6.l(aVar7);
                                                                    if (aVarL8 != null) {
                                                                        arrayList8.add(aVar7);
                                                                        aVar6.f40181e.add(aVarL8);
                                                                    }
                                                                    if (i33 > 0) {
                                                                        i21 = 20;
                                                                        if (arrayList8.size() >= 20) {
                                                                        }
                                                                    }
                                                                    i34++;
                                                                }
                                                                i34++;
                                                            } else {
                                                                i21 = 20;
                                                            }
                                                        }
                                                        if (arrayList8.size() < i21) {
                                                            i33++;
                                                        }
                                                    }
                                                }
                                                aVar6.h(arrayList8);
                                                aVar6.i(aVar6.f40181e);
                                                aVar3 = aVar6;
                                            }
                                            break;
                                        case 19:
                                            if (bundle != null && bundle.containsKey(INTENTS.EXTRA_INDEX)) {
                                                m.f(view, "view");
                                                aVar3 = new pn.a(view, 13);
                                            } else {
                                                m.f(view, "view");
                                                m.f(reviews, "reviews");
                                                pn.a aVar8 = new pn.a(view, 13);
                                                aVar8.f46959h = reviews;
                                                Collections.shuffle(reviews);
                                                int i35 = 0;
                                                while (true) {
                                                    arrayList9 = aVar8.f40180d;
                                                    if (i35 < 3) {
                                                        int size4 = reviews.size();
                                                        int i36 = 0;
                                                        while (true) {
                                                            if (i36 < size4) {
                                                                ReviewNew reviewNew4 = (ReviewNew) reviews.get(i36);
                                                                qi.a aVar9 = new qi.a();
                                                                aVar9.f47799b = (int) reviewNew4.getId();
                                                                int iA4 = p.a(reviewNew4, "getElemType(...)");
                                                                aVar9.f47798a = iA4;
                                                                if (iA4 == 0) {
                                                                    List listB4 = lp.a.b(aVar9.f47799b);
                                                                    aVar9.f47802e = listB4;
                                                                    if (listB4.size() > 0) {
                                                                        aVar8.k(aVar9);
                                                                        aVarL9 = aVar8.l(aVar9);
                                                                        if (aVarL9 != null) {
                                                                            arrayList9.add(aVar9);
                                                                            aVar8.f40181e.add(aVarL9);
                                                                        }
                                                                        if (i35 > 0) {
                                                                            i22 = 20;
                                                                            if (arrayList9.size() >= 20) {
                                                                            }
                                                                        }
                                                                    }
                                                                    i36++;
                                                                } else {
                                                                    if (iA4 == 1) {
                                                                        List listA4 = lp.a.a(aVar9.f47799b);
                                                                        aVar9.f47802e = listA4;
                                                                        if (listA4.size() > 0) {
                                                                            aVar8.k(aVar9);
                                                                        }
                                                                        i36++;
                                                                    } else if (iA4 == 2) {
                                                                        aVar9.f47800c = 2;
                                                                    }
                                                                    aVarL9 = aVar8.l(aVar9);
                                                                    if (aVarL9 != null) {
                                                                        arrayList9.add(aVar9);
                                                                        aVar8.f40181e.add(aVarL9);
                                                                    }
                                                                    if (i35 > 0) {
                                                                        i22 = 20;
                                                                        if (arrayList9.size() >= 20) {
                                                                        }
                                                                    }
                                                                    i36++;
                                                                }
                                                                i36++;
                                                            } else {
                                                                i22 = 20;
                                                            }
                                                        }
                                                        if (arrayList9.size() < i22) {
                                                            i35++;
                                                        }
                                                    }
                                                }
                                                aVar8.h(arrayList9);
                                                aVar8.i(aVar8.f40181e);
                                                aVar3 = aVar8;
                                            }
                                            break;
                                        case 20:
                                            if (bundle != null) {
                                                m.f(view, "view");
                                                m.f(reviews, "reviews");
                                                aVar = new am.a(view, 1);
                                                aVar.f755h = reviews;
                                                Collections.shuffle(reviews);
                                                i11 = 0;
                                                while (true) {
                                                    arrayList = aVar.f40180d;
                                                    if (i11 < 3) {
                                                        size = reviews.size();
                                                        i12 = 0;
                                                        while (true) {
                                                            if (i12 < size) {
                                                                ReviewNew reviewNew5 = (ReviewNew) reviews.get(i12);
                                                                aVar2 = new qi.a();
                                                                aVar2.f47799b = (int) reviewNew5.getId();
                                                                iA = p.a(reviewNew5, "getElemType(...)");
                                                                aVar2.f47798a = iA;
                                                                if (iA == 0) {
                                                                    listB = lp.a.b(aVar2.f47799b);
                                                                    aVar2.f47802e = listB;
                                                                    if (listB.size() > 0) {
                                                                        aVar.k(aVar2);
                                                                        aVarL = aVar.l(aVar2);
                                                                        if (aVarL != null) {
                                                                            arrayList.add(aVar2);
                                                                            aVar.f40181e.add(aVarL);
                                                                        }
                                                                        if (i11 > 0) {
                                                                            i13 = 20;
                                                                            if (arrayList.size() >= 20) {
                                                                            }
                                                                        }
                                                                        i12++;
                                                                    }
                                                                    i12++;
                                                                } else {
                                                                    if (iA == 1) {
                                                                        listA = lp.a.a(aVar2.f47799b);
                                                                        aVar2.f47802e = listA;
                                                                        if (listA.size() > 0) {
                                                                            aVar.k(aVar2);
                                                                        }
                                                                        i12++;
                                                                    } else if (iA == 2) {
                                                                        aVar2.f47800c = 2;
                                                                    }
                                                                    aVarL = aVar.l(aVar2);
                                                                    if (aVarL != null) {
                                                                        arrayList.add(aVar2);
                                                                        aVar.f40181e.add(aVarL);
                                                                    }
                                                                    if (i11 > 0) {
                                                                        i13 = 20;
                                                                        if (arrayList.size() >= 20) {
                                                                        }
                                                                    }
                                                                    i12++;
                                                                }
                                                            } else {
                                                                i13 = 20;
                                                            }
                                                        }
                                                        if (arrayList.size() < i13) {
                                                            i11++;
                                                        }
                                                    }
                                                }
                                                aVar.h(arrayList);
                                                aVar.i(aVar.f40181e);
                                                aVar3 = aVar;
                                            } else {
                                                m.f(view, "view");
                                                m.f(reviews, "reviews");
                                                aVar = new am.a(view, 1);
                                                aVar.f755h = reviews;
                                                Collections.shuffle(reviews);
                                                i11 = 0;
                                                while (true) {
                                                    arrayList = aVar.f40180d;
                                                    if (i11 < 3) {
                                                        size = reviews.size();
                                                        i12 = 0;
                                                        while (true) {
                                                            if (i12 < size) {
                                                                ReviewNew reviewNew6 = (ReviewNew) reviews.get(i12);
                                                                aVar2 = new qi.a();
                                                                aVar2.f47799b = (int) reviewNew6.getId();
                                                                iA = p.a(reviewNew6, "getElemType(...)");
                                                                aVar2.f47798a = iA;
                                                                if (iA == 0) {
                                                                    listB = lp.a.b(aVar2.f47799b);
                                                                    aVar2.f47802e = listB;
                                                                    if (listB.size() > 0) {
                                                                        aVar.k(aVar2);
                                                                        aVarL = aVar.l(aVar2);
                                                                        if (aVarL != null) {
                                                                            arrayList.add(aVar2);
                                                                            aVar.f40181e.add(aVarL);
                                                                        }
                                                                        if (i11 > 0) {
                                                                            i13 = 20;
                                                                            if (arrayList.size() >= 20) {
                                                                            }
                                                                        }
                                                                        i12++;
                                                                    }
                                                                    i12++;
                                                                } else {
                                                                    if (iA == 1) {
                                                                        listA = lp.a.a(aVar2.f47799b);
                                                                        aVar2.f47802e = listA;
                                                                        if (listA.size() > 0) {
                                                                            aVar.k(aVar2);
                                                                        }
                                                                        i12++;
                                                                    } else if (iA == 2) {
                                                                        aVar2.f47800c = 2;
                                                                    }
                                                                    aVarL = aVar.l(aVar2);
                                                                    if (aVarL != null) {
                                                                        arrayList.add(aVar2);
                                                                        aVar.f40181e.add(aVarL);
                                                                    }
                                                                    if (i11 > 0) {
                                                                        i13 = 20;
                                                                        if (arrayList.size() >= 20) {
                                                                        }
                                                                    }
                                                                    i12++;
                                                                }
                                                            } else {
                                                                i13 = 20;
                                                            }
                                                        }
                                                        if (arrayList.size() < i13) {
                                                            i11++;
                                                        }
                                                    }
                                                }
                                                aVar.h(arrayList);
                                                aVar.i(aVar.f40181e);
                                                aVar3 = aVar;
                                            }
                                            break;
                                        case 21:
                                            if (bundle != null && bundle.containsKey(INTENTS.EXTRA_INDEX)) {
                                                m.f(view, "view");
                                                aVar3 = new yo.a(view, 21);
                                            } else {
                                                m.f(view, "view");
                                                m.f(reviews, "reviews");
                                                yo.a aVar10 = new yo.a(view, 21);
                                                aVar10.f57866h = reviews;
                                                Collections.shuffle(reviews);
                                                int i37 = 0;
                                                while (true) {
                                                    arrayList10 = aVar10.f40180d;
                                                    if (i37 < 3) {
                                                        int size5 = reviews.size();
                                                        int i38 = 0;
                                                        while (true) {
                                                            if (i38 < size5) {
                                                                ReviewNew reviewNew7 = (ReviewNew) reviews.get(i38);
                                                                qi.a aVar11 = new qi.a();
                                                                aVar11.f47799b = (int) reviewNew7.getId();
                                                                int iA5 = p.a(reviewNew7, "getElemType(...)");
                                                                aVar11.f47798a = iA5;
                                                                if (iA5 == 0) {
                                                                    List listB5 = lp.a.b(aVar11.f47799b);
                                                                    aVar11.f47802e = listB5;
                                                                    if (listB5.size() > 0) {
                                                                        aVar10.k(aVar11);
                                                                        aVarL10 = aVar10.l(aVar11);
                                                                        if (aVarL10 != null) {
                                                                            arrayList10.add(aVar11);
                                                                            aVar10.f40181e.add(aVarL10);
                                                                        }
                                                                        if (i37 > 0) {
                                                                            i23 = 20;
                                                                            if (arrayList10.size() >= 20) {
                                                                            }
                                                                        }
                                                                    }
                                                                    i38++;
                                                                } else {
                                                                    if (iA5 == 1) {
                                                                        List listA5 = lp.a.a(aVar11.f47799b);
                                                                        aVar11.f47802e = listA5;
                                                                        if (listA5.size() > 0) {
                                                                            aVar10.k(aVar11);
                                                                        }
                                                                        i38++;
                                                                    } else if (iA5 == 2) {
                                                                        aVar11.f47800c = 2;
                                                                    }
                                                                    aVarL10 = aVar10.l(aVar11);
                                                                    if (aVarL10 != null) {
                                                                        arrayList10.add(aVar11);
                                                                        aVar10.f40181e.add(aVarL10);
                                                                    }
                                                                    if (i37 > 0) {
                                                                        i23 = 20;
                                                                        if (arrayList10.size() >= 20) {
                                                                        }
                                                                    }
                                                                    i38++;
                                                                }
                                                                i38++;
                                                            } else {
                                                                i23 = 20;
                                                            }
                                                        }
                                                        if (arrayList10.size() < i23) {
                                                            i37++;
                                                        }
                                                    }
                                                }
                                                aVar10.h(arrayList10);
                                                aVar10.i(aVar10.f40181e);
                                                aVar3 = aVar10;
                                            }
                                            break;
                                        default:
                                            switch (i28) {
                                                case 47:
                                                case 48:
                                                    if (bundle != null && bundle.containsKey(INTENTS.EXTRA_INDEX)) {
                                                        m.f(view, "view");
                                                        aVar3 = new pk.a(view, 12);
                                                    } else {
                                                        m.f(view, "view");
                                                        m.f(reviews, "reviews");
                                                        pk.a aVar12 = new pk.a(view, 12);
                                                        aVar12.f46945h = reviews;
                                                        Collections.shuffle(reviews);
                                                        int i39 = 0;
                                                        while (true) {
                                                            arrayList11 = aVar12.f40180d;
                                                            if (i39 < 3) {
                                                                int size6 = reviews.size();
                                                                int i40 = 0;
                                                                while (true) {
                                                                    if (i40 < size6) {
                                                                        ReviewNew reviewNew8 = (ReviewNew) reviews.get(i40);
                                                                        qi.a aVar13 = new qi.a();
                                                                        aVar13.f47799b = (int) reviewNew8.getId();
                                                                        int iA6 = p.a(reviewNew8, "getElemType(...)");
                                                                        aVar13.f47798a = iA6;
                                                                        if (iA6 == 0) {
                                                                            List listB6 = lp.a.b(aVar13.f47799b);
                                                                            aVar13.f47802e = listB6;
                                                                            if (listB6.size() > 0) {
                                                                                aVar12.k(aVar13);
                                                                                aVarL11 = aVar12.l(aVar13);
                                                                                if (aVarL11 != null) {
                                                                                    arrayList11.add(aVar13);
                                                                                    aVar12.f40181e.add(aVarL11);
                                                                                }
                                                                                if (i39 > 0) {
                                                                                    i24 = 20;
                                                                                    if (arrayList11.size() >= 20) {
                                                                                    }
                                                                                }
                                                                            }
                                                                            i40++;
                                                                        } else {
                                                                            if (iA6 == 1) {
                                                                                List listA6 = lp.a.a(aVar13.f47799b);
                                                                                aVar13.f47802e = listA6;
                                                                                if (listA6.size() > 0) {
                                                                                    aVar12.k(aVar13);
                                                                                }
                                                                                i40++;
                                                                            } else if (iA6 == 2) {
                                                                                aVar13.f47800c = 2;
                                                                            }
                                                                            aVarL11 = aVar12.l(aVar13);
                                                                            if (aVarL11 != null) {
                                                                                arrayList11.add(aVar13);
                                                                                aVar12.f40181e.add(aVarL11);
                                                                            }
                                                                            if (i39 > 0) {
                                                                                i24 = 20;
                                                                                if (arrayList11.size() >= 20) {
                                                                                }
                                                                            }
                                                                            i40++;
                                                                        }
                                                                        i40++;
                                                                    } else {
                                                                        i24 = 20;
                                                                    }
                                                                }
                                                                if (arrayList11.size() < i24) {
                                                                    i39++;
                                                                }
                                                            }
                                                        }
                                                        aVar12.h(arrayList11);
                                                        aVar12.i(aVar12.f40181e);
                                                        aVar3 = aVar12;
                                                    }
                                                    break;
                                                case 49:
                                                case 50:
                                                    if (bundle != null && bundle.containsKey(INTENTS.EXTRA_INDEX)) {
                                                        m.f(view, "view");
                                                        aVar3 = new wj.a(view, 20);
                                                    } else {
                                                        m.f(view, "view");
                                                        m.f(reviews, "reviews");
                                                        wj.a aVar14 = new wj.a(view, 20);
                                                        aVar14.f55174h = reviews;
                                                        Collections.shuffle(reviews);
                                                        int i41 = 0;
                                                        while (true) {
                                                            arrayList12 = aVar14.f40181e;
                                                            arrayList13 = aVar14.f40180d;
                                                            if (i41 < 3) {
                                                                int size7 = reviews.size();
                                                                int i42 = 0;
                                                                while (true) {
                                                                    if (i42 < size7) {
                                                                        ReviewNew reviewNew9 = (ReviewNew) reviews.get(i42);
                                                                        qi.a aVar15 = new qi.a();
                                                                        aVar15.f47799b = (int) reviewNew9.getId();
                                                                        int iA7 = p.a(reviewNew9, "getElemType(...)");
                                                                        aVar15.f47798a = iA7;
                                                                        if (iA7 == 0) {
                                                                            List listB7 = lp.a.b(aVar15.f47799b);
                                                                            aVar15.f47802e = listB7;
                                                                            if (listB7.size() > 0) {
                                                                                aVar14.k(aVar15);
                                                                                aVarL12 = aVar14.l(aVar15);
                                                                                if (aVarL12 != null) {
                                                                                    arrayList13.add(aVar15);
                                                                                    arrayList12.add(aVarL12);
                                                                                }
                                                                                if (i41 > 0) {
                                                                                    i25 = 20;
                                                                                    if (arrayList13.size() >= 20) {
                                                                                    }
                                                                                }
                                                                            }
                                                                            i42++;
                                                                        } else {
                                                                            if (iA7 == 1) {
                                                                                List listA7 = lp.a.a(aVar15.f47799b);
                                                                                aVar15.f47802e = listA7;
                                                                                if (listA7.size() > 0) {
                                                                                    aVar14.k(aVar15);
                                                                                }
                                                                                i42++;
                                                                            } else if (iA7 == 2) {
                                                                                aVar15.f47800c = 2;
                                                                            }
                                                                            aVarL12 = aVar14.l(aVar15);
                                                                            if (aVarL12 != null) {
                                                                                arrayList13.add(aVar15);
                                                                                arrayList12.add(aVarL12);
                                                                            }
                                                                            if (i41 > 0) {
                                                                                i25 = 20;
                                                                                if (arrayList13.size() >= 20) {
                                                                                }
                                                                            }
                                                                            i42++;
                                                                        }
                                                                        i42++;
                                                                    } else {
                                                                        i25 = 20;
                                                                    }
                                                                }
                                                                if (arrayList13.size() < i25) {
                                                                    i41++;
                                                                }
                                                            }
                                                        }
                                                        aVar14.h(arrayList13);
                                                        aVar14.i(arrayList12);
                                                        aVar3 = aVar14;
                                                    }
                                                    break;
                                                default:
                                                    switch (i28) {
                                                        case 53:
                                                        case 54:
                                                            if (bundle != null && bundle.containsKey(INTENTS.EXTRA_INDEX)) {
                                                                m.f(view, "view");
                                                                aVar3 = new bl.a(view, 2);
                                                            } else {
                                                                m.f(view, "view");
                                                                m.f(reviews, "reviews");
                                                                bl.a aVar16 = new bl.a(view, 2);
                                                                aVar16.f4458h = reviews;
                                                                Collections.shuffle(reviews);
                                                                int i43 = 0;
                                                                while (true) {
                                                                    arrayList16 = aVar16.f40181e;
                                                                    arrayList17 = aVar16.f40180d;
                                                                    if (i43 < 3) {
                                                                        int size8 = reviews.size();
                                                                        int i44 = 0;
                                                                        while (true) {
                                                                            if (i44 < size8) {
                                                                                ReviewNew reviewNew10 = (ReviewNew) reviews.get(i44);
                                                                                qi.a aVar17 = new qi.a();
                                                                                ArrayList arrayList18 = arrayList17;
                                                                                aVar17.f47799b = (int) reviewNew10.getId();
                                                                                int iA8 = p.a(reviewNew10, "getElemType(...)");
                                                                                aVar17.f47798a = iA8;
                                                                                if (iA8 == 0) {
                                                                                    List listB8 = lp.a.b(aVar17.f47799b);
                                                                                    aVar17.f47802e = listB8;
                                                                                    if (listB8.size() <= 0) {
                                                                                        arrayList17 = arrayList18;
                                                                                    } else {
                                                                                        aVar16.k(aVar17);
                                                                                        aVarL14 = aVar16.l(aVar17);
                                                                                        arrayList17 = arrayList18;
                                                                                        if (aVarL14 != null) {
                                                                                            arrayList17.add(aVar17);
                                                                                            arrayList16.add(aVarL14);
                                                                                        }
                                                                                        if (i43 > 0) {
                                                                                            i27 = 20;
                                                                                            if (arrayList17.size() >= 20) {
                                                                                            }
                                                                                        }
                                                                                        i44++;
                                                                                    }
                                                                                    i44++;
                                                                                } else {
                                                                                    if (iA8 == 1) {
                                                                                        List listA8 = lp.a.a(aVar17.f47799b);
                                                                                        aVar17.f47802e = listA8;
                                                                                        if (listA8.size() <= 0) {
                                                                                            arrayList17 = arrayList18;
                                                                                        } else {
                                                                                            aVar16.k(aVar17);
                                                                                        }
                                                                                        i44++;
                                                                                    } else if (iA8 == 2) {
                                                                                        aVar17.f47800c = 2;
                                                                                    }
                                                                                    aVarL14 = aVar16.l(aVar17);
                                                                                    arrayList17 = arrayList18;
                                                                                    if (aVarL14 != null) {
                                                                                        arrayList17.add(aVar17);
                                                                                        arrayList16.add(aVarL14);
                                                                                    }
                                                                                    if (i43 > 0) {
                                                                                        i27 = 20;
                                                                                        if (arrayList17.size() >= 20) {
                                                                                        }
                                                                                    }
                                                                                    i44++;
                                                                                }
                                                                            } else {
                                                                                i27 = 20;
                                                                            }
                                                                        }
                                                                        if (arrayList17.size() < i27) {
                                                                            i43++;
                                                                        }
                                                                    }
                                                                }
                                                                aVar16.h(arrayList17);
                                                                aVar16.i(arrayList16);
                                                                aVar3 = aVar16;
                                                            }
                                                            break;
                                                        case 55:
                                                            break;
                                                        default:
                                                            throw new IllegalArgumentException();
                                                    }
                                                case 51:
                                                    if (bundle != null && bundle.containsKey(INTENTS.EXTRA_INDEX)) {
                                                        m.f(view, "view");
                                                        aVar3 = new ai.a(view, 0);
                                                    } else {
                                                        m.f(view, "view");
                                                        m.f(reviews, "reviews");
                                                        ai.a aVar18 = new ai.a(view, 0);
                                                        aVar18.f723h = reviews;
                                                        Collections.shuffle(reviews);
                                                        int i45 = 0;
                                                        while (true) {
                                                            arrayList14 = aVar18.f40181e;
                                                            arrayList15 = aVar18.f40180d;
                                                            if (i45 < 3) {
                                                                int size9 = reviews.size();
                                                                int i46 = i29;
                                                                while (true) {
                                                                    if (i46 < size9) {
                                                                        ReviewNew reviewNew11 = (ReviewNew) reviews.get(i46);
                                                                        qi.a aVar19 = new qi.a();
                                                                        aVar19.f47799b = (int) reviewNew11.getId();
                                                                        int iA9 = p.a(reviewNew11, "getElemType(...)");
                                                                        aVar19.f47798a = iA9;
                                                                        if (iA9 == 0) {
                                                                            List listB9 = lp.a.b(aVar19.f47799b);
                                                                            aVar19.f47802e = listB9;
                                                                            if (listB9.size() > 0) {
                                                                                aVar18.k(aVar19);
                                                                                aVarL13 = aVar18.l(aVar19);
                                                                                if (aVarL13 != null) {
                                                                                    arrayList15.add(aVar19);
                                                                                    arrayList14.add(aVarL13);
                                                                                }
                                                                                if (i45 > 0) {
                                                                                    i26 = 20;
                                                                                    if (arrayList15.size() >= 20) {
                                                                                    }
                                                                                }
                                                                            }
                                                                            i46++;
                                                                        } else {
                                                                            if (iA9 == 1) {
                                                                                List listA9 = lp.a.a(aVar19.f47799b);
                                                                                aVar19.f47802e = listA9;
                                                                                if (listA9.size() > 0) {
                                                                                    aVar18.k(aVar19);
                                                                                }
                                                                                i46++;
                                                                            } else if (iA9 == 2) {
                                                                                aVar19.f47800c = 2;
                                                                            }
                                                                            aVarL13 = aVar18.l(aVar19);
                                                                            if (aVarL13 != null) {
                                                                                arrayList15.add(aVar19);
                                                                                arrayList14.add(aVarL13);
                                                                            }
                                                                            if (i45 > 0) {
                                                                                i26 = 20;
                                                                                if (arrayList15.size() >= 20) {
                                                                                }
                                                                            }
                                                                            i46++;
                                                                        }
                                                                        i46++;
                                                                    } else {
                                                                        i26 = 20;
                                                                    }
                                                                }
                                                                if (arrayList15.size() < i26) {
                                                                    i45++;
                                                                    i29 = 0;
                                                                }
                                                            }
                                                        }
                                                        aVar18.h(arrayList15);
                                                        aVar18.i(arrayList14);
                                                        aVar3 = aVar18;
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                        } else if (bundle == null || !bundle.containsKey(INTENTS.EXTRA_INDEX)) {
                            m.f(view, "view");
                            m.f(reviews, "reviews");
                            kn.a aVar20 = new kn.a(view, 9);
                            aVar20.f38334h = reviews;
                            Collections.shuffle(reviews);
                            int i47 = 0;
                            while (true) {
                                arrayList6 = aVar20.f40180d;
                                if (i47 >= 3) {
                                    break;
                                }
                                int size10 = reviews.size();
                                int i48 = 0;
                                while (true) {
                                    if (i48 >= size10) {
                                        i18 = 20;
                                        break;
                                    }
                                    ReviewNew reviewNew12 = (ReviewNew) reviews.get(i48);
                                    qi.a aVar21 = new qi.a();
                                    aVar21.f47799b = (int) reviewNew12.getId();
                                    int iA10 = p.a(reviewNew12, "getElemType(...)");
                                    aVar21.f47798a = iA10;
                                    if (iA10 == 0) {
                                        List listB10 = lp.a.b(aVar21.f47799b);
                                        aVar21.f47802e = listB10;
                                        if (listB10.size() > 0) {
                                            aVar20.k(aVar21);
                                            aVarL6 = aVar20.l(aVar21);
                                            if (aVarL6 != null) {
                                                arrayList6.add(aVar21);
                                                aVar20.f40181e.add(aVarL6);
                                            }
                                            if (i47 > 0) {
                                                i18 = 20;
                                                if (arrayList6.size() >= 20) {
                                                    break;
                                                }
                                            }
                                        }
                                        i48++;
                                    } else {
                                        if (iA10 == 1) {
                                            List listA10 = lp.a.a(aVar21.f47799b);
                                            aVar21.f47802e = listA10;
                                            if (listA10.size() > 0) {
                                                aVar20.k(aVar21);
                                            }
                                            i48++;
                                        } else if (iA10 == 2) {
                                            aVar21.f47800c = 2;
                                        }
                                        aVarL6 = aVar20.l(aVar21);
                                        if (aVarL6 != null) {
                                            arrayList6.add(aVar21);
                                            aVar20.f40181e.add(aVarL6);
                                        }
                                        if (i47 > 0) {
                                            i18 = 20;
                                            if (arrayList6.size() >= 20) {
                                                break;
                                                break;
                                            }
                                        }
                                        i48++;
                                    }
                                    i48++;
                                }
                                if (arrayList6.size() >= i18) {
                                    break;
                                } else {
                                    i47++;
                                }
                            }
                            aVar20.h(arrayList6);
                            aVar20.i(aVar20.f40181e);
                            aVar3 = aVar20;
                        } else {
                            m.f(view, "view");
                            aVar3 = new kn.a(view, 9);
                        }
                    } else if (bundle == null || !bundle.containsKey(INTENTS.EXTRA_INDEX)) {
                        m.f(view, "view");
                        m.f(reviews, "reviews");
                        fl.a aVar22 = new fl.a(view, 5);
                        aVar22.f27338h = reviews;
                        Collections.shuffle(reviews);
                        int i49 = 0;
                        while (true) {
                            arrayList5 = aVar22.f40180d;
                            if (i49 >= 3) {
                                break;
                            }
                            int size11 = reviews.size();
                            int i50 = 0;
                            while (true) {
                                if (i50 >= size11) {
                                    i17 = 20;
                                    break;
                                }
                                ReviewNew reviewNew13 = (ReviewNew) reviews.get(i50);
                                qi.a aVar23 = new qi.a();
                                aVar23.f47799b = (int) reviewNew13.getId();
                                int iA11 = p.a(reviewNew13, "getElemType(...)");
                                aVar23.f47798a = iA11;
                                if (iA11 == 0) {
                                    List listB11 = lp.a.b(aVar23.f47799b);
                                    aVar23.f47802e = listB11;
                                    if (listB11.size() > 0) {
                                        aVar22.k(aVar23);
                                        aVarL5 = aVar22.l(aVar23);
                                        if (aVarL5 != null) {
                                            arrayList5.add(aVar23);
                                            aVar22.f40181e.add(aVarL5);
                                        }
                                        if (i49 > 0) {
                                            i17 = 20;
                                            if (arrayList5.size() >= 20) {
                                                break;
                                            }
                                        }
                                    }
                                    i50++;
                                } else {
                                    if (iA11 == 1) {
                                        List listA11 = lp.a.a(aVar23.f47799b);
                                        aVar23.f47802e = listA11;
                                        if (listA11.size() > 0) {
                                            aVar22.k(aVar23);
                                        }
                                        i50++;
                                    } else if (iA11 == 2) {
                                        aVar23.f47800c = 2;
                                    }
                                    aVarL5 = aVar22.l(aVar23);
                                    if (aVarL5 != null) {
                                        arrayList5.add(aVar23);
                                        aVar22.f40181e.add(aVarL5);
                                    }
                                    if (i49 > 0) {
                                        i17 = 20;
                                        if (arrayList5.size() >= 20) {
                                            break;
                                            break;
                                        }
                                    }
                                    i50++;
                                }
                                i50++;
                            }
                            if (arrayList5.size() >= i17) {
                                break;
                            } else {
                                i49++;
                            }
                        }
                        aVar22.h(arrayList5);
                        aVar22.i(aVar22.f40181e);
                        aVar3 = aVar22;
                    } else {
                        m.f(view, "view");
                        aVar3 = new fl.a(view, 5);
                    }
                } else if (bundle == null || !bundle.containsKey(INTENTS.EXTRA_INDEX)) {
                    m.f(view, "view");
                    m.f(reviews, "reviews");
                    zp.a aVar24 = new zp.a(view, 22);
                    aVar24.f59263h = reviews;
                    Collections.shuffle(reviews);
                    int i51 = 0;
                    while (true) {
                        arrayList4 = aVar24.f40180d;
                        if (i51 >= 3) {
                            break;
                        }
                        int size12 = reviews.size();
                        int i52 = 0;
                        while (true) {
                            if (i52 >= size12) {
                                i16 = 20;
                                break;
                            }
                            ReviewNew reviewNew14 = (ReviewNew) reviews.get(i52);
                            qi.a aVar25 = new qi.a();
                            aVar25.f47799b = (int) reviewNew14.getId();
                            int iA12 = p.a(reviewNew14, "getElemType(...)");
                            aVar25.f47798a = iA12;
                            if (iA12 == 0) {
                                List listB12 = lp.a.b(aVar25.f47799b);
                                aVar25.f47802e = listB12;
                                if (listB12.size() > 0) {
                                    aVar24.k(aVar25);
                                    aVarL4 = aVar24.l(aVar25);
                                    if (aVarL4 != null) {
                                        arrayList4.add(aVar25);
                                        aVar24.f40181e.add(aVarL4);
                                    }
                                    if (i51 > 0) {
                                        i16 = 20;
                                        if (arrayList4.size() >= 20) {
                                            break;
                                        }
                                    }
                                }
                                i52++;
                            } else {
                                if (iA12 == 1) {
                                    List listA12 = lp.a.a(aVar25.f47799b);
                                    aVar25.f47802e = listA12;
                                    if (listA12.size() > 0) {
                                        aVar24.k(aVar25);
                                    }
                                    i52++;
                                } else if (iA12 == 2) {
                                    aVar25.f47800c = 2;
                                }
                                aVarL4 = aVar24.l(aVar25);
                                if (aVarL4 != null) {
                                    arrayList4.add(aVar25);
                                    aVar24.f40181e.add(aVarL4);
                                }
                                if (i51 > 0) {
                                    i16 = 20;
                                    if (arrayList4.size() >= 20) {
                                        break;
                                        break;
                                    }
                                }
                                i52++;
                            }
                            i52++;
                        }
                        if (arrayList4.size() >= i16) {
                            break;
                        } else {
                            i51++;
                        }
                    }
                    aVar24.h(arrayList4);
                    aVar24.i(aVar24.f40181e);
                    aVar3 = aVar24;
                } else {
                    m.f(view, "view");
                    aVar3 = new zp.a(view, 22);
                }
            } else if (bundle == null || !bundle.containsKey(INTENTS.EXTRA_INDEX)) {
                m.f(view, "view");
                m.f(reviews, "reviews");
                ll.a aVar26 = new ll.a(view, 10);
                aVar26.f40173h = reviews;
                Collections.shuffle(reviews);
                int i53 = 0;
                while (true) {
                    arrayList3 = aVar26.f40180d;
                    if (i53 >= 3) {
                        break;
                    }
                    int size13 = reviews.size();
                    int i54 = 0;
                    while (true) {
                        if (i54 >= size13) {
                            i15 = 20;
                            break;
                        }
                        ReviewNew reviewNew15 = (ReviewNew) reviews.get(i54);
                        qi.a aVar27 = new qi.a();
                        aVar27.f47799b = (int) reviewNew15.getId();
                        int iA13 = p.a(reviewNew15, "getElemType(...)");
                        aVar27.f47798a = iA13;
                        if (iA13 == 0) {
                            List listB13 = lp.a.b(aVar27.f47799b);
                            aVar27.f47802e = listB13;
                            if (listB13.size() > 0) {
                                aVar26.k(aVar27);
                                aVarL3 = aVar26.l(aVar27);
                                if (aVarL3 != null) {
                                    arrayList3.add(aVar27);
                                    aVar26.f40181e.add(aVarL3);
                                }
                                if (i53 > 0) {
                                    i15 = 20;
                                    if (arrayList3.size() >= 20) {
                                        break;
                                    }
                                }
                            }
                            i54++;
                        } else {
                            if (iA13 == 1) {
                                List listA13 = lp.a.a(aVar27.f47799b);
                                aVar27.f47802e = listA13;
                                if (listA13.size() > 0) {
                                    aVar26.k(aVar27);
                                }
                                i54++;
                            } else if (iA13 == 2) {
                                aVar27.f47800c = 2;
                            }
                            aVarL3 = aVar26.l(aVar27);
                            if (aVarL3 != null) {
                                arrayList3.add(aVar27);
                                aVar26.f40181e.add(aVarL3);
                            }
                            if (i53 > 0) {
                                i15 = 20;
                                if (arrayList3.size() >= 20) {
                                    break;
                                    break;
                                }
                            }
                            i54++;
                        }
                        i54++;
                    }
                    if (arrayList3.size() >= i15) {
                        break;
                    } else {
                        i53++;
                    }
                }
                aVar26.h(arrayList3);
                aVar26.i(aVar26.f40181e);
                aVar3 = aVar26;
            } else {
                m.f(view, "view");
                aVar3 = new ll.a(view, 10);
            }
        } else if (bundle == null || !bundle.containsKey(INTENTS.EXTRA_INDEX)) {
            m.f(view, "view");
            m.f(reviews, "reviews");
            to.a aVar28 = new to.a(view, 16);
            aVar28.f52436h = reviews;
            Collections.shuffle(reviews);
            int i55 = 0;
            while (true) {
                arrayList2 = aVar28.f40180d;
                if (i55 >= 3) {
                    break;
                }
                int size14 = reviews.size();
                int i56 = 0;
                while (true) {
                    if (i56 >= size14) {
                        i14 = 20;
                        break;
                    }
                    ReviewNew reviewNew16 = (ReviewNew) reviews.get(i56);
                    qi.a aVar29 = new qi.a();
                    aVar29.f47799b = (int) reviewNew16.getId();
                    int iA14 = p.a(reviewNew16, "getElemType(...)");
                    aVar29.f47798a = iA14;
                    if (iA14 == 0) {
                        List listB14 = lp.a.b(aVar29.f47799b);
                        aVar29.f47802e = listB14;
                        if (listB14.size() > 0) {
                            aVar28.k(aVar29);
                            aVarL2 = aVar28.l(aVar29);
                            if (aVarL2 != null) {
                                arrayList2.add(aVar29);
                                aVar28.f40181e.add(aVarL2);
                            }
                            if (i55 > 0) {
                                i14 = 20;
                                if (arrayList2.size() >= 20) {
                                    break;
                                }
                            }
                        }
                        i56++;
                    } else {
                        if (iA14 == 1) {
                            List listA14 = lp.a.a(aVar29.f47799b);
                            aVar29.f47802e = listA14;
                            if (listA14.size() > 0) {
                                aVar28.k(aVar29);
                            }
                            i56++;
                        } else if (iA14 == 2) {
                            aVar29.f47800c = 2;
                        }
                        aVarL2 = aVar28.l(aVar29);
                        if (aVarL2 != null) {
                            arrayList2.add(aVar29);
                            aVar28.f40181e.add(aVarL2);
                        }
                        if (i55 > 0) {
                            i14 = 20;
                            if (arrayList2.size() >= 20) {
                                break;
                                break;
                            }
                        }
                        i56++;
                    }
                    i56++;
                }
                if (arrayList2.size() >= i14) {
                    break;
                } else {
                    i55++;
                }
            }
            aVar28.h(arrayList2);
            aVar28.i(aVar28.f40181e);
            aVar3 = aVar28;
        } else {
            m.f(view, "view");
            aVar3 = new to.a(view, 16);
        }
        this.f46981f = aVar3;
    }

    @Override // pp.e
    public final void w(boolean z11) {
        hi.a aVar = this.f46982t;
        if (aVar != null) {
            Iterator it = this.V.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ReviewNew reviewNew = (ReviewNew) it.next();
                Integer elemType = reviewNew.getElemType();
                int i11 = aVar.i();
                if (elemType != null && elemType.intValue() == i11 && reviewNew.getId() == aVar.l()) {
                    reviewNew.getId();
                    int i12 = z11 ? 1 : -1;
                    if (i.f34434b == null) {
                        synchronized (i.class) {
                            if (i.f34434b == null) {
                                i.f34434b = new i();
                            }
                        }
                    }
                    i iVar = i.f34434b;
                    m.c(iVar);
                    iVar.b(reviewNew, i12);
                }
            }
            if (i.f34434b == null) {
                synchronized (i.class) {
                    if (i.f34434b == null) {
                        i.f34434b = new i();
                    }
                }
            }
            m.c(i.f34434b);
            String strA = i.a(aVar.l(), aVar.i(), this.f46980e.keyLanguage);
            if (z11) {
                this.L.put(strA, 1);
            } else {
                this.L.put(strA, -1);
            }
        }
    }

    @Override // pp.e
    public final void x(qi.a testModel) {
        List list;
        m.f(testModel, "testModel");
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        if (!l.D(new Integer[]{1, 12}, Integer.valueOf(x.n().keyLanguage))) {
            if (l.D(new Integer[]{2, 13, 0, 11}, Integer.valueOf(x.n().keyLanguage)) && (list = testModel.f47802e) != null && list.contains(9)) {
                testModel.f47802e.remove((Object) 9);
                return;
            }
            return;
        }
        List list2 = testModel.f47802e;
        if (list2 != null && testModel.f47800c == 5) {
            list2.remove((Object) 5);
        } else {
            if (list2 == null || testModel.f47800c != 9) {
                return;
            }
            list2.remove((Object) 9);
        }
    }
}
