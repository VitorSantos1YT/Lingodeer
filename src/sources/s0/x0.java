package s0;

import android.view.KeyEvent;
import fr.j3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f51252a;

    public /* synthetic */ x0(int i11) {
        this.f51252a = i11;
    }

    public static g a(long j11, long j12) {
        return new g(j11, j12, j3.z(0.25d));
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0046  */
    public l0 b(KeyEvent keyEvent) {
        l0 l0Var;
        l0 l0Var2 = null;
        switch (this.f51252a) {
            case 1:
                int i11 = m0.f51097b;
                if (keyEvent.isCtrlPressed() && keyEvent.isShiftPressed()) {
                    if (q2.a.a(q2.c.a(keyEvent.getKeyCode()), v0.f51219g)) {
                        return l0.REDO;
                    }
                    return null;
                }
                if (keyEvent.isCtrlPressed()) {
                    long jB = q2.c.b(keyEvent);
                    if (q2.a.a(jB, v0.f51214b) || q2.a.a(jB, v0.f51229r)) {
                        return l0.COPY;
                    }
                    if (q2.a.a(jB, v0.f51216d)) {
                        return l0.PASTE;
                    }
                    if (q2.a.a(jB, v0.f51218f)) {
                        return l0.CUT;
                    }
                    if (q2.a.a(jB, v0.f51213a)) {
                        return l0.SELECT_ALL;
                    }
                    if (q2.a.a(jB, v0.f51217e)) {
                        return l0.REDO;
                    }
                    if (q2.a.a(jB, v0.f51219g)) {
                        return l0.UNDO;
                    }
                    return null;
                }
                if (keyEvent.isCtrlPressed()) {
                    return null;
                }
                if (keyEvent.isShiftPressed()) {
                    long jA = q2.c.a(keyEvent.getKeyCode());
                    if (q2.a.a(jA, v0.f51221i)) {
                        return l0.SELECT_LEFT_CHAR;
                    }
                    if (q2.a.a(jA, v0.f51222j)) {
                        return l0.SELECT_RIGHT_CHAR;
                    }
                    if (q2.a.a(jA, v0.f51223k)) {
                        return l0.SELECT_UP;
                    }
                    if (q2.a.a(jA, v0.f51224l)) {
                        return l0.SELECT_DOWN;
                    }
                    if (q2.a.a(jA, v0.f51225n)) {
                        return l0.SELECT_PAGE_UP;
                    }
                    if (q2.a.a(jA, v0.f51226o)) {
                        return l0.SELECT_PAGE_DOWN;
                    }
                    if (q2.a.a(jA, v0.f51227p)) {
                        return l0.SELECT_LINE_START;
                    }
                    if (q2.a.a(jA, v0.f51228q)) {
                        return l0.SELECT_LINE_END;
                    }
                    if (q2.a.a(jA, v0.f51229r)) {
                        return l0.PASTE;
                    }
                    return null;
                }
                long jA2 = q2.c.a(keyEvent.getKeyCode());
                if (q2.a.a(jA2, v0.f51221i)) {
                    return l0.LEFT_CHAR;
                }
                if (q2.a.a(jA2, v0.f51222j)) {
                    return l0.RIGHT_CHAR;
                }
                if (q2.a.a(jA2, v0.f51223k)) {
                    return l0.UP;
                }
                if (q2.a.a(jA2, v0.f51224l)) {
                    return l0.DOWN;
                }
                if (q2.a.a(jA2, v0.m)) {
                    return l0.CENTER;
                }
                if (q2.a.a(jA2, v0.f51225n)) {
                    return l0.PAGE_UP;
                }
                if (q2.a.a(jA2, v0.f51226o)) {
                    return l0.PAGE_DOWN;
                }
                if (q2.a.a(jA2, v0.f51227p)) {
                    return l0.LINE_START;
                }
                if (q2.a.a(jA2, v0.f51228q)) {
                    return l0.LINE_END;
                }
                if (q2.a.a(jA2, v0.f51230s) || q2.a.a(jA2, v0.f51231t)) {
                    return l0.NEW_LINE;
                }
                if (q2.a.a(jA2, v0.f51232u)) {
                    return l0.DELETE_PREV_CHAR;
                }
                if (q2.a.a(jA2, v0.f51233v)) {
                    return l0.DELETE_NEXT_CHAR;
                }
                if (q2.a.a(jA2, v0.f51234w)) {
                    return l0.PASTE;
                }
                if (q2.a.a(jA2, v0.f51235x)) {
                    return l0.CUT;
                }
                if (q2.a.a(jA2, v0.f51236y)) {
                    return l0.COPY;
                }
                if (q2.a.a(jA2, v0.f51237z)) {
                    return l0.TAB;
                }
                return null;
            default:
                if (keyEvent.isShiftPressed() && keyEvent.isAltPressed()) {
                    long jA3 = q2.c.a(keyEvent.getKeyCode());
                    if (q2.a.a(jA3, v0.f51221i)) {
                        l0Var = l0.SELECT_LINE_LEFT;
                    } else if (q2.a.a(jA3, v0.f51222j)) {
                        l0Var = l0.SELECT_LINE_RIGHT;
                    } else if (q2.a.a(jA3, v0.f51223k)) {
                        l0Var = l0.SELECT_HOME;
                    } else if (q2.a.a(jA3, v0.f51224l)) {
                        l0Var = l0.SELECT_END;
                    } else {
                        l0Var = null;
                    }
                } else if (keyEvent.isAltPressed()) {
                    long jA4 = q2.c.a(keyEvent.getKeyCode());
                    if (q2.a.a(jA4, v0.f51221i)) {
                        l0Var = l0.LINE_LEFT;
                    } else if (q2.a.a(jA4, v0.f51222j)) {
                        l0Var = l0.LINE_RIGHT;
                    } else if (q2.a.a(jA4, v0.f51223k)) {
                        l0Var = l0.HOME;
                    } else if (q2.a.a(jA4, v0.f51224l)) {
                        l0Var = l0.END;
                    } else {
                        l0Var = null;
                    }
                } else {
                    l0Var = null;
                }
                if (l0Var != null) {
                    return l0Var;
                }
                n9.q qVar = n0.f51112a;
                qVar.getClass();
                if (keyEvent.isShiftPressed() && keyEvent.isCtrlPressed()) {
                    long jA5 = q2.c.a(keyEvent.getKeyCode());
                    if (q2.a.a(jA5, v0.f51221i)) {
                        l0Var2 = l0.SELECT_LEFT_WORD;
                    } else if (q2.a.a(jA5, v0.f51222j)) {
                        l0Var2 = l0.SELECT_RIGHT_WORD;
                    } else if (q2.a.a(jA5, v0.f51223k)) {
                        l0Var2 = l0.SELECT_PREV_PARAGRAPH;
                    } else if (q2.a.a(jA5, v0.f51224l)) {
                        l0Var2 = l0.SELECT_NEXT_PARAGRAPH;
                    }
                } else if (keyEvent.isCtrlPressed()) {
                    long jA6 = q2.c.a(keyEvent.getKeyCode());
                    if (q2.a.a(jA6, v0.f51221i)) {
                        l0Var2 = l0.LEFT_WORD;
                    } else if (q2.a.a(jA6, v0.f51222j)) {
                        l0Var2 = l0.RIGHT_WORD;
                    } else if (q2.a.a(jA6, v0.f51223k)) {
                        l0Var2 = l0.PREV_PARAGRAPH;
                    } else if (q2.a.a(jA6, v0.f51224l)) {
                        l0Var2 = l0.NEXT_PARAGRAPH;
                    } else if (q2.a.a(jA6, v0.f51215c)) {
                        l0Var2 = l0.DELETE_PREV_CHAR;
                    } else if (q2.a.a(jA6, v0.f51233v)) {
                        l0Var2 = l0.DELETE_NEXT_WORD;
                    } else if (q2.a.a(jA6, v0.f51232u)) {
                        l0Var2 = l0.DELETE_PREV_WORD;
                    } else if (q2.a.a(jA6, v0.f51220h)) {
                        l0Var2 = l0.DESELECT;
                    }
                } else if (keyEvent.isShiftPressed()) {
                    long jA7 = q2.c.a(keyEvent.getKeyCode());
                    if (q2.a.a(jA7, v0.f51227p)) {
                        l0Var2 = l0.SELECT_LINE_START;
                    } else if (q2.a.a(jA7, v0.f51228q)) {
                        l0Var2 = l0.SELECT_LINE_END;
                    }
                } else if (keyEvent.isAltPressed()) {
                    long jA8 = q2.c.a(keyEvent.getKeyCode());
                    if (q2.a.a(jA8, v0.f51232u)) {
                        l0Var2 = l0.DELETE_FROM_LINE_START;
                    } else if (q2.a.a(jA8, v0.f51233v)) {
                        l0Var2 = l0.DELETE_TO_LINE_END;
                    }
                }
                return l0Var2 == null ? ((x0) qVar.f43673b).b(keyEvent) : l0Var2;
        }
    }
}
