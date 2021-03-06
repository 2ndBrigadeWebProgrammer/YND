class Verb extends Word
{
	String s3Word;
	String pWord;
	String presentPWord;
	String pastPWord;

	public Verb()
	{}

	public Verb(String word, String s3Word, 
		        String pWord, String presentPWord, String pastPword)
	{
		super(word);
		this.s3Word = s3Word;
		this.pWord = pWord;
		this.presentPWord = presentPWord;
		this.pastPWord = "hi";
	}
    
    public Verb(String word)
    {
    super(word);
    this.s3Word = "_";
	this.pWord = "_";
	this.presentPWord = "_";
	this.pastPWord = "_";
    }

	public Verb(String[] info)
    {
        super(info[0]);
        this.s3Word = info[1];
	    this.pWord = info[2];
	    this.presentPWord = info[3];
    	this.pastPWord = info[4];
    }
    
    public String toString()
    {return super.toString()+" "+s3Word+" "+pWord+" "+presentPWord+" "+pastPWord;}
}