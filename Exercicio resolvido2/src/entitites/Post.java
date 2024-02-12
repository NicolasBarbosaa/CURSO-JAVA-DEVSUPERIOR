package entitites;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	
	// crio essa aplicação static para não ter copia dela na aplicação
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm::ss");

	
	private Date moment;
	private String title;
	private String content;
	private Integer likes;
	
	private List<Comment> comments = new ArrayList<>();
	
	public Post() {	}

	public Post(Date moment, String title, String content, Integer likes) {
		super();
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public List<Comment> getComments() {
		return comments;
	}

	// não posso ter um SET para uma lista por uma listar chamar 
	//outra e criar outra, por isso se é criado um 
	//metodo para add comentario e remover comentario da lista
	
	public void addComment(Comment comment) {
		comments.add(comment);
	}
	
	public void removeComment(Comment comment) {
		comments.remove(comment);
	}
	/*usamos o StringBuilder para não criarmos um toString()
	 * tão grande e consumirmos muito da mémoria e deixar o programa lento.
	 * "append" = acrecentar no final
	*/
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(title + "\n");
		sb.append(likes);
		sb.append("  likes  -");
		sb.append(sdf.format(moment) + "\n");
		sb.append(content + "\n");
		sb.append("Comments: \n");
		for(Comment c : comments) {
		sb.append(c.getText());
		
		}
		return sb.toString();
	}
}
