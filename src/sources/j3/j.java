package j3;

import android.text.Editable;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.ArrayList;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements ContentHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ContentHandler f35707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Editable f35708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f35709c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public n f35710d;

    public j(ContentHandler contentHandler, Editable editable) {
        this.f35707a = contentHandler;
        this.f35708b = editable;
    }

    public final void a() {
        n nVar = this.f35710d;
        if (nVar != null) {
            int i11 = nVar.f35725c;
            Editable editable = this.f35708b;
            editable.setSpan(nVar, i11, editable.length(), 33);
        }
        this.f35710d = null;
    }

    @Override // org.xml.sax.ContentHandler
    public final void characters(char[] cArr, int i11, int i12) throws SAXException {
        this.f35707a.characters(cArr, i11, i12);
    }

    @Override // org.xml.sax.ContentHandler
    public final void endDocument() throws SAXException {
        this.f35707a.endDocument();
    }

    @Override // org.xml.sax.ContentHandler
    public final void endElement(String str, String str2, String str3) throws SAXException {
        if (str2 != null) {
            int iHashCode = str2.hashCode();
            if (iHashCode != -1555043537) {
                if (iHashCode != 3453) {
                    if (iHashCode == 3735 && str2.equals("ul")) {
                        a();
                        this.f35709c--;
                        return;
                    }
                } else if (str2.equals("li")) {
                    a();
                    return;
                }
            } else if (str2.equals("annotation")) {
                Editable editable = this.f35708b;
                Object[] spans = editable.getSpans(0, editable.length(), k.class);
                ArrayList arrayList = new ArrayList();
                for (Object obj : spans) {
                    if (editable.getSpanFlags((k) obj) == 17) {
                        arrayList.add(obj);
                    }
                }
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    k kVar = (k) arrayList.get(i11);
                    int spanStart = editable.getSpanStart(kVar);
                    int length = editable.length();
                    editable.removeSpan(kVar);
                    if (spanStart != length) {
                        editable.setSpan(kVar, spanStart, length, 33);
                    }
                }
                return;
            }
        }
        this.f35707a.endElement(str, str2, str3);
    }

    @Override // org.xml.sax.ContentHandler
    public final void endPrefixMapping(String str) throws SAXException {
        this.f35707a.endPrefixMapping(str);
    }

    @Override // org.xml.sax.ContentHandler
    public final void ignorableWhitespace(char[] cArr, int i11, int i12) throws SAXException {
        this.f35707a.ignorableWhitespace(cArr, i11, i12);
    }

    @Override // org.xml.sax.ContentHandler
    public final void processingInstruction(String str, String str2) throws SAXException {
        this.f35707a.processingInstruction(str, str2);
    }

    @Override // org.xml.sax.ContentHandler
    public final void setDocumentLocator(Locator locator) {
        this.f35707a.setDocumentLocator(locator);
    }

    @Override // org.xml.sax.ContentHandler
    public final void skippedEntity(String str) throws SAXException {
        this.f35707a.skippedEntity(str);
    }

    @Override // org.xml.sax.ContentHandler
    public final void startDocument() throws SAXException {
        this.f35707a.startDocument();
    }

    @Override // org.xml.sax.ContentHandler
    public final void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
        if (str2 != null) {
            int iHashCode = str2.hashCode();
            Editable editable = this.f35708b;
            if (iHashCode != -1555043537) {
                if (iHashCode != 3453) {
                    if (iHashCode == 3735 && str2.equals("ul")) {
                        a();
                        this.f35709c++;
                        return;
                    }
                } else if (str2.equals("li")) {
                    a();
                    this.f35710d = new n(m.f35717e, this.f35709c, editable.length());
                    return;
                }
            } else if (str2.equals("annotation")) {
                if (attributes != null) {
                    int length = attributes.getLength();
                    for (int i11 = 0; i11 < length; i11++) {
                        String localName = attributes.getLocalName(i11);
                        String str4 = BuildConfig.VERSION_NAME;
                        if (localName == null) {
                            localName = BuildConfig.VERSION_NAME;
                        }
                        String value = attributes.getValue(i11);
                        if (value != null) {
                            str4 = value;
                        }
                        if (localName.length() > 0 && str4.length() > 0) {
                            int length2 = editable.length();
                            editable.setSpan(new k(localName, str4), length2, length2, 17);
                        }
                    }
                    return;
                }
                return;
            }
        }
        this.f35707a.startElement(str, str2, str3, attributes);
    }

    @Override // org.xml.sax.ContentHandler
    public final void startPrefixMapping(String str, String str2) throws SAXException {
        this.f35707a.startPrefixMapping(str, str2);
    }
}
