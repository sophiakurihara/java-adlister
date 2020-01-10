import java.util.List;

interface Contacts {
    public List<Contact> getContacts();
    public long saveContact(Contact contact);
    public void deleteContactById(long id);
    public Contact getContactById(long id);
}
