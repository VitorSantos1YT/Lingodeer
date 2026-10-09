package e2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v f24760b = new v();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final v f24761c = new v();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final v f24762d = new v();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n1.e f24763a = new n1.e(new x[16]);

    public static void b(v vVar) {
        vVar.getClass();
        if (vVar == f24760b) {
            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
        }
        if (vVar == f24761c) {
            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
        }
        n1.e eVar = vVar.f24763a;
        int i11 = eVar.f43114c;
        if (i11 == 0) {
            System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
            return;
        }
        Object[] objArr = eVar.f43112a;
        for (int i12 = 0; i12 < i11; i12++) {
            z1.q qVar = (z1.q) ((x) objArr[i12]);
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
                int i13 = eVar2.f43114c;
                if (i13 == 0) {
                    break;
                }
                z1.q qVarF = (z1.q) eVar2.l(i13 - 1);
                if ((qVarF.f58485d & 1024) == 0) {
                    y2.f.b(eVar2, qVarF);
                } else {
                    while (qVarF != null) {
                        if ((qVarF.f58484c & 1024) != 0) {
                            n1.e eVar3 = null;
                            while (qVarF != null) {
                                if (qVarF instanceof e0) {
                                    if (((e0) qVarF).Z0(7)) {
                                        break;
                                    }
                                } else if ((qVarF.f58484c & 1024) != 0 && (qVarF instanceof y2.n)) {
                                    int i14 = 0;
                                    for (z1.q qVar4 = ((y2.n) qVarF).R; qVar4 != null; qVar4 = qVar4.f58487f) {
                                        if ((qVar4.f58484c & 1024) != 0) {
                                            i14++;
                                            if (i14 == 1) {
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
                                    if (i14 == 1) {
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
    }

    public final void a() {
        n1.e eVar = this.f24763a;
        int i11 = eVar.f43114c;
        if (i11 == 0) {
            System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
            return;
        }
        Object[] objArr = eVar.f43112a;
        for (int i12 = 0; i12 < i11; i12++) {
            z1.q qVar = (z1.q) ((x) objArr[i12]);
            z1.q qVarF = qVar.f58482a;
            n1.e eVar2 = null;
            while (qVarF != null) {
                if (qVarF instanceof e0) {
                    if (d.l((e0) qVarF)) {
                        return;
                    }
                } else if ((qVarF.f58484c & 1024) != 0 && (qVarF instanceof y2.n)) {
                    int i13 = 0;
                    for (z1.q qVar2 = ((y2.n) qVarF).R; qVar2 != null; qVar2 = qVar2.f58487f) {
                        if ((qVar2.f58484c & 1024) != 0) {
                            i13++;
                            if (i13 == 1) {
                                qVarF = qVar2;
                            } else {
                                if (eVar2 == null) {
                                    eVar2 = new n1.e(new z1.q[16]);
                                }
                                if (qVarF != null) {
                                    eVar2.c(qVarF);
                                    qVarF = null;
                                }
                                eVar2.c(qVar2);
                            }
                        }
                    }
                    if (i13 == 1) {
                    }
                }
                qVarF = y2.f.f(eVar2);
            }
            if (!qVar.f58482a.P) {
                v2.a.b("visitChildren called on an unattached node");
            }
            n1.e eVar3 = new n1.e(new z1.q[16]);
            z1.q qVar3 = qVar.f58482a;
            z1.q qVar4 = qVar3.f58487f;
            if (qVar4 == null) {
                y2.f.b(eVar3, qVar3);
            } else {
                eVar3.c(qVar4);
            }
            while (true) {
                int i14 = eVar3.f43114c;
                if (i14 != 0) {
                    z1.q qVarF2 = (z1.q) eVar3.l(i14 - 1);
                    if ((qVarF2.f58485d & 1024) == 0) {
                        y2.f.b(eVar3, qVarF2);
                    } else {
                        while (qVarF2 != null) {
                            if ((qVarF2.f58484c & 1024) != 0) {
                                n1.e eVar4 = null;
                                while (qVarF2 != null) {
                                    if (qVarF2 instanceof e0) {
                                        if (d.l((e0) qVarF2)) {
                                            return;
                                        }
                                    } else if ((qVarF2.f58484c & 1024) != 0 && (qVarF2 instanceof y2.n)) {
                                        int i15 = 0;
                                        for (z1.q qVar5 = ((y2.n) qVarF2).R; qVar5 != null; qVar5 = qVar5.f58487f) {
                                            if ((qVar5.f58484c & 1024) != 0) {
                                                i15++;
                                                if (i15 == 1) {
                                                    qVarF2 = qVar5;
                                                } else {
                                                    if (eVar4 == null) {
                                                        eVar4 = new n1.e(new z1.q[16]);
                                                    }
                                                    if (qVarF2 != null) {
                                                        eVar4.c(qVarF2);
                                                        qVarF2 = null;
                                                    }
                                                    eVar4.c(qVar5);
                                                }
                                            }
                                        }
                                        if (i15 == 1) {
                                        }
                                    }
                                    qVarF2 = y2.f.f(eVar4);
                                }
                                break;
                            }
                            qVarF2 = qVarF2.f58487f;
                        }
                    }
                }
            }
        }
    }
}
