package p;

import am.rVFB.LwKl;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import qp.m4;
import r.c1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends MenuInflater {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Class[] f46222e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Class[] f46223f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f46224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f46225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f46226c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f46227d;

    static {
        Class[] clsArr = {Context.class};
        f46222e = clsArr;
        f46223f = clsArr;
    }

    public j(Context context) {
        super(context);
        this.f46226c = context;
        Object[] objArr = {context};
        this.f46224a = objArr;
        this.f46225b = objArr;
    }

    public static Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i11, Menu menu) {
        if (!(menu instanceof q.l)) {
            super.inflate(i11, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z11 = false;
        try {
            try {
                layout = this.f46226c.getResources().getLayout(i11);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof q.l) {
                    q.l lVar = (q.l) menu;
                    if (!lVar.R) {
                        lVar.y();
                        z11 = true;
                    }
                }
                b(layout, attributeSetAsAttributeSet, menu);
                if (z11) {
                    ((q.l) menu).x();
                }
                layout.close();
            } catch (IOException e8) {
                throw new InflateException("Error inflating menu XML", e8);
            } catch (XmlPullParserException e10) {
                throw new InflateException("Error inflating menu XML", e10);
            }
        } catch (Throwable th2) {
            if (z11) {
                ((q.l) menu).x();
            }
            if (layout != null) {
                layout.close();
            }
            throw th2;
        }
    }

    public final void b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        int i11;
        ColorStateList colorStateList;
        i iVar = new i(this, menu);
        int eventType = xmlPullParser.getEventType();
        do {
            i11 = 2;
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlPullParser.next();
                break;
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        boolean z11 = false;
        boolean z12 = false;
        String str = null;
        while (!z11) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            Object obj = LwKl.zfQNROtHGNxk;
            if (eventType == i11) {
                if (!z12) {
                    String name2 = xmlPullParser.getName();
                    boolean zEquals = name2.equals(obj);
                    Context context = this.f46226c;
                    if (zEquals) {
                        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.a.f37415r);
                        iVar.f46198b = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                        iVar.f46199c = typedArrayObtainStyledAttributes.getInt(3, 0);
                        iVar.f46200d = typedArrayObtainStyledAttributes.getInt(4, 0);
                        iVar.f46201e = typedArrayObtainStyledAttributes.getInt(5, 0);
                        iVar.f46202f = typedArrayObtainStyledAttributes.getBoolean(2, true);
                        iVar.f46203g = typedArrayObtainStyledAttributes.getBoolean(0, true);
                        typedArrayObtainStyledAttributes.recycle();
                    } else if (name2.equals("item")) {
                        m4 m4VarJ = m4.j(context, attributeSet, k.a.f37416s);
                        TypedArray typedArray = (TypedArray) m4VarJ.f48061c;
                        iVar.f46205i = typedArray.getResourceId(2, 0);
                        iVar.f46206j = (typedArray.getInt(5, iVar.f46199c) & (-65536)) | (typedArray.getInt(6, iVar.f46200d) & 65535);
                        iVar.f46207k = typedArray.getText(7);
                        iVar.f46208l = typedArray.getText(8);
                        iVar.m = typedArray.getResourceId(0, 0);
                        String string = typedArray.getString(9);
                        iVar.f46209n = string == null ? (char) 0 : string.charAt(0);
                        iVar.f46210o = typedArray.getInt(16, 4096);
                        String string2 = typedArray.getString(10);
                        iVar.f46211p = string2 == null ? (char) 0 : string2.charAt(0);
                        iVar.f46212q = typedArray.getInt(20, 4096);
                        if (typedArray.hasValue(11)) {
                            iVar.f46213r = typedArray.getBoolean(11, false) ? 1 : 0;
                        } else {
                            iVar.f46213r = iVar.f46201e;
                        }
                        iVar.f46214s = typedArray.getBoolean(3, false);
                        iVar.f46215t = typedArray.getBoolean(4, iVar.f46202f);
                        iVar.f46216u = typedArray.getBoolean(1, iVar.f46203g);
                        iVar.f46217v = typedArray.getInt(21, -1);
                        iVar.f46220y = typedArray.getString(12);
                        iVar.f46218w = typedArray.getResourceId(13, 0);
                        iVar.f46219x = typedArray.getString(15);
                        String string3 = typedArray.getString(14);
                        if (string3 != null && iVar.f46218w == 0 && iVar.f46219x == null) {
                            iVar.f46221z = (z4.c) iVar.a(string3, f46223f, this.f46225b);
                        } else {
                            iVar.f46221z = null;
                        }
                        iVar.A = typedArray.getText(17);
                        iVar.B = typedArray.getText(22);
                        if (typedArray.hasValue(19)) {
                            iVar.D = c1.c(typedArray.getInt(19, -1), iVar.D);
                            colorStateList = null;
                        } else {
                            colorStateList = null;
                            iVar.D = null;
                        }
                        if (typedArray.hasValue(18)) {
                            iVar.C = m4VarJ.f(18);
                        } else {
                            iVar.C = colorStateList;
                        }
                        m4VarJ.l();
                        iVar.f46204h = false;
                        xmlPullParser = xmlPullParser;
                    } else if (name2.equals("menu")) {
                        iVar.f46204h = true;
                        SubMenu subMenuAddSubMenu = iVar.f46197a.addSubMenu(iVar.f46198b, iVar.f46205i, iVar.f46206j, iVar.f46207k);
                        iVar.b(subMenuAddSubMenu.getItem());
                        xmlPullParser = xmlPullParser;
                        b(xmlPullParser, attributeSet, subMenuAddSubMenu);
                    } else {
                        xmlPullParser = xmlPullParser;
                        str = name2;
                        z12 = true;
                    }
                }
                z11 = z11;
            } else if (eventType != 3) {
                z11 = z11;
            } else {
                String name3 = xmlPullParser.getName();
                if (z12 && name3.equals(str)) {
                    xmlPullParser = xmlPullParser;
                    z12 = false;
                    str = null;
                } else {
                    if (name3.equals(obj)) {
                        iVar.f46198b = 0;
                        iVar.f46199c = 0;
                        iVar.f46200d = 0;
                        iVar.f46201e = 0;
                        iVar.f46202f = true;
                        iVar.f46203g = true;
                    } else if (name3.equals("item")) {
                        if (!iVar.f46204h) {
                            z4.c cVar = iVar.f46221z;
                            if (cVar == null || !((q.o) cVar).f47303c.hasSubMenu()) {
                                iVar.f46204h = true;
                                iVar.b(iVar.f46197a.add(iVar.f46198b, iVar.f46205i, iVar.f46206j, iVar.f46207k));
                            } else {
                                iVar.f46204h = true;
                                iVar.b(iVar.f46197a.addSubMenu(iVar.f46198b, iVar.f46205i, iVar.f46206j, iVar.f46207k).getItem());
                            }
                        }
                    } else if (name3.equals("menu")) {
                        z11 = true;
                    }
                    z11 = z11;
                }
            }
            eventType = xmlPullParser.next();
            i11 = 2;
            z11 = z11;
            z12 = z12;
        }
    }
}
